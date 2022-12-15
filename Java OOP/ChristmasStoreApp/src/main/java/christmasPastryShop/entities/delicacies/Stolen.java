package christmasPastryShop.entities.delicacies;

public class Stolen extends BaseDelicacy {
    private final static double InitialGingerbreadPortion = 250;

    public Stolen(String name, double price) {
        super(name, InitialGingerbreadPortion, price);
    }
}
