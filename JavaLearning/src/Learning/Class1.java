package Learning;

public class Class1 {

	public static void main(String[] args) {
		int a[]= {9,5,4,3,8};
		int temp=a[0];
		for (int i = 0; i < a.length-1; i++) {
			a[i]=a[i+1];
			if(i==a.length-2) {
				a[i+1]=temp;
			}
			
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
