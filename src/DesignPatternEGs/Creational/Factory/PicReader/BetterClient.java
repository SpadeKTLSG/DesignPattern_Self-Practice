package DesignPatternEGs.Creational.Factory.PicReader;

import DesignPatternEGs.Creational.Factory.PicReader.config.PropertiesUtil;
import DesignPatternEGs.Creational.Factory.PicReader.factory.PicFactory;
import DesignPatternEGs.Creational.Factory.PicReader.product.Picture;

/**
 * 通过配置文件与反射机制，客户端代码不需要改动，只需要修改配置文件即可
 */
public class BetterClient {

    public static void main(String[] args) {

        PicFactory anyPicFactory = (PicFactory) PropertiesUtil.getFactoryMethodBean();
        Picture newPic1 = anyPicFactory.getImg();
        newPic1.getSource();
    }
}
