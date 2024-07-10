package Object;

import Arrays.ArrayFrequency;

public class ObjectMethods {
	public String toString() {
		
		return ""+"selva"+"ganesh";
	}
	
	public int hashCode() {
		return 10+2;
	}
	public static void main(String[] args) {
		int a=10;
		int b=20;
	
		ArrayFrequency ar=new ArrayFrequency();
		
		System.out.println(ar);
			ObjectMethods ob= new ObjectMethods();
			System.out.println(ob);
	}
}
