package strategy;

public class Defenceman extends Player{
    
    public Defenceman(String firstName, String lastName) {
        //recalls info from Player class
        super(firstName, lastName, PlayerType.DEFENCE_MAN);
    }

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
