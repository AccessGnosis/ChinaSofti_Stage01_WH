package com.chinasofti.eec.wvt.task.demo;

public class TestGame {
	public static void main(String[]args){
		Game game=new Game();
		System.out.println("-----------------��ӭ���������Ϸ����--------------------\n\n");
		System.out.println("\t\t******************");
		System.out.println("\t\t**  ��Ϸ��ʼ  **");
		System.out.println("\t\t******************\n\n");
		System.out.println("��ȭ����1.ʯͷ2.����3.��");
		game.init();
		game.start();
		game.printResult();
	}
}
