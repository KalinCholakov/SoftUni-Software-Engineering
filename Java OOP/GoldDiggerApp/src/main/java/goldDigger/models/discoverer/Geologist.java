package goldDigger.models.discoverer;

public class Geologist extends BaseDiscoverer {
    private final static double ENERGY = 100;

    public Geologist(String name) {
        super(name, ENERGY);
    }
}
