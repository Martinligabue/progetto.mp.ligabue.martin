package progetto.mp.ligabue.martin;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class RoomTest {

	@Test
	public void testObject() {
		assertThat(5).isEqualTo(5);
		assertThat(new Room()).isNotNull();
		assertThat("abc").isNotEqualTo(123);
	}

}
