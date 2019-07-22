package com.Homework.C8;
import java.util.Scanner;

public class ValidateUserName {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("用户名输入规则：用户名不为空，长度大于6，不能有数字。");
		System.out.println("请输入用户名：");
		Scanner input = new Scanner(System.in);
		String username = input.nextLine();
		if(username == null || "".equals(username)) {
			System.out.println("用户名不能为空。");
			return;
		}
		if(username.length() < 6) {
			System.out.println("长度不能小于6");
			return;
		}
		
		for(int i = 0; i < username.length(); i++) {
			char ch = username.charAt(i);
			if(ch >= 48 && ch <= 57) {
				System.out.println("不能有数字");
				return;
			}
			
		}
			
		System.out.println("用户名符合要求。");

	}

}
