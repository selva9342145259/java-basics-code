package OopsProgramming;

import java.util.Scanner;


public class Model implements PrintForm {
	String name;
	Short age;
	public String toString() {
		return "name :"+name+"\n age :"+age;
	}
	Scanner sc=new Scanner(System.in);


	public String printName() {
		System.out.println("ENTER YOUR NAME");
		 name=sc.next();
		return name;
		
	}

	public Short age() 
	{
		System.out.println("ENTER YOUR AGE");
	   age =sc.nextShort();
		return age;
	}
	

}
