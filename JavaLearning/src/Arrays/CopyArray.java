package Arrays;

import java.lang.reflect.Array;

public class CopyArray {
	public static void main(String[] args) {
		int arr[]= {1,2,2,4,5};
		int copy[]=new int[arr.length];
		for (int i = 0; i < copy.length; i++) {
			copy[i]=arr[i];
			
		}
		for (int i : copy) {
			System.out.println(i);
		}
	}

}
