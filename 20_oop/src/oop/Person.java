package oop;

public class Person {

	int age;
	int plz;
	int wealth;

	public void init(int age, int plz, int wealth) {
		this.age = age;
		this.plz = plz;
		this.wealth = wealth;
	}

	public int getAge() {
		return age;
	}

	public int getPlz() {
		return plz;
	}

	public int getWealth() {
		return wealth;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public void addWealth(int wealth) {
		this.wealth += wealth - 1;
	}

	public static void main(String[] args) {
		Person person = new Person();		
		person.init(12, 35392, 1000);
		
		System.out.println(person.getAge());
		person.setAge(18);
		System.out.println(person.getAge());
		
		person.addWealth(10);
		System.out.println(person.getWealth());
		person.addWealth(5);
		System.out.println(person.getWealth());
	}
}
