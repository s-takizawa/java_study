package fpij;

public class SeaPlane extends Vehicle implements FastFly, Sail {
  private int altitude;

  public void funcMain() {
    System.out.println("takeoff");
    this.takeOff();
    System.out.println("turn");
    this.turn();
    System.out.println("cruise");
    this.cruise();
    System.out.println("land");
    this.land();
  }

  public void cruise() {
    System.out.println("SeaPlane::curise currently curise like: ");
    if (altitude > 0) {
      FastFly.super.cruise();
    } else {
      Sail.super.cruise();
    }
  }

}
