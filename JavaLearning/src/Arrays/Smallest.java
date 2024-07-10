package Arrays;
public class Smallest {

	public static void main(String[] args) {
		int a[]= {2,7,8,9,10,3};
		int small=a[0];
		int small1=a[1];
		int small2=a[2];
		for (int i = 0; i < a.length; i++) {
			if (small>a[i]) {
				small1=small;
				small=a[i];
			}
			if (small<a[i]&&small1>a[i]) {
				small2=small1;
				small1=a[i];
			}
			if (small<a[i]&&small1<a[i]&&small2>a[i]) {
				small2=a[i];
			}
			
		}
		System.out.println(small);
		System.out.println(small1);
		System.out.println(small2);

	}

}
