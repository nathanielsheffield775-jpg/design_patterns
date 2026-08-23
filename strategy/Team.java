package strategy;

import java.util.ArrayList;

public class Team {
    //makes a team with a name and an arraylist of players
    private String teamName;
    private ArrayList<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<Player>();
    }

    public void addTeamMember(String firstName, String lastName, PlayerType playerType) {
        Player player;
        //makes a new player based on the player type and adds them to the team
        switch (playerType) {
            case GOALIE:
                player = new Goalie(firstName, lastName);
                break;
            case FORWARD:
                player = new Forward(firstName, lastName);
                break;
            case DEFENCE_MAN:
                player = new Defenceman(firstName, lastName);
                break;
            default:
                throw new IllegalArgumentException("Invalid player type");
        }
        
        players.add(player);
    }

    public void executePlay(PlayerType playerType) {
        // Finds the first player of the specified type and executes their play
        for (Player player : players) {
            if (player.getPlayerType() == playerType) {
                System.out.println(player.play());
                return;
            }
        }
        System.out.println("No " + playerType.label + " found in the team.");
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return teamName;
    }
}