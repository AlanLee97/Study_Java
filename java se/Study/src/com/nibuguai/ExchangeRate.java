package com.nibuguai;

public class ExchangeRate {
	public void change(double[] T) {
		for(int j = 0; j < T.length; j++) {
			T[j] = T[j] * 6.903;
		}
	}
	public static void main(String[] args) {
		ExchangeRate rate = new ExchangeRate();
		double[] denomination = {1,10,100};
		System.out.print("美    元：");
		for (int i = 0; i < denomination.length; i++) {
			System.out.print(denomination[i]+"美元  ");
		}
			
		System.out.print("\n人民币：");
		rate.change(denomination);
		for(int j = 0; j < denomination.length; j++) {
			System.out.print(denomination[j]+"元  ");
		}
		
	}

}
