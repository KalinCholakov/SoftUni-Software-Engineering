package football.entities.field;

import football.entities.player.Player;
import football.entities.supplement.Supplement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static football.common.ConstantMessages.NOT_ENOUGH_CAPACITY;
import static football.common.ExceptionMessages.FIELD_NAME_NULL_OR_EMPTY;

public abstract class BaseField implements Field {
    private String name;
    private int capacity;
    private List<Supplement> supplements;
    private List<Player> players;

    protected BaseField(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
        this.supplements = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(FIELD_NAME_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    @Override
    public int sumEnergy() {
        return supplements.stream()
                .mapToInt(Supplement::getEnergy)
                .sum();
    }

    @Override
    public void addPlayer(Player player) {
        if (players.size() == capacity) {
            throw new IllegalStateException(NOT_ENOUGH_CAPACITY);
        }

        players.add(player);
    }

    @Override
    public void removePlayer(Player player) {
        players.remove(player);
    }

    @Override
    public void addSupplement(Supplement supplement) {
        supplements.add(supplement);
    }

    @Override
    public void drag() {
        players.forEach(Player::stimulation);
    }

    @Override
    public String getInfo() {

        String playersReport = players.isEmpty()
                ? "none"
                : players.stream()
                .map(Player::getName)
                .collect(Collectors.joining(" "));

        return String.format("%s (%s):%n" +
                        "Player: %s%n" +
                        "Supplement: %d%n" +
                        "Energy: %d",
                name, getClass().getSimpleName(),
                playersReport,
                supplements.size(),
                sumEnergy());
    }

    @Override
    public List<Player> getPlayers() {
        return players;
    }

    @Override
    public List<Supplement> getSupplements() {
        return supplements;
    }

    @Override
    public String getName() {
        return name;
    }
}
