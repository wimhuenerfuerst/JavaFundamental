package patterns.strategy;

public class UsdConverter implements CurrencyConvert {

	@Override
	public double convert(double input) {
		return input * (1 / 0.92);
	}

}
