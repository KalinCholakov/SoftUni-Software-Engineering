package christmasPastryShop.entities.booths;

import christmasPastryShop.entities.booths.interfaces.Booth;
import christmasPastryShop.entities.cocktails.interfaces.Cocktail;
import christmasPastryShop.entities.delicacies.interfaces.Delicacy;

import java.util.ArrayList;
import java.util.Collection;

import static christmasPastryShop.common.ExceptionMessages.INVALID_NUMBER_OF_PEOPLE;
import static christmasPastryShop.common.ExceptionMessages.INVALID_TABLE_CAPACITY;

public abstract class BaseBooth implements Booth {
    private Collection<Delicacy> delicacyOrders;
    private Collection<Cocktail> cocktailOrders;
    private int boothNumber;
    private int capacity;
    private int numberOfPeople;
    private double pricePerPerson;
    private boolean isReserved;
    private double price;

    protected BaseBooth(int boothNumber, int capacity, double pricePerPerson) {
        this.boothNumber = boothNumber;
        setCapacity(capacity);
        this.isReserved = false;
        this.pricePerPerson = pricePerPerson;
        this.delicacyOrders = new ArrayList<>();
        this.cocktailOrders = new ArrayList<>();
    }

    public void setCapacity(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException(INVALID_TABLE_CAPACITY);
        }
        this.capacity = capacity;
    }

    @Override
    public int getBoothNumber() {
        return boothNumber;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean isReserved() {
        return isReserved;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void reserve(int numberOfPeople) {
        if (numberOfPeople <= 0) {
            throw new IllegalArgumentException(INVALID_NUMBER_OF_PEOPLE);
        }

        this.numberOfPeople = numberOfPeople;
        this.price = this.pricePerPerson * numberOfPeople;
        this.isReserved = true;
    }

    @Override
    public double getBill() {
        double delicacySum = delicacyOrders.stream().mapToDouble(Delicacy::getPrice).sum();
        double cocktailSum = cocktailOrders.stream().mapToDouble(Cocktail::getPrice).sum();

        return delicacySum + cocktailSum + this.price;
    }

    @Override
    public void clear() {
        this.delicacyOrders.clear();
        this.cocktailOrders.clear();
        this.isReserved = false;
        this.numberOfPeople = 0;
    }
}
