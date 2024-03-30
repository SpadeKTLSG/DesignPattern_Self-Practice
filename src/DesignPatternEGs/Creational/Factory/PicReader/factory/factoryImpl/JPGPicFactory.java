package DesignPatternEGs.Creational.Factory.PicReader.factory.factoryImpl;

import DesignPatternEGs.Creational.Factory.PicReader.factory.PicFactory;
import DesignPatternEGs.Creational.Factory.PicReader.product.Picture;
import DesignPatternEGs.Creational.Factory.PicReader.product.productImpl.JPG;

public class JPGPicFactory implements PicFactory {

    @Override
    public Picture getImg() {
        System.out.println("获取到JPG图片");
        return new JPG();
    }
}
