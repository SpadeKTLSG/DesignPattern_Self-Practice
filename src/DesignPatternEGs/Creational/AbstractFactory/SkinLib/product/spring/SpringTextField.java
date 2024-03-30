package DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.spring;

import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.TextField;

public class SpringTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示浅绿色文本框。");
    }
}
