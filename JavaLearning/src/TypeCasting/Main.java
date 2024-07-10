package TypeCasting;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		A_super a =new A_super();
		B_sub b=new B_sub();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		for (int i = 50; i < 55; i++) {
			System.out.println("main :"+i);
		
			
	}
		
		t2.setName("Customer");
			t2.start();
			System.err.println(t2.getName());
			System.err.println(t2.getId());
			System.err.println(t2.getPriority());
			t2.setPriority(1);
			System.err.println(t2.getPriority());
			

			t1.setName("programmer");
			t1.start();
			System.err.println(t1.getName());
			System.err.println(t1.getId());
			System.err.println(t1.getPriority());
			t1.setPriority(3);
			System.err.println(t1.getPriority());

	
	for (int i = 36; i <42; i++) {
		System.out.println("bye main :"+i);
		
	}
		
		
	}

	
}
