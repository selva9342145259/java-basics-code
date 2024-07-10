package Numbers;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your Year");
		int year =scn.nextInt();
		if(year%4==0&&year%100==0&&year%400==0) {
			System.out.println(year +" This year is leap year");
		} else {
			System.out.println(year +" This year is not leap year");
		}
	}

}
