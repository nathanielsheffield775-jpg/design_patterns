package strategy;

public class BlockGoalBehavior implements Behavior {

    /**
     * Plays.
     *
     * @return the resulting string
     */
    @Override
    public String play() {
        return "Blocks the puck from going into the goal!" + "\n" +
               "  0                                  0        |\\\n" +
               "- | -                             /- | -     |  \\\n" +
               "/   \\ \\_          <>        _/   /   \\       |    \\\n" +
               "         \n";
    }
}
