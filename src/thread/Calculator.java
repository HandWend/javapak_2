package thread;

public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}
	
	// 동기화 메소드 synchronized
	public  void setMemory(int memory) {
		// 동기화 블록
		synchronized(this) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 현재 스레드와 그 이름과 메모리의 값 출력하기.
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	}
}
