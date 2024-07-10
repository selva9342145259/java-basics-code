package Numbers;

public class Factors {

	public static void main(String[] args) {
		int n=10;
		System.out.println(n +" : factors are");
		for (int i = 1; i <=n/2; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
			
		}

	}

}
