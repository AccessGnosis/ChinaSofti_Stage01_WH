/**
* Describe: 4��	ʹ��ð���������飩
* Keyword: 
* Hint: 
* Filename: Di_04_BubbleSort.java
* Copyright 2017-02-11 By Gnosis. Allright reserved.
* Time: ����2:43:35
*/
package com.chinasofti.eec.lft.task;

import java.util.Scanner;

public class Di_04_BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("������5����");
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < arr.length - 1; ++i) {
			for (int j = 0; j < arr.length - 1 - i; ++j) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("�����������ǣ�");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
