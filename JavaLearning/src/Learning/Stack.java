package Learning;

public class Stack {
	int[] s = new int[10];
	int tos;

	Stack() {
		tos = -1;
	}

	public void push(int value) {
		if (tos < s.length) {
			s[++tos] = value;
		} else {
			System.out.println("stack is full");
		}
	}
		public int pop () {
			if (tos>=0) {
				
			return	s[tos--];
			}
			else {
				System.out.println("your stack is empty");
				return -1;
			}

	}
}
