package progetto.mp.ligabue.martin;

import java.util.*;

public class Library implements Iterable<Executable> {
	private List<Executable> exe = new ArrayList<>();
	private set
	// this willl have a collection of Executables(?)
	public boolean hasNext() {
		return exe.isEmpty();
	}

	@Override
	public java.util.Iterator<Executable> iterator() {
		return exe.iterator();
	}
}
