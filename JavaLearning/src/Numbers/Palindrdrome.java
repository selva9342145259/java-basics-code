package Numbers;

public class Palindrdrome {

	public static void main(String[] args) {
		int n=12321;
		int rev=0;
		for (int i = n; i >0 ; i/=10) {
			int last=i%10;
			rev=rev*10+last;
			
		}
		if (rev==n) {
			System.out.println("It is palindrome number");
			
		} else {
			System.out.println("not a palindrome number");
		}

	}

}
