package com.chinasofti.eec.day001;

import java.util.Scanner; //1.导入API

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 2.创建对象
		System.out.print("请输入：");
		int a = scan.nextInt(); // 3.从键盘获取一个整数，赋值给a

		System.out.println(a);
	}

}
