package com.chinasofti.eec.task;

import java.math.BigDecimal;

public class CalcForBigDecimal {

	public static void main(String[] args) {
		double width = 6.0;
		double length = 4.9;
		System.out.println(width - length);

		// ʹ��BigDecimal���о�ȷ����
		BigDecimal bwidth = new BigDecimal(Double.toString(width));
		BigDecimal blength = new BigDecimal(Double.toString(length));
		System.out.println(bwidth.subtract(blength).doubleValue());
	}
}
