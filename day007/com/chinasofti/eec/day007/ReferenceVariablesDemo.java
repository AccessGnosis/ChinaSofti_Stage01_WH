/**
* Describe: �������ͱ���֮��ĸ�ֵ����
* Keyword: �������͸�ֵ
* Hint: o	�������ͱ����洢���Ƕ���ĵ�ַ��Ϣ����ͬ���͵��������ͱ���֮������໥��ֵ
*       o	�������ͱ���֮��ĸ�ֵ���ᴴ���µĶ��󣬵��п��ܻ�ʹ�������ϵ�����ָ��ͬһ������
*       ��ʵ����ָ��ĸ��e1��e2ͬʱָ��һ�����󣬶����۸����Ǹ������������һ������Ҳ����Ÿı�
* Filename: ReferenceVariablesDemo.java
* Copyright 2017-02-09 By Gnosis. Allright reserved.
* Time: ����2:23:20
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
		// e1��e2�ĵ�ַ����һ����
	}

}

class Emp02 {
	String name;
}