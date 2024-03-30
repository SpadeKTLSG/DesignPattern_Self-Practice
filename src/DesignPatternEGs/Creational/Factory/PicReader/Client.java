package DesignPatternEGs.Creational.Factory.PicReader;

import DesignPatternEGs.Creational.Factory.PicReader.factory.factoryImpl.GIFPicFactory;
import DesignPatternEGs.Creational.Factory.PicReader.factory.factoryImpl.JPGPicFactory;
import DesignPatternEGs.Creational.Factory.PicReader.factory.factoryImpl.PNGPicFactory;
import DesignPatternEGs.Creational.Factory.PicReader.product.productImpl.GIF;
import DesignPatternEGs.Creational.Factory.PicReader.product.productImpl.JPG;
import DesignPatternEGs.Creational.Factory.PicReader.product.productImpl.PNG;

/**
 * 在客户端中需要创建具体的阅读器工厂，所以如果换一个阅读器工厂则需要对客户端代码进行改动
 * 可以利用 Java 的反射与配置文件进行扩展
 */
public class Client {

    public static void main(String[] args) {
        JPGPicFactory jpgPicFactory = new JPGPicFactory();
        JPG newPic1 = (JPG) jpgPicFactory.getImg();
        newPic1.getSource();

        PNGPicFactory pngPicFactory = new PNGPicFactory();
        PNG newPic2 = (PNG) pngPicFactory.getImg();
        newPic2.getSource();

        GIFPicFactory gifPicFactory = new GIFPicFactory();
        GIF newPic3 = (GIF) gifPicFactory.getImg();
        newPic3.getSource();
    }

}
