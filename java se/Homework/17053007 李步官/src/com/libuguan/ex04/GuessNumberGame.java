package com.libuguan.ex04;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int randomNumber = new Random().nextInt(100);
		System.out.println("\n������100���������");
		
		System.out.println("\n=========��������Ҫ�µ����֣�=========");
		Scanner input = new Scanner(System.in);
		int enterNumber = input.nextInt();
		
		while(enterNumber != randomNumber) {
			if(enterNumber > randomNumber) {
				System.out.println("sorry!��µ����ִ��ˡ�������¡�");
			}else {
				System.out.println("sorry!��µ�����С�ˡ�������¡�");
			}
			System.out.println("��������Ҫ�µ����֣�");
			enterNumber = input.nextInt();
			
		}
		System.out.println("��ϲ�㣬�¶�����");

	}

}
