package decorator;

public class Shield extends GearAdder {
    public Shield(Player player) {
        super(player, FileReader.getLines("txt/shield.txt"));
    }
}