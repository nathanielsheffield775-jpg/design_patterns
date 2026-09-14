package decorator;

import java.util.ArrayList;

public abstract class Player {
    protected String name;
    protected ArrayList<String> character;

    /**
     * Constructs a new player instance with the specified parameters.
     *
     * @param character character
     * @param name name
     */
    public Player(ArrayList<String> character, String name) {
        this.character = character;
        this.name = name;
    }

    /**
     * Returns the name.
     *
     * @return the resulting string
     */
    public String getName() {
        return name;
    }

    /**
     * To strings.
     *
     * @return the resulting string
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String line : character) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}