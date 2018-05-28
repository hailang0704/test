package com.lzt.design_patterns.servicelocator;

/**
 * Created by viruser on 05/28.
 */
public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }

    public String getName() {
        return "Service1";
    }
}
