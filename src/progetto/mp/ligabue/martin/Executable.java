package progetto.mp.ligabue.martin;

public class Executable {
    private String name;
    private boolean isGame= false;
    private boolean ACO = false;
    private boolean DLSS = false;
    private boolean FSR = false;
    //make a builder pattern
    public Executable(String name) {
        this.name=name;
    }
    public static class Builder{
        private String name;
        private boolean isGame;
        private boolean ACO;
        private boolean DLSS;
        private boolean FSR;
        public Builder(String name){
            this.name = name;
        }
        public Builder isGame(boolean isGame){
            this.isGame = isGame;
            return this;
        }
        public Builder ACO(boolean ACO){
            this.ACO = ACO;
            return this;
        }
        public Builder DLSS(boolean DLSS){
            this.DLSS = DLSS;
            return this;
        }
        public Builder FSR(boolean FSR){
            this.FSR = FSR;
            return this;
        }
        public Executable build(){
            return new Executable(name);
        }
        
    }
    public String getName() {
        return null;
    } 



}
