package info.sjd;

public class Validate {
	public static boolean validate(String n) {
		int finalSumOfDigits = 0;
		boolean toggle = false;
		for (int i = n.length() - 1; i >= 0; i--) {
			int number = Integer.valueOf(n.substring(i, i + 1));
			if (toggle) {
				number *= 2;
				if (number > 9) {
					number -= 9;
				}
			}
			
			finalSumOfDigits += number;
			toggle = !toggle;

		}
		return (finalSumOfDigits % 10 == 0); 
		
	}
	
	public static void main(String[] args) {
		String n = "4561261212345467";
		System.out.println(validate(n));
	}

}
