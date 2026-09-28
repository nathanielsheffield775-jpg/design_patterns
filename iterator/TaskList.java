package iterator;

public class TaskList {
	private Ticket[] tickets;
	private int count;
	private String name;

	public TaskList(String name) {
		this.name = name;
		this.tickets = new Ticket[2];
		this.count = 0;
	}

	public void addTicket(String name, String teamMember, Difficulty difficulty) {
		addTicket(new Ticket(name, teamMember, difficulty));
	}

	public void addTicket(Ticket ticket) {
		if (ticket == null) {
			return;
		}
		if (count == tickets.length) {
			Ticket[] bigger = new Ticket[tickets.length * 2];
			for (int i = 0; i < count; i++) {
				bigger[i] = tickets[i];
			}
			tickets = bigger;
		}
		tickets[count++] = ticket;
	}

	/**
	 * Finds the ticket with the given name (case-insensitive), removes it
	 * from this list, and returns it. Returns null if no ticket matches.
	 */
	public Ticket getTicket(String name) {
		for (int i = 0; i < count; i++) {
			if (tickets[i].getName().equalsIgnoreCase(name)) {
				Ticket found = tickets[i];
				for (int j = i; j < count - 1; j++) {
					tickets[j] = tickets[j + 1];
				}
				tickets[--count] = null;
				return found;
			}
		}
		return null;
	}

	public TaskListIterator createIterator() {
		return new TaskListIterator(tickets);
	}

	public String toString() {
		String result = name + ":\n";
		TaskListIterator iterator = createIterator();
		while (iterator.hasNext()) {
			result += iterator.next() + "\n";
		}
		return result;
	}
}