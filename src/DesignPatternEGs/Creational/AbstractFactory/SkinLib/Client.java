package DesignPatternEGs.Creational.AbstractFactory.SkinLib;

import DesignPatternEGs.Creational.AbstractFactory.SkinLib.config.XMLUtil;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.factory.SkinFactory;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.Button;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.ComboBox;
import DesignPatternEGs.Creational.AbstractFactory.SkinLib.product.TextField;

public class Client {

    public static void main(String[] args) {

        //抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;

        //获取具体工厂
        factory = (SkinFactory) XMLUtil.getBean();
        
        assert factory != null;
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();

        bt.display();
        tf.display();
        cb.display();
    }

}
