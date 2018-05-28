package com.lzt.design_patterns.servicelocator;

/**
 * Created by viruser on 05/28.
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    /**
     * 确定从缓存中取，还是创造实例
     * @param jndiName
     * @return
     */
    public static Service getService(String jndiName){

        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
