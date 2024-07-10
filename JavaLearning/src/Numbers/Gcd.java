package Numbers;

public class Gcd {

	public static void main(String[] args) {
				int no1=3;
				int no2=24;
				int min=no1<no2?no1:no2;
				int lcm=0;
				while(true) {
					if (min%no1==0&&min%no2==0) {
						lcm=min;
						System.out.println(lcm);
						break;
					}
					min--;
				}
				
			}
		}

