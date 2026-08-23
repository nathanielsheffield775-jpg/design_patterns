package strategy;

import java.util.Random;

public abstract class Player {
    private String firstName;
    private String lastName;
    protected Behavior behavior;
    protected Random rand;
    protected PlayerType playerType;

    public Player(String firstName, String lastName, PlayerType playerType) {
        //creates the player with a first name, last name, and player type
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerType = playerType;
        this.rand = new Random();
        setBehavior();
    }

    public abstract void setBehavior();

    public String play(){
        //creates the play in the terminal
        setBehavior();
        return firstName + " " + lastName + " (" + playerType + ") " + behavior.play();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + playerType + ")";
    }

    public PlayerType getPlayerType() {
        return playerType;
    }
}
