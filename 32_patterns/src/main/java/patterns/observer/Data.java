package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Data {

	int internalValue = 0;

	List<DataObserver> observers = new ArrayList<DataObserver>();

	public int getInternalValue() {
		return internalValue;
	}

	public void setInternalValue(int internalValue) {
		int oldInternalVale = this.internalValue;

		this.internalValue = internalValue;

		observers.stream().forEach(o -> o.changed(oldInternalVale, internalValue));
	}

	public void addObserver(DataObserver observer) {
		observers.add(observer);
	}

	public static void main(String[] args) {
		Data data = new Data();
		data.addObserver(new LoggingDataObserver());
		data.addObserver(new LoggingDataObserver());

		data.setInternalValue(123);

		data.setInternalValue(124);

		data.setInternalValue(125);
	}
}
