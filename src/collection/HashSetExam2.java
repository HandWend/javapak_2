package collection;

import java.util.*;

public class HashSetExam2 {

	public static void main(String[] args) {
		// 컬렉션에는 객체가 들어가야 한다.
		// Set<Member>: Member 객체가 들어가야 한다 (클래스)
		Set<Member> set = new HashSet<Member>();
		
		// Member.java 파일에서 override - equals 주석 처리 시 set.size()는 중복값도 허용한다.
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		set.add(new Member("양희원", 25));
		
		System.out.println("총 객체 수: " + set.size());
		
	}

}
