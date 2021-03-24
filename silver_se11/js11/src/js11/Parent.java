package js11;

public class Parent {
  public Parent() {
    System.out.println("parent");
  }

  public Parent(int i) {
    System.out.println("int parent");
  }

  protected void methodHoge() {
    System.out.println("parent method");
  }

  void parentMethod() {
    return;
  }

  public static void main(String[] args) {
    Child c = new Child();
    for (String str : c.getList()) {
      System.out.println(str);
    }
  }
}
