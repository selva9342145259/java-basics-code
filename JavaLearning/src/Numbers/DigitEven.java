package Numbers;

public class DigitEven {

	public static void main(String[] args) {
		int n=1234;
		int even=0;
		int odd=0;
		while(n>0) {
			int temp=n%10;
			if(temp%2==0) {
				even++;
			} else {
				odd++;
			}
			n/=10;
		}
		System.out.println("even : "+ even+"\nodd : "+odd);

	}

}
