package TypeCasting;

public class A_super implements  Runnable{
	int a=10;
	public void aloop() {
		for (int i = 0; i < 5; i++) {
			System.out.println("A class :" + i);

		}
	}
	public void aloop1() {
		for (int i = 10; i < 12; i++) {
		
			
			System.out.println("A class no thread :" + i);

		}

	}
	@Override
	public void run() {
		
		aloop();
		
	} 
	

}
