package Arrays;

public class Largest {
	public static void main(String[] args) {
		int a[]= {35,45, 2,3,4,5,7,8,9,6,10,40,30,20,15,04};
		int lar=a[0];
		int sec=a[1];
		int third=a[2];
		for (int i = 0; i < a.length; i++) {
			if(lar<a[i]) {
				
				sec=lar;
				lar=a[i];
				
			}   if(lar>a[i]&&sec<a[i]) {
				third=sec;
				sec=a[i];
			}  if (lar>a[i]&&sec>a[i]&&third<a[i]) {
				third=a[i];
			}
		}
			System.out.println("largest ="+lar);
			System.out.println("Sec ="+ sec);
			System.out.println("Third ="+ third);
	}
}
				
