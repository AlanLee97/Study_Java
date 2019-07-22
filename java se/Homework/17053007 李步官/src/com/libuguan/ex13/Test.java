package com.libuguan.ex13;

public class Test {

	public static void main(String[] args) {
		LapTop laptop = new LapTop();
		laptop.run();
		
		Mouse mouse = new Mouse();
		laptop.useUSB(mouse);
		
		Keyboard keyboard = new Keyboard();
		laptop.useUSB(keyboard);
		
		laptop.shutdown();

	}

}
