package com.nibuguai;

public class BorrowABook {
	public void borrow(String bookName)
	{
		System.out.println("��ǰ�����ĵǼǴ�����ȡ" + bookName + "��");
	}
	
	
	
	
	public static void main(String[] args) {
		BorrowABook book = new BorrowABook();
		book.borrow("ս�����ƽ");
	}
}
