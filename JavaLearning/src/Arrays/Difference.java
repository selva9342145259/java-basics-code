package Arrays;

public class Difference {

	public static void main(String[] args) {
		int[] a = { 4, 3, 7, 11, 50, 1 };
		int x = 4;
		int y = 10;
		if (x < y) {
			for (int i = 0; i < a.length; i++) {
				if (x < a[i] && a[i] < y) {
					System.out.println(a[i]);

				}

			}
		}
	}

}
