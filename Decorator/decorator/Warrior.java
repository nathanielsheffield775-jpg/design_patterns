package decorator;

public class Warrior extends Player {
    /**
     * Constructs a new warrior instance with the specified parameters.
     *
     * @param name name
     */
    public Warrior(String name) {
        super(FileReader.getLines("txt/warrior.txt"), name);
    }
}