package com.nibuguai;

public class Book {
	public static void main(String[] args) {
		Book book = new Book();
		int shelf = 30;
		int box = 40;
		System.out.println("把书架上的书全部放进箱子后，箱子里一共有" + book.add(shelf,box) + "本书。\n明细如下：书架上有"+shelf+"本书，箱子里原有"+box+"本书。");
		
	}
	private int add(int shelf, int box) {
		box = box + shelf;
		return box;
	}

}
