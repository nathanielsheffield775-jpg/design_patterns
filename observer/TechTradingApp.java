package observer;

public class TechTradingApp extends Observer {

	private static final String RESET = "\u001B[0m";

	/**
	 * Constructs a new tech trading app instance with the specified parameters.
	 *
	 * @param publisher publisher
	 * @param name name
	 */
	public TechTradingApp(Subject publisher, String name) {
		super(publisher, name, Sector.TECHNOLOGY, "\u001B[36m"); // cyan
	}

	/**
	 * Updates the tech trading app.
	 *
	 * @param stock stock
	 * @param direction direction
	 */
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