package strategy;

public class ShootBehavior implements Behavior {

    @Override
    public String play() {
        return "Shoots the puck to the goal!" + "\n" +
               "  0                                |\\\n" +
               "- | - \\                           |  \\\n" +
               " / \\    \\_           <>         |    \\   \n" +
               "         \n";
    }
}
