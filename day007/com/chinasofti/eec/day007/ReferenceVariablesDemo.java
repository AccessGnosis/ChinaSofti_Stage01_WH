/**
* Describe: 引用类型变量之间的赋值问题
* Keyword: 引用类型赋值
* Hint: o	引用类型变量存储的是对象的地址信息。相同类型的引用类型变量之间可以相互赋值
*       o	引用类型变量之间的赋值不会创建新的对象，但有可能会使两个以上的引用指向同一个对象
*       其实就是指针的概念，e1和e2同时指向一个对象，而无论更改那个对象的数据另一个数据也会跟着改变
* Filename: ReferenceVariablesDemo.java
* Copyright 2017-02-09 By Gnosis. Allright reserved.
* Time: 下午2:23:20
*/
package com.chinasofti.eec.day007;

public class ReferenceVariablesDemo {

	public static void main(String[] args) {
		Emp02 e1 = new Emp02();
		Emp02 e2 = e1;

		e1.name = "e1";
		e2.name = "e2";

		System.out.println(e1.name);
		System.out.println(e2.name);
		System.out.println(e1); // com.chinasofti.eec.day007.Emp02@7852e922
		System.out.println(e2); // com.chinasofti.eec.day007.Emp02@7852e922
		// e1和e2的地址都是一样的
	}

}

class Emp02 {
	String name;
}