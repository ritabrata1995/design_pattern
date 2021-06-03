package factory_pattern;

public class PersonFactory {

	public static Person createPerson(String type) {
		Person p = null;

		switch (type.toLowerCase()) {
		case "male":
			p = new MalePerson();
			break;
		case "female":
			p = new FemalePerson();
			break;
		default:
			break;
		}
		
		return p;
	}

}
