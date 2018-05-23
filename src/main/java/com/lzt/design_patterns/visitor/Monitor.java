package com.lzt.design_patterns.visitor;

/**
 * Created by viruser on 05/23.
 */
public class Monitor  implements ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
