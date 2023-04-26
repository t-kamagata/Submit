package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest6 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int value = rnd.nextInt();
		
		switch(value) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
				
		}
		
		for(int i = 1; i <= 100; i++) {
			if(i % 7 == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
	}
}
