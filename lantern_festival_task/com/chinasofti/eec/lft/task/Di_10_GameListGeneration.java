/**
* Describe: 10、	题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。
* 				有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
* Keyword: 
* Hint: 
* Filename: Di_10_GameListGeneration.java
* Copyright 2017-02-11 By Gnosis. Allright reserved.
* Time: 下午4:15:45
*/
package com.chinasofti.eec.lft.task;

public class Di_10_GameListGeneration {

	public static void main(String[] args) {
		char[] no1 = new char[] { 'a', 'b', 'c' };
		char[] no2 = new char[] { 'x', 'y', 'z' };

		for (int i = 0; i < no1.length; ++i) {
			for (int j = 0; j < no2.length; ++j) {
				if ((no1[i] == 'a' && no2[j] == 'x')) {
					continue;
				} else if (no1[i] == 'c' && (no2[j] == 'x' || no2[j] == 'z')) {
					continue;
				} else {
					System.out.println(no1[i] + "<-->" + no2[j]);
				}
			}
		}
	}

}
