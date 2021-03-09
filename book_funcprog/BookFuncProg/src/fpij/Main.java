package fpij;

public class Main {

  public static void main(String[] args) {
    // Cities
    Cities.funcMain();
    System.out.println("--------------------------");

    // DiscountFunctional
    var df = new DiscountFunctinal();
    df.funcMain();
    System.out.println("--------------------------");

    // Iteration
    var itrt = new Iteration();
    itrt.funcMain();
    System.out.println("--------------------------");

    // Transform
    var trs = new Transform();
    trs.funcMain();
    System.out.println("--------------------------");

    // PrintList
    var pl = new PrintList();
    pl.funcMain();
    System.out.println("--------------------------");
  }

}
