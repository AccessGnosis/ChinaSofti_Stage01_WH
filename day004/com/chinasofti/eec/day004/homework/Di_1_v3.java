package com.chinasofti.eec.day004.homework;

import java.util.Scanner;

public class Di_1_v3 {
	public static void main(String[] args) {
		// ������ֻ�ܱ�1����������������

		// ���ж�һ�����ǲ�������
		// 5��5%2/3/4 ������0 ������
		// 6��6%2 ��0 ��������
		// 7��7%2/3/4/5/6 ������0 ������
		// �ܽ᣺
		// ֻҪ��һ��ȡ��Ϊ0�Ͳ�������
		// ��ȡ�����еĶ���Ϊ0����������
		// �ж�һ�����Ƿ�������
		// ���أ�һ�αȽϲ��ܵõ����ս���������
		// int num = 97; // 2, 3, 4, 5, 6
		Scanner scan = new Scanner(System.in);
		System.out.print("����������������2~");
		int scanf = scan.nextInt();
		int count = 0; // ������
		// for (int i = 2; i < num; ++i) { //������
		// for (int i = 2; i < num / 2; ++i) { //����
		for (int num = 2; num < scanf; ++num) { // ����2~scanf���ÿ����
			boolean flag = true;// 1���������ز���ʼ��������������
			for (int i = 2; i <= Math.sqrt(num); ++i) { // ������
				if (num % i == 0) { // �ж��Ƿ�ȡ��Ϊ0
					flag = false; // 2����������
					break;
				}
			}
			if (flag) { // 3���ж�
				count++; // ������++
				System.out.print(num + "\t");
				if (count % 10 == 0) { // �жϼ�������10��һ����
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("һ����" + count + "������");
	}
}
