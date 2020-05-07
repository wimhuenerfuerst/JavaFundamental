package junitdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigA {
	@Bean
	public InterfaceA interfaceA() {
		return new BeanA();
	}
	
	@Bean("bean2")
	public InterfaceA interfaceA2() {
		return new BeanA();
	}
}
