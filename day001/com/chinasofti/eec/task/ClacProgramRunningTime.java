package com.chinasofti.eec.task;

import java.util.Scanner;

public class ClacProgramRunningTime {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner scan = new Scanner(System.in);
		System.out.println("��������������������");
		int a = scan.nextInt();
		long end = System.currentTimeMillis();
		long time = (end - start) / 1000;
		System.out.println("�˳��������ˣ� " + time + " ��");
	}
}
