package iterator;

import java.util.Iterator;

public class TaskListIterator implements Iterator<Ticket> {
	private Ticket[] tickets;
	private int position;

	public TaskListIterator(Ticket[] tickets) {
		this.tickets = tickets;
		this.position = 0;
	}

	public boolean hasNext() {
		return position < tickets.length && tickets[position] != null;
	}

	public Ticket next() {
		if (!hasNext()) {
			return null;
		}
		return tickets[position++];
	}
}