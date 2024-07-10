package Strings;

public class PalindromeString {
	public static void main(String[] args) {
		String s1="madam";
		s1=s1.toLowerCase();
		boolean p=true;
		for (int i = 0; i <s1.length()/2; i++) {
			if (s1.charAt(i)!=s1.charAt(s1.length()-i-1)) {
				p=false;
				System.out.println("it is not palindrome");
				break;
				
			}
			
			
			
			
		}
		if (p==true) {
			System.out.println("it is palindrome");
			
		}
	}

}
