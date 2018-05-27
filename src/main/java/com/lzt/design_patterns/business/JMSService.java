package com.lzt.design_patterns.business;

/**
 * Created by viruser on 05/24.
 */
public class JMSService implements BusinessService {

    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
