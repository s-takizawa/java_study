package js11;

public class Sample1 {

  private int num;

  public static void main(String[] args) {
    //    test1(10);  // コンパイルエラー
    test2(10);

    Sample1 s = new Sample1();
    s.test1(20);
    s.test2(30);
    s.test3();
  }

  private void test1(int num) {
    System.out.println(num);
  }

  private static void test2(int num) {
    System.out.println(num);
  }

  private void test3() {
    System.out.println("num:" + num);
  }

}
