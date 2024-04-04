import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SimonShould {

  private Simon simon;
  @BeforeEach
  void setUp() {
    this.simon = new Simon();
  }

	@Test
	void whenSimonSaysYellowAndUserSaysYThenReturnsTrue() {
		assertTrue(this.simon.checkResponse("yellow", "y"));
	}
  @Test
  void whenSimonSaysGreenAndUserSaysGThenReturnsTrue() {
    assertTrue(this.simon.checkResponse("green", "g"));
  }

  @ParameterizedTest
  @CsvSource({"yellow red,  y g", "green, y", "red, g", "blue, r"})
  void whenTheUserLosesThenReturnsFalse(String simon, String user) {
    assertFalse(this.simon.checkResponse(simon, user));
  }
}
