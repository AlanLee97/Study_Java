package com.libuguan.ex12;
import java.util.Scanner;

public class Bank {
	private String account;
	private double balance;
	private double deposit;
	private double cash;
	
	Bank(String account, double balance){
		this.account = account;
		this.balance = balance;
	}
	public void getDeposit() {
		Scanner input = new Scanner(System.in);
		System.out.println("����������Ŀ:");
		
		double cunKuan = input.nextDouble();
		System.out.println("���Ĵ����ĿΪ��" + cunKuan + "  �˻����Ϊ��"
		+ (balance + cunKuan) + "Ԫ");
	}
	
	public void getCash() {
		Scanner input = new Scanner(System.in);
		System.out.println("������ȡ����Ŀ��");
		double quKuan = input.nextDouble();
		if(quKuan > balance) {
			System.out.println("�������㡣");
		}else {
			System.out.println("����ȡ����ĿΪ��" + quKuan + "Ԫ��" + 
		"\n��ǰ�˻����Ϊ��" + (balance-quKuan));
		}
	}
	
	public double queryBalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank("62270022109125725661",10000.0);
		System.out.println("��ǰ�˻�Ϊ��" + bank.account);
		System.out.println("��ѡ��������ͣ�");
		System.out.println("1.���");
		System.out.println("2.ȡ��");
		System.out.println("3.����ѯ");
		Scanner input = new Scanner(System.in);
		int menuNum = input.nextInt();
		
			switch(menuNum) {
			case 1:
				bank.getDeposit();break;
			case 2:
				bank.getCash();break;
			case 3:
				System.out.println("��ǰ���Ϊ��" + bank.queryBalance() + "Ԫ��");
				default:
					System.out.println("���������������������룡");
			}
		
	}
	
	
	
	
	

}
