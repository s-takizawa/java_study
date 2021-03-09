package fpij;

public class IteratorString {

  public void funcMain() {
    final String str = "w00t";

    str.chars()
        .mapToObj(ch -> Character.valueOf((char) ch))
        .forEach(ch -> System.out.println("c:" + ch));

    str.chars()
        .filter(Character::isDigit)
        .mapToObj(ch -> Character.valueOf((char) ch))
        .forEach(IteratorString::printChars);
  }

  private static void printChars(int aChar) {
    System.out.println("c=>" + (char) aChar);
  }
}
