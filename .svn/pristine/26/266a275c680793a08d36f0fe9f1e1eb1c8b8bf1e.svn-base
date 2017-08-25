/**
* Describe: 实现会员注册，要求用户名长度不小于3，密码长度不小于6，注册时两次输入密码必须相同 （字符串）
* Keyword: 
* Hint: 
* Filename: Di_05_RegUser.java
* Copyright 2017-02-11 By Gnosis. Allright reserved.
* Time: 下午3:03:36
*/
package com.chinasofti.eec.lft.task;

import java.util.Scanner;

public class Di_05_RegUser {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String username = null;
		String password = null;
		String password_comfirm = null;

		while (true) {
			System.out.print("请输入用户名：");
			username = scan.next();
			if (username.length() > 3) {
				break;
			} else {
				System.out.println("用户名不能小于3位，请重新设置");
			}
		}
		do {
			System.out.print("请输入密码：");
			password = scan.next();
			if (password.length() < 6) {
				System.out.println("密码不能小于6位，请重新设置");
				continue;
			}
			System.out.print("请再次输入密码：");
			password_comfirm = scan.next();
			if (password.equals(password_comfirm) == false) {
				System.out.println("两次密码输入不一致，请重新输入");
			}
		} while (password.equals(password_comfirm) == false);
		System.out.println("注册成功");
		System.out.println("用户名：" + username);
		System.out.println("密码：" + password);
	}

}
