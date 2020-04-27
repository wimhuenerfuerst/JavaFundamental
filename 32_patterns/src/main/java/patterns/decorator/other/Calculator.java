package patterns.decorator.other;

public class Calculator {

	EuroConverter euroConverter;

	public Calculator(EuroConverter euroConverter) {
		super();
		this.euroConverter = euroConverter;
	};

	public void calc(float a, float b) {
		float ea = euroConverter.convert(a);
		float eb = euroConverter.convert(b);
		System.out.println(ea + eb);
	}
}
