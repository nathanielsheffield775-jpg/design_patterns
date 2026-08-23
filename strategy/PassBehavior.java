package strategy;

public class PassBehavior implements Behavior {

    /**
     * Plays.
     *
     * @return the resulting string
     */
    @Override
    public String play() {
        return "Passes the puck!" + "\n" +
               "  0                                  0\n" +
               "- | -                             /- | -\n" +
               "/   \\ \\_          <>        _/   / \\  \n" +
               "         \n";
    }
}
