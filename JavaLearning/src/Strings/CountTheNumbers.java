package Strings;

public class CountTheNumbers {
	public static void main(String[] args) {
		String str="TamilSelvi";
		String str1="SelvaGanesh";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			str.charAt(i);
			if (str.charAt(i)=='.'||str                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          .charAt(i)==','||str.charAt(i)=='!'||str.charAt(i)==';'||str.charAt(i)==':') {
				
				count++;
				
			}
			
		}
		System.out.println(count);
		
	}	
}
