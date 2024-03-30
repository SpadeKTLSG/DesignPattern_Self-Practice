package DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.spring;

import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.ComboBox;

public class SpringComboBox implements ComboBox {

    @Override
    public void display() {
        System.out.println("显示浅绿色组合框。");
    }
}
