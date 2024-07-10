package Numbers;

public class FibonaciiSeries {
	public static void main(String[] args) {
		int fib=0;
		int fib1=1;
		for (int i = 0; i < 10; i++) {
			System.out.println(fib);
			int fib2=fib1+fib;
			fib=fib1;
			fib1=fib2;
			
			
		}
	}

}
