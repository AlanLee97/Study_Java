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
		System.out.println("请输入存款数目:");
		
		double cunKuan = input.nextDouble();
		System.out.println("您的存款数目为：" + cunKuan + "  账户余额为："
		+ (balance + cunKuan) + "元");
	}
	
	public void getCash() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入取款数目：");
		double quKuan = input.nextDouble();
		if(quKuan > balance) {
			System.out.println("您的余额不足。");
		}else {
			System.out.println("您的取款数目为：" + quKuan + "元。" + 
		"\n当前账户余额为：" + (balance-quKuan));
		}
	}
	
	public double queryBalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank("62270022109125725661",10000.0);
		System.out.println("当前账户为：" + bank.account);
		System.out.println("请选择服务类型：");
		System.out.println("1.存款");
		System.out.println("2.取款");
		System.out.println("3.余额查询");
		Scanner input = new Scanner(System.in);
		int menuNum = input.nextInt();
		
			switch(menuNum) {
			case 1:
				bank.getDeposit();break;
			case 2:
				bank.getCash();break;
			case 3:
				System.out.println("当前余额为：" + bank.queryBalance() + "元。");
				default:
					System.out.println("您的输入有误，请重新输入！");
			}
		
	}
	
	
	
	
	

}
