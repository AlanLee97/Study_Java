package com.Homework.C4;

public class Person {
	String name;
	int age;
	Person(String n,int a){
		name = n;
		age = a;
	}
	void display() {
		System.out.println("������" + name + "\n���䣺" + age);
	}
	
	public static void main(String[] args) {
		Person p = new Person("���",21);
		p.display();

	}

}
