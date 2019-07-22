package com.nibuguai;

public class BMIexponent {

	public static void main(String[] args) {
		double height = 1.62;
		int weight = 65;
		double exponent = weight/(height * height); 
		System.out.println("你的体重为：" + weight);
		System.out.println("你的身高为：" + height);
		System.out.println("你的BMI指数为：" + exponent);
		System.out.println("你的体重范围为：");
		if(exponent < 18.5) {System.out.println("体重过轻");}
		if(exponent >= 18.5 && exponent < 24.9) {System.out.println("正常范围");}
		if(exponent >= 24.9 && exponent <29.9) {System.out.println("体重过重");}
		if(exponent >= 29.9) {System.out.println("肥胖");}

	}

}
