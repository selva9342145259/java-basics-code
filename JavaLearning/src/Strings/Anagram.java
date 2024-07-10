package Strings;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "Raja";
		String s2 = "Jara";
		if (s1.length() != s2.length()) {
			System.out.println("It is not anagram");
		} else {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			int count =0;
			for (int i = 0; i < c2.length; i++) {
				if (c1[i]==c2[i]) {
					count++;
				}
				else {
					System.out.println("This is not anagram");
					break;
				}
			}
			if (count++==c1.length) {
				System.out.println("IT IS A ANAGRAM  " +s1+" == "+s2);
			}

		}
	}
}
