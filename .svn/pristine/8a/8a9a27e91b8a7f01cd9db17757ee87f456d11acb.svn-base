/**
* Describe: 9、	根据类Student的定义，创建五个该类的对象，输出每个学生的信息，
* 				计算并输出这五个学生Java语言成绩的平均值，以及计算并输出他们Java语言成绩的最大值和最小值。
* Keyword: 
* Hint: 
* Filename: Di_09_ClacStuScore.java
* Copyright 2017-02-11 By Gnosis. Allright reserved.
* Time: 下午4:01:31
*/
package com.chinasofti.eec.lft.task;

public class Di_09_ClacStuScore {

	public static void main(String[] args) {
		Student[] st = new Student[] { new Student("张三", 69), new Student("李四", 99), new Student("王五", 59),
				new Student("赵六", 64), new Student("周七", 78) };
		double sum = 0;
		double min = st[0].getScore();
		double max = st[0].getScore();
		String maxName = null;
		String minName = null;

		for (int i = 0; i < st.length; ++i) {
			sum += st[i].getScore();
			System.out.println(st[i].getName() + "同学的java成绩是：" + st[i].getScore());
			if (st[i].getScore() > max) {
				max = st[i].getScore();
				maxName = st[i].getName();
			}
			if (st[i].getScore() < min) {
				min = st[i].getScore();
				minName = st[i].getName();
			}
		}
		System.out.println();
		System.out.println("这" + st.length + "位同学Java的平均成绩是：" + sum / st.length);
		System.out.println("这" + st.length + "位同学Java的最低分是：" + minName + "：" + min + "分");
		System.out.println("这" + st.length + "位同学Java的最高分是：" + maxName + "：" + max + "分");
	}

}

class Student {
	private String name;
	private double score;

	public Student(String name, double score) {
		this.name = name;
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public String getName() {
		return name;
	}
}