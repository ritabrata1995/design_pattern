package factory_pattern;

public class FemalePerson implements Person {

	@Override
	public void wish(String message) {
		System.out.println("Wish from female_person:: " + message);

	}

}
