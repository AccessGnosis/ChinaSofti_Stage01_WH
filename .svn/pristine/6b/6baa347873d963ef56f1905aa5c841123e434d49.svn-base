package com.chinasofti.eec.task;

import java.util.Scanner;

public class CashierDemo_v2_0 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入单价（￥）：");
		double unitPrice = scan.nextDouble();
		System.out.print("请输入数量：");
		double quantity = scan.nextInt();

		double totalPrice = unitPrice * quantity;
		double priceReviceable = totalPrice;

		System.out.print("应收金额为：");
		if (totalPrice >= 500) {
			totalPrice *= 0.8;
			System.out.println(totalPrice);
			System.out.println("优惠金额为：" + priceReviceable * 0.2);
		}
		System.out.println(totalPrice);
		System.out.print("实收金额为：");
		double reciveMoney = scan.nextDouble();
		System.out.print("找零：");
		System.out.println(reciveMoney - totalPrice);
	}
}
