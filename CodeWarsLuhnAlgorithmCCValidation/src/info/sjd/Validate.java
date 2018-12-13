package info.sjd;

public class Validate {
	public static boolean validate(String n) {
		int finalSumOfDigits = 0;
		int[] intArray = new int[n.length()];
		for (int i = n.length() - 1; i >= 0; i--) {
			intArray[i] = Integer.valueOf(n.charAt(i));
			if (i % 2 == 0) {
				intArray[i] = intArray[i] * 2;
				if (intArray[i] > 9) {
					intArray[i] = intArray[i] - 9;
				}
			}
			
			finalSumOfDigits = finalSumOfDigits + intArray[i];
		}
		if (finalSumOfDigits % 10 == 0) {
			return true;
		} else {
			return false;		
		}
	}
	
	public static void main(String[] args) {
		String n = "891";
		System.out.println(validate(n));
	}

}
