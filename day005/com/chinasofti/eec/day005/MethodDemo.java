package com.chinasofti.eec.day005;

public class MethodDemo {
	public static void main(String[] args) {
		sayMethod();
		sayMethod("大家好");
		sayMethod(123321);

		String str = say();
		System.out.println(str);
		System.out.println(say()); // 不建议，方法嵌套方法

		double sum = sum(Math.PI, Math.E);
		System.out.println(sum);
	}

	// 无参无返回值
	public static void sayMethod() {
		System.out.println("sayMethod()方法被调用了");
		return;
	}

	// 有参无返回值
	public static void sayMethod(String str) {
		System.out.println("sayMethod()方法说:" + str);
	}

	// 有参无返回值
	public static void sayMethod(int a) {
		System.out.println("sayMethod()方法说:" + a);
	}

	// 无参有返回值
	public static String say() {
		// return的数据类型要和返回值一致
		return "say()无参有返回值的方法"; // return：结束方法的执行，返回一个结果给调用方法
	}

	// 有参有返回值
	public static double sum(double a, double b) {
		return a + b;
	}
}
