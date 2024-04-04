import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimonShould {

	@Test
	void whenSimonSaysYellowAndUserSaysYThenReturnsTrue() {
    var simon = new Simon();
		assertTrue(simon.checkResponse("yellow", "y"));
	}

  @Test
  void whenSimonSaysGreenAndUserSaysYThenReturnsFalse() {
    var simon = new Simon();
    assertFalse(simon.checkResponse("green", "y"));
  }

  /*@Test
  void whenSimonSaysGreenAndUserSaysGThenReturnsTrue() {
    var simon = new Simon();
    assertTrue(simon.checkResponse("green", "g"));
  }*/

  /*@Test
  void whenSimonSaysGreenAndUserSaysYThenReturnsFalse() {
    var simon = new Simon();
    assertFalse(simon.checkResponse("yellow green", "y g"));
  }*/
}
