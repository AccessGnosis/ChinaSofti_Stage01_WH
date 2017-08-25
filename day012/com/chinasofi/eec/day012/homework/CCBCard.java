/**
* Describe: 建设银行卡类
* Keyword: 
* Hint: 
* Filename: CCBCard.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午3:04:55
*/
package com.chinasofi.eec.day012.homework;

/**建设银行卡首先是卡，继承了银行卡的功能，然后需要实现CCB接口已实现功能
 */
public class CCBCard extends Card implements CCB {
	static long totalCardNum = 0; // 为了计数，看这种卡有多少人办理，非必须

	public CCBCard(double remaining, String password) {
		super(remaining, password);// 调用父类Card的构造方法，定义remaining（余额）和password（密码）
		totalCardNum++;// 卡的数量自增
	}

	@Override
	public boolean payUtilityBills(String to, double money) { // 实现建行特有的功能——交电费
		if (getRemaining() - money >= 0) { // 如果余额充足
			double list = getRemaining() - money; // 重新计算余额
			setRemaining(list); // 设置余额
			System.out.println("支付成功"); // 提示信息
			System.out.println("您本次交电费：" + money + "元");
			System.out.println("余额：" + getRemaining());
			return true;
		} else {
			return false;
		}
	}

}
