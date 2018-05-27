package com.lzt.design_patterns.nullobject;

/**
 * Created by viruser on 05/22.
 * 两个子类实现父类，当不满足条件时返回null子类，相当于返回了一个默认的值而代替null
 */
public class NullPatternDemo {
    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers：");
        System.out.println("----------------------------");
        System.out.println(customer1.getName());
        System.out.println(customer1.isNil());
        System.out.println("----------------------------");
        System.out.println(customer2.getName());
        System.out.println(customer2.isNil());
        System.out.println("----------------------------");
        System.out.println(customer3.getName());
        System.out.println(customer3.isNil());
        System.out.println("----------------------------");
        System.out.println(customer4.getName());
        System.out.println(customer4.isNil());
    }
}
