package Arrays;

public class EvenOddPosition {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,5,6,7,8,9,10};
		for (int i = 0; i < a.length; i++) {
			 
			if (i%2==0) {
				System.out.print(a[i]);
				
			} else {
			//	System.out.println(a[i]);
			}
		}
	
	}

}
