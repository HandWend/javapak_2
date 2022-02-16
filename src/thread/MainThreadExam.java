package thread;

public class MainThreadExam {

	public static void main(String[] args) {
		// 계산기 객체
		Calculator calc = new Calculator();
		
		// 유저1 객체 
		User1 user1 = new User1();
		user1.setCalculator(calc);
		user1.start();
	
		User2 user2 = new User2();
		user2.setCalculator(calc);
		user2.start();
	}

}
