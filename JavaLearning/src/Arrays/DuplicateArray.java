package Arrays;

import java.util.Arrays;

public class DuplicateArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,9,7,8,1,2,3,4,5,6,7,8};
		int count=0;
			Arrays.sort(a);
			
		for (int i = 0; i < a.length-1; i++) {
				if (a[i]!=a[i+1]) {
					count++;
				}
				
		}
		int[] b=new int[count+1];
		int j=0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]!=a[i+1]) {
				b[j]=a[i];
				j++;
			}
			
		}
		b[j]=a[a.length-1];
		for (int i : b) {
			System.out.print(i);
			
		}
		
	}

}
