package fpij;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {

    // LambdaSample
    System.out.println("LambdaSample --------------------------");
    LambdaSample.func1();

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

    // OlderThan20
    System.out.println("OlderThan20 --------------------------");
    var ot20 = new OlderThan20();
    ot20.funcMain();

    // ListFiles
    System.out.println("ListFiles --------------------------");
    var lf = new ListFiles();
    lf.funcMain();

    // WatchFileChange
    System.out.println("WatchFileChange --------------------------");
    WatchFileChange.funcMain();

    // AsssetUtil
    System.out.println("AsssetUtil --------------------------");
    AsssetUtil.funcMain();

    // AssetUtilRefactored
    System.out.println("AssetUtilRefactored --------------------------");
    AssetUtilRefactored.funcMain();

    // Camera
    System.out.println("Camera --------------------------");
    Camera.funcMain();

    // SeaPlane
    System.out.println("SeaPlane --------------------------");
    var sp = new SeaPlane();
    sp.funcMain();

    // MailBuilder
    System.out.println("MailBuilder --------------------------");
    MailBuilder.funcMain();

    // FluentMailer
    System.out.println("FluentMailer --------------------------");
    FluentMailer.funcMain();
  }

}
