package decorator;

public class Sword extends GearAdder {
    
    public Sword(Player player) {
        super(player, FileReader.getLines("sword.txt"));
    }
    
}
