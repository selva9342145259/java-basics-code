package Arrays;

public class RightRotate {
	public static void main(String[] args) {
		int k = 25;
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Before Swapping");
		for (int i : a) {
			System.out.print(i);

		}

		if (k > a.length) {
			k %= a.length;
		}
		int[] temp = new int[k];
		for (int i = 0; i < k; i++) {
			temp[i] = a[i];
		}
		System.out.println();
		int j = 0;
		int t = 0;
		for (int i = k; i < a.length + temp.length; i++) {
			if (i <a.length) {

			a[j] = a[i];
			}
			else {
				a[j] = temp[t];
				t++;
			}
			j++;

		}
		System.out.println("After Swapping");
		for (int i : a) {
			System.out.print(i);

		}

	}

}
