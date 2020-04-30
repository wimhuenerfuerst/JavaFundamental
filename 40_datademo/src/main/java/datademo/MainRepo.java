package datademo;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import datademo.data.Address;
import datademo.data.Person;
import datademo.data.PersonRepository;

@Component
public class MainRepo {

	@Autowired
	PersonRepository personRepository;

	@Transactional
	public void test() {

		Person person = new Person();

		person.setFirstname("Test");
		person.setLastname("TestLast");
		person.setBirth(LocalDate.now());

		personRepository.save(person);

		System.out.println(person);

		for (Person person2 : personRepository.findAll()) {
			System.out.println(person2);
		}

		System.out.println("***");

		for (Person person2 : personRepository.findByFirstname("Test2")) {
			System.out.println(person2);
		}

		System.out.println("***");

		for (Person person2 : personRepository.findByFirstnameAndLastname("Test2", "TestLast")) {
			System.out.println(person2);
		}

		System.out.println("***");

		for (Person person2 : personRepository.myQuery("Test2", "TestLast")) {
			System.out.println(person2);
		}

		System.out.println(personRepository.myNativeQuery());

		System.out.println(personRepository.findByLastname("assdfsdfsd").isPresent());
	}

	@Transactional
	public void aufpassen() {
		Person parent = new Person();

		parent.setFirstname("Test");
		parent.setLastname("TestLast");
		parent.setBirth(LocalDate.now());

		personRepository.save(parent);

		Person person = new Person();

		person.setFirstname("Test");
		person.setLastname("TestLast");
		person.setBirth(LocalDate.now());
		person.setParent(parent);

		Address address = new Address();

		address.setCity("FFM");
		address.setStreet("mystreet");
		address.setZip("12345");

		person.getAddresses().add(address);

		address = new Address();

		address.setCity("FFM");
		address.setStreet("mystreet");
		address.setZip("12345");

		person.getAddresses().add(address);

		personRepository.save(person);

		System.out.println(personRepository.findById(person.getId()));
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("datademo");
		context.getBean(MainRepo.class).aufpassen();
	}
}
