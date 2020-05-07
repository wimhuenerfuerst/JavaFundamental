package junitdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("beanA")
public class BeanA implements InterfaceA {

	@Autowired
	@Qualifier("bean2")
	private InterfaceA interfaceA;

	@Override
	public void test() {		
		System.out.println(this);		
	}
}
