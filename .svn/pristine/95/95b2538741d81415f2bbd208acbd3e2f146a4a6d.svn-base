/**
* Describe: 内部类
* Keyword: 
* Hint: 
* Filename: InnerDemo.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: 下午3:16:11
*/
package com.chinasofi.eec.day012;

public class InnerDemo {

	public static void main(String[] args) {
		Mama m = new Mama();
		// Baby b = new Baby();// 编译错误，内部类相当于是外部类的成员，不具有可见性
		Mama.Baby b = m.createBaby();
		b.getMamaName();
	}

}

class Mama {
	private String name;

	Baby createBaby() {
		return new Baby(); // 创建Baby对象
	}

	class Baby {
		void getMamaName() {
			System.out.println(name);
			System.out.println(Mama.this.name); // 隐式的引用：类名.this.
			// System.out.println(this.name); // 报错，Baby中没有name属性
		}
	}
}