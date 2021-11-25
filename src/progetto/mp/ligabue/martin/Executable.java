package progetto.mp.ligabue.martin;

public class Executable {
    private String name;
    private boolean isGame = false;
    private boolean ACO = false;
    private boolean DLSS = false;
    private boolean FSR = false;

    private Executable(String name, boolean isGame, boolean ACO, boolean DLSS, boolean FSR) {
        this.name = name;
        this.isGame = isGame;
        this.ACO = ACO;
        this.DLSS = DLSS;
        this.FSR = FSR;
    }

    // nyeh
    public Executable withName(String name) {
        this.name = name;
        return this;
    }

    public Executable withIsGame(boolean isGame) {
        this.isGame = isGame;
        return this;
    }// sì, builder

}
