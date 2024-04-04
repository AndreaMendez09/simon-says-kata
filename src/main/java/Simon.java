public class Simon {
  boolean checkResponse(String simon, String user) {

    if (!user.equals(simon.substring(0, 1))) {
      return false;
    }

    return true;
  }
}
