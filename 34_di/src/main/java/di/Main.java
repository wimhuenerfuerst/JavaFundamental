package di;

public class Main {

	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		Dependency mandatoryDependency = new DependencyImpl();
		Dependency optionalDependency = new DependencyImpl();

		DependencyUser dependencyUser = new DependencyUser(mandatoryDependency);

		dependencyUser.setOptionalDependency(optionalDependency);

		DependencyUser.class.getDeclaredField("optionalDependency").set(dependencyUser, optionalDependency);
		
		dependencyUser.test();
	}

}
