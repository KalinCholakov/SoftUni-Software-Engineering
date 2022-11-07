package interfacesAndAbstraction.lab.ex02CarShopExtended;

public class Audi extends CarImpl implements Rentable {
    private Integer getMinRentDay;
    private Double getPricePerDay;

    public Audi(String model, String color, Integer getHorsePower,
                String countryProduced, Integer getMinRentDay, Double getPricePerDay) {
        super(model, color, getHorsePower, countryProduced);
        this.getMinRentDay = getMinRentDay;
        this.getPricePerDay = getPricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return getMinRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return getPricePerDay;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());

        stringBuilder.append(System.lineSeparator())
                .append(String.format("Minimum rental period of %d days. Price per day %f",
                        getMinRentDay, getPricePerDay));

        return stringBuilder.toString();
    }
}
