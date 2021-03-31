package builder;

public class Main {

  public static void main(String[] args) {

    Builder builder;
    boolean flg = true;
    if (flg) {
      builder = new TextBuilder();

    } else {
      builder = new HtmlBuilder();
    }

    Director director = new Director(builder);
    director.construct();
    String result = builder.getResult();
    System.out.println(result);

  }

}
