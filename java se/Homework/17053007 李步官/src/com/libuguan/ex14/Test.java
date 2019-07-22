package com.libuguan.ex14;

public class Test {

	public static void main(String[] args) {
		try {
			Person p = new Person("你不乖",210);
			System.out.println(p);
			System.out.println("年龄值正常");
		}catch(IllegalAgeException i){
			System.out.println("年龄值非法");
		}
		System.out.println("结束。");

	}

}
