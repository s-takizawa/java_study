package fpij;

public class HolderNaive {

  private Heavy heavy;

  public HolderNaive() {
    System.out.println("Holder created");
  }

  public Heavy getHeavy() {
    if (heavy == null) {
      heavy = new Heavy();
    }
    return heavy;
  }

  public static void funcMain() {
    final HolderNaive holder = new HolderNaive();
    System.out.println("deferring heavy cration...");
    System.out.println(holder.getHeavy());
    System.out.println(holder.getHeavy());
  }
}
