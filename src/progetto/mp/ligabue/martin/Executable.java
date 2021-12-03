package progetto.mp.ligabue.martin;

public class Executable {
	public Executable(ExecutableBuilder executableBuilder) {
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setGame(boolean isGame) {
		this.isGame = isGame;
	}

	private void setACO(boolean aCO) {
		ACO = aCO;
	}

	private void setDLSS(boolean dLSS) {
		DLSS = dLSS;
	}

	private void setFSR(boolean fSR) {
		FSR = fSR;
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
		private Integer age;// ?

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
			return null;
			// return new
			// Executable(this).isGame(isGame).withACO().withDLSS().withFSR();
		}

		public ExecutableBuilder withAge(Integer age) {
			if (age <= 0)
				throw new IllegalArgumentException(
						"age must be positive: " + age);
			this.age = age;
			return this;
		}

		public ExecutableBuilder withDLSS(boolean DLSS) {
			this.DLSS = DLSS;
			return this;
		}

	}

}