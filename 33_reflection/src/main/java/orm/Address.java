package orm;

@Table("tbl_address")
public class Address {

	@Column("col_city")
	String city;

	@Column("col_postcode")
	String postcode;

	@Column("col_street")
	String street;

	@Column("col_houseNumber")
	int houseNumber;

	public Address(String city, String postcode, String street, int houseNumber) {
		super();
		this.city = city;
		this.postcode = postcode;
		this.street = street;
		this.houseNumber = houseNumber;
	}

	public String getCity() {
		return city;
	}

	public String getPostcode() {
		return postcode;
	}

	public String getStreet() {
		return street;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", postcode=" + postcode + ", street=" + street + ", houseNumber="
				+ houseNumber + "]";
	}

}
