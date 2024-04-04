public enum ColorsAndLetterEnum {
  RED("red", "r"),
  BLUE("blue", "b"),
  GREEN("green", "g"),
  YELLOW("yellow", "y");


  private final String simonColor;
  private final String userColor;

  ColorsAndLetterEnum(String simonColor, String userColor) {
    this.simonColor = simonColor;
    this.userColor = userColor;
  }
  public String getSimonColor() {
    return simonColor;
  }

  public String getUserColor() {
    return userColor;
  }

}
