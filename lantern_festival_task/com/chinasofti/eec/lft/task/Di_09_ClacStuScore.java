/**
* Describe: 9��	������Student�Ķ��壬�����������Ķ������ÿ��ѧ������Ϣ��
* 				���㲢��������ѧ��Java���Գɼ���ƽ��ֵ���Լ����㲢�������Java���Գɼ������ֵ����Сֵ��
* Keyword: 
* Hint: 
* Filename: Di_09_ClacStuScore.java
* Copyright 2017-02-11 By Gnosis. Allright reserved.
* Time: ����4:01:31
*/
package com.chinasofti.eec.lft.task;

public class Di_09_ClacStuScore {

	public static void main(String[] args) {
		Student[] st = new Student[] { new Student("����", 69), new Student("����", 99), new Student("����", 59),
				new Student("����", 64), new Student("����", 78) };
		double sum = 0;
		double min = st[0].getScore();
		double max = st[0].getScore();
		String maxName = null;
		String minName = null;

		for (int i = 0; i < st.length; ++i) {
			sum += st[i].getScore();
			System.out.println(st[i].getName() + "ͬѧ��java�ɼ��ǣ�" + st[i].getScore());
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
		System.out.println("��" + st.length + "λͬѧJava��ƽ���ɼ��ǣ�" + sum / st.length);
		System.out.println("��" + st.length + "λͬѧJava����ͷ��ǣ�" + minName + "��" + min + "��");
		System.out.println("��" + st.length + "λͬѧJava����߷��ǣ�" + maxName + "��" + max + "��");
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