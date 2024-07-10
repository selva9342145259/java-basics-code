package Numbers;

public class SumOfDigit {

	public static void main(String[] args) {
		int n=123456;
		int sum=0;
		for (int i = n; i >0; i/=10) {
			int last=i%10;
			sum+=last;
		}
		System.out.println("sum of digits : "+sum);
	}

}
