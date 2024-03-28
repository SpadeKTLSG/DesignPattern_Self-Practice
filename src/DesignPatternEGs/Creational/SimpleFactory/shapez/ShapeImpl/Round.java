package DesignPatternEGs.Creational.SimpleFactory.shapez.ShapeImpl;

import DesignPatternEGs.Creational.SimpleFactory.shapez.Product;

public class Round extends Product {
    @Override
    public void draw() {
        System.out.println("Draw a round");
    }

    @Override
    public void erase() {
        System.out.println("Erase a round");
    }
}
