package com.Homework.C7;

import java.util.Random;

public class GetMaxMin {
	static int count;
	static int[] a = new int[101];
	
	public static void main(String[] args) {
		GetMaxMin gmm = new GetMaxMin();
		System.out.println("��ǰ��������������Ϊ��");
		gmm.createRandomNum(100);
		gmm.InitArray(50);
		System.out.println("\n���������ֵΪ��" + gmm.getMax(a) + 
				"\n��СֵΪ��" + gmm.getMin(a));
		System.out.println("�����д��ڵ���60������" + gmm.countNum(a) + "����");
		
	}
	
	//����������ĺ���
	int createRandomNum(int n) {
		int randomNum = (int)Math.round(Math.random() * n);
		//int randomNum = new Random().nextInt(n);   //��һ������������ķ���
		return randomNum;
	}
	
	//���������������
	void InitArray(int sum) {
		int tempCount = 0;
		for(int i = 0 ; i < sum; i++) {
			a[i] = createRandomNum(100);
		}
		for(int i = 0; i < 50; i++) {
			
			System.out.print(a[i] + " ");
			tempCount++;
		}
		System.out.println("\n������" + tempCount + "���������");
		
	}
	
	//ʹ��ѡ�����򷨽��дӴ�С����
	int getMax(int[] a) {
		int max;
		for(int i = 0; i < a.length -1; i++) {
			for(int j = 0; j < a.length - i - 1; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return max = a[0];  //�����һ��ֵ�����ֵ��
	}
	
	//ͬ��
	int getMin(int[] a) {
		int min;
		for(int i = 0; i < a.length -1; i++) {
			for(int j = 0; j < a.length - i - 1; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return min = a[0];
	}
	
	//ͳ�ƴ��ڵ���60�����ж��ٸ�
	int countNum(int[] a) {
		for(int i : a) {
			if(a[i] >= 60)
				count++;
		}
		return count;
	}
	
}
