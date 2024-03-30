package DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.spring;

import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.Button;

public class SpringButton implements Button {

    @Override
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}
