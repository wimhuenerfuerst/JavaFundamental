package springdemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("secret")
@PropertySource("classpath:properties.properties")
public class BeanFactory implements ApplicationContextAware {
	
	ApplicationContext applicationContext;

	@Bean
	public Dependency factoryDependency(@Value("${beanName}") String beanName) {
		System.out.println("creating factoryDependency");
		
		
		return applicationContext.getBean(beanName, Dependency.class);

		/*return new Dependency() {

			@Override
			public void doSomething() {
				System.out.println("factoryDependency");
			}
		};*/
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;		
	}
}
