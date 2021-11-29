package progetto.mp.ligabue.martin;

import java.util.logging.LogManager;

public class RunLogger {
    //make methods Start Stop and Read  
    public void start(String name) {
        LogManager.getLogManager().getLogger(name).info("Start");
    }
    public void stop(String name) {
        LogManager.getLogManager().reset();
    }
}
