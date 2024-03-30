package DesignPatternEGs.Creational.AbstractFactory.SkinLib.factory.summer;

import DesignPatternEGs.Creational.AbstractFactory.SkinLib.factory.SkinFactory;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.Button;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.ComboBox;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.TextField;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.summer.SummerButton;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.summer.SummerComboBox;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.summer.SummerTextField;

public class SummerSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        System.out.println("创建Summer按钮！");
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("创建Summer文本框！");
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        System.out.println("创建Summer组合框！");
        return new SummerComboBox();
    }

}
