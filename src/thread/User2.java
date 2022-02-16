package thread;

public class User2 extends Thread {

	// calculator 객체 선언
	private Calculator calculator;

	// setter만 들고 나오기
	public void setCalculator(Calculator calculator) {
		setName("User2");
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
