package com.Homework.C8;

enum Signal{red,yellow,green}

public class code3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Signal s = Signal.red;
		switch(s) {
		case red:
			System.out.println("ͣ��");
			break;
		case green:
			System.out.println("��ʻ");
			break;
		case yellow:
			System.out.println("����");
			break;
			
		}

	}

}
