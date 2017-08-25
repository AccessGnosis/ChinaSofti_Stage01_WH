/**
* Describe: 类和对象
* Keyword: 
* Hint: 
* Filename: StudentClassDemo02.java
* Copyright 2017-02-09 By Gnosis. Allright reserved.
* Time: 上午10:01:19
*/
package com.chinasofti.eec.day007;

public class EmpClassDemo {

	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.name = "李豪";
		emp.age = 20;
		emp.salary = 8000;
		printEmpInfo(emp);
		System.out.println(); // 换行
		emp.printEmpInfo();
	}

	public static void printEmpInfo(Emp emp) {
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.salary);
	}
}

class Emp {
	String name;
	int age;
	double salary;

	public void printEmpInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.salary);
	}
}