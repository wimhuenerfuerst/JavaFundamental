package mdb;

public class Reviewer {
	String firstname;
	String lastname;

	public Reviewer(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	@Override
	public String toString() {
		return "Reviewer [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
