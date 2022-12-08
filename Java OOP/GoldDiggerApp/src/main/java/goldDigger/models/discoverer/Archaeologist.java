package goldDigger.models.discoverer;

public class Archaeologist extends BaseDiscoverer {
    private final static double ENERGY = 60;

    public Archaeologist(String name) {
        super(name, ENERGY);
    }
}
