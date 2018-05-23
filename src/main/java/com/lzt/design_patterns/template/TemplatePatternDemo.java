package com.lzt.design_patterns.template;

/**
 * Created by viruser on 05/23.
 * 定义的末班设为final类型，而具体行为放到子类来实现
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
