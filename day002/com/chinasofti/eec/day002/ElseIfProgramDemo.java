package com.chinasofti.eec.day002;

import java.util.Scanner;

public class ElseIfProgramDemo {

	public static void main(String[] args) {
		
		// ��·����ѡ��
		// if(){
		// ���1;
		// } else if(){
		// ���2;
		// } else if(){
		// ���3;
		// } else {
		// ���4;
		// }
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���������ĳɼ���");
		double score = scan.nextDouble();

		// if-else if-else���˳��ִ�У��ҵ����������ľ�ִ��
		// ִ�н�����if�ṹ������ʣ���������������Ҳ��ִ��
		if (score < 0 || score > 100) {
			System.out.println("������ĳɼ�������Ҫ��");
		} else if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 60) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}

}
