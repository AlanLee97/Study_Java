package com.libuguan.ex11;

public class Run {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		JavaEE ee = new JavaEE();
		ee.setId("001");
		ee.setName("С��");
		ee.work();
		
		Android android = new Android();
		android.setId("002");
		android.setName("С��");
		android.work();
		
		Network net = new Network();
		net.setId("003");
		net.setName("С��");
		net.work();

	}

}
