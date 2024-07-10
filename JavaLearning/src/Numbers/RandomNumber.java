package Numbers;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random r1=new Random();
		int i=1;
		while (i<10) {
			System.out.println(r1.nextInt(115000));
			i++;
		}

	}

}
