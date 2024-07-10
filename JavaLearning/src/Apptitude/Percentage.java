package Apptitude;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter yout amount");
		double percent=sc.nextInt();
		System.out.println("Enter your Percentge");
		double amount =sc.nextInt();
		double ans=percent*100;
		double ans1=ans/amount;
		System.out.println("Your percentage is "+ans1);
		
	}

}
