package observer;

public class Stock {

	private String symbol;
	private String companyName;
	private Sector sector;
	private double price;

	public Stock(String symbol, String companyName, Sector sector, double price) {
		this.symbol = symbol;
		this.companyName = companyName;
		this.sector = sector;
		this.price = price;
	}

	public void updatePrice(double delta) {
		this.price += delta;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getCompanyName() {
		return companyName;
	}

	public Sector getSector() {
		return sector;
	}

	public double getPrice() {
		return price;
	}
}