package observer;

import java.util.ArrayList;
import java.util.HashMap;

public class StockMarketPublisher implements Subject {

	private ArrayList<Observer> observers;
	private HashMap<String, Stock> stocks;

	/**
	 * Constructs a new stock market publisher instance.
	 */
	public StockMarketPublisher() {
		this.observers = new ArrayList<>();
		this.stocks = new HashMap<>();
	}

	/**
	 * Registers the observer.
	 *
	 * @param observer observer
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	/**
	 * Removes the observer.
	 *
	 * @param observer observer
	 */
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * Adds the stock.
	 *
	 * @param symbol symbol
	 * @param companyName name
	 * @param sector sector
	 * @param price price
	 */
	public void addStock(String symbol, String companyName, Sector sector, double price) {
		stocks.put(symbol, new Stock(symbol, companyName, sector, price));
	}

	/**
	 * Updates the stock.
	 *
	 * @param symbol symbol
	 * @param change change
	 */
	public void updateStock(String symbol, double change) {
		Stock stock = stocks.get(symbol);
		if (stock == null) {
			System.out.println("No such stock: " + symbol);
			return;
		}

		stock.updatePrice(change);
		Direction direction = change >= 0 ? Direction.UP : Direction.DOWN;
		notifyObservers(stock, direction);
	}

	/**
	 * Notifies the observers.
	 *
	 * @param stock stock
	 * @param direction direction
	 */
	@Override
	public void notifyObservers(Stock stock, Direction direction) {
		for (Observer observer : observers) {
			observer.update(stock, direction);
		}
	}
}