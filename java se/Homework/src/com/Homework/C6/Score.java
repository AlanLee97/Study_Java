//Score.java
package com.Homework.C6;
import java.util.Scanner;

public class Score {
	int score = 0;
	public void inputScore(int score) throws IllegalScoreException {
		if(score < 0 || score >100) {
			throw new IllegalScoreException("����������ֲ���0~100֮�䡣\n"
					+ "������0~100֮������֡�");
		}
		this.score = score;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.println("���������ĳɼ���");
		int score = 0;
		score = input.nextInt();
		Score s = new Score();
		try {
			s.inputScore(score);
			System.out.println("���ĳɼ�Ϊ��" + score + "�֡�");
		} catch (IllegalScoreException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
