package SoftUniJavaOOP.OOP.InterfacesAndAbstraction.Lab.CarShopExtend;

import java.io.Serializable;

public interface Car extends Serializable {
    Integer tires = 4;




    String getModel();
    String getColor();
    Integer getHorsePower();
    String getCountryProduced();




}
