package di;

public class DependencyUser {

	// field injection via annotations & reflection
	// less code
	// bad for mandatory dependencies
	// null pointer checks required
	// reflection mechanism required
	final Dependency mandatoryDependency;
	Dependency optionalDependency;

	// good for mandatory dependencies
	// good for final dependencies
	// bad for optional dependencies
	// bad if there are many dependencies
	// preffered method for dependency injection of mandatory dependencies
	public DependencyUser(Dependency mandatoryDependency) {
		this.mandatoryDependency = mandatoryDependency;
	}

	// good for optional dependencies
	// bad for mandatory dependencies
	// null pointer checks required
	public void setOptionalDependency(Dependency optionalDependency) {
		this.optionalDependency = optionalDependency;
	}

	public void test() {
		mandatoryDependency.doSomething();

		if (optionalDependency != null) {
			optionalDependency.doSomething();
		}

	}
}
