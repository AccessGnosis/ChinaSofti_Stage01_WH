package com.chinasofti.eec.exam.onboard;

public class Di_06_v2 {

	public static void main(String[] args) {
		int num = 1020;
		int day = 0;
		do {
			num = num - (num / 2 + 2);
			day++;
			System.out.println("��" + day + "���ʣ��" + num + "������");
		} while (num > 0);
		System.out.println("��" + day + "�������");
	}

}
