package strategy;

public class ShootBehavior implements Behavior {

    /**
     * Plays.
     *
     * @return the resulting string
     */
    @Override
    public String play() {
        return "Shoots the puck to the goal!" + "\n" +
               "  0                                |\\\n" +
               "- | - \\                           |  \\\n" +
               " / \\    \\_           <>         |    \\   \n" +
               "         \n";
    }
}
