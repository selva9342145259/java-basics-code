package Numbers;

public class SwapNumbers {
	public static void thirdVariableSwap(int a, int b) {
		System.out.println("Before Swapping \n" + "a :" + a + "\n b :" + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swapping \n" + "a :" + a + "\n b :" + b);
	}

	public static void withOutThirdVariable(int a, int b) {
		System.out.println("Before Swapping \n" + "a :" + a + "\n b :" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping \n" + "a :" + a + "\n b :" + b);
	}

	public static void main(String[] args) {
		thirdVariableSwap(20, 30);
		withOutThirdVariable(200, 300);
	}

}
