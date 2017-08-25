package com.chinasofti.eec.wvt.task.demo;

public class TestGame {
	public static void main(String[]args){
		Game game=new Game();
		System.out.println("-----------------欢迎进入羊村游戏世界--------------------\n\n");
		System.out.println("\t\t******************");
		System.out.println("\t\t**  游戏开始  **");
		System.out.println("\t\t******************\n\n");
		System.out.println("出拳规则：1.石头2.剪子3.布");
		game.init();
		game.start();
		game.printResult();
	}
}
