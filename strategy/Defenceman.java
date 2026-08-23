package strategy;

public class Defenceman extends Player{
    
    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName, PlayerType.DEFENCE_MAN);
    }

    @Override
    public void setBehavior() {
        if(rand.nextBoolean()==true) {
            behavior = new PassBehavior();
        } else {
            behavior = new BlockGoalBehavior();
        }  
    }
    
}
