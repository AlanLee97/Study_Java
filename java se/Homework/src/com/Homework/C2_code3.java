package com.Homework;
import java.util.Scanner;

public class C2_code3 {
	static int x, x1, x2, x3, x4;

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		C2_code3 c = new C2_code3();
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����λ����");
		x = input.nextInt();

		if(x < 999 || x > 9999) {
			System.out.println("������Ĳ�����λ���֣������������룡");
		}else {
			x1 = ((x / 1000) + 5) % 10;					//��ȡǧλ
			x2 = ((x % 1000) / 100 + 5) % 10;			//��ȡ��λ
			x3 = (((x % 1000) % 100) / 10 + 5) % 10;	//��ȡʮλ
			x4 = ((((x % 1000) % 100) % 10) + 5) % 10;  //��ȡ��λ
			int[] arr = {x1, x2, x3, x4};				//�����鴢�����ĸ���
			for(int i = 0, j = 3; i < j ; i++, j--) {	//����λ��
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
		}
		System.out.println("���ܺ������Ϊ��");
		for(int i = 0; i < 4; i++) {
			System.out.print(arr[i]);
		}
		}
		

	}

}
