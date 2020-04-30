package datademo;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import datademo.data.Person;

@Component
public class Main {

	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public void test() {
		
		Person person = new Person();
		
		person.setFirstname("Test");
		person.setLastname("TestLast");
		person.setBirth(LocalDate.now());			
		
		entityManager.persist(person);
		
		System.out.println(person);
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("datademo");
		context.getBean(Main.class).test();
	}
}
