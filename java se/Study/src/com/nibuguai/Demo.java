package com.nibuguai;

public class Demo {
	public static void main(String[] args) {
		Computer pc = new Computer();
		System.out.println("computer����Ļ�ǣ�"+pc.screen);
		System.out.println("computer�ļ����ǣ�"+pc.keyboard);
		pc.starup();
		Pad pad = new Pad();
		System.out.println("\niPad����Ļ�ǣ�"+pad.screen);
		System.out.println("iPad����Ļ�ǣ�"+pad.battery);
		System.out.println("computer�ļ����ǣ�"+pad.keyboard);
		pad.starup();
		pad.open3G();
		pad.play();
	}

}
