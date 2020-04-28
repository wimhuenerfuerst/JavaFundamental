package orm;

import java.time.LocalDate;

@Table("tbl_person")
public class Person {

	@Column("col_firstName")
	String firstName;

	@Column("col_lastName")
	String lastName;

	@Column("col_dateOfBrith")
	LocalDate dateOfBrith;

	@Column("col_address")
	Address address;

	public Person(String firstName, String lastName, LocalDate dateOfBrith, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBrith = dateOfBrith;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getDateOfBrith() {
		return dateOfBrith;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBrith=" + dateOfBrith + "]";
	}

}
