package corona;

public class Country {
	String name;
	int cases;
	int deaths;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCases() {
		return cases;
	}

	public void setCases(int cases) {
		this.cases = cases;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public Country(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("Country [name=");
		builder.append(name);
		builder.append(", cases=");
		builder.append(cases);
		builder.append(", deaths=");
		builder.append(deaths);
		builder.append("]");

		return builder.toString();
	}

}
