package strategy;

import java.util.Random;

public abstract class Player {
    private String firstName;
    private String lastName;
    protected Behavior behavior;
    protected Random rand;
    protected PlayerType playerType;

    /**
     * Constructs a new player instance with the specified parameters.
     *
     * @param firstName name
     * @param lastName name
     * @param playerType type
     */
    public Player(String firstName, String lastName, PlayerType playerType) {
        //creates the player with a first name, last name, and player type
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerType = playerType;
        this.rand = new Random();
        setBehavior();
    }

    /**
     * Sets the behavior.
     */
    public abstract void setBehavior();

    /**
     * Plays.
     *
     * @return the resulting string
     */
    public String play(){
        //creates the play in the terminal
        setBehavior();
        return firstName + " " + lastName + " (" + playerType + ") " + behavior.play();
    }

    /**
     * To strings.
     *
     * @return the resulting string
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + playerType + ")";
    }

    /**
     * Returns the player type.
     *
     * @return the resulting player type
     */
    public PlayerType getPlayerType() {
        return playerType;
    }
}
