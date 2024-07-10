package Numbers;

import java.util.Scanner;

public class CountOfEven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int even = 0;
		System.out.println("Enter you Numbers");
		for (int i = 0; i < 5; i++) {
			int n = scn.nextInt();
			if (n%2==0) {
				even++;
			}

		}
		System.out.println(even + " even numbers you are added");
	}

}
