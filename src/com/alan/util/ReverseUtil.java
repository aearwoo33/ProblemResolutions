
public class ReverseUtil {
	
	public static void main(String[] args) {
		String str = "Reverse this!";
		
		System.out.println(ReverseUtil.reverseString(str));
		
		Integer num = 18534;
		System.out.println("Num= " + num + " RevNum= " + reverseNumber(num));
	}
	public static Integer reverseNumber ( int number) {
		int n = 10;
		int reversedNumber = 0;
		while ( number >= 1) {
			reversedNumber = reversedNumber * n + number % 10;
			number = number / 10;
		}
		
		return reversedNumber;
	}
	public static String reverseString(String str) {
		return helpReverseString("", str);
	}
	private static String helpReverseString (String beginStr, String endStr) {
		if (endStr.length() == 1) {
			return beginStr + endStr;
		}
		else {
			return helpReverseString(beginStr + endStr.substring(endStr.length() - 1), endStr.substring(0,endStr.length() - 1));
		}
	}
}
