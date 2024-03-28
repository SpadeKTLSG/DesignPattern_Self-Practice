package DesignPatternEGs.Creational.SimpleFactory.shapez;


public class Client {

    public static void main(String[] args) {

        try {
            Product s1, s2, s3, s4;
            s1 = Factory.createShape("circle");
            s2 = Factory.createShape("square");
            s3 = Factory.createShape("triangle");
//            s4 = Factory.createShape("rectangle");

            s1.draw();
            s1.erase();
            s2.draw();
            s2.erase();
            s3.draw();
            s3.erase();
            // s4.draw();
            // s4.erase();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
