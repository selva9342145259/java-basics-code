package Strings;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String str="SElVa!@#$%&";
		str=str.replaceAll("[^a-zA-z0-9]","");
		System.out.println(str);

	}

}
