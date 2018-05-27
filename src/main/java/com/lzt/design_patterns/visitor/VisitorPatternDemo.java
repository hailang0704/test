package com.lzt.design_patterns.visitor;

/**
 * Created by viruser on 05/23.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
