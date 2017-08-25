package com.chinasofti.eec.day004;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// 1.����Ķ���
		// ����һ����������arr������5��Ԫ��
		int[] arr = new int[5];

		System.out.println(arr[0]); // ���arr�����еĵ�һ��Ԫ��
		System.out.println(arr[1]); // ���arr�����еĵڶ���Ԫ��

		int[] arr1; // ����һ����������arr1
		int a; // ����һ�����α�����
		// System.out.println(a); //�������û�г�ʼ��
		// System.out.println(arr1[0]); //�������û�г�ʼ��(û��new�������ڴ����)

		// 2.����ĳ�ʼ��
		int[] arr2 = new int[5]; // ��һ�֣���ʼ��arr2���飬����5������Ԫ�ص��ڴ�ռ��С
		double[] arr3 = new double[5]; // ��ʼ��arr3���飬����5��������Ԫ�ص��ڴ�ռ��С
		int[] arr4 = { 1, 2, 3 }; // �ڶ��֣���ʼ��arr4���飬�洢3������Ԫ�طֱ�Ϊ1��2��3
		int[] arr5;
		// int[] arr6;
		// arr6 = {1, 2, 3}; //���󣬲����ڶ�������֮���ٳ�ʼ��
		int[] arr7;
		arr7 = new int[] { 1, 2, 3 }; // ��ȷ���ڶ�������֮�����ʹ��new�ؼ�������ʼ������
		int[] arr8 = new int[] { 1, 2, 3, 4, 5 }; // �����֣���ʼ��arr8���飬�洢5��Ԫ��
		// int[] arr9 = new int[5] { 1, 2, 3, 4 }; //���󣬲��ܶ���ͷ���ռ���ʼ������

		// 3.����ķ���
		int[] arr10 = new int[] { 1, 5, 7, 9 };
		// ����һ����������arr10����ʼ������Ϊ4��Ԫ�طֱ�Ϊ1, 5, 7, 9
		System.out.println("arr10����ĳ����ǣ�" + arr10.length);
		arr10[0] = 2;
		arr10[1] = 6;
		arr10[2] = 10;
		// arr10[4] = 12; // ����Խ��
		showArray(arr10);

		Arrays.sort(arr10);
		showArray(arr10);

		// scanfArray(����������, �Ƿ������ֵ(true/false))
		scanfArray(arr10, true);
		System.out.println("��������������ǣ�");
		showArray(arr10);

		// scanfArray(arr10);
		// showArray(arr10);

		System.out.println("����������飺");
		showReverseArray(arr10);

		System.out.println();
		System.out.println("�������������ǣ�" + showArrayMaxEle(arr10));

		System.out.println("�������鵽arr11");
		int[] arr11 = arrayCopy(arr10);
		showArray(arr11);
	}

	// �������Ԫ��
	public static void showArray(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// �����������Ԫ��
	public static void showReverseArray(int[] arr) {
		for (int i = (arr.length - 1); i >= 0; --i) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void scanfArray(int[] arr) {
		System.out.println("����������Ԫ��");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = scan.nextInt();
		}
	}

	// �ڶ�������Ϊtrueʱ�������������Ԫ��
	// �ڶ�������Ϊfalseʱ����������Ԫ��
	public static void scanfArray(int[] arr, boolean a) {
		if (a == true) {
			for (int i = 0; i < arr.length; ++i) {
				arr[i] = (int) (Math.random() * 100);
			}
		} else {
			scanfArray(arr);
		}
	}

	// �����������ֵ
	public static int showArrayMaxEle(int[] arr) {
		int max = arr[0]; // �����һ��Ԫ�����
		for (int i = 1; i < arr.length; ++i) { // ����ʣ���Ԫ��
			if (arr[i] > max) { // ��ʣ���Ԫ�ش���max
				max = arr[i]; // �ı�max����Ϊ�ϴ��ֵ
			}
		}
		return max;
	}

	// ���鿽��
	public static int[] arrayCopy(int[] arr) {
		int[] b = new int[arr.length];
		for (int i = 0; i < b.length; ++i) {
			b[i] = arr[i];
		}
		return b;
	}
}
