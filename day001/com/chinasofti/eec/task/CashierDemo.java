package com.chinasofti.eec.task;

import java.util.Scanner;

public class CashierDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("请输入单价（￥）：");
			double unitPrice = scan.nextDouble();
			System.out.print("请输入数量：");
			int quantity = scan.nextInt();
			System.out.print("应收金额为：");
			System.out.println(unitPrice * quantity);
			System.out.print("实收金额为：");
			double reciveMoney = scan.nextDouble();
			if (reciveMoney < unitPrice * quantity) {
				System.out.println("您还有" + (unitPrice * quantity - reciveMoney)+ "元没有收齐");
			} else {
				System.out.print("找零：");
				System.out.println(reciveMoney - (unitPrice * quantity));
			}
		}
	}

}
