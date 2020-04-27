package patterns.builder;

public class Person {

	private final String firstname;
	private final String lastname;
	private final int age;
	private final String postcode;

	/*
	 * public Person(String firstname, String lastname, int age) { this.firstname =
	 * firstname; this.lastname = lastname; this.age = age; }
	 */

	public static class PersonBuilder {
		private String firstname;
		private String lastname;
		private int age;
		private String postcode = "";

		public PersonBuilder(String firstname, String lastname, int age) {
			this.firstname = firstname;
			this.lastname = lastname;
			this.age = age;
		}

		public PersonBuilder setPostcode(String postcode) {
			this.postcode = postcode;
			return this;
		}

		public Person build() {
			return new Person(firstname, lastname, age, postcode);
		}
	}

	private Person(String firstname, String lastname, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.postcode = "";
	}

	private Person(String firstname, String lastname, int age, String postcode) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.postcode = postcode;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getAge() {
		return age;
	}

	public String getPostcode() {
		return postcode;
	}

}
