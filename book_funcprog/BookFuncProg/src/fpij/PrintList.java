package fpij;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintList {
  public static final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

  public void funcMain() {
    System.out.println(String.join(", ", friends));

    var tempList = friends.stream()
        .map(String::toUpperCase)
        .collect(Collectors.joining(", "));

    System.out.println(tempList);

  }
}
