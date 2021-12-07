package progetto.mp.ligabue.martin;

public class MockLog {
	//Make a list called files
	public static java.util.List<String> files = new java.util.ArrayList<String>();
	// scrivi su file
	public void scrivi(String s) {
		files.add(s);
		System.out.println(s);
	}
	// leggi da file
	public String leggi() {
	
	//get last item of files list
		return files.get(files.size()-1);
	}

	// avvia e controlla per un codice in output?
}
