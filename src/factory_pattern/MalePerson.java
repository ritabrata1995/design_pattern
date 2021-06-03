package factory_pattern;

public class MalePerson implements Person {

	@Override
	public void wish(String message) {
		System.out.println("Wish from male_person:: " + message);

	}

}
