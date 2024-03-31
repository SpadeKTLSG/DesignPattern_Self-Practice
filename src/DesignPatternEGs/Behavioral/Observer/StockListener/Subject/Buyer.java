package DesignPatternEGs.Behavioral.Observer.StockListener.Subject;

import DesignPatternEGs.Behavioral.Observer.StockListener.Observer.Stock;

// 抽象买家类：抽象观察者类
public abstract class Buyer {
    protected String name;

    public Buyer(String name) {
        this.name = name;
    }

    public abstract void focus(Stock stock);
}
