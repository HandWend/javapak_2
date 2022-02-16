package thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			System.out.println("땡");
			toolkit.beep(); // 띠리링~ 윈도우 기본 경고음
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
