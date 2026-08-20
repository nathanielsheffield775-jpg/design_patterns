package strategy;

import java.util.Scanner;

public class HockeyDriver {
	private Scanner scanner;
	private Team mapleLeafs;

	public HockeyDriver() {
		clear();
		scanner = new Scanner(System.in);
	}

	public void play() {
		mapleLeafs = initializeTeam();
		displayTeam();

		while (true) {
			int command = getCommand();

			if (command == 3) {
				break;
			} 

			mapleLeafs.executePlay(getPlayerType(command));
		}

		System.out.println("Goodbye");
	}

	private Team initializeTeam() {
		Team mapleLeafs = new Team("Maple Leafs");
		mapleLeafs.addTeamMember("Matt", "Murray", PlayerType.GOALIE);
		mapleLeafs.addTeamMember("John", "Tavares", PlayerType.FORWARD);
		mapleLeafs.addTeamMember("Timothy", "Liljegren", PlayerType.DEFENCE_MAN);
		return mapleLeafs;
	}

	private void displayTeam() {
		System.out.println("\n####### " + mapleLeafs.getName() + "####### ");

		for (Player player : mapleLeafs.getPlayers()) {
			System.out.println(" - " + player);
		}
	}

	private PlayerType getPlayerType(int num) {
		if(num == 0) {
			return PlayerType.GOALIE;
		} else if(num == 1) {
			return PlayerType.FORWARD;
		} else {
			return PlayerType.DEFENCE_MAN;
		}
	}

	private int getCommand() {
		while (true) {
			System.out.println("\nExecute Play");
			System.out.print("1. Goalie, 2. Forward, 3. Defence, 4. Quit: ");
			try {
				int option = Integer.parseInt(scanner.nextLine().trim());

				if (option >= 1 && option <= 4) {
					return option -1;
				}
			} catch (Exception e) {
			}
			System.out.println("Please enter a valid number between 1 and 3.");
		}
	}

	public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

	public static void main(String[] args) {
		HockeyDriver hockey = new HockeyDriver();
		hockey.play();
	}

}
