package strategy;

public class PassBehavior implements Behavior {

    @Override
    public String play() {
        return "Passes the puck!" + "\n" +
               "  0                                  0\n" +
               "- | -                             /- | -\n" +
               "/   \\ \\_          <>        _/   / \\  \n" +
               "         \n";
    }
}
