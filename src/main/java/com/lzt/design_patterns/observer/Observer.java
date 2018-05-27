package com.lzt.design_patterns.observer;

/**
 * Created by viruser on 05/21.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
