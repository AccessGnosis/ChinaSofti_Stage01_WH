package com.chinasofti.eec.task;

import java.math.BigDecimal;

/*
 * 1.����double�͵ı���a���洢ֵΪ25.50
 * 2.����float�ͱ���b���洢ֵΪ25.50
 * 3.����double�ͱ���c���洢5/2
 * 4.����double�ͱ���d���洢5.0/2
 * 5.����double�ͱ���e���洢3.0
 * 6.����double�ͱ���f���洢2.81
 * 7.���e-f
 * 8.����char����c1���洢������
 * 9.����char���ͣ��洢һ���ո�
 * 10.����char���ͣ��洢һ��������
 * 11.���boolean���ͱ���d1���洢true
 * 12.����boolean���ͱ���d2���洢���㡯
 * 13.����һ��char���ͣ���� ��2��
 * 14.����һ��char���ͣ���� ��2��+��2��
*/
public class ElementTypeTask {

	public static void main(String[] args) {
		double a = 25.50;
		float b = 25.50F;
		double c = 5 / 2; // �����2.0����Ϊ5��2����int����
		double d = 5.0 / 2;
		double e = 3.0;
		double f = 2.81;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);

		// BigDecimal�������������������ȷ������
		BigDecimal be = new BigDecimal(Double.toString(e)); // ������������BigDecimal����
		BigDecimal bf = new BigDecimal(Double.toString(f)); // �������ַ�����ʽ����
		double bef = be.subtract(bf).doubleValue(); // e��ֵ��ȥf��ֵ��������ȷ�����ֵ��bef
		// ���㷽��
		// �ӷ� add()
		// ���� subtract()
		// �˷� multiply()
		// ���� divide()
		// ������ɺ�ʹ��floatValue()��doubleValue()�ȷ�������ȷ��������ֵʹ��
		System.out.println("e-f = " + bef);

		BigDecimal bresult = new BigDecimal(0);
		bresult = calcSubtractBigNumber(Double.toString(e), Double.toString(f));
		System.out.println("e-f = " + bresult.doubleValue());

		char c1 = '��';
		char c2 = ' ';
		char c3 = '\'';

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);

		boolean d1 = true;
		// boolean d2 = '��';
		char d2 = '��';

		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);

		char d3 = '2';	//d3�Ǹ��ַ���2��ASCII��ֵ��50
		char d4 = '2' + '2';	//�����ַ���ӣ�ʵ������ASCII��ֵ�����
		System.out.println(d3);	//�����ַ�������ʱ��ת��
		System.out.println(d3 + d3);
		System.out.println(d4);
		
		double pi = Math.PI;
		System.out.println(pi);
		System.out.println((float)pi);	//����ɥʧ
	}

	public static BigDecimal calcSubtractBigNumber(String a, String b) {
		BigDecimal ba = new BigDecimal(a);
		BigDecimal bb = new BigDecimal(b);

		return ba.subtract(bb);
	}
}
