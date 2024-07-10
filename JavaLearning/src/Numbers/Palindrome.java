package Numbers;

public class Palindrome {
	public static int rev(int n) {
		int num=n;
		int rev=0;
		while (n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return rev;
	}
	

	public static void main(String[] args) {
		int n=12321;
	
		if (n==rev(n)) {
			System.out.println("it is palindrome "+ n);
		}
		else {
			System.out.println("it is not palindrome");
		}
	}

}
