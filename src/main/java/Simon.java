public class Simon {
  boolean checkResponse(String simon, String user) {
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
