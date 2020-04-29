package helloworld.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:proprties.proprties")
public class ServiceConfig {

	@Bean
	public HelloWorldService anonyomous() {
		return new HelloWorldService() {

			public void helloWorld() {
				System.out.println("*****");
			}
		};
	}

	@Bean
	public HelloWorldService properties(@Value("${text}") final String text) {
		return () -> System.out.println(text);
	}

}
