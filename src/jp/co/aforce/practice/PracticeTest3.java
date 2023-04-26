package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest3 {
	public static void main(String[] args) {
		String[] items = {"シャープペンシル", "ボールペン",
				"リングノート", "クリップ", "消しゴム"
		};
		System.out.println(items[1]);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("山田太郎");
		list.add("鈴木花子");
		list.add("佐藤次郎");
		list.add("山田太郎");
		list.add("高橋三郎");
		
		System.out.println(list.get(2));
	}
}
