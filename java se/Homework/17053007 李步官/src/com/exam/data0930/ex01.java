package com.exam.data0930;
import java.util.Arrays;

public class ex01 {

	public static void main(String[] args) {
		char arr [] = new char[10];
		String a [] = new String[20]; 
		for(int i = 0; i < 10; i++) {
			arr[i] = 'a';
			a[20] = Arrays.toString(arr);
			System.out.print(a + " ");
		}
		

	}

}
