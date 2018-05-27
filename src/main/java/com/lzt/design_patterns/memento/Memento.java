package com.lzt.design_patterns.memento;

/**
 * Created by viruser on 05/21.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
