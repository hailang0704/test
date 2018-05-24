package com.lzt.design_patterns.business;

/**
 * Created by viruser on 05/24.
 */
public class EJBService implements BusinessService {

    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
