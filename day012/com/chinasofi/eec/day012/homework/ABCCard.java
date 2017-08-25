/**
* Describe: 农行卡
* Keyword: 
* Hint: 
* Filename: ABCCard.java
* Copyright 2017-02-15 By Gnosis. Allright reserved.
* Time: 下午3:01:48
*/
package com.chinasofi.eec.day012.homework;

/**农行卡，继承了Card通用类，实现了ABC的接口
所以它有了通用银行卡的所有功能，也有了ABC的特有业务（在线支付）*/
public class ABCCard extends Card implements ABC {
	static long totalCardNum = 0;	//为了计数，看这种卡有多少人办理，非必须

	public ABCCard(double remaining, String password) {	//ABCCard的构造方法
		super(remaining, password);	//调用父类Card的构造方法，定义remaining（余额）和password（密码）
		totalCardNum++;	//卡的数量自增
	}

	@Override
	public boolean payOnline(String from, String to, String account,
			double money) {	//实现在线支付功能
		if (getRemaining() >= money) {	//如果余额 大于 需要支付的金额
			double list = getRemaining() - money;	//重新计算余额
			setRemaining(list);	//卡设置余额
			System.out.println("支付成功");	//支付成功，输出以下信息
			System.out.println("您本次线上支付：" + money + "元");
			System.out.println("余额：" + getRemaining());
			return true;	//返回真，方便其他程序进行逻辑判断
		} else {	//余额不足返回假
			return false;
		}
	}
}
