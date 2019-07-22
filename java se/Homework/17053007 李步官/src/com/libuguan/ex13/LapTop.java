package com.libuguan.ex13;

public class LapTop {
	public void run() {
		System.out.println("笔记本运行");
	}
	
	public void useUSB(USB usb) {
		if(usb != null) {
			usb.open();
			usb.close();
		}
	}
	
	public void shutdown() {
		System.out.println("笔记本关闭");
	}

}
