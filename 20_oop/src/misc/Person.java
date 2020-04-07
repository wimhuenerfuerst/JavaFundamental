package misc;

public class Person {
	String vorname;
	String nachname;
	int alter;
	String email; // optional
	String telefon; // optional

	public Person(String vorname, String nachname, int alter) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}

	public Person(String vorname, String nachname, int alter, String email, String telefon) {
		this(vorname, nachname, alter); // oder init() methode
		this.email = email;
		this.telefon = telefon;
	}

	public static void main(String[] args) {
		System.out.println(new Person("Hans", "Peter", 18));
		System.out.println(new Person("Hans", "Meyer", 18, "mail@mail.de", "123456"));
	}

	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + ", alter=" + alter + ", email=" + email
				+ ", telefon=" + telefon + "]";
	}

}
