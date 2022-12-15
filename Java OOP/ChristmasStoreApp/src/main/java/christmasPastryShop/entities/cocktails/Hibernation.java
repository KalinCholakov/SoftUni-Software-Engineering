package christmasPastryShop.entities.cocktails;

public class Hibernation extends BaseCocktail {
    private final static double mulledWinePrice = 4.50;

    public Hibernation(String name, int size, String brand) {
        super(name, size, mulledWinePrice, brand);
    }
}
