package js11;

public class Sample3 {

  private int num;
  private String str;
  private int no;

  public Sample3(int num) {
    this.no = num;
  }

  public Sample3() {
    this.no = 99;
    this.str = "test";
  }

  private int test() {
    return 10;
  }

  public static void main(String[] args) {
    printHoge();
    Sample3.printHoge();
    
    Sample3 s = new Sample3();
    int num = s.test();
    s.test();
    System.out.println(num);

    Sample3 s2 = new Sample3(20);
    System.out.println(s2.str + ", " + s2.no);
    System.out.println(s.str + ", " + s.no);
  }
  
  private static void printHoge() {
    System.out.println("hoge");
  }

}
