package thread;

import java.awt.Toolkit;
/**
 * 단일 스레드
 * @author smart19
 *
 */
public class BeepPrintExam {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
		toolkit.beep(); // 띠리링~ 윈도우 기본 경고음
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
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
