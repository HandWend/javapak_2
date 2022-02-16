package thread;

public class User1 extends Thread{

	// calculator 객체 선언
	// has a 방식
	private Calculator calculator;
	
	
	// setter만 들고 나오기
	public void setCalculator(Calculator calculator) {
		setName("User1");
		this.calculator = calculator;
	}



	@Override
	public void run() {
		calculator.setMemory(100);
	}

	
}
