package DesignPatternEGs.Creational.AbstractFactory.SkinLib.factory;

import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.Button;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.ComboBox;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.TextField;

public interface SkinFactory {

    public Button createButton();

    public TextField createTextField();

    public ComboBox createComboBox();
}
