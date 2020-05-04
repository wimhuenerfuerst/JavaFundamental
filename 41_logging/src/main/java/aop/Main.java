package aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
public class Main {

	public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	@Autowired
	Main main;

	public int doSomething() {
		int sum = 0;

		for (int i = 0; i < 1000; i++) {
			sum += i;
		}

		System.out.println(main + " " + this);

		main.test();

		return sum;
	}

	private int doSomethingElse() {
		int sum = 0;

		for (int i = 0; i < 1000; i++) {
			sum += i;
		}

		return sum;
	}

	public String test() {
		return "Test";
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("aop");
		LOGGER.info("" + context.getBean(Main.class).doSomething());
		LOGGER.info("" + context.getBean(Main.class).doSomethingElse());
		LOGGER.info("" + context.getBean(Main.class).test());
	}

}
