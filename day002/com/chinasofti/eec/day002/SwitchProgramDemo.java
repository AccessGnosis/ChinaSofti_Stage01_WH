package com.chinasofti.eec.day002;

public class SwitchProgramDemo {

	public static void main(String[] args) {
		// switch(���α��ʽ){
		// case ���γ���ֵ1:
		// ���1;
		// ���2;
		// (break; ����switch)
		// case ���γ���ֵ2:
		// ���3;
		// ���4;
		// ����
		// default:
		// ���5;
		// ���6;
		// (break; ���ã�����switch�ṹ)
		// }
		int num = 2;
		switch (num) { // jdk 1.7�汾����ֻ�ܰ������γ�����jdk 1.7�汾����num�������ַ���
		case 1:
			System.out.println("111");
			break;
		case 2:
			System.out.println("222");
			break;
		case 3:
			System.out.println("333");
			break;
		default:
			System.out.println("δ֪");
		}
	}
}
