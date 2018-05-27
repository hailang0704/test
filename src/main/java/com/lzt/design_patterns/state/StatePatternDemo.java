package com.lzt.design_patterns.state;

/**
 * Created by viruser on 05/21.
 * 一个类随着状态的改变而改变
 * context为行为
 * state为状态
 * 不同的状态给context赋予不同的值，使其有不同的状态
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);//使context持有不同的状态

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
