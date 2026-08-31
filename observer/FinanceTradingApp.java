package observer;

public class FinanceTradingApp extends Observer {

	private static final String RESET = "\u001B[0m";

	public FinanceTradingApp(Subject publisher, String name) {
		super(publisher, name, Sector.FINANCE, "\u001B[32m"); // green
	}

	@Override
	public void update(Stock stock, Direction direction) {
		// Only interested in stocks from this app's sector
		if (stock.getSector() != getSector()) {
			return;
		}

		String arrow = direction == Direction.UP ? "▲" : "▼";
		System.out.printf("%s[%s] %s (%s) is now $%.2f %s%s%n",
				getColor(), getName(), stock.getCompanyName(), stock.getSymbol(),
				stock.getPrice(), arrow, RESET);
	}
}