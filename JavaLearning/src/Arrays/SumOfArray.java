package Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int total=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
		}
		for (int i : arr) {
			System.out.println(arr[i]);
		}
		for (int i : arr) {
			total+=i;
		}
		System.out.println(total);
	}

}
