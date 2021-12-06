package progetto.mp.ligabue.martin;

import java.util.*;

public class Library implements Iterable<Executable> {
	private List<Executable> exe = new ArrayList<>();
	private Set<Executable> exeSet = new HashSet<>();
	// this willl have a collection of Executables(?)
	public boolean hasNext() {
		return exe.isEmpty()||exeSet.isEmpty();///aaaaAAAAAAAAAAAAAAAA
	}

	@Override
	public java.util.Iterator<Executable> iterator() {
		return exe.iterator();
	}
	
}
