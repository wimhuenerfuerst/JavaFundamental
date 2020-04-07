package constansts;

public enum Category {
	SHOES(0.19), HATS(0.79), PANTS(0.09);

	private Category(double vat) {
		this.vat = vat;
	}

	public double getVat() {
		return vat;
	}

	public void print() {
		System.out.println(vat);
	}

	final double vat;
}
