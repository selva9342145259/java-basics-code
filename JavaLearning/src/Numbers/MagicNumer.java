package Numbers;

import java.util.Scanner;

public class MagicNumer {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		System.out.println("enter your num 1");
		int num1=scn.nextInt();
		System.out.println("enter your num 2");
		int num2=scn.nextInt();
		if (num1<num2) {
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
		}
		System.out.println("num 1="+num1);
		System.out.println("num 2="+num2);
		
	}
}
