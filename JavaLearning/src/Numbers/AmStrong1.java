package Numbers;

public class AmStrong1 {

	public static void main(String[] args) {
		int n=154;
		int sum=0;
		int amstrong=0;
		for (int i = n; i >0; i/=10) {
			sum++;
		}
		for (int i = n; i >0; i/=10) {
			int rem=i%10;
			int run=sum;
			int temp=(int)Math.pow(rem, sum);
			amstrong+=temp;
		}
		if (n==amstrong) {
			System.out.println("It is a amstrong number");
		} else {
			System.out.println("it is not amstrong number");
		}

	}

}
