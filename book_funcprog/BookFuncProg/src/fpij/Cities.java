package fpij;

import java.util.Arrays;
import java.util.List;

public class Cities {

  public static boolean findChicagoDeclarative(final List<String> cities) {
    return cities.contains("Chicago");
  }

  public static void funcMain() {
    List<String> cities = Arrays.asList("Albany", "Boulder", "Chicago", "Denver", "Eugene");

    boolean ret = findChicagoDeclarative(cities);
    System.out.println("Found chicago?:" + ret);
  }
}
