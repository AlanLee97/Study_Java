package com.Homework.C7;

public class ArrayReverse {
	static int [] a = {0,1,2,3,4,5,6,7,8,9};
	
	//输出原数组
	void showArray(int[] arg) {
		for(int i = 0; i < arg.length; i++) {
			System.out.print(arg[i] + " ");
		}
	}
	
	//输出逆序后的数组
	void showReverse(int[] arg) {
		//将数组倒置
		for(int i = arg.length - 1, j = 0; i > arg.length / 2; i--,j++) {
			int temp = a[i];
			arg[i] = arg[j];
			arg[j] = temp;
		}
		//输出倒置后的数组
		for(int i = 0; i < arg.length; i++) {
			System.out.print(arg[i] + " ");
		}
	}
	public static void main(String[] args) {
		ArrayReverse ar = new ArrayReverse();
		System.out.print("原数组为：" );
		ar.showArray(a);
		
		System.out.print("\n逆序后的数组为：");
		ar.showReverse(a);

	}

}
