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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (plz != other.plz)
			return false;
		if (wealth != other.wealth)
			return false;
		return true;
	}

	public static void main(String[] args) {
		{
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
		
		Person p1 = new Person();		
		p1.init(12, 35392, 1000);
		
		Person p2 = new Person();		
		p2.init(12, 35392, 1000);
		
		if(p1 == p2) {
			System.out.println("== gleich");
		}
		
		if(p1.equals(p2)) {
			System.out.println("eq gleich");
		}
	}
}
