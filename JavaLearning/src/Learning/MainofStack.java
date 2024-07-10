package Learning;

public class MainofStack {

	public static void main(String[] args) {
		Stack s1 = new Stack();
		int i = 10;
		while (i > 0) {
			s1.push(i);
			i--;
		}
		for (int x : s1.s) {
			System.out.println(x);

		}
		while (i < 10) {
		System.out.println(s1.pop());
			i++;
		}
		s1.push(4);
		System.out.println(s1.pop());

	}
}
