package Arrays;

public class Mininmum {

	public static void main(String[] args) {
		int arr[]= {3,4,7,2,6,5};
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}
