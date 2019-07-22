package com.libuguan.ex03;

public class Stock {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String macBrand = "MacBookAir";
		double macSize = 13.3;
		double macPrice = 6988.88;
		int macCount = 5;
		
		String thinkPadBrand = "ThinkPadT450";
		double thinkPadSize = 14.0;
		double thinkPadPrice = 5999.99;
		int thinkPadCount = 10;
		
		String AUSUBrand = "AUSU-FL5800";
		double AUSUSize = 15.6;
		double AUSUPrice = 4999.50;
		int AUSUCount = 18;
		
		int totalCount = macCount + thinkPadCount + AUSUCount;
		double totalMoney = (macCount * macPrice) + (thinkPadCount * thinkPadPrice)
				+ (AUSUCount * AUSUPrice);
		System.out.println("-------------------库房库存清单-------------------");
		System.out.println(" 品牌型号 \t 尺寸 \t 价格 \t 库存数");
		System.out.println(macBrand + "\t"+ macSize + "\t" + macPrice + "\t" + macCount);
		System.out.println(thinkPadBrand + "\t" + thinkPadSize + "\t" + thinkPadPrice + "\t" + thinkPadCount);
		System.out.println(AUSUBrand + "\t" + AUSUSize + "\t"  + AUSUPrice + "\t" + AUSUCount);
		System.out.println("-------------------------------------------------");
		
		System.out.println("总库存数：" + totalCount);
		System.out.println("库存商品总金额：" + totalMoney);
		
		
	}

}
