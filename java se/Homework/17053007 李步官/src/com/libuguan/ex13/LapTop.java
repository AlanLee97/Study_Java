package com.libuguan.ex13;

public class LapTop {
	public void run() {
		System.out.println("�ʼǱ�����");
	}
	
	public void useUSB(USB usb) {
		if(usb != null) {
			usb.open();
			usb.close();
		}
	}
	
	public void shutdown() {
		System.out.println("�ʼǱ��ر�");
	}

}
