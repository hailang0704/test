package com.lzt.design_patterns.visitor;

/**
 * Created by viruser on 05/23.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
