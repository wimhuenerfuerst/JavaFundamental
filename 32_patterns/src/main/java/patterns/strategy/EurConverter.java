package patterns.strategy;

public class EurConverter implements CurrencyConvert {

	@Override
	public double convert(double input) {
		return input * 0.92;
	}

}
