package Numbers;

public class GreatestThreeNumber {
	public static void threeGreatestNumber(int a,int b,int c) {
		if(a>b&&a>c) {
			System.out.println(a +"is Greatest Number");
		} else if(b>a&&b>c) {
			System.out.println(b +"is Greatest Number");
		} else if(c>a&&c>b) {
			System.out.println(c +"is Greatest Number");
		} else {
			System.out.println("It is same Numbers");
		}
	}

	public static void main(String[] args) {
		threeGreatestNumber(1000, 1000, 1000);

	}

}
