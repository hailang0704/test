package com.lzt.design_patterns.servicelocator;

/**
 * Created by viruser on 05/28.
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        System.out.println("------------------------------");
        service = ServiceLocator.getService("Service2");
        service.execute();
        System.out.println("------------------------------");
        service = ServiceLocator.getService("Service1");
        service.execute();
        System.out.println("------------------------------");
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
