package DesignPatternEGs.Creational.Factory.PicReader.product.productImpl;

import DesignPatternEGs.Creational.Factory.PicReader.product.Picture;

public class GIF implements Picture {

    @Override
    public void getSource() {
        System.out.println("获取图片: 佛祖杀生图.gif");
    }
}
