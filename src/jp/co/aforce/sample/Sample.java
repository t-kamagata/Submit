package jp.co.aforce.sample;

public class Sample {

	public static void main(String[] args) {
		String lastName = "鎌形";
		String firstName = "竜也";
		String myName = lastName + firstName;
		System.out.println(myName);
		
		String saying = "明日は明日の風が吹く";
		boolean result = saying.contains("風");
		System.out.println(result);
	}
}
