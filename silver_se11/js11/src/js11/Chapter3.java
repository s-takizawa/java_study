package js11;

public class Chapter3 {

  public static void main(String[] args) {
    // その他
    {

      System.out.println("[その他]");
      System.out.println(1 + 2 + "3" + 4 + 5);
      System.out.println("-----------");

    }
    // 1
    {
      int a = 3;
      int b = a += 5;
      System.out.println("[1]");
      System.out.println(a + b);
      System.out.println("-----------");
    }

    // 2
    {
      int num = -10;
      System.out.println("[2]");
      System.out.println(10 * -num);
      System.out.println("-----------");
    }

    // 3
    {
      //      byte a = 0b10000000;
      short b = 128 + 128;
      //      int c = 2 * 3L;
      //      float d = 10.0;
    }

    // 4
    {
      int a = 10;
      int b = a++ + a + a-- - a-- + ++a;
      System.out.println("[4]");
      System.out.println(b);
      System.out.println("-----------");
    }

    // 5
    {
      boolean a = true;
      boolean b = true;
      System.out.println("[5]");
      //      System.out.println(a <= b);
      System.out.println("-----------");

    }

    //
    {

      System.out.println("[]");
      System.out.println();
      System.out.println("-----------");

    }
  }

}
