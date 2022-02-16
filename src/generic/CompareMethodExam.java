package generic;

public class CompareMethodExam {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		
		if (Util.<Integer, String>compare(p1,p2)) {
			System.out.println("논리적으로 동등한 객체");
		} else {
			System.out.println("동등하지 않아.");
		}
	}

}
