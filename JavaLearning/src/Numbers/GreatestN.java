package Numbers;

import java.util.Scanner;

public class GreatestN {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int temp=Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter you Numbers");
			int n=scn.nextInt();
			if (n>temp) {
				temp=n;
			}
			
		}
		System.out.println(temp+" Is the greatest number");
	}

}
