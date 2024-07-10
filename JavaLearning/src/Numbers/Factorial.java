package Numbers;

public class Factorial {
	public int fact(int n) {
	int fact=n-1;
	while(fact>0) {
		n*=fact;
		fact--;
				
	}
	return n;
	}
			
}
