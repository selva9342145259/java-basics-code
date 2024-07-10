package TypeCasting;

public class B_sub extends A_super {
	int b = 20;

	public void bLoop() {
		for (int i = 12; i < 14; i++) {
			
			System.out.println("B class no thread:" + i);

		}
	}
	public void bLoop1() {
		for (int i = 5; i <10 ; i++) {
			Thread.yield();
			System.out.println("B class :" + i);
			

		}
	}
	@Override
	public void run() {
		bLoop1();
		
	}
}
