package Arrays;

public class ContinouasSumArray {

	public static void main(String[] args) {
		int a[]= {0,5,6,0,9,11,1,4};
		int big=0;
		for (int i = 0; i < a.length-1; i++) {
			int sum=a[i]+a[i+1]; 
			if (big<sum) {
				big=sum;
			}
		}
		System.out.println(big);
	}

}
