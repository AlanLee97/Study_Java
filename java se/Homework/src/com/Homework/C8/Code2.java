package com.Homework.C8;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.println("���������䣺");
		String strAge = input.nextLine();
		System.out.println("�����������");
		String strScore = input.nextLine();
		System.out.println("��������ѧʱ�䣺��ʽΪ2017/09/16");
		String strDate = input.nextLine();
		
		int age = Integer.parseInt(strAge);
		double score = Double.parseDouble(strScore);
		Date date = null;
		DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(age + "  " + score + "  " + date);

	}

}
