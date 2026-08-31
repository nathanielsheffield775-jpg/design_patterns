package observer;

import java.util.ArrayList;
import java.util.HashMap;

public class StockMarketPublisher implements Subject {

	private ArrayList<Observer> observers;
	private HashMap<String, Stock> stocks;

	public StockMarketPublisher() {
		this.observers = new ArrayList<>();
		this.stocks = new HashMap<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void addStock(String symbol, String companyName, Sector sector, double price) {
		stocks.put(symbol, new Stock(symbol, companyName, sector, price));
	}

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

	@Override
	public void notifyObservers(Stock stock, Direction direction) {
		for (Observer observer : observers) {
			observer.update(stock, direction);
		}
	}
}