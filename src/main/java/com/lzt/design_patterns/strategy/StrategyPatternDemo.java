package com.lzt.design_patterns.strategy;

/**
 * Created by viruser on 05/22.
 * 一个行为随着策略对象的改变而改变
 * 创建各种策略对象
 * 行为context随着策略对象的变化而变化
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperateAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperateSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperateMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
