package Strings;

public class RemoveWhite {

	public static void main(String[] args) {
		String s1="  java developer  is good";
		s1=s1.trim();
		System.out.println(s1);
		s1=s1.replaceAll(" ", "");
		System.out.println(s1);

	}

}
