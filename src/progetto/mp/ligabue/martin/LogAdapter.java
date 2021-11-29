package progetto.mp.ligabue.martin;

public class LogAdapter extends RunLogger {
    public LogAdapter(String name) {
        super(name);
    }
    
    public void start(String name) {
        super.info("Start");
    }
    
    public void stop(String name) {
        super.reset();
    }
}

    
}
