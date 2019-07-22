package com.nibuguai;

public class Demo {
	public static void main(String[] args) {
		Computer pc = new Computer();
		System.out.println("computer的屏幕是："+pc.screen);
		System.out.println("computer的键盘是："+pc.keyboard);
		pc.starup();
		Pad pad = new Pad();
		System.out.println("\niPad的屏幕是："+pad.screen);
		System.out.println("iPad的屏幕是："+pad.battery);
		System.out.println("computer的键盘是："+pad.keyboard);
		pad.starup();
		pad.open3G();
		pad.play();
	}

}
