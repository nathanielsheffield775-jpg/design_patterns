package decorator;

import java.util.ArrayList;

public abstract class GearAdder extends Player {
    public GearAdder(Player player, ArrayList<String> gear) {
        super(player.character, player.getName());
        addGear(gear);
    }

    protected void addGear(ArrayList<String> gear) {
        for (int i = 0; i < gear.size() && i < character.size(); i++) {
            character.set(i, overlay(character.get(i), gear.get(i)));
        }
    }

    private String overlay(String base, String gearLine) {
        StringBuilder result = new StringBuilder(base);
        for (int i = 0; i < gearLine.length(); i++) {
            char c = gearLine.charAt(i);
            if (c != ' ') {
                while (result.length() <= i) result.append(' ');
                result.setCharAt(i, c);
            }
        }
        return result.toString();
    }
}