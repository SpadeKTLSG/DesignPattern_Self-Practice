package DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.summer;

import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.Button;

public class SummerButton implements Button {

    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }
}
