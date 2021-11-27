package progetto.mp.ligabue.martin;

public class Executable {
    private String name;
    private boolean isGame = false;
    private boolean ACO = false;
    private boolean DLSS = false;
    private boolean FSR = false;

    private Executable(String name, boolean isGame, boolean ACO, boolean DLSS, boolean FSR) {
        this.name = name;       /* questo parametro è l'unico 
        this.isGame = isGame;    * questo prob è opzionale
        this.ACO = ACO;          */
        this.DLSS = DLSS;
        this.FSR = FSR;
    }
    /*
     * hee hee hee
     */

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
