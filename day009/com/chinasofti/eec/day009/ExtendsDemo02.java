/**
* Describe: 演示继承中的构造方法和注意事项
* Keyword: constructor, extends, attention
* Hint: 实例化子类先调用子类无参构造，然后再调用父类无参构造
* Filename: ExtendsDemo02.java
* Copyright 2017-02-13 By Gnosis. Allright reserved.
* Time: 下午3:02:49
*/
package com.chinasofti.eec.day009;

public class ExtendsDemo02 {

	public static void main(String[] args) {
		Eoo e = new Eoo();
	}

}

class Doo {
	Doo() {
		System.out.println("父类的无参构造");
	}
}

class Eoo extends Doo {
	Eoo() {
		// super();//调用父类的无参构造方法
		System.out.println("子类的无参构造");
	}
}