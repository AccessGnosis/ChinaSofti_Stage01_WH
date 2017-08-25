/**
* Describe: 重写方法的注意事项
* Keyword: 重写方法
* Hint: 子类方法的返回值和父类方法的返回类型必须相同
* Filename: OverrideDemo03.java
* Copyright 2017-02-14 By Gnosis. Allright reserved.
* Time: 上午10:01:18
*/
package com.chinasofti.eec.day010;

public class OverrideDemo03 {

	public static void main(String[] args) {

	}

}

class Coo {
	void show() {

	}

	double say() {
		return 0.0;
	}

	Coo test() {
		return null;
	}
}

class Doo extends Coo {
	// int show() {//void重写时必须相同；void 父类类型方法无返回值，子类方法不能有返回值
	void show() {
		return;
	}

	// int say(){ //基本类型重写时必须相同；必须是double类型，和父类的方法一样
	double say() {
		return 1.0;
	}

	// Coo test() { // 引用类型重写时等于父类
	// return new Coo();
	// }
	Doo test() {// 引用类型重写小于父类类型
		return new Doo();
	}
	// 引用类型可以小于等于父类
	// Eoo test(){
	// return new Eoo();
	// }
}

class Eoo {

}