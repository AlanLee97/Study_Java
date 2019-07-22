package com.nibuguai;

import java.util.Scanner;
public class LoginService {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入6位数字密码：");
		int password = sc.nextInt();
		boolean result = (password==123456);
		System.out.println("用户密码是否正确:" + result);
		sc.close();

	}

}
