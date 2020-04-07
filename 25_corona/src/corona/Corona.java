package corona;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import de.vandermeer.asciitable.AsciiTable;

public class Corona {

	Country[] countries = {};

	public Country findCountry(String name) {
		for (Country country : countries) {
			if (name.equals(country.getName())) {
				return country;
			}
		}

		Country country = new Country(name);

		countries = Arrays.copyOf(countries, countries.length + 1);
		countries[countries.length - 1] = country;

		return country;
	}

	public static void main(String[] args) throws IOException {
		Corona corona = new Corona();

		// String[] lines = Files.readAllLines(new File("input.txt").toPath(),
		// Charset.defaultCharset()).stream().toArray(x -> new String[x]);

		List<String> lines = Files.readAllLines(new File("res/corona.csv").toPath(),
				Charset.defaultCharset());

		String[] linesArray = lines.toArray(new String[lines.size()]);

		boolean skip = true;

		for (String line : linesArray) {
			if (!skip) {
				String[] values = line.split(",");

				int cases = Integer.valueOf(values[4]);
				int deaths = Integer.valueOf(values[5]);
				String name = values[6];

				Country country = corona.findCountry(name);
				country.setCases(cases + country.getCases());
				country.setDeaths(deaths + country.getDeaths());

			} else {
				skip = false;
			}
		}

		for (Country country : corona.countries) {
			System.out.println(country);
		}
		
		AsciiTable asciiTable = new AsciiTable();
		
		asciiTable.addRule();
		asciiTable.addRow("country", "Cases", "Deaths");
		asciiTable.addRule();
		
		for (Country country : corona.countries) {
			System.out.println(country);
			
			asciiTable.addRow(country.getName(), country.getCases(), country.getDeaths());
			asciiTable.addRule();
		}
		
		System.out.println(asciiTable.render());
	}

}
