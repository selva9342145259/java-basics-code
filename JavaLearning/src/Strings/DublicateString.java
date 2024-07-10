package Strings;

public class DublicateString {
	public static void main(String[] args) {
		int n = 10;
		int rev = 0;
		int rev1=0;
		String s1 = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for (int i = n; i > 0; i /= 10) {
			int rem = i % 10;
			rev = rev * 10 + rem;

		}
		for (int i = rev; i > 0; i/=10) {
			int rem = i % 10;
			rev1 = rev1 * 10 + rem;
			if (rev1>0&&rev1<=26) {
				System.out.println(s1.charAt(rev1));
			}
		

			
		}

	}

}
