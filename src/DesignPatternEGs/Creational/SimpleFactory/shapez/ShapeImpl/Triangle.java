package DesignPatternEGs.Creational.SimpleFactory.shapez.ShapeImpl;

import DesignPatternEGs.Creational.SimpleFactory.shapez.Product;

public class Triangle extends Product {

    @Override
    public void draw() {
        System.out.println("Draw a triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erase a triangle");
    }
}
