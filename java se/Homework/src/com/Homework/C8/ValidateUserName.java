package com.Homework.C8;
import java.util.Scanner;

public class ValidateUserName {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("�û�����������û�����Ϊ�գ����ȴ���6�����������֡�");
		System.out.println("�������û�����");
		Scanner input = new Scanner(System.in);
		String username = input.nextLine();
		if(username == null || "".equals(username)) {
			System.out.println("�û�������Ϊ�ա�");
			return;
		}
		if(username.length() < 6) {
			System.out.println("���Ȳ���С��6");
			return;
		}
		
		for(int i = 0; i < username.length(); i++) {
			char ch = username.charAt(i);
			if(ch >= 48 && ch <= 57) {
				System.out.println("����������");
				return;
			}
			
		}
			
		System.out.println("�û�������Ҫ��");

	}

}
