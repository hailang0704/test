package com.lzt.design_patterns.factory;

/**
 * 工厂设计模式：
 * 1.简单工厂模式
 * 2.工厂方法模式
 * 3.抽象工厂模式
 */
public class Factory {
    public static void main(String[] args) throws Exception {
        System.out.println("-------simpleFactory--------------");
        simpleDriver();
        System.out.println("-------methodFactory--------------");
        methodFactory();

    }
    private static void methodFactory() {
        Driver driver = new AudiDriver();
        driver.driverCar().drive();
        driver = new BenzDriver();
        driver.driverCar().drive();
        driver = new BmwDriver();
        driver.driverCar().drive();
    }

    private static void simpleDriver() throws Exception {
        Car car = SimpleFactory.driverCar("Audi");
        car.drive();
        car = SimpleFactory.driverCar("Bmw");
        car.drive();
        car = SimpleFactory.driverCar("Benz");
        car.drive();
    }


}
