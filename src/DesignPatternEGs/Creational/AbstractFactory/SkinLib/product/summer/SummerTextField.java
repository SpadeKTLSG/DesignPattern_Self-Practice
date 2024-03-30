package DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.summer;

import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.TextField;

public class SummerTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示浅蓝色文本框。");
    }
}
