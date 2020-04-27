package patterns.builder;

import patterns.builder.Person.PersonBuilder;

public class Main {

	public static void main(String[] args) {
		PersonBuilder builder = new PersonBuilder("hans", "peter", 18);
		Person p = builder.setPostcode("12345").build();
	}

}
