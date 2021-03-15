package js11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter3 {

  public static void main(String[] args) {
    // その他
    {

      System.out.println("[その他]");
      System.out.println(1 + 2 + "3" + 4 + 5);
      var list1 = List.of(1, 2, 3); // List<Integer>:固定長
      System.out.println(list1);
      var list2 = new ArrayList<Integer>(); // ArrayList<Integer>:可変長
      System.out.println(list2);
      var list3 = Arrays.asList(new Integer[] { 1, 2, 3 }); // List<Integer>:固定長
      System.out.println(list3);
      var list4 = new ArrayList<Integer>(3); // ArrayList<Integer>:可変長
      System.out.println(list4);

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

    // 9-17
    {

      System.out.println("[9-17]");

      List<String> list = new ArrayList<>(
          Arrays.asList(new String[] { "A", "B", "C" }));
      list.removeIf((String s) -> {
        return s.equals("B");
      });
      System.out.println(list);
      System.out.println();

      // 以下は実行時エラー UnsupportedOperationException
      try {
        List<String> list2 = Arrays.asList(new String[] { "A", "B", "C" });
        list2.removeIf((String s) -> {
          return s.equals("B");
        });
        System.out.println(list2);
      } catch (UnsupportedOperationException e) {
        // TODO: handle exception
        System.out.println(e);
      }
      try {
        List<String> list3 = List.of("A", "B", "C");
        list3.removeIf((String s) -> {
          return s.equals("B");
        });
        System.out.println(list3);
      } catch (UnsupportedOperationException e) {
        // TODO: handle exception
        System.out.println(e);
      }
      System.out.println();

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
