package classes;

public class Substaction implements IOperation {
	@Override
	public String getSign() {
		return "-";
	}

	@Override
	public String getName() {
		return "Разность";
	}
	
	@Override
	public int estimate(int a, int b) {
		return a-b;
	}
}
