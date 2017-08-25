/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_2_Shape.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午3:55:44
*/
package com.chinasofti.eec.day011.homework;

public class Di_2_Shape {

	public static void main(String[] args) {
		Shape s1 = new Square(10);
		Shape c1 = new Circle(10);
		Shape h1 = new Hexagon(10);

		System.out.println("矩形的面积是：" + s1.calcArea());
		System.out.println("圆形的面积是：" + c1.calcArea());
		System.out.println("六边形的面积是：" + h1.calcArea());
	}

}

abstract class Shape {
	private double sidelength;

	public Shape(double sidelength) {
		this.sidelength = sidelength;
	}

	public double getSidelength() {
		return sidelength;
	}

	public abstract double calcArea();
}

class Square extends Shape {

	public Square(double sidelength) {
		super(sidelength);
	}

	@Override
	public double calcArea() {
		return 0.0625 * Math.pow(getSidelength(), 2);
	}

}

class Circle extends Shape {

	public Circle(double sidelength) {
		super(sidelength);
	}

	@Override
	public double calcArea() {
		return 0.0796 * Math.pow(getSidelength(), 2);
	}

}

class Hexagon extends Shape {

	public Hexagon(double sidelength) {
		super(sidelength);
	}

	@Override
	public double calcArea() {
		return 0.0721 * Math.pow(getSidelength(), 2);
	}

}