package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class PracticeTest5 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("犬", "猫", "うさぎ", "へび"));
		String like = "ペンギン";
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(like)) {
				System.out.println(like + "はリストに含まれています");
				break;
			}
			if(i == list.size()-1) {
				System.out.println(like + "はリストに含まれていません");
			}
		}
		
		int month = Calendar.getInstance().get(Calendar.MONTH);
		
		switch(month) {
		case 0:
			System.out.println("冬物セール");
			break;
		case 1:
		case 2:
		case 3:
			System.out.println("春物を売る");
			break;
		case 4:
			System.out.println("春物セール");
			break;
		case 5:
		case 6:
			System.out.println("夏物を売る");
			break;
		case 7:
			System.out.println("夏物セール");
		case 8:
			System.out.println("秋物を売る");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("冬物を売る");
			break;
		default:
			System.out.println("不正な月です");
		}
		
	}
}
