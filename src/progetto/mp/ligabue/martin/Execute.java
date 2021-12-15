package progetto.mp.ligabue.martin;

public class Execute {
	// take a runner, a game, start the logger, manage excemxptions
	public void run(Executable exe) {
		//choose a Runner
		Runner runner = new Runner();//???
		
		//take the exe
		//start the logger
		LoggerAdapter a = new LoggerAdapter();
		a.start();
		
		//run the exe
		exe.run();
		//coninuously check for errors
	}
}
