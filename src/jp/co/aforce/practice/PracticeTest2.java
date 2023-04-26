package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
		final double TAX = 0.1;
		System.out.println(TAX);
		int x = 480;
		double price = x * TAX;
		System.out.println(price);
		
		String name = "鎌形竜也";
		System.out.println(name);
		
		String str1 = "この商品の値段は";
		String str2 = "円です";
		System.out.println(str1 + price + str2);
	}
}
