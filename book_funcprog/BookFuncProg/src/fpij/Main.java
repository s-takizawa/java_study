package fpij;

public class Main {

  public static void main(String[] args) {
    // Cities
    System.out.println("Cities --------------------------");
    Cities.funcMain();

    // DiscountFunctional
    System.out.println("DiscountFunctional--------------------------");
    var df = new DiscountFunctinal();
    df.funcMain();

    // Iteration
    System.out.println("Iteration --------------------------");
    var itrt = new Iteration();
    itrt.funcMain();

    // Transform
    System.out.println("Transform --------------------------");
    var trs = new Transform();
    trs.funcMain();

    // PrintList
    System.out.println("PrintList --------------------------");
    var pl = new PrintList();
    pl.funcMain();

    // IteratorString
    System.out.println("IteratorString --------------------------");
    var is = new IteratorString();
    is.funcMain();

    // Person
    System.out.println("Person --------------------------");
    var cp = new Person("tarou", 12);
    cp.funcMain();
  }

}
