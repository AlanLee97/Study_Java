package com.Homework;

public class C1_code2 {
	public static void main(String[] args) {
		int i, j;
		for(i = 1; i < 5; i++) {		//���ѭ��������
			for(j = 1; j <= i; j++) {	//�ڲ�ѭ��������
				System.out.print(j + "*" + i + "=" + i * j + " ");
				if(i == j) {
					System.out.println();	//���ƻ���
				}
			}
		}
	}

}
