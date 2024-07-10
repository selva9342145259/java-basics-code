package Numbers;

public class Lcm {
	public static void main(String[] args) {
		int no1=3;
		int no2=24;
		int max=no1>no2?no1:no2;
		int lcm=0;
		while(true) {
			if (max%no1==0&&max%no2==0) {
				lcm=max;
				System.out.println(lcm);
				break;
			}
			max--;
		}
		
	}
}
