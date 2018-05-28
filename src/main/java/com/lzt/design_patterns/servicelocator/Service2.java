package com.lzt.design_patterns.servicelocator;

/**
 * Created by viruser on 05/28.
 */
public class Service2 implements Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    public String getName() {
        return "Service2";
    }
}
