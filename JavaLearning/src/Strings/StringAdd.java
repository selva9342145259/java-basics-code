package Strings;

public class StringAdd {

	public static void main(String[] args) {
		String s1 = "madama";
		String s2 = "";
		for (int i = s1.length()-1; i >= 0; i--) {
			char ch=s1.charAt(i);
			s2+=ch;
			
		}
		if (s2.equals(s1)) {
			System.out.println("it is Palindrome");
		} else {
			System.out.println("it is not palindrome");
		}
	}

}
