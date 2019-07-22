package com.Homework.C4;

public class Person {
	String name;
	int age;
	Person(String n,int a){
		name = n;
		age = a;
	}
	void display() {
		System.out.println("姓名：" + name + "\n年龄：" + age);
	}
	
	public static void main(String[] args) {
		Person p = new Person("李步官",21);
		p.display();

	}

}
