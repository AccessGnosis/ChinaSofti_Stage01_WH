package com.chinasofti.eec.wvt.task.demo;

import java.util.Scanner;


public class PersonPlayer {
	
		private String personName;
		private int score;
			
		public PersonPlayer() {
			super();
		}

		public PersonPlayer(String personName) {
			super();
			this.personName = personName;
		}
		
		

		public String getPersonName() {
			return personName;
		}

		public void setPersonName(String personName) {
			this.personName = personName;
		}
		
		public int getScore() {
			return score;
		}

		public void addScore(){
			score++;
		}
		
		public int show(){
		    Scanner input=new Scanner(System.in);
			System.out.print("\n���ȭ��1.ʯͷ2.����3.��");
			int num=input.nextInt();
			switch(num){
			case 1:System.out.println("���ȭ��ʯͷ");break;
			case 2:System.out.println("���ȭ������");break;
			case 3:System.out.println("���ȭ����");break;
			}
			return num;
		}
		
		public static void main(String[] args){
			PersonPlayer player=new PersonPlayer();
			player.setPersonName("������");
			System.out.println(player.show());
		}
		
}
