package com.Homework;
import java.util.Scanner;

public class C3_code1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��ʮ���Ƶ����֣�");
		int InputNum = input.nextInt();
		int CalNum = InputNum;
		String str = "";
		do {
			int div = CalNum / 2;
			int mod = CalNum % 2;
			CalNum = div;
			str = mod + str;
		}while(CalNum != 0);
		System.out.println(InputNum + "�Ķ�������Ϊ��" + str);
		

	}

}
