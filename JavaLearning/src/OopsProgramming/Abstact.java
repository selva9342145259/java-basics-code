package OopsProgramming;

abstract public class Abstact {
	
	public static void open(){
		System.out.println("sounds on");
	}
	abstract public void sound();
	public static void close() {
		System.out.println("sounds off");
	}
	

}
