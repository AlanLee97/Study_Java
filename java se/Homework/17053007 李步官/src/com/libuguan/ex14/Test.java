package com.libuguan.ex14;

public class Test {

	public static void main(String[] args) {
		try {
			Person p = new Person("�㲻��",210);
			System.out.println(p);
			System.out.println("����ֵ����");
		}catch(IllegalAgeException i){
			System.out.println("����ֵ�Ƿ�");
		}
		System.out.println("������");

	}

}
