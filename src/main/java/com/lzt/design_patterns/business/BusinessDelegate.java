package com.lzt.design_patterns.business;

/**
 * Created by viruser on 05/24.
 * 持有对象并调用对象的方法操作对象
 * 持有属性，并提供方法，供外界操作属性
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
