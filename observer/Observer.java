package observer;

public abstract class Observer {

	private String name;
	private Sector sector;
	private String color;

	/**
	 * Constructs a new observer instance with the specified parameters.
	 *
	 * @param publisher publisher
	 * @param name name
	 * @param sector sector
	 * @param color color
	 */
	public Observer(Subject publisher, String name, Sector sector, String color) {
		this.name = name;
		this.sector = sector;
		this.color = color;
		publisher.registerObserver(this);
	}

	/**
	 * Updates the observer.
	 *
	 * @param stock stock
	 * @param direction direction
	 */
	public abstract void update(Stock stock, Direction direction);

	/**
	 * Returns the name.
	 *
	 * @return the resulting string
	 */
	public String getName() {
		return name;
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
	 * Returns the color.
	 *
	 * @return the resulting string
	 */
	public String getColor() {
		return color;
	}
}
