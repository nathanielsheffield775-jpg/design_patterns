package decorator;

public class Shield extends GearAdder {
    /**
     * Constructs a new shield instance with the specified parameters.
     *
     * @param player player
     */
    public Shield(Player player) {
        super(player, FileReader.getLines("txt/shield.txt"));
    }
}