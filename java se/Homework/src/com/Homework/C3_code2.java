package com.Homework;

public class C3_code2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int i, j;
		
		int addOfOuter = 0;//�洢���ѭ��ֵ�ĺ�
		for(i = 1; i <= 100; i++) {//���ѭ�������1+��2+����+��100ֵ�ĺ�
			int addOfInner = 0;	//�洢�ڲ�ѭ��ֵ�ĺ�
			for(j = 1; j <= i; j++) {//����ÿһ��ĺ�
				addOfInner += j;
			}
			addOfOuter += addOfInner; 
		}
		System.out.println("��1+��2+����+��100 = " + addOfOuter);

	}

}
