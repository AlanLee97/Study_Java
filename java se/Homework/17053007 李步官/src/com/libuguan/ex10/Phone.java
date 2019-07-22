package com.libuguan.ex10;

public class Phone {
		String brand;
		String color;
		double size;
	public static void main(String[] args) {
		Phone p = new Phone();
		p.brand = "小米8";
		p.color = "蓝色";
		p.size = 6.21;
		
		System.out.println("手机品牌为：" + p.brand);
		System.out.println("手机颜色为：" + p.color);
		System.out.println("手机尺寸为：" + p.size);
		

	}

}
