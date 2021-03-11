package fpij;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaSample {

  public static void func1() {
    // apply
    Function<String, Integer> funcApply = s -> Integer.parseInt(s);
    System.out.println("apply:" + funcApply.apply("123"));

    // compose => A.compose(B) => Bの結果をAに
    Function<String, String> funcComposeDoubleQ = s -> "\"" + s + "\"";
    Function<String, String> funcComposeSingleQ = s -> "\'" + s + "\'";

    Function<String, String> funcComposeDoubleSingleQ = funcComposeDoubleQ.compose(funcComposeSingleQ);
    Function<String, String> funcComposeSigleDoubleQ = funcComposeSingleQ.compose(funcComposeDoubleQ);

    System.out.println("compose:ds:" + funcComposeDoubleSingleQ.apply("hoge")); // "'hoge'"
    System.out.println("compose:sd:" + funcComposeSigleDoubleQ.apply("fuga")); // '"fuga"'

    // andthen => A.compose(B) => Aの結果をBに
    Function<String, String> funcAndThenDoubleSingleQ = funcComposeDoubleQ.andThen(funcComposeSingleQ);
    Function<String, String> funcAndThenSingleDoubleQ = funcComposeSingleQ.andThen(funcComposeDoubleQ);

    System.out.println("andthen:ds:" + funcAndThenDoubleSingleQ.apply("foo")); // '"foo"'
    System.out.println("andthen:sd:" + funcAndThenSingleDoubleQ.apply("bar")); // "'bar'"

    // reduce
    List<String> reduceList = Arrays.asList("pineapple", "strawberry", "peach", "apple", "banana");

    // 引数1
    Optional<String> reduceArg1Result = reduceList.stream()
        .reduce((name1, name2) -> name1 + "=>" + name2);
    System.out.println("reduce result[args1]:" + reduceArg1Result.get());

    // 引数2
    String reduceArg2Result = reduceList.stream()
        .reduce("start:", (name1, name2) -> name1 + "=>" + name2);
    System.out.println("reduce result[args2]:" + reduceArg2Result);

    // 引数3 => streamの型と取得したい型が違う場合
    // 直列
    Integer reudceArg3TyokuretuResult = reduceList.stream()
        .reduce(0, (lencnt, name) -> lencnt + name.length(), (res1, res2) -> null);
    System.out.println("reduce result[args3]:直列:" + reudceArg3TyokuretuResult);
    // 並列
    Integer reudceArg3ParallelResult = reduceList.parallelStream()
        .reduce(0, (lencnt, name) -> lencnt + name.length(), (res1, res2) -> res1 += res2);
    System.out.println("reduce result[args3]:並列:" + reudceArg3ParallelResult);

    // consumer => 引数＋戻り値
    Consumer<String> consumerStrlencnt = (s) -> System.out.println("consumer:" + s.length());
    consumerStrlencnt.accept("hoge");

    // supplier => 戻り値のみ
    Supplier<Integer> supplier = () -> 1111;
    System.out.println("supplier:" + supplier.get());

    System.out.println(); // 改行
  }
}
