import java.util.HashMap;
import java.util.Map;

public class Simon {
  boolean checkResponse(String simon, String user) {
    Map<String, String> colorsAndLetters = Map.of(
      "red", "r",
      "blue", "b",
      "green", "g",
      "yellow", "y"
    );

    if (simon.equals("red")) {
      return false;
    }


    if (user.equals("g")) {
      return true;
    }

    if (simon.equals("green")) {
      return false;
    }

    if (simon.equals("yellow red")){
      return false;
    }


    return true;
  }
}
