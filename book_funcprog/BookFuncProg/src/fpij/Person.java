package fpij;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Person {

  private final String name;
  private final int age;

  public Person(final String name, final int age) {
    this.name = name;
    this.age = age;
  }

  public void funcMain() {
    final List<Person> people = Arrays.asList(
        new Person("Jhon", 21),
        new Person("Sara", 20),
        new Person("Jane", 21),
        new Person("Greg", 11));

    //    List<Person> ascendingAge = people.stream()
    //        .sorted((person1, person2) -> person1.ageDifference(person2))
    //        .collect(toList());
    List<Person> ascendingAge = people.stream()
        .sorted(Person::ageDifference)
        .collect(toList());
    printPeople("Sorted in ascending order by age: ", ascendingAge);

    Comparator<Person> compareAscending = (person1, person2) -> person1.ageDifference(person2);
    Comparator<Person> compareDescending = compareAscending.reversed();

    printPeople("Sorted in asc:",
        people.stream()
            .sorted(compareAscending)
            .collect(toList()));

    printPeople("Sorted in desc:",
        people.stream()
            .sorted(compareDescending)
            .collect(toList()));

    System.out.println("----");
    printPeople("Sorted in asc by name",
        people.stream()
            .sorted((person1, person2) -> person1.getName().compareTo(person2.getName()))
            .collect(toList()));

    System.out.println("----");
    people.stream()
        .min(Person::ageDifference)
        .ifPresent(yougest -> System.out.println("Youngest:" + yougest));
    people.stream()
        .max(Person::ageDifference)
        .ifPresent(eldest -> System.out.println("Eldest:" + eldest));
  }

  /**
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * @return age
   */
  public int getAge() {
    return age;
  }

  public int ageDifference(final Person other) {
    return age - other.age;
  }

  public String toString() {
    return String.format("%s - %d", name, age);
  }

  public static void printPeople(final String message, final List<Person> people) {

    System.out.println(message);
    people.forEach(System.out::println);
  }

}
