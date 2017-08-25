/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: Di_1.java
* Copyright 2017-02-14 By Gnosis. Allright reserved.
* Time: 下午5:48:19
*/
package com.chinasofti.eec.day010.homework;

public class Di_1 {
	public void fly() {
		System.out.println("我只能在地上奔跑...");
	}

	public static void main(String[] args) {
		Di_1 os = new Di_1();
		os.fly();
	}

}

class Bird {
	public void fly() {
		System.out.println("我在天空里自由自在的飞翔...");
	}
}
