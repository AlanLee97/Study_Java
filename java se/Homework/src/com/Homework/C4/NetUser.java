package com.Homework.C4;

public class NetUser {
	String id;
	String pwd;
	String email;
	public NetUser(String id,String pwd,String email){
		this.id = id;
		this.pwd = pwd;
		this.email = email;
	}
	
	public NetUser(String id,String pwd){
		this.id = id;
		this.pwd = pwd;
		this.email = "@gameschool.com";
	}
	
	public void show() {
		System.out.println("\n±àºÅ£º"+ this.id);
		System.out.println("ÃÜÂë£º"+ this.pwd);
		System.out.println("ÓÊ¼þ£º"+ this.email);
	}

	public static void main(String[] args) {
		NetUser ns1 = new NetUser("abc123","123456","@gameschool.com");
		ns1.show();
		
		NetUser ns2 = new NetUser("abc123","123456");
		ns2.show();
	}
}
