package thread;
// 상속은 하나밖에 못 받음.
public class CalcThread extends Thread  {

	// source - override - run() - ok
	@Override
	public void run() {
		for (int i = 0; i <Integer.MAX_VALUE; i++) {
			
		}
		System.out.println(getName());
	}

	
}
