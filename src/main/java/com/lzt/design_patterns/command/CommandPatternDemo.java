package com.lzt.design_patterns.command;

/**
 * Created by viruser on 05/16.
 * 调用者Demo-->接受者broker-->命令Order
 * 命令包含在Order对象中，每个命令是一个类，这随时的拓展命令
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
