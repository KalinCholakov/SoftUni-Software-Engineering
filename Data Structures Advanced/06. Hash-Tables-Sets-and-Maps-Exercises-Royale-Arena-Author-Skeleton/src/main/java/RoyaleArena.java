import java.util.*;
import java.util.stream.Collectors;


public class RoyaleArena implements IArena {
    private Set<Battlecard> battleCards;
    private Map<Integer, Battlecard> battleCardMap;
    private Map<CardType, List<Battlecard>> battleTypes;

    public RoyaleArena() {
        this.battleCards = new LinkedHashSet<>();
        this.battleCardMap = new LinkedHashMap<>();
        this.battleTypes = new LinkedHashMap<>();
    }

    @Override
    public void add(Battlecard card) {
        this.battleCards.add(card);
        this.battleCardMap.put(card.getId(), card);
        if (!this.battleTypes.containsKey(card.getType())) {
            this.battleTypes.put(card.getType(), new ArrayList<>());
        }
        this.battleTypes.get(card.getType()).add(card);
    }

    @Override
    public boolean contains(Battlecard card) {
        return this.battleCards.contains(card);
    }

    @Override
    public int count() {
        return battleCards.size();
    }

    @Override
    public void changeCardType(int id, CardType type) {
        if (!this.battleCardMap.containsKey(id)) {
            throw new IllegalArgumentException();
        }
        this.battleCardMap.get(id).setType(type);
    }

    @Override
    public Battlecard getById(int id) {
        if (!this.battleCardMap.containsKey(id)) {
            throw new UnsupportedOperationException();
        }
        return this.battleCardMap.get(id);
    }

    @Override
    public void removeById(int id) {
        if (!this.battleCardMap.containsKey(id)) {
            throw new UnsupportedOperationException();
        }
        var toRemove = this.battleCardMap.get(id);
        this.battleCardMap.remove(id);
        this.battleCards.remove(toRemove);
        this.battleTypes.get(toRemove.getType()).remove(toRemove);
    }

    @Override
    public Iterable<Battlecard> getByCardType(CardType type) {
        if (!this.battleTypes.containsKey(type)) {
            throw new UnsupportedOperationException();
        }
        var result = this.battleTypes.get(type);
        return result.stream().sorted(Battlecard::compareTo).collect(Collectors.toList());
    }

    @Override
    public Iterable<Battlecard> getByTypeAndDamageRangeOrderedByDamageThenById(CardType type, int lo, int hi) {
        if (!this.battleTypes.containsKey(type)) {
            throw new UnsupportedOperationException();
        }
        var result = this.battleTypes.get(type)
                .stream()
                .filter(v -> v.getDamage() > lo && v.getDamage() < hi)
                .sorted(Battlecard::compareTo).collect(Collectors.toList());

        if (result.size() == 0) {
            throw new UnsupportedOperationException();
        }

        return result;
    }

    @Override
    public Iterable<Battlecard> getByCardTypeAndMaximumDamage(CardType type, double damage) {
        if (!this.battleTypes.containsKey(type)) {
            throw new UnsupportedOperationException();
        }
        var result = this.battleTypes.get(type)
                .stream()
                .filter(v -> v.getDamage() <= damage)
                .sorted(Battlecard::compareTo).collect(Collectors.toList());

        if (result.size() == 0) {
            throw new UnsupportedOperationException();
        }

        return result;
    }

    @Override
    public Iterable<Battlecard> getByNameOrderedBySwagDescending(String name) {
        var result = this.battleCards
                .stream()
                .filter(v -> v.getName().equals(name))
                .sorted(Comparator.comparingDouble(Battlecard::getSwag).reversed().thenComparing(Battlecard::getId))
                .collect(Collectors.toList());

        if (result.size() == 0) {
            throw new UnsupportedOperationException();
        }

        return result;
    }

    @Override
    public Iterable<Battlecard> getByNameAndSwagRange(String name, double lo, double hi) {
        var result = this.battleCards
                .stream()
                .filter(v -> v.getName().equals(name))
                .sorted((f, s) -> Double.compare(s.getSwag(), f.getSwag())).sorted(Comparator.comparingInt(x -> x.getId())).collect(Collectors.toList());

        if (result.size() == 0) {
            throw new UnsupportedOperationException();
        }

        return result;
    }

    @Override
    public Iterable<Battlecard> getAllByNameAndSwag() {
        Map<String, Set<Battlecard>> cards = new HashMap<>();
        for (Battlecard battleCard : battleCards) {
            if (!cards.containsKey(battleCard.getName())) {
                cards.put(battleCard.getName(), new HashSet<>());
            }
            cards.get(battleCard.getName()).add(battleCard);
        }

        List<Battlecard> battleCards = new ArrayList<>();

        for (var entry : cards.entrySet()) {
            battleCards.add(entry.getValue().stream().max(Comparator.comparingDouble(Battlecard::getSwag)).orElse(null));
        }
        return battleCards.stream().filter(Objects::nonNull).sorted(Comparator.comparingDouble(Battlecard::getSwag)).collect(Collectors.toList());
    }

    @Override
    public Iterable<Battlecard> findFirstLeastSwag(int n) {
        if (n > this.battleCards.size()) {
            throw new UnsupportedOperationException();
        }

        return this.battleCards.stream()
                .sorted(Comparator.comparingDouble(Battlecard::getSwag))
                .limit(n)
                .sorted(Comparator.comparingInt(Battlecard::getId))
                .collect(Collectors.toList());
    }

    @Override
    public Iterable<Battlecard> getAllInSwagRange(double lo, double hi) {
        List<Battlecard> result;
        result = this.battleCards.stream()
                .filter(s -> s.getSwag() >= lo && s.getSwag() <= hi).sorted(Comparator.comparingDouble(Battlecard::getSwag))
                .collect(Collectors.toList());

        return result;
    }

    @Override
    public Iterator<Battlecard> iterator() {
        return this.battleCardMap.values().iterator();
    }
}
