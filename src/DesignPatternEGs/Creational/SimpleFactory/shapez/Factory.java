package DesignPatternEGs.Creational.SimpleFactory.shapez;

import DesignPatternEGs.Creational.SimpleFactory.shapez.exception.UnSupportedShapeException;
import DesignPatternEGs.Creational.SimpleFactory.shapez.shapeImpl.Round;
import DesignPatternEGs.Creational.SimpleFactory.shapez.shapeImpl.Square;
import DesignPatternEGs.Creational.SimpleFactory.shapez.shapeImpl.Triangle;

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
