package decorator;

public class Sword extends GearAdder {
    /**
     * Constructs a new sword instance with the specified parameters.
     *
     * @param player player
     */
    public Sword(Player player) {
        super(player, FileReader.getLines("txt/sword.txt"));
    }
}