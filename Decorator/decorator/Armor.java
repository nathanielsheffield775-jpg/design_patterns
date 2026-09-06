package decorator;

public class Armor extends GearAdder {
    public Armor(Player player) {
        super(player, FileReader.getLines("txt/armor.txt"));
    }
}