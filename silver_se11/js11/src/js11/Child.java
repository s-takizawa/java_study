package js11;

import java.util.List;

public class Child extends Parent {
  private List<String> list = List.of("A", "B", "C");

  public Child() {
    System.out.println("Child");
  }

  public Child(int i) {
    System.out.println("int Child");
  }

  @Override
  protected void methodHoge() {
    System.out.println("child method");
  }

  public List<String> getList() {
    return list;
  }

  public static void main(String[] args) {
    System.out.println("start");
    Parent p = new Child();
    p.methodHoge();
    Child c = new Child();
    c.methodHoge();
    Parent p2 = new Parent();
    p2.methodHoge();
    System.out.println("end");
  }

}
