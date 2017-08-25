package com.chinasofti.eec.exam.onboard;

//写java代码，打印如下的杨辉三角
public class Di_03 {
	public static void main(String[] args) {
		int cuber = 5;
		int[][] arr = new int[cuber][cuber];

		for (int i = 0; i < cuber; ++i) {
			arr[i][i] = 1;
			arr[i][0] = 1;
		}

		for (int i = 2; i < cuber; ++i) {
			for (int j = 1; j < cuber; ++j) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}
		for (int i = 0; i < cuber; ++i) {
			for (int k = cuber - i; k >= 0; --k) {
				System.out.print(" ");
			}
			for (int j = 0; j < cuber; ++j) {
				System.out.print(arr[i][j] + " ");
				if (j == i) {
					break;
				}
			}
			System.out.println();
		}
	}
}
