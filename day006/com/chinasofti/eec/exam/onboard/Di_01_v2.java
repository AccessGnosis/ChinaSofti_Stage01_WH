package com.chinasofti.eec.exam.onboard;

import java.util.Scanner;

public class Di_01_v2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������֣�");
		long input = scan.nextLong();
		long temp = input;
		long reverse = 0L;
		while (input != 0) {
			reverse = reverse * 10 + input % 10;
			input = input / 10;
		}
		if (temp == reverse) {
			System.out.println(temp + "�ǻ���");
		} else {
			System.out.println(temp + "���ǻ���");
		}
	}

}
