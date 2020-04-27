package patterns.decorator;

import patterns.decorator.other.EuroConverter;

public class EuroConverterDecorator implements EuroConverter {

	EuroConverter euroConverter;

	public EuroConverterDecorator(EuroConverter euroConverter) {
		super();
		this.euroConverter = euroConverter;
	}

	@Override
	public float convert(float usd) {

		System.out.println("start conversion");

		float result = euroConverter.convert(usd);

		System.out.println("stop conversion");

		System.out.println("result " + result);

		return result;
	}

}
