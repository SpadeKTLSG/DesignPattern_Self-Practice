package DesignPatternEGs.Creational.Factory.PicReader.product.productImpl;

import DesignPatternEGs.Creational.Factory.PicReader.product.Picture;

public class PNG implements Picture {

    @Override
    public void getSource() {
        System.out.println("获取图片: 孔子出浴图.png");
    }
}
