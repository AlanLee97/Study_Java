package com.nibuguai;

public class BorrowABook {
	public void borrow(String bookName)
	{
		System.out.println("请前往借阅登记处理领取" + bookName + "。");
	}
	
	
	
	
	public static void main(String[] args) {
		BorrowABook book = new BorrowABook();
		book.borrow("战争与和平");
	}
}
