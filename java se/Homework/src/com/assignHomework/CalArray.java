package com.assignHomework;

public class CalArray {

	    public static void main(String[] args) {
	        int[] array = {0,1,2,3,4,5};
	        int maxIndex = array[0];//定义最大值为该数组的第一个数
	        int minIndex = array[0];//定义最小值为该数组的第一个数
	        //遍历循环数组
	        System.out.print("这个数组为：");
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
	        System.out.println("这个数组的最大值为：" + maxIndex + "\n最小值为：" + minIndex);
	    }

}
