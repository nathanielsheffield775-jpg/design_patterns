package strategy;

public class Defenceman extends Player{
    
    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName, PlayerType.DEFENCE_MAN);
    }

    @Override
    public void setBehavior() {
        if(rand.nextInt(2)==0) {
            behavior = new PassBehavior();
        } else {
            behavior = new BlockGoalBehavior();
        }  
    }
    
}
