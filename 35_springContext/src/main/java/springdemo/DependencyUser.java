package springdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DependencyUser {

	@Autowired
	@Qualifier("factoryDependency")
	Dependency mandatoryDependency;
	
	@Autowired
	List<Dependency> dependencies;

	public void test() {
		System.out.println("calling doSomething");

		mandatoryDependency.doSomething();
		
		/*System.out.println("calling listed dependencies");
		
		for (Dependency dependency : dependencies) {
			dependency.doSomething();
		}*/
	}
}
