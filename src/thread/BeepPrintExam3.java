package thread;

import java.awt.Toolkit;
/**
 * 단일 스레드
 * @author smart19
 *
 */
public class BeepPrintExam3 {

	public static void main(String[] args) {
	
		Thread thread = new BeepThread();
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
