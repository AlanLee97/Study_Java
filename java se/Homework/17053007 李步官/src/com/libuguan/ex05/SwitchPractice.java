package com.libuguan.ex05;
import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.print("������1~7�����֣���ʾһ�ܵ��������ж��Ƿ�Ϊ������:");
		int weekDay = input.nextInt();
		switch(weekDay) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("����Ϊ�����գ��úù����ɣ�");break;
		case 6:
		case 7:
			System.out.println("����Ϊ��Ϣ�գ��ú÷���һ���Լ��ɣ�");
			break;
			default:
				System.out.println("����������������룡");
		}

	}

}
