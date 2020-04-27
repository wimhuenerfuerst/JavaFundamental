package patterns.observer;

public interface DataObserver {
	void changed(int oldInternalVale, int newInternalValue);
}
