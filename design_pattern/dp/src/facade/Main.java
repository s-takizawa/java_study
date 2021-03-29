package facade;

import facade.pagemaker.PageMaker;

public class Main {

  public static void main(String[] args) {
    PageMaker.makeWelcomePage("tanaka@tanaka.com", "welcome.html");
  }

}
