package com.lzt.design_patterns.prototype;

public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}