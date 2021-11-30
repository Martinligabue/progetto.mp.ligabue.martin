package progetto.mp.ligabue.martin;

public class Executable {
	public Executable(ExecutableBuilder executableBuilder) {
	}

	private String name;
	private boolean isGame = false;
	private boolean ACO = false;
	private boolean DLSS = false;
	private boolean FSR = false;

	private static class ExecutableBuilder {     
        

        private String name;
        private boolean isGame;
        private boolean ACO;
        private boolean DLSS;
        private boolean FSR;
        private Integer age;
        
		public ExecutableBuilder(String name) {
            this.name = name;

        }

        public ExecutableBuilder isGame(boolean isGame) {
            this.isGame = isGame;
            return this;
        }

        public ExecutableBuilder withACO(boolean ACO) {
            this.ACO = ACO;
            return this;
        }
        public Executable build() {
            return new Executable(this);
        }
        public ExecutableBuilder withAge(Integer age) {
            if (age <= 0)
            throw new IllegalArgumentException("age must be positive: " + age);
            this.age = age;
            return this;
           }
           
    }

}