package com.nibuguai;

public class Book {
	public static void main(String[] args) {
		Book book = new Book();
		int shelf = 30;
		int box = 40;
		System.out.println("������ϵ���ȫ���Ž����Ӻ�������һ����" + book.add(shelf,box) + "���顣\n��ϸ���£��������"+shelf+"���飬������ԭ��"+box+"���顣");
		
	}
	private int add(int shelf, int box) {
		box = box + shelf;
		return box;
	}

}
