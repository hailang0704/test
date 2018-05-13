package com.lzt.design_patterns.factory;


public class MehtodFactory {
}

interface Driver {
    Car driverCar();
}

class BmwDriver implements Driver {
    public Car driverCar() {
        return new Bmw();
    }
}

class AudiDriver implements Driver {
    public Car driverCar() {
        return new Audi();
    }
}
class BenzDriver implements Driver {
    public Car driverCar() {
        return new Benz();
    }
}


