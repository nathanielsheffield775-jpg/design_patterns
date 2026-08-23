package strategy;

public class Defenceman extends Player{
    
    /**
     * Constructs a new defenceman instance with the specified parameters.
     *
     * @param firstName name
     * @param lastName name
     */
    public Defenceman(String firstName, String lastName) {
        //recalls info from Player class
        super(firstName, lastName, PlayerType.DEFENCE_MAN);
    }

    /**
     * Sets the behavior.
     */
    @Override
    public void setBehavior() {
        //randomly choose between PassBehavior and BlockBehavior
        if(rand.nextInt(2)==0) {
            behavior = new PassBehavior();
        } else {
            behavior = new BlockBehavior();
        }  
    }
    
}
