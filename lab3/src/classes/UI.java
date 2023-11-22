package classes;

public class UI {
	public static void main (String[] args) {
		IOperation[] operations = {
				new Addition(), new Substaction(),
				new Multiplection(), new Maximum(),
				new Minimal()
		};
		int a = 120, b = 24;
		for (IOperation op : operations) {
			System.out.println(op.getName());
			System.out.printf("%d %s %d = %d\n",
					a, op.getSign(), b, op.estimate(a, b));
		}
	}
}
