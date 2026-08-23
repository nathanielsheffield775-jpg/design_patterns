package strategy;

public class BlockGoalBehavior implements Behavior {

    @Override
    public String play() {
        return "Blocks the puck from going into the goal!";
    }
}
