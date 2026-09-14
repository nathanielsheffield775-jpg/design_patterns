package decorator;

import java.util.ArrayList;

public abstract class GearAdder extends Player {
    /**
     * Constructs a new gear adder instance with the specified parameters.
     *
     * @param player player
     * @param gear gear
     */
    public GearAdder(Player player, ArrayList<String> gear) {
        super(player.character, player.getName());
        addGear(gear);
    }

    /**
     * Adds the gear.
     *
     * @param gear gear
     */
    protected void addGear(ArrayList<String> gear) {
        for (int i = 0; i < gear.size() && i < character.size(); i++) {
            character.set(i, overlay(character.get(i), gear.get(i)));
        }
    }

    /**
     * Overlays.
     *
     * @param base base
     * @param gearLine gear line
     * @return the resulting string
     */
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