package Numbers;

public class Amstrong {

	public static void main(String[] args) {
	int n=153;
	int count=0;
	int rev=0;
	int sum=0;
	int multi=1;
	int num=n;
	while (num>0) {
		count++;
		num/=10;
	}
	for(int i=1;i<=count;i++) {
		int rem=n%10;
		int k=1;
		while (k<=count) {
		multi*=rem;
		k++;
		}
		sum+=multi;
		multi=1;
		n/=10;
	}
		System.out.println(sum);

	}

}
