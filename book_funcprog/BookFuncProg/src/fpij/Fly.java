package fpij;

public interface Fly {
  default void takeOff() {
    System.out.println("Fly::takeoff");
  }

  default void land() {
    System.out.println("Fly::land");
  }

  default void turn() {
    System.out.println("Fly::turn");
  }

  default void cruise() {
    System.out.println("Fly::cruise");
  }
}
