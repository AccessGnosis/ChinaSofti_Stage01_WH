package com.chinasofti.eec.task;

import java.util.Scanner;

//�����û������һ�����䣬�ж��Ƿ���18��50֮��
public class JudgeAge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("�������������䣺");
			int age = scan.nextInt();

			if (age >= 18 && age <= 50) {
				System.out.println("����������18��50��֮��");
			} else {
				System.out.println("�������䲻��18��50��֮��");
			}

			System.out.print("��Ҫ�����ж�ô��(y/n)");
			if (scan.next().equals("n")) {
				break;
			}
		}
	}
}
