/**
* Describe: ��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������ڵ�10�����ʱ�������������ף���10�η�����ߣ� 
* Keyword: 
* Hint: 
* Filename: Di_06_MarblesProblem.java
* Copyright 2017-02-11 By Gnosis. Allright reserved.
* Time: ����3:17:29
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
		System.out.println("С������" + calc + "��");
		System.out.println("��10�η���" + height + "��");
	}

}
