package DesignPatternEGs.Creational.Factory.PicReader.product.productImpl;

import DesignPatternEGs.Creational.Factory.PicReader.product.Picture;

public class JPG implements Picture {

    @Override
    public void getSource() {
        System.out.println("获取图片: 耶稣削发图.jpg");
    }
}
