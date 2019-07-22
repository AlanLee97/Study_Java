package com.libuguan.ex13;

public class Keyboard implements USB {

	@Override
	public void open() {
		System.out.println("¼üÅÌ¿ªÆô");

	}

	@Override
	public void close() {
		System.out.println("¼üÅÌ¹Ø±Õ");

	}

}
