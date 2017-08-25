/**
* Describe: ATM机，通用ATM机
* Keyword: 
* Hint: 
* Filename: ATM.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: 下午4:55:13
*/
package com.chinasofi.eec.day012.homework;

import java.util.Scanner;

/**ATM类是所有银行ATM机的父类
所有银行的ATM机继承此类*/
public class ATM {
	private Unionpay card; // 银联卡

	public void insertCard(Unionpay card) { // 插卡
		this.card = card;
	}

	public boolean run() { // ATM机运行方法
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入密码：");
		String pwd = scan.next();// 接收用户输入密码
		if (pwd.equals(((Card) card).getPassword())) {// 将用户输入密码和卡本身的密码做比较，因为卡是Unionpay的卡，所以要向下转，获取getPassword()的方法
			int command = 0;// 定义用户输入命令，用于控制逻辑交互
			do {// 进入循环，直至用户业务办理完成
				System.out.println("请选择功能：");
				System.out.println("1.查询余额  2.取款  3.交费  0.退出");
				command = scan.nextInt();// 获取用户输入命令

				switch (command) {// 根据用户输入命令进行行为判断
				case 1:// 如果用户需要查询余额
					System.out.println("您的余额是（元）：" + card.getRemaining());// 输出显示余额
					break; // 余额查询完成
				case 2:
					System.out.print("请输入您的取款金额：");
					int takenMoney = scan.nextInt();// 获取用户需要取款金额
					card.withdrawingMoney(takenMoney);// 调用card的withdrawingMoney()方法，takenMoney是需要取款的金额
					break;// 取款结束
				case 3:
					System.out.println("根据您所在银行的业务为您选择服务类型"); // 根据卡类型进行不同银行的业务判断
					if (card instanceof CCBCard) { // 如果卡是建行卡，那么就可以交电费
						System.out.println("您可以使用您的建行卡交电费（中国电网）");
						System.out.print("请输入您要缴费的金额：");
						double toMoney = scan.nextDouble(); // 获得缴费金额
						((CCBCard) card).payUtilityBills("中国电网", toMoney); // 调用CCBCard的特有功能——交电费
																			// //为了方便，只将付款金额传入方法
					}
					if (card instanceof ICBCCard) { // 如果卡是工行卡，那么久可以交话费
						System.out.println("您可以使用您的工行卡交话费");
						System.out.print("请输入您要缴费的电话号码：");
						String phoneNum = scan.next(); // 获得电话号码
						System.out.print("请输入您要缴费的金额：");
						double toMoney = scan.nextDouble(); // 获得缴费金额
						((ICBCCard) card).payCommunicationExpense("中国联通",
								phoneNum, toMoney); // 调用ICBCCard的特有功能——交话费
													// //为了方便，只将付款金额传入方法
					}
					if (card instanceof ABCCard) { // 如果卡是农行卡，那么就可以在线支付
						System.out.println("您可以使用您的农行卡在线支付");
						System.out.print("请输入您要付款的金额：");
						double toMoney = scan.nextDouble(); // 获取缴费金额
						((ABCCard) card).payOnline("20170214757289478329147",
								"京东", "1410074102", 100); // 调用ABCCard的特有功能——在线支付
															// //为了方便，只将付款金额传入方法
					}
					break;
				case 0:
					System.out.println("谢谢您的使用，请收好卡片");// 如果选择退出，结束循环
					break;
				default:
					System.out.println("您的指令输入有误，请重新输入");// 如果没有正确选择办理业务类型
					break;
				}
			} while (command != 0);
			return true;
		} else {// 如果密码验证错误
			System.out.println("密码输入错误");
			return false;
		}
	}
}
