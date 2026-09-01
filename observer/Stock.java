package observer;

public class Stock {

	private String symbol;
	private String companyName;
	private Sector sector;
	private double price;

	/**
	 * Constructs a new stock instance with the specified parameters.
	 *
	 * @param symbol symbol
	 * @param companyName name
	 * @param sector sector
	 * @param price price
	 */
	public Stock(String symbol, String companyName, Sector sector, double price) {
		this.symbol = symbol;
		this.companyName = companyName;
		this.sector = sector;
		this.price = price;
	}

	/**
	 * Updates the price.
	 *
	 * @param delta delta
	 */
	public void updatePrice(double delta) {
		this.price += delta;
	}

	/**
	 * Returns the symbol.
	 *
	 * @return the resulting string
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * Returns the company name.
	 *
	 * @return the resulting string
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Returns the sector.
	 *
	 * @return the resulting sector
	 */
	public Sector getSector() {
		return sector;
	}

	/**
	 * Returns the price.
	 *
	 * @return the resulting numeric value
	 */
	public double getPrice() {
		return price;
	}
}