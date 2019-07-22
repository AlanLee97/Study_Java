package com.libuguan.ex14;

public class Person {
	String name;
	int age;
	Person(){
		
	}
	
	Person(String name,int age) throws IllegalAgeException{
		if(age < 0 || age > 100) {
			throw new IllegalAgeException(age + "，年龄数值非法");
		}
		this.name = name;
		this.age = age;
	}

}
