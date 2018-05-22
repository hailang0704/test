package com.lzt.design_patterns.strategy;

/**
 * Created by viruser on 05/22.
 */
public class OperateAdd implements Strategy{
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
