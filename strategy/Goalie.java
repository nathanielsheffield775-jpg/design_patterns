package strategy;

public class Goalie extends Player{
    
    public Goalie(String firstName, String lastName) {
        //recalls info from Player class
        super(firstName, lastName, PlayerType.GOALIE);
    }

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
