package com.lzt.design_patterns.proxy;

/**
 * Created by viruser on 05/15.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        System.out.println("---------------");
        //图像将从磁盘加载
        image.display();
        System.out.println("---------------");
        //图像将无法从磁盘加载
        image.display();
    }
}
