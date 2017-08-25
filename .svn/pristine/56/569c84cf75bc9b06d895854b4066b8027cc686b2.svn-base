/**
* Describe: ABCATM（农业银行的ATM机）
* Keyword: 
* Hint: 
* Filename: ABCATM.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: 下午5:21:04
*/
package com.chinasofi.eec.day012.homework;

import java.util.Scanner;

/**定义农行ATM机，属于农行特有的
继承了ATM机父类*/
public class ABCATM extends ATM {
	private Unionpay card; // 银联卡

	public void insertCard(Unionpay card) { // 插卡方法
		this.card = card;
	}
	// 判断卡的类型
	public boolean judgeCardType() {
		if (card instanceof ABCCard) {// 如果是农行卡
			this.card = (ABCCard) card; // 将银联卡强制类型转换为农行卡
			return true; // 返回真的判断条件
		} else { // 如果不是农行卡
			return false;// 返回假的条件
		}
	}

	public boolean run() { // ATM机运行方法
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入密码：");
		String pwd = scan.next(); // 接收用户输入密码
		if (pwd.equals(((Card) card).getPassword())) { // 将用户输入密码和卡本身的密码做比较，因为卡是Unionpay的卡，所以要向下转，获取getPassword()的方法
			int command = 0; // 定义用户输入命令，用于控制逻辑交互
			do { // 进入循环，直至用户业务办理完成
				System.out.println("请选择功能：");
				System.out.println("1.查询余额  2.取款  3.在线支付  0.退出");
				command = scan.nextInt(); // 获取用户输入命令

				switch (command) { // 根据用户输入命令进行行为判断
				case 1: // 如果用户需要查询余额
					System.out.println("您的余额是（元）：" + card.getRemaining()); // 输出显示余额
					break; // 余额查询完成
				case 2:
					System.out.print("请输入您的取款金额：");
					int takenMoney = scan.nextInt();// 获取用户需要取款金额
					card.withdrawingMoney(takenMoney); // 调用card的withdrawingMoney()方法，takenMoney是需要取款的金额
					break;// 取款结束
				case 3:
					if (judgeCardType()) { // 判断卡类型
						// 如果是农行卡
						System.out.print("请输入您要付款的金额：");
						double toMoney = scan.nextDouble(); // 获取支付金额
						((ABCCard) card).payOnline("20170214757289478329147",
								"京东", "1410074102", toMoney); // 此处为了方便，其他参数为常量，只有toMoney（支付金额）可通过程序改变
					} else { // 如果不是农行卡
						System.out.println("您的卡不是农业银行的卡，无法在线支付");
					}
					break;
				case 0:
					System.out.println("谢谢您的使用，请收好卡片"); // 如果选择退出，结束循环
					break;
				default:
					System.out.println("您的指令输入有误，请重新输入"); // 如果没有正确选择办理业务类型
					break;
				}
			} while (command != 0);
			return true;
		} else { // 如果密码验证错误
			System.out.println("密码输入错误");
			return false;
		}
	}
}
