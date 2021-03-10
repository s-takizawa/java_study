package fpij;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class OlderThan20 {
  final List<Person> people = Arrays.asList(
      new Person("John", 20),
      new Person("Sara", 21),
      new Person("Jane", 21),
      new Person("Greg", 35));

  public void funcMain() {

    List<Person> olderThan20 = new ArrayList<>();
    people.stream().filter(person -> person.getAge() > 20)
        .forEach(person -> olderThan20.add(person));
    System.out.println("People older tha 20:" + olderThan20);

    System.out.println("----");

    List<Person> olth20 = people.stream()
        .filter(person -> person.getAge() > 20)
        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    System.out.println("People older tha 20 2:" + olth20);

    System.out.println("----");
    List<Person> ot2 = people.stream()
        .filter(person -> person.getAge() > 20)
        .collect(Collectors.toList());
    System.out.println("People older tha 20 3:" + ot2);

    System.out.println("----");
    Map<Integer, List<Person>> peopleByAge = people.stream()
        .collect(Collectors.groupingBy(Person::getAge));
    System.out.println("Grouped by age:" + peopleByAge);

    System.out.println("----");
    Map<Integer, List<String>> peopleNameByAge = people.stream()
        .collect(groupingBy(Person::getAge, mapping(Person::getName, toList())));
    System.out.println("Name Grouped by age:" + peopleNameByAge);

    System.out.println("----");
    Comparator<Person> byAge = Comparator.comparing(Person::getAge);
    Map<Character, Optional<Person>> oldestPersonOfEachLetter = people.stream()
        .collect(groupingBy(person -> person.getName().charAt(0), reducing(BinaryOperator.maxBy(byAge))));
    System.out.println("oldest person of each letter:");
    System.out.println(oldestPersonOfEachLetter);

  }

}
