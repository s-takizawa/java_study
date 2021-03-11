package fpij;

public interface FastFly extends Fly {
  default void takeOff() {
    System.out.println("FastFly::takeoff");
  }
}
