package strategy;

public class Goalie extends Player{
    
    /**
     * Constructs a new goalie instance with the specified parameters.
     *
     * @param firstName name
     * @param lastName name
     */
    public Goalie(String firstName, String lastName) {
        //recalls info from Player class
        super(firstName, lastName, PlayerType.GOALIE);
    }

    /**
     * Sets the behavior.
     */
    @Override
    public void setBehavior() {
        if(rand.nextInt(2)==0) {
            //randomly choose between BlockGoalBehavior and PassBehavior
            behavior = new BlockGoalBehavior();
        } else {
            behavior = new PassBehavior();
        }
    }
}
