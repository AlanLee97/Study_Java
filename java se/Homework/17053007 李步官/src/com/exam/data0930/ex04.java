package com.exam.data0930;
import java.util.Arrays;

public class ex04 {

	public static void main(String[] args) {
		int arr[] = {20,30,10,90,8,23,100,2,49,88};
		int key = 20;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(key + "的位置在第" + (binarySearch(arr,key) + 1) + "位。");

	}
	public static int binarySearch(int arr[],int value) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(value == arr[mid]) {
				return mid;
			}
			if(value > arr[mid]) {
				low = mid + 1;
			}
			if(value < arr[mid]) {
				high = mid - 1;
			}
		}
		return -1;
	}

}
