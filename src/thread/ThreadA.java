package thread;

public class ThreadA extends Thread {
	// 디폴트생성자, source - superclass - Thread - ok
	public ThreadA() {
		setName("ThreadA");
	}
	// source - override - run() - ok
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용입니다.");
		}
	}

	

	
}
