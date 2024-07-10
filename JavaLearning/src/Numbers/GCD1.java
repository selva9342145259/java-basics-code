package Numbers;

public class GCD1 {

	public static void main(String[] args) {
		int gcd1=60;
		int gcd2=36;
		int gcd=0;
		int n=gcd1 < gcd2 ? gcd1 :gcd2;
		for (int i = n/2; i > 1; i--) {
			if (gcd1%i==0&&gcd2%i==0) {
				gcd=i;
				break;
			}
			
		}
		System.out.println(gcd);

	}

}
