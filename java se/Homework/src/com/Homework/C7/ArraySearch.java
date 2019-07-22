package com.Homework.C7;
import java.util.*;

public class ArraySearch {
	
	public static void main(String[] args) {
		String [] array= {"hello","world","computer","java","c","css","python",
				"javascript","html","xml"}; 
		boolean sign = false;
		System.out.print("请输入一个单词：");
		Scanner input = new Scanner(System.in);
		String inp = input.next();
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals(inp) ) {
				sign = true;
			}
		}
		
		if(sign == true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
