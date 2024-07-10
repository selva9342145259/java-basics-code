package OopsProgramming;
import java.util.Scanner;
public class MainAbstact {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		Dog d1=new Dog();
		Cat c1=new Cat();
		Cow c2=new Cow();
		
		int choice=scn.nextInt();
		Abstact.open();
		switch (choice) {
		case 1: d1.sound();
			
			break;
		case 2:c1.sound();
				break;
		case 3:c2.sound();
				break;
		default: System.out.println("invalid option");
			break;
		}
		Abstact.close();
		

	}

}
