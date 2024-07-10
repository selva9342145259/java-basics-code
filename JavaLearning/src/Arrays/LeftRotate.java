package Arrays;

public class LeftRotate {

	public static void main(String[] args) {

		int k = 28;

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		if (k > a.length) {
			k%=a.length;
		}
		System.out.println("before swapping");
		for (int i : a) {
			System.out.print(i);
		}
		int temp[] = new int[k];
		int j = 0;
		for (int i = 0; i < k; i++) {
			temp[i] = a[i];
		}
		for (int i = 0; i < a.length; i++) {
			try {
				a[i] = a[k];
			} catch (Exception e) {

			}
			k++;
			if (k > a.length) {

				a[i] = temp[j];
				j++;
			}

		}
		System.out.println("\nafter swapping");
		for (int i : a) {
			System.out.print(i);
		}

	}

}
