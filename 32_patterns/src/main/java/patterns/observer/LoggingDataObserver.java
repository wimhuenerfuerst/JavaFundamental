package patterns.observer;

public class LoggingDataObserver implements DataObserver {

	@Override
	public void changed(int oldInternalVale, int newInternalValue) {
		System.out.println(oldInternalVale + " -> " + newInternalValue);
	}

}
