package Arrays;

public class Array {

	public static void main(String[] args) {
		int sum=0;
		int a[]=new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i]=i;
		}
		for (int i : a) {
			sum+=i;
			System.out.println(i);
		}
		System.out.println(sum);
	}

}
