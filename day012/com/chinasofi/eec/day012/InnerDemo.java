/**
* Describe: �ڲ���
* Keyword: 
* Hint: 
* Filename: InnerDemo.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: ����3:16:11
*/
package com.chinasofi.eec.day012;

public class InnerDemo {

	public static void main(String[] args) {
		Mama m = new Mama();
		// Baby b = new Baby();// ��������ڲ����൱�����ⲿ��ĳ�Ա�������пɼ���
		Mama.Baby b = m.createBaby();
		b.getMamaName();
	}

}

class Mama {
	private String name;

	Baby createBaby() {
		return new Baby(); // ����Baby����
	}

	class Baby {
		void getMamaName() {
			System.out.println(name);
			System.out.println(Mama.this.name); // ��ʽ�����ã�����.this.
			// System.out.println(this.name); // ����Baby��û��name����
		}
	}
}