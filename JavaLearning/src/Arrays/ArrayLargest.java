package Arrays;

public class ArrayLargest {

	public static void main(String[] args) {
		int[] a= {1,2,24,4,5,6,7,23,30,8,9};
		int largest=a[0];
		int secondLargest=0;
		for (int i = 0; i < a.length-1; i++) {
				if (a[i]<a[i+1]&&a[i+1]>largest) {
					largest=a[i];
				}
			/* if (a[i]<largest) {
				 secondLargest=a[i];
				}*/
				
			}
			System.out.println("1st largest  "+largest);
			System.out.println("2 nd largest "+secondLargest);
		}
	}
