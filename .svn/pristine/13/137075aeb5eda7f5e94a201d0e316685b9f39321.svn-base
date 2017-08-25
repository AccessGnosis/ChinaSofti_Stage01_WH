/**
* Describe: 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？ 
* Keyword: 
* Hint: 
* Filename: Di_06_MarblesProblem.java
* Copyright 2017-02-11 By Gnosis. Allright reserved.
* Time: 下午3:17:29
*/
package com.chinasofti.eec.lft.task;

public class Di_06_MarblesProblem {

	public static void main(String[] args) {
		double height = 100;
		double calc = 100;

		for (int i = 1; i <= 10; ++i) {
			calc += height;
			height /= 2;
		}
		System.out.println("小球共走了" + calc + "米");
		System.out.println("第10次反弹" + height + "米");
	}

}
