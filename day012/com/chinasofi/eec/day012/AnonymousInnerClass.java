/**
* Describe: 
* Keyword: 
* Hint: 
* Filename: AnonymousInnerClass.java
* Copyright 2017-02-16 By Gnosis. Allright reserved.
* Time: ����3:39:51
*/
package com.chinasofi.eec.day012;

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void execute() {
				System.out.println("Action�������ڲ����ִ�з�����ִ��");
			}
		};
		action.execute();
	}
}

interface Action {
	public void execute();
}