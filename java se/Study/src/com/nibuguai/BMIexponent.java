package com.nibuguai;

public class BMIexponent {

	public static void main(String[] args) {
		double height = 1.62;
		int weight = 65;
		double exponent = weight/(height * height); 
		System.out.println("�������Ϊ��" + weight);
		System.out.println("������Ϊ��" + height);
		System.out.println("���BMIָ��Ϊ��" + exponent);
		System.out.println("������ط�ΧΪ��");
		if(exponent < 18.5) {System.out.println("���ع���");}
		if(exponent >= 18.5 && exponent < 24.9) {System.out.println("������Χ");}
		if(exponent >= 24.9 && exponent <29.9) {System.out.println("���ع���");}
		if(exponent >= 29.9) {System.out.println("����");}

	}

}
