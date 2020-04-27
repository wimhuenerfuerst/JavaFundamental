package patterns.decorator.other;

public class EuroConverterImpl implements EuroConverter {

	@Override
	public float convert(float usd) {
		return usd * 0.92f;
	}

}
