package collection;

import java.util.*;
// 배열에서 객체값 하나씩 리턴하기
public class ArrayListExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DB");
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			String data = it.next();
			// 첫 번째 아이를 가져온 후 remove() 작동하여 하나씩 사라진다. next()
			System.out.println(data);
			
		}
		System.out.println("-------------");
		// 한번 더 반복해 줘야 하는 부분. it = list.iterator();
		it = list.iterator();
		while (it.hasNext()) {
			String data = it.next();
			System.out.println(data);
			
		}
		System.out.println("-------------");
		
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
