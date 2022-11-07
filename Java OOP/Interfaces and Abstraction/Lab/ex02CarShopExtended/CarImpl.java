package interfacesAndAbstraction.lab.ex02CarShopExtended;

public class CarImpl implements Car {
    private String model;
    private String color;
    private Integer getHorsePower;
    private String countryProduced;

    public CarImpl(String model, String color, Integer getHorsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.getHorsePower = getHorsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return getHorsePower;
    }

    @Override
    public String countryProduced() {
        return countryProduced;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                getModel(), countryProduced(), Car.Tyres);
    }
}
