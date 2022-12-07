package football.entities.player;

public class Women extends BasePlayer {
    private final static double KG = 60.00;

    public Women(String name, String nationality, int strength) {
        super(name, nationality, KG, strength);
    }

    @Override
    public void stimulation() {
        int newStrength = getStrength() + 115;
        setStrength(newStrength);
    }
}
