/**
* Describe: 工行卡
* Keyword: 
* Hint: 
* Filename: ICBCCard.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午3:05:04
*/
package com.chinasofi.eec.day012.homework;

/**
 * 工行卡，继承了Card通用类，实现了ICBC的接口
 *所以它有了通用银行卡的所有功能，也有了ICBC的特有业务（交话费）
 */
public class ICBCCard extends Card implements ICBC {
	static long totalCardNum = 0;// 为了计数，看这种卡有多少人办理，非必须

	public ICBCCard(double remaining, String password) {// ICBCCard的构造方法
		super(remaining, password);// 调用父类Card的构造方法，定义remaining（余额）和password（密码）
		totalCardNum++; // 卡的数量自增
	}

	@Override
	public boolean payCommunicationExpense(String to, String phoneNum,
			double money) { // 实现工行卡的交话费功能
		if (getRemaining() - money >= 0) { // 余额充足
			double list = getRemaining() - money; // 重新计算余额
			setRemaining(list); // 卡设置余额
			System.out.println("支付成功");// 支付成功，输出以下信息
			System.out.println("您本次为 " + phoneNum + " 交话费：" + money + "元");
			System.out.println("余额：" + getRemaining());
			return true;// 返回真，方便其他程序进行逻辑判断
		} else {// 余额不足返回假
			return false;
		}
	}

}
