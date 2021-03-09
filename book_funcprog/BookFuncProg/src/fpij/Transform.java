package fpij;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Transform {
  public static final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

  public static final List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");

  public static final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

  public void funcMain() {

    //    final List<String> friends = Arrays.asList("Mike", "Tom", "Bob", "Keit", "TK");

    final List<String> upperNames = new ArrayList<String>();

    friends.forEach(name -> upperNames.add(name.toUpperCase()));
    System.out.println(upperNames);

    // lambda
    friends.stream()
        .filter(name -> name != "Nate")
        .map(String::toUpperCase)
        .forEach(name -> System.out.println(name + " ** "));

    var hoge = friends.stream()
        .filter(name -> name.startsWith("S"))
        .collect(Collectors.toList());
    System.out.println(hoge);

    System.out.println("****** funcPickElements ******");
    funcPickElements();

    System.out.println("****** funcPickLongest ******");
    funcPickLongest();
  }

  public void funcPickElements() {
    final Predicate<String> startsWithN = name -> name.startsWith("N");

    final long countFriendsStartN = friends.stream()
        .filter(startsWithN)
        .count();
    System.out.println("friends start N count:" + countFriendsStartN);

    // 静的スコープ
    var temp_list = friends.stream()
        .filter(checkIfStartsWith("N"))
        .collect(Collectors.toList());
    System.out.println(temp_list);

    temp_list = friends.stream()
        .filter(checkIfStartsWith("B"))
        .collect(Collectors.toList());
    System.out.println(temp_list);

    // Functionインターフェイス
    final Function<String, Predicate<String>> starsWithLetter = (letter) -> name -> name.startsWith(letter);

    temp_list = friends.stream()
        .filter(starsWithLetter.apply("N"))
        .collect(Collectors.toList());
    System.out.println(temp_list);

    System.out.println("");
    pickName(friends, "N");
    pickName(friends, "B");
    pickName(friends, "Z");

  }

  public static Predicate<String> checkIfStartsWith(final String letter) {
    return name -> name.startsWith(letter);
  }

  public static void pickName(final List<String> names, final String startingLetter) {

    final Optional<String> foundName = names.stream()
        .filter(name -> name.startsWith(startingLetter))
        .findFirst();

    //    System.out.println(String.format("A name starting with %s: %s", startingLetter, foundName.orElse("No name found")));
    foundName.ifPresent(name -> System.out.println("Hello " + name));

  }

  public void funcPickLongest() {
    final int nameLengthCount = friends.stream()
        .mapToInt(name -> name.length())
        .sum();
    System.out.println("sum len cnt:" + nameLengthCount);

    final Optional<String> aLongName = friends.stream()
        .reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
    aLongName.ifPresent(name -> System.out.println(String.format("A longest name:%s", name)));

    final String steveOrLonger = friends.stream()
        .reduce("Steve j", (name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
    System.out.println(String.format("A longest name:%s", steveOrLonger));
  }

}
