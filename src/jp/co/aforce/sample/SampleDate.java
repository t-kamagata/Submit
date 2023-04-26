package jp.co.aforce.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SampleDate {
	public static void main(String[] args) {
		var calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(2000, 5, 12);
		var fmt = new SimpleDateFormat("yyyy年MM月dd(EEE) HH:mm:ss");
		String date = fmt.format(calendar.getTime());
		System.out.println(date);
	}
}
