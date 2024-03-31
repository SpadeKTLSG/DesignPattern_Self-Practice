package DesignPatternEGs.Behavioral.Observer.StockListener;

import DesignPatternEGs.Behavioral.Observer.StockListener.Observer.ObserverImpl.ConcreteStock;
import DesignPatternEGs.Behavioral.Observer.StockListener.Observer.Stock;
import DesignPatternEGs.Behavioral.Observer.StockListener.Subject.Buyer;
import DesignPatternEGs.Behavioral.Observer.StockListener.Subject.SubjectImpl.ConcreteBuyer;

public class Client {
    public static void main(String[] args) {
        Stock concreteStock;
        concreteStock = new ConcreteStock();
        concreteStock.setName("股票一");
        concreteStock.setPrice(10.53);

        Buyer concreteBuyer1, concreteBuyer2;
        concreteBuyer1 = new ConcreteBuyer("股民一");
        concreteBuyer2 = new ConcreteBuyer("股民二");

        concreteStock.addBuyer(concreteBuyer1);
        concreteStock.addBuyer(concreteBuyer2);
        concreteStock.changePrice(10.00);
        concreteStock.changePrice(12.00);
    }
}
