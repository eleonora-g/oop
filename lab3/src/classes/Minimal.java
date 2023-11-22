package classes;

public class Minimal implements IOperation {
	@Override
	public String getSign() {
		return "MIN";
	}

	@Override
	public String getName() {
		return "Минимум";
	}
	
	@Override
	public int estimate(int a, int b) {
		return a<b ? a : b;
	}
}
