package strategy;

public enum PlayerType {
    GOALIE("Goalie"), FORWARD("Forward"), DEFENCE_MAN("Defence Man");

    public final String label;

    private PlayerType(String label) {
        this.label = label;
    }
}