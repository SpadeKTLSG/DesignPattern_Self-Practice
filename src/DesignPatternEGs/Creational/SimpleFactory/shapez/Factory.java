package DesignPatternEGs.Creational.SimpleFactory.shapez;

import DesignPatternEGs.Creational.SimpleFactory.shapez.ShapeImpl.Round;
import DesignPatternEGs.Creational.SimpleFactory.shapez.ShapeImpl.Square;
import DesignPatternEGs.Creational.SimpleFactory.shapez.ShapeImpl.Triangle;
import DesignPatternEGs.Creational.SimpleFactory.shapez.exception.UnSupportedShapeException;

/**
 * 简单工厂模式
 */
public class Factory {

    public static Product createShape(String type) throws UnSupportedShapeException {
        Product shape;
        shape = switch (type) {
            case "circle" -> new Round();
            case "square" -> new Square();
            case "triangle" -> new Triangle();
            default -> throw new UnSupportedShapeException("UnSupportedShapeException");
        };

        return shape;
    }
}
