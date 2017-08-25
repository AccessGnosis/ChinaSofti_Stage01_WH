/**
* Describe: 向上造型示例
* Keyword: 
* Hint: 
* Filename: UpwardDemo.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: 上午11:24:13
*/
package com.chinasofi.eec.day012;

public class UpwardDemo {
	public static void main(String[] args) {
		Aoo o = new Coo(); // 向上造型
		Boo o1 = (Boo) o; // 强转成功
		Coo co = (Coo) o; //
		// Doo do1 = (Doo)o; //抛出 java.lang.ClassCastException 异常
		if (o instanceof Coo) {
			Coo do2 = (Coo) o; // 类无法强制转换，不抛异常
			System.out.println("强转成功");
		} else {
			System.out.println("强转失败");
		}
	}
}

class Aoo {
	public void aooA() {

	}
}

interface Boo {
	public abstract void booA();
}

class Coo extends Aoo implements Boo {

	@Override
	public void booA() {
	}

}

class Doo extends Aoo {

}