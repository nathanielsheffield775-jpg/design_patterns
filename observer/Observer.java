package observer;

public class Observer {
    
    private String name;
    private Sector sector;
    private String color;

    public Observer(String name, Sector sector, String color) {
        this.name = name;
        this.sector = sector;
        this.color = color;
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
