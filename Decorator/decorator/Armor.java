package decorator;

public class Armor extends GearAdder {
    /**
     * Constructs a new armor instance with the specified parameters.
     *
     * @param player player
     */
    public Armor(Player player) {
        super(player, FileReader.getLines("txt/armor.txt"));
    }
}