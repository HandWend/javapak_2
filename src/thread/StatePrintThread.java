package thread;

public class StatePrintThread extends Thread {

	// field
	private Thread targetThread;
	
	// constructor
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	// method
	@Override
	public void run() {
		while (true) {
			// 
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태: " + state);
			
			// new가 생성되었느냐
			if (state == Thread.State.NEW) {
				targetThread.start();
			}
			// 스레드가 종료되었냐
			if (state ==Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	

	
}
