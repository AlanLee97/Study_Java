package com.libuguan.ex14;

public class Person {
	String name;
	int age;
	Person(){
		
	}
	
	Person(String name,int age) throws IllegalAgeException{
		if(age < 0 || age > 100) {
			throw new IllegalAgeException(age + "��������ֵ�Ƿ�");
		}
		this.name = name;
		this.age = age;
	}

}
