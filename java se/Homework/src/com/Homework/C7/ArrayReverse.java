package com.Homework.C7;

public class ArrayReverse {
	static int [] a = {0,1,2,3,4,5,6,7,8,9};
	
	//���ԭ����
	void showArray(int[] arg) {
		for(int i = 0; i < arg.length; i++) {
			System.out.print(arg[i] + " ");
		}
	}
	
	//�������������
	void showReverse(int[] arg) {
		//�����鵹��
		for(int i = arg.length - 1, j = 0; i > arg.length / 2; i--,j++) {
			int temp = a[i];
			arg[i] = arg[j];
			arg[j] = temp;
		}
		//������ú������
		for(int i = 0; i < arg.length; i++) {
			System.out.print(arg[i] + " ");
		}
	}
	public static void main(String[] args) {
		ArrayReverse ar = new ArrayReverse();
		System.out.print("ԭ����Ϊ��" );
		ar.showArray(a);
		
		System.out.print("\n����������Ϊ��");
		ar.showReverse(a);

	}

}
