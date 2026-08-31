package observer;

public abstract class Observer {

	private String name;
	private Sector sector;
	private String color;

	public Observer(Subject publisher, String name, Sector sector, String color) {
		this.name = name;
		this.sector = sector;
		this.color = color;
		publisher.registerObserver(this);
	}

	public abstract void update(Stock stock, Direction direction);

	public String getName() {
		return name;
	}

	public Sector getSector() {
		return sector;
	}

	public String getColor() {
		return color;
	}
}
