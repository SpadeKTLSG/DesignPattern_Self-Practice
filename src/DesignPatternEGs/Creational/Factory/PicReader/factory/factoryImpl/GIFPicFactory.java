package DesignPatternEGs.Creational.Factory.PicReader.factory.factoryImpl;

import DesignPatternEGs.Creational.Factory.PicReader.factory.PicFactory;
import DesignPatternEGs.Creational.Factory.PicReader.product.Picture;
import DesignPatternEGs.Creational.Factory.PicReader.product.productImpl.GIF;

public class GIFPicFactory implements PicFactory {

    @Override
    public Picture getImg() {
        System.out.println("获取到GIF图片");
        return new GIF();
    }
}
