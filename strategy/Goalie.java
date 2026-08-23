package strategy;

public class Goalie extends Player{
    
    public Goalie(String firstName, String lastName) {
        super(firstName, lastName, PlayerType.GOALIE);
    }

    @Override
    public void setBehavior() {
        if(rand.nextBoolean()==true) {
            behavior = new BlockGoalBehavior();
        } else {
            behavior = new PassBehavior();
        }
    }
}
