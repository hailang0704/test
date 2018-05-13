package com.lzt.design_patterns.factory;

//抽象产品角色
public interface Car {
    public void drive();
}

//具体产品角色
class Benz implements Car {
    public void drive() {
        System.out.println("Driving Benz ");
    }
}

class Bmw implements Car {
    public void drive() {
        System.out.println("Driving Bmw ");
    }
}

class Audi implements Car {
    public void drive() {
        System.out.println("Driving Audi ");
    }
}