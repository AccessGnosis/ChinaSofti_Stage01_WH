package com.chinasofti.eec.wvt.task.demo;

import java.util.Scanner;

public class Game {
	private int countGame;
	private int countTie;
	private PersonPlayer personPlayer=new PersonPlayer();
	private ComputerPlayer computerPlayer=new ComputerPlayer();
	private Scanner input=new Scanner(System.in);
	
	public void init(){
		System.out.print("请选择你的角色(1.沸羊羊  2.暖羊羊  3.美羊羊):");
		int rolePerson=input.nextInt();
		switch(rolePerson){
			case 1:personPlayer.setPersonName("沸羊羊");
				break;
			case 2:personPlayer.setPersonName("暖羊羊");
				break;
			case 3:personPlayer.setPersonName("美羊羊");
				break;
		}
		System.out.print("请选择对手角色(1.喜羊羊  2. 慢羊羊 3.懒羊羊):");
		int roleComputer=input.nextInt();
		switch(roleComputer){
			case 1:computerPlayer.setPlayerName("喜羊羊");
				break;
			case 2:computerPlayer.setPlayerName("慢羊羊");
				break;
			case 3:computerPlayer.setPlayerName("懒羊羊");
				break;
		}
	}
	public void start(){
			System.out.print("\n开始游戏吗？ (y/n)");
			String answer=input.next();
			while(answer.equals("y")){
					int x=personPlayer.show();
					int y=computerPlayer.show();
					if(x==1&&y==2||x==2&&y==3||x==3&&y==1){
						System.out.println("结果：运气真好，你赢了！");
						personPlayer.addScore();
					}else if(x==1&&y==1||x==2&&y==2||x==3&&y==3){
						System.out.println("结果：平局，加油啊!");
						countTie++;
					}else{
						System.out.println("结果：啊！你输了！");
						computerPlayer.addScore();
					}
					countGame++;
					System.out.print("\n是否开始下一轮?  (y/n)");
					answer=input.next();	
				}
			
		}
	
	public String getResult(){
		String result;
		if(personPlayer.getScore()>computerPlayer.getScore()){
			result="最终结果："+personPlayer.getPersonName()+"赢！";
		}else if(personPlayer.getScore()==computerPlayer.getScore()){
			result="最终结果：平！";
		}else{
			result="最终结果："+computerPlayer.getPlayerName()+"赢！";
		}
		return result;
	}
	
	public void printResult(){
		System.out.println("---------------------------------------------------");
		System.out.println("\t\t"+personPlayer.getPersonName()+"  对决 "+computerPlayer.getPlayerName()+"\n");
		System.out.println("次数："+countGame+"次");
		System.out.println("平局："+countTie+"次");
		System.out.println(personPlayer.getPersonName()+"得："+personPlayer.getScore()+"分");
		System.out.println(computerPlayer.getPlayerName()+"得："+computerPlayer.getScore()+"分\n");
		System.out.println(getResult());
		System.out.println("---------------------------------------------------");
	}

}
