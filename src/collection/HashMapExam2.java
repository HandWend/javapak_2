package collection;

import java.util.*;

public class HashMapExam2 {

	public static void main(String[] args) {
		
		// Map 컬렉션 생성
		// key: String, value: Integer
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		// 객체 저장
		// "key", value
		// 중복된 키가 있을 경우 마지막에 들어온 값으로 대치됨.
		map.put("신용권", 85);
		map.put("홍길동", 95);
		map.put("이순신", 100);
		map.put("양희원", 98);
		map.put("홍길동", 80);
		System.out.println("총 Entry 수: " + map.size());
		
		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		// 객체 하나씩 처리
		// 아래 4줄은 한 세트라고 보면 됨.
		// Set<String> ~ it.hasNext()
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.print(key);
			System.out.print(" : ");
			System.out.println(map.get(key));
//			Integer value = map.get(key);
//			System.out.println("\t" + key + " : " + value);
			
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
	}

}
