package com.chinasofti.eec.task;

import java.util.Scanner;

public class LoopGuessGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cusNum = 0;
		int randomNum = (int) (Math.random()*10);	//���ɵ����Ǹ���������Ҫǿ������ת��
		System.out.println("������ǣ�" + randomNum);

		while (true) {
			System.out.print("������һ����(0~9)��");
			cusNum = scan.nextInt();
			if (randomNum == cusNum) {
				System.out.println("���¶�����");
				break;
			} else {
				System.out.print("���������£�");
				if(cusNum > randomNum){
					System.out.println("���µ�������");
				}else{
					System.out.println("���µ���С��");
				}
			}
		}
	}

}
