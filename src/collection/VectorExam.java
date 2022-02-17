package collection;

import java.util.*;

public class VectorExam {

	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		System.out.println("용량: " + list.capacity());
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DB");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println();
		
		list.remove(0);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());

	}

}
