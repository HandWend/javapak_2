package collection;

public class Member {

	private String name;
	private int age;
	
	// source - field - select all - ok
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// source - override - equals / hashCode - ok
	@Override
	public boolean equals(Object obj) {
		// instanceof : 멤버클래스의 객체냐?
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	
}
