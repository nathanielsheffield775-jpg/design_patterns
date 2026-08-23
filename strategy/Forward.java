package strategy;

public class Forward extends Player{
    
    /**
     * Constructs a new forward instance with the specified parameters.
     *
     * @param firstName name
     * @param lastName name
     */
    public Forward(String firstName, String lastName) {
        //recalls info from Player class
        super(firstName, lastName, PlayerType.FORWARD);
    }

    /**
     * Sets the behavior.
     */
    @Override
    public void setBehavior() {
        if(rand.nextInt(2)==0) {
            //randomly choose between ShootBehavior and PassBehavior
            behavior = new ShootBehavior();
        } else {
            behavior = new PassBehavior();
        }
    }

    
}
