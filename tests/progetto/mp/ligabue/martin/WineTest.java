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
		Executable exe=new Executable(ExecutableBuilder.getBuilder().setName("wine").setPath("/usr/bin/wine").setArgs(new String[]{"/home/martin/Desktop/test.exe"}).build());
		exe.runExe();
		assertThat(exe.getName(),is("Minecraft"));
	}

}
