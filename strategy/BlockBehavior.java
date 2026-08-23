package strategy;

public class BlockBehavior implements Behavior {
    public String play() {
        return "Blocks the opponent!"  + "\n" +
               "                        0         0\n" +
               "                     /- | -   /- | -\n" +
               "     <>        _/   / \\  _/  / \\\n" +
               "         \n";
    }
}
