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
		System.out.print("��    Ԫ��");
		for (int i = 0; i < denomination.length; i++) {
			System.out.print(denomination[i]+"��Ԫ  ");
		}
			
		System.out.print("\n����ң�");
		rate.change(denomination);
		for(int j = 0; j < denomination.length; j++) {
			System.out.print(denomination[j]+"Ԫ  ");
		}
		
	}

}
