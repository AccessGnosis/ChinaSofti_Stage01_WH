package com.chinasofti.eec.exam;

public class Di_29 {

	String str = new String("good");
	char[] ch = { 'a', 'b', 'c' };

	public static void main(String args[]) {
		Di_29 ex = new Di_29();
		ex.change(ex.str, ex.ch);
		System.out.print(ex.str + " and ");
		for (int i = 0; i < ex.ch.length; i++) {
			System.out.print(ex.ch[i]);
		}
	}

	public void change(String str, char ch[]) {
		str = "test ok";
		ch[0] = 'g';
	}
}
