package patterns.decorator;

import patterns.decorator.other.Calculator;
import patterns.decorator.other.EuroConverter;
import patterns.decorator.other.EuroConverterImpl;

public class Main {

	public static void main(String[] args) {
		EuroConverter converter = new EuroConverterImpl();
		System.out.println(converter.convert(1234) + " Euro");

		converter = new EuroConverterDecorator(converter);

		Calculator calculator = new Calculator(converter);
		calculator.calc(12f, 14f);
	}

}
