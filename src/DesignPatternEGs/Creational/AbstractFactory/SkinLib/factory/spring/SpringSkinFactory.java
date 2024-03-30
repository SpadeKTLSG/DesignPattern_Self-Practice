package DesignPatternEGs.Creational.AbstractFactory.SkinLib.factory.spring;

import DesignPatternEGs.Creational.AbstractFactory.SkinLib.factory.SkinFactory;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.Button;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.ComboBox;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.TextField;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.spring.SpringButton;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.spring.SpringComboBox;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.spring.SpringTextField;

public class SpringSkinFactory implements SkinFactory {

    public Button createButton() {
        System.out.println("创建Spring按钮！");
        return new SpringButton();
    }

    public TextField createTextField() {
        System.out.println("创建Spring文本框！");
        return new SpringTextField();
    }

    public ComboBox createComboBox() {
        System.out.println("创建Spring组合框！");
        return new SpringComboBox();
    }
}
