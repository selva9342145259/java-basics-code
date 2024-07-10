package Numbers;

public class GreatestNumber {
	public static void greatest(int a,int b) {
		if (a>b) {
			System.out.println(a +" : Greatest Number");
		}else if(b>a) {
			System.out.println(b +" : Greatest Number");
		} else {
			System.out.println("it is same number");
		}
	}

	public static void main(String[] args) {
		greatest(100,100);

	}

}
