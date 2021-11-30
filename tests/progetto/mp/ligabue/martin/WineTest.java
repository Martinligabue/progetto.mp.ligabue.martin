package progetto.mp.ligabue.martin;

import static org.junit.Assert.*;

import org.junit.Test;

public class WineTest {

	@Test
	public void testRun() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testRunExe() {
		Executable exe=new Executable("Minecraft.exe");
		exe.runExe();
		assertThat(exe.getName(),is("Minecraft"));
	}

}
