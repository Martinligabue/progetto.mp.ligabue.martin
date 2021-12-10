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
	public void scriviConControllo(String name, String s) {
		//before writing to files check if string s is used
		if(!files.contains(s)) {
			files.add(s);
			System.out.println(s);
		}
		else {
			System.out.println("Stringa già presente");
		}
	}
	//take a random item from the files list
	public String leggiConControllo() {
		int i = (int) (Math.random()*files.size());
		return files.get(i);
	}
	// avvia e controlla per un codice in output?
}
