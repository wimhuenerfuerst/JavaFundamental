package oop;

public class Address {

	int plz;
	String street;

	public void init(int plz, String street) {
		this.plz = plz;
		this.street = street;
	}

	public int getPlz() {
		return plz;
	}

	public String getStreet() {
		return street;
	}
	
	public Address rename(String newName) {
		Address address = new Address();
		address.init(plz, newName);
		
		return address;
	}

	@Override
	public String toString() {
		return "Address [plz=" + plz + ", street=" + street + "]";
	}
}
