package Numbers;

public class LCM1 {

	public static void main(String[] args) {
		int lcm1=60;
		int lcm2=36;
		int lcm=0;
		int n=lcm1<lcm2?lcm1:lcm2;
		outer :
		for (int i = 1; i <=lcm1/2; i++) {
			int temp1=i*lcm1;
			for (int j = 1; j <=lcm2/2; j++) {
				int temp2=j*lcm2;
				if (temp1==temp2) {
					lcm=temp2;
					break outer;
				}
			}
			
		}
			System.out.println(lcm);
	}

}
