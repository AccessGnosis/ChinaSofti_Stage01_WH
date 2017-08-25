/**
* Describe: 学生类实例
* Keyword: 类
* Hint: 
* Filename: StudentClassDemo.java
* Copyright 2017-02-09 By Gnosis. Allright reserved.
* Time: 上午9:30:49
*/
package com.chinasofti.eec.day007;

public class StudentClassDemo {
	// 面向过程的方法
	public static void main(String[] args) {
		String name = "程鑫峰";
		int age = 18;
		double score = 59;

		print(name, age, score);

		Student st1 = new Student();
		st1.name = "新锐";
		st1.age = 19;
		st1.score = 89;

		Student st2 = new Student();
		st2.name = "程鑫峰";
		st2.age = 18;
		st2.score = 59;

		st1.print();
		st1.study();
		st1.run();

		st2.print();
		st2.study();
		st2.run();
	}

	public static void print(String name, int age, double score) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
	}
}

class Student {
	// 对象所共有的属性/特征
	String name; // 成员变量
	int age;
	double score;

	// 对象所共有的行为/方法
	public void print() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.score);
	}

	public void study() {
		int sno = 02; // 局部变量
		System.out.println(this.name + "在学习");
	}

	public void run() {
		System.out.println(this.name + "在跑步");
	}
}