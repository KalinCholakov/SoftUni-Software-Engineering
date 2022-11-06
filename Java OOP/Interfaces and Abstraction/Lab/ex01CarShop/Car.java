package interfacesAndAbstraction.lab.ex01CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
    int Tyres = 4;

    String getModel();

    String getColor();

    Integer getHorsePower();

    String countryProduced();
}
