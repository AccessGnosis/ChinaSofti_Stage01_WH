package com.chinasofti.eec.exam;

import java.util.Arrays;

public class Di_09 {
	public static void main(String[] args) {
		int[] one = new int[] { 4, 6, 8 };
		int[] two = new int[] { 1, 3, 5, 7, 9 };
		System.arraycopy(one, 1, two, 2, 2);
		System.out.println(Arrays.toString(two));

		String str = "420";
		str += 42;
		System.out.print(str);

		String s = "";
		if (s == s + 0) {
			System.out.println("Hello World");
		}

		String[] elements = { "for", "tea", "too" };
		String first = (elements.length > 0) ? elements[0] : null;
		System.out.println(first);

		int[] oneArr = { 2, 11, 26, 27, 37, 44, 48, 60 };
		int[] twoArr = { 19, 35, 49, 55, 58, 75, 83, 84, 91, 93 };
		int[] threeArr = new int[oneArr.length + twoArr.length];
		int p = 0, q = 0;
		while (p < oneArr.length && q < twoArr.length) {
			threeArr[p + q] = oneArr[p] < twoArr[q] ? oneArr[p++] : twoArr[q++];
		}
		if (p < oneArr.length) {
			System.arraycopy(oneArr, p, threeArr, p + q, oneArr.length - p);
		} else if (q < twoArr.length) {
			System.arraycopy(twoArr, q, threeArr, p + q, twoArr.length - q);
		}
		System.out.println(Arrays.toString(threeArr));
	}
}
