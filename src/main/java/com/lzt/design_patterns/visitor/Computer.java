package com.lzt.design_patterns.visitor;

/**
 * Created by viruser on 05/23.
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }


    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
            System.out.println("-------------------");
        }
        computerPartVisitor.visit(this);
    }
}
