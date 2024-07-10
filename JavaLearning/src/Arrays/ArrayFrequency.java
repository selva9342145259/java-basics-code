package Arrays;

public class ArrayFrequency {



	public static void main(String[] args) {
		int count = 0;
		int[] a = { 1, 2, 2, 2, 3, 3, 5, 67, 4 };
		for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}

			}
			System.out.println(a[i] + "\t\t" + count);
			count = 0;
		}
		
	}
}
