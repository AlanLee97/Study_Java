package com.Homework.C6;
import java.util.Scanner;

public class CalAverageScore {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int sum = 0;
		int score = 0;
		int num = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("��Ҫ������ٸ����֣�");
		num = input.nextInt();
		int[] arr = new int[num];
		int average = 0;
		System.out.println("�����������");
		for(int i = 0; i < num; i++) {
			arr[i] = input.nextInt();
			try {
				if(arr[i] < 0) {
					throw new Exception("����ķ�������Ϊ������");
				}
				sum += arr[i];
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		average = sum / num;
		System.out.println("�������������ƽ����Ϊ��" + average);
	}
}
