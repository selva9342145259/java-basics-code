package ExceptionHandling;
public class ArithmaticException {
	public static void main(String[] args) throws NotELigible {
		int a = 10;
		int b = 0;
		int h[] = new int[3];
		int n[] = null;
		if (a==10) {
			
		//	throw new NotELigible ();
		}
		try {
			System.out.println(n[5]);
		} catch (Exception e) {
			throw new NotELigible ();
		}
		finally {
			System.out.println(a);
		}
		System.out.println("bye");
	}
}