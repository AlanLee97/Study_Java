//Score.java
package com.Homework.C6;
import java.util.Scanner;

public class Score {
	int score = 0;
	public void inputScore(int score) throws IllegalScoreException {
		if(score < 0 || score >100) {
			throw new IllegalScoreException("您输入的数字不在0~100之间。\n"
					+ "请输入0~100之间的数字。");
		}
		this.score = score;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您的成绩：");
		int score = 0;
		score = input.nextInt();
		Score s = new Score();
		try {
			s.inputScore(score);
			System.out.println("您的成绩为：" + score + "分。");
		} catch (IllegalScoreException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
