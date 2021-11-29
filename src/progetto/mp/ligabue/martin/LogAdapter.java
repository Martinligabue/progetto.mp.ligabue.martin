package progetto.mp.ligabue.martin;

import java.lang.System.Logger;
import java.util.ResourceBundle;

public class LogAdapter extends RunLogger implements Logger {
    public LogAdapter(String name) {
        super(name);
    }

    public void start(String name) {
        super.info("Start");
    }

    public void stop(String name) {
        super.reset();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean isLoggable(Level arg0) {
        return super.isLoggable(arg0);
    }

    @Override
    public void log(Level arg0, ResourceBundle arg1, String arg2, Throwable arg3) {
        super.log(arg0, arg1, arg2, arg3);
    }

    @Override
    public void log(Level arg0, ResourceBundle arg1, String arg2, Object... arg3) {
        super.log(arg0, arg1, arg2, arg3);
    }
}
