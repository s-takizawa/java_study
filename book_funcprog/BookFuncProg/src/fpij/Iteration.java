package fpij;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Iteration {

  public void funcMain() {
    final List<String> friends = Arrays.asList("Mike", "Tom", "Bob", "Keit");

    // loop
    for (var val : friends) {
      System.out.println("iteration:for:name=" + val);
    }

    // foreach
    friends.forEach(new Consumer<String>() {
      public void accept(final String name) {
        System.out.println("iteration:foreach:name:" + name);
      }
    });

    // foreach + lambda
    friends.forEach(name -> System.out.println("iteration:lambda:name=" + name));
  }

}
