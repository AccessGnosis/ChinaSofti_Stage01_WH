package com.chinasofti.eec.task;

import java.util.Scanner;

public class CashierDemo_v2_0 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�����뵥�ۣ�������");
		double unitPrice = scan.nextDouble();
		System.out.print("������������");
		double quantity = scan.nextInt();

		double totalPrice = unitPrice * quantity;
		double priceReviceable = totalPrice;

		System.out.print("Ӧ�ս��Ϊ��");
		if (totalPrice >= 500) {
			totalPrice *= 0.8;
			System.out.println(totalPrice);
			System.out.println("�Żݽ��Ϊ��" + priceReviceable * 0.2);
		}
		System.out.println(totalPrice);
		System.out.print("ʵ�ս��Ϊ��");
		double reciveMoney = scan.nextDouble();
		System.out.print("���㣺");
		System.out.println(reciveMoney - totalPrice);
	}
}
