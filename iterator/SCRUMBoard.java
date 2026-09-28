package iterator;

public class SCRUMBoard {
	private String projectName;
	private TaskList todo;
	private TaskList doing;
	private TaskList done;

	public SCRUMBoard(String projectName) {
		this.projectName = projectName;
		this.todo = new TaskList("ToDo");
		this.doing = new TaskList("Doing");
		this.done = new TaskList("Done");
	}

	public void addTicket(String name, String teamMember, Difficulty difficulty) {
		todo.addTicket(name, teamMember, difficulty);
	}

	public boolean startTicket(String name) {
		Ticket ticket = todo.getTicket(name);
		if (ticket == null) {
			return false;
		}
		doing.addTicket(ticket);
		return true;
	}

	public boolean finishTicket(String name) {
		Ticket ticket = doing.getTicket(name);
		if (ticket == null) {
			return false;
		}
		done.addTicket(ticket);
		return true;
	}

	public String toString() {
		return "***** " + projectName + "******\n"
				+ todo + "\n"
				+ doing + "\n"
				+ done;
	}
}