package com.chinasofti.eec.wvt.task.demo;

import java.util.Scanner;

public class Game {
	private int countGame;
	private int countTie;
	private PersonPlayer personPlayer=new PersonPlayer();
	private ComputerPlayer computerPlayer=new ComputerPlayer();
	private Scanner input=new Scanner(System.in);
	
	public void init(){
		System.out.print("��ѡ����Ľ�ɫ(1.������  2.ů����  3.������):");
		int rolePerson=input.nextInt();
		switch(rolePerson){
			case 1:personPlayer.setPersonName("������");
				break;
			case 2:personPlayer.setPersonName("ů����");
				break;
			case 3:personPlayer.setPersonName("������");
				break;
		}
		System.out.print("��ѡ����ֽ�ɫ(1.ϲ����  2. ������ 3.������):");
		int roleComputer=input.nextInt();
		switch(roleComputer){
			case 1:computerPlayer.setPlayerName("ϲ����");
				break;
			case 2:computerPlayer.setPlayerName("������");
				break;
			case 3:computerPlayer.setPlayerName("������");
				break;
		}
	}
	public void start(){
			System.out.print("\n��ʼ��Ϸ�� (y/n)");
			String answer=input.next();
			while(answer.equals("y")){
					int x=personPlayer.show();
					int y=computerPlayer.show();
					if(x==1&&y==2||x==2&&y==3||x==3&&y==1){
						System.out.println("�����������ã���Ӯ�ˣ�");
						personPlayer.addScore();
					}else if(x==1&&y==1||x==2&&y==2||x==3&&y==3){
						System.out.println("�����ƽ�֣����Ͱ�!");
						countTie++;
					}else{
						System.out.println("��������������ˣ�");
						computerPlayer.addScore();
					}
					countGame++;
					System.out.print("\n�Ƿ�ʼ��һ��?  (y/n)");
					answer=input.next();	
				}
			
		}
	
	public String getResult(){
		String result;
		if(personPlayer.getScore()>computerPlayer.getScore()){
			result="���ս����"+personPlayer.getPersonName()+"Ӯ��";
		}else if(personPlayer.getScore()==computerPlayer.getScore()){
			result="���ս����ƽ��";
		}else{
			result="���ս����"+computerPlayer.getPlayerName()+"Ӯ��";
		}
		return result;
	}
	
	public void printResult(){
		System.out.println("---------------------------------------------------");
		System.out.println("\t\t"+personPlayer.getPersonName()+"  �Ծ� "+computerPlayer.getPlayerName()+"\n");
		System.out.println("������"+countGame+"��");
		System.out.println("ƽ�֣�"+countTie+"��");
		System.out.println(personPlayer.getPersonName()+"�ã�"+personPlayer.getScore()+"��");
		System.out.println(computerPlayer.getPlayerName()+"�ã�"+computerPlayer.getScore()+"��\n");
		System.out.println(getResult());
		System.out.println("---------------------------------------------------");
	}

}
