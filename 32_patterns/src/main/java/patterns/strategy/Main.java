package patterns.strategy;

public class Main {

	CurrencyConvert currencyConvert;

	public Main(CurrencyConvert currencyConvert) {
		this.currencyConvert = currencyConvert;
	}

	public void calc(double input) {
		System.out.println("result " + currencyConvert.convert(input));
	}

	public static void main(String[] args) {
		double result = 0;
		double input = 1000;

		if ("usd".equals(args[0])) {
			result = input * (1 / 0.92);
		} else {
			result = input * 0.92;
		}

		System.out.println(result);
		
		CurrencyConvert currencyConvert;
		
		if ("usd".equals(args[0])) {
			currencyConvert = new UsdConverter();
		} else {
			currencyConvert = new EurConverter();
		}
				
		Main main = new Main(currencyConvert);
		main.calc(input);
	}

}
