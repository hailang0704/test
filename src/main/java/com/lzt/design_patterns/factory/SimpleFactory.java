package com.lzt.design_patterns.factory;


import java.util.ArrayList;
import java.util.List;

public class SimpleFactory {
    //工厂类角色
    public static Car driverCar(String s) throws Exception {
        //判断逻辑,返回具体的产品角色给 Client
        if (s.equalsIgnoreCase("Benz"))
            return new Benz();
        else if (s.equalsIgnoreCase("Bmw"))
            return new Bmw();
        else if (s.equalsIgnoreCase("Audi"))
            return new Audi( ) ;
        else {
            return null;
        }
    }
    private int i;

    public int getI() {
        List<String> a = new ArrayList<String>();
        return i;
    }

    public void setI(int i) {
//
//  this.i = i;



    }


    public static void main(String[] args) {

    }
}
