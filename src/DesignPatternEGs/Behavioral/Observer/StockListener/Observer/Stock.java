package DesignPatternEGs.Behavioral.Observer.StockListener.Observer;

import DesignPatternEGs.Behavioral.Observer.StockListener.Subject.Buyer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// 抽象股票类：抽象观察目标类
public abstract class Stock {
    private String name;
    private Double price;
    protected List<Buyer> buyerList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void addBuyer(Buyer buyer) {
        this.buyerList.add(buyer);
    }

    public void removeBuyer(Buyer buyer) {
        this.buyerList.remove(buyer);
    }

    public void changePrice(Double price) {
        Double absGap = Math.abs(price - this.price);
        Double changePercent =
                new BigDecimal(absGap).divide(new BigDecimal(this.price), 4, BigDecimal.ROUND_HALF_UP).doubleValue();
        this.price = price;
        if (changePercent >= 0.05) {
            nofityBuyer();
        }
    }

    public abstract void nofityBuyer();
}
