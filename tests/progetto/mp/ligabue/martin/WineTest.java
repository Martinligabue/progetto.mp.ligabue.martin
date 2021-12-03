package progetto.mp.ligabue.martin;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class WineTest {

	@Test
	public void testRun() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		assertThat(5).isEqualTo(5);
	}

	@Test
	public void testRunExe() {
		Executable exe=new Executable(ExecutableBuilder.getBuilder().setName("wine").setPath("/usr/bin/wine")//path auto
				.build());
		Executable person = new Executable.ExecutableBuilder(1, "John")
 .withAge(10)
 .withAddress("an address")
 .build()
		exe.runExe();
		assertThat(exe.getName().is("Minecraft"));
	}

}
