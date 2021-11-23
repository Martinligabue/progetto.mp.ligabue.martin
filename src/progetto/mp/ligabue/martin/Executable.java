package progetto.mp.ligabue.martin;

public class Executable {
    private String name;
    private boolean ACO = false;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setACO() {
        this.ACO = true;

    }

    public boolean getACO() {
        return ACO;
    }

}
