package com.lzt.design_patterns.front;

public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        System.out.println("--------------------------------");
        frontController.dispatchRequest("HOME");
        System.out.println("--------------------------------");
        frontController.dispatchRequest("STUDENT");
    }
}
