package com.exam.data0930;

public class ex02 {

	public static void main(String[] args) {
		String [] str = {"阿里","京东","百度","腾讯","新浪"};
		String [] sBak = new String[6];
		System.arraycopy(str, 0, sBak, 0, str.length);
		for(int i = 0; i < str.length; i++) {
			System.out.print(sBak[i] + "\t");
		}
		

	}

}
