/**
* Describe: 10��	��Ŀ������ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ��������������
* 				�������Ա����������������a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ�������
* Keyword: 
* Hint: 
* Filename: Di_10_GameListGeneration.java
* Copyright 2017-02-11 By Gnosis. Allright reserved.
* Time: ����4:15:45
*/
package com.chinasofti.eec.lft.task;

public class Di_10_GameListGeneration {

	public static void main(String[] args) {
		char[] no1 = new char[] { 'a', 'b', 'c' };
		char[] no2 = new char[] { 'x', 'y', 'z' };

		for (int i = 0; i < no1.length; ++i) {
			for (int j = 0; j < no2.length; ++j) {
				if ((no1[i] == 'a' && no2[j] == 'x')) {
					continue;
				} else if (no1[i] == 'c' && (no2[j] == 'x' || no2[j] == 'z')) {
					continue;
				} else {
					System.out.println(no1[i] + "<-->" + no2[j]);
				}
			}
		}
	}

}
