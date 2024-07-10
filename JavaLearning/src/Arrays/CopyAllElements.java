package Arrays;

public class CopyAllElements {
	public static void main(String[] args) {
		int b[]= {1,2,3,4,5,6};
		int a[]=new int[b.length];
		for (int i = 0; i < b.length; i++) {
			a[i]=b[i];
		}	
		for (int i : a) {
			System.out.print(i);
		}
		
	}

}
