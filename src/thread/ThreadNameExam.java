package thread;

public class ThreadNameExam {

	public static void main(String[] args) {
		
		
		// 우선순위
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
		Thread mainThread = Thread.currentThread();
		// 기본은 5, 범위는 1부터 10까지
		mainThread.setPriority(4);
		System.out.println("프로그램 시작 스레드이름: " + mainThread.getName());
	
		Thread ta = new ThreadA();
		System.out.println("작업 스레드 이름: " + ta.getName());
		ta.start();
		
		Thread tb = new ThreadB();
		System.out.println("작업 스레드 이름: " + tb.getName());
		tb.start();
	}

}
