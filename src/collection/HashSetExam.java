package collection;

import java.util.*;

public class HashSetExam {

	public static void main(String[] args) {
		// 중복값 불용
		Set<String> set = new HashSet<String>();
		// 중복값 허용
		// List<String> set = new ArrayList<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/Jsp");
		// 중복값은 나오지 않음.
		set.add("JAVA");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}

	}

}
