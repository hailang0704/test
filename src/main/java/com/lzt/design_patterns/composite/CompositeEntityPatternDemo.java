package com.lzt.design_patterns.composite;

/**
 * Created by viruser on 05/25.
 * 组合实体，一层套一层
 * 组合实体更新，内部实体也更新
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println("------------------------------");
        client.setData("Test", "Data");
        System.out.println("------------------------------");
        client.printData();
        System.out.println("------------------------------");
        client.setData("Second Test", "Data1");
        System.out.println("------------------------------");
        client.printData();
    }
}
