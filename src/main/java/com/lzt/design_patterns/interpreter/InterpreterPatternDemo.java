package com.lzt.design_patterns.interpreter;

/**
 * Created by viruser on 05/16.
 * 创建一个Teminal对象返回boolean，然后组合表达式
 * a对象先持有一个b对象，再对b对象进行操作
 */
public class InterpreterPatternDemo {

    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
