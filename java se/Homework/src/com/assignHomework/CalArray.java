package com.assignHomework;

public class CalArray {

	    public static void main(String[] args) {
	        int[] array = {0,1,2,3,4,5};
	        int maxIndex = array[0];//�������ֵΪ������ĵ�һ����
	        int minIndex = array[0];//������СֵΪ������ĵ�һ����
	        //����ѭ������
	        System.out.print("�������Ϊ��");
	        for (int i = 0; i < array.length; i++) {
	            if(maxIndex < array[i]){
	                maxIndex = array[i];
	            }
	            if(minIndex > array[i]){
	                minIndex = array[i];
	            }
	        }
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i]+" ");
	        }
	        System.out.println();
	        System.out.println("�����������ֵΪ��" + maxIndex + "\n��СֵΪ��" + minIndex);
	    }

}
