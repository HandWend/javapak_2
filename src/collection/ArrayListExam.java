package collection;

import java.util.*;

public class ArrayListExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DB");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());

	}

}
