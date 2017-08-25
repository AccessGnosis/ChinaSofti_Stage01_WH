/**
* Describe: 抽象类案例
* Keyword: 
* Hint: 
* Filename: AbstractDemo_Shape.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 上午10:11:29
*/
package com.chinasofti.eec.day011;

public class AbstractDemo_Shape {
	public static void main(String[] args) {
		// Shape s = new Shape(); //抽象类不能被实例化

		Shape s1 = new Square(2); // 向上造型
		System.out.println(s1.area());

		Shape c1 = new Circle(10);
		System.out.println(c1.area());

		// 相同周长c求哪个图形面积大
		Shape[] shapes = new Shape[2]; // 只开辟空间，没有实例化
		shapes[0] = new Square(1); // 向上造型
		shapes[1] = new Circle(1);

		Shape[] shapes1 = new Shape[2];
		shapes1[0] = new Square(4);
		shapes1[1] = new Circle(4);

		max(shapes);
		max(shapes1);
	}

	public static void max(Shape[] shapes) {
		// 假设第一个元素面积最大
		double max = shapes[0].area();
		int maxIndex = 0; // 记录最大值的下标

		for (int i = 1; i < shapes.length; ++i) {
			if (shapes[i].area() > max) {
				max = shapes[i].area(); // 将最大面积改为较大的那一个
				maxIndex = i; // 修改最大面积的下标
			}
		}
		System.out.println("最大面积：" + max + "，所在的索引为：" + maxIndex);
	}
}

abstract class Shape {
	public double c;

	public Shape(double c) {
		this.c = c;
	}

	public abstract double area();
}

class Square extends Shape {
	public Square(double c) { // 构造方法
		super(c); // 调用父类的构造方法
	}

	@Override
	public double area() {// 重写抽象方法
		return c * c;
	}

}

class Circle extends Shape {
	public Circle(double c) {
		super(c);
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(c, 2);
	}
}