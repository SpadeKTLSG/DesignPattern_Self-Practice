package DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.summer;

import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.ComboBox;

public class SummerComboBox implements ComboBox {

    @Override
    public void display() {
        System.out.println("显示浅蓝色组合框。");
    }
}
