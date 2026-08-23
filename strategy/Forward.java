package strategy;

public class Forward extends Player{
    
    public Forward(String firstName, String lastName) {
        super(firstName, lastName, PlayerType.FORWARD);
    }

    @Override
    public void setBehavior() {
        if(rand.nextBoolean()) {
            behavior = new ShootBehavior();
        } else {
            behavior = new PassBehavior();
        }
    }

    
}
