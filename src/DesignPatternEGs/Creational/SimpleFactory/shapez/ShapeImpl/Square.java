package DesignPatternEGs.Creational.SimpleFactory.shapez.ShapeImpl;

import DesignPatternEGs.Creational.SimpleFactory.shapez.Product;

public class Square extends Product {
    @Override
    public void draw() {
        System.out.println("Draw a square");
    }

    @Override
    public void erase() {
        System.out.println("Erase a square");
    }
}
