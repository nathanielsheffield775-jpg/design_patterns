package strategy;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<Player>();
    }

    public void addTeamMember(String firstName, String lastName, PlayerType playerType) {
        Player player;
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
        }
    }
    public void executePlay(PlayerType playerType) {
        for(Player player: players) {
            if(player.getPlayerType() == playerType) {
                System.out.println(player.play());
                return;
            }
        }
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return teamName;
    }
}
