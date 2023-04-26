package jp.co.aforce.sample;

import java.util.Calendar;

public class SampleTime {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		
		switch("") {
		case "月":
			System.out.println("今日は" + "曜日です");
			break;
		case "水":
			System.out.println("今日は" +  "曜日です");
			break;
		case "木":
			System.out.println("今日は" + "曜日です");
			break;
		case "金":
			System.out.println("今日は"  + "曜日です");
			break;
		case "土":
			System.out.println("今日は"  + "曜日です");
			break;
		case "日":
			System.out.println("今日は" +  "曜日です");
			break;
		default:
			System.out.println("以外");
			break;
		}
	}
}
