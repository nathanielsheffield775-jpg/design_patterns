package strategy;

public enum PlayerType {
    /**
     * Defence mans.
     *
     * @param Man" man"
     * @return the resulting goalie("goalie"), forward("forward"),
     */
    GOALIE("Goalie"), FORWARD("Forward"), DEFENCE_MAN("Defence Man");

    public final String label;

    /**
     * Constructs a new player type instance with the specified parameters.
     *
     * @param label label
     */
    private PlayerType(String label) {
        this.label = label;
    }
}