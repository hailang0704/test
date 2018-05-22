package com.lzt.design_patterns.nullobject;

/**
 * Created by viruser on 05/22.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
