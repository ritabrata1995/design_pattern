package factory_pattern;

public class Test {

	public static void main(String[] args) {
		Person p = PersonFactory.createPerson("male");
		p.wish("hello world");

	}

}
