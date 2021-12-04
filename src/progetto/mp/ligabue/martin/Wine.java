package progetto.mp.ligabue.martin;

public class Wine extends Runner {

	@Override
	public void run(Executable exe) {
		// for now just the mock implementation
		String name = exe.getName();
		String path = "./Wine";
		// remove last 4 characters from name
		name = name.substring(0, name.length() - 4);
		// set name to binaryExe
		Executable binaryExe = new Executable(name);

	}

}
