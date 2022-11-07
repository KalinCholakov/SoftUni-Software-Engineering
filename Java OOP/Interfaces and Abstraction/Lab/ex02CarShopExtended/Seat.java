package interfacesAndAbstraction.lab.ex02CarShopExtended;

public class Seat extends CarImpl implements Sellable {
    private Double price;

    public Seat(String model, String color, Integer getHorsePower,
                String countryProduced, Double price) {
        super(model, color, getHorsePower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());

        stringBuilder.append(System.lineSeparator())
                .append(String.format("%s sells for %f", getModel(), price));

        return stringBuilder.toString();
    }
}
