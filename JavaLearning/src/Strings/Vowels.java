package Strings;

public class Vowels {

	public static void main(String[] args) {
		String s1="1par10apara9sundari5";
			s1=s1.toLowerCase();
			 int vowels=0;
			 int consonants=0;
			 int numbers=0;
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			} else if(ch >= '0'&&ch<= '9') {
				numbers++;
			} else {
				consonants++;
			}
			
		}
		System.out.println("vowels ="+vowels);
		System.out.println("consonants  = "+consonants);
		System.out.println("numbers = "+numbers);
	}

}
