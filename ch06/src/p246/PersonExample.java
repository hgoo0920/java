package p246;

import p245.Person;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-123456", "���");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "��������";
	}
}
