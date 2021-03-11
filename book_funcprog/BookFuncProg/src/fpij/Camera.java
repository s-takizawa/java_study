package fpij;

import java.awt.Color;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")
public class Camera {
  private Function<Color, Color> filter;

  public Camera() {
    setFilters();
  }

  public Color capture(final Color inputColor) {
    final Color processedColor = filter.apply(inputColor);
    //... more processing of color...
    return processedColor;
  }
  //... other functions that use the filter ...

  public void setFilters(final Function<Color, Color>... filters) {
    filter = Stream.of(filters)
        .reduce((filter, next) -> filter.compose(next))
        //        .orElse(color -> color);
        .orElseGet(Function::identity);
  }

  public static void funcMain() {
    final Camera camera = new Camera();
    final Consumer<String> printCaptured = (filterInfo) -> System.out
        .println(String.format("with %s: %s", filterInfo, camera.capture(new Color(200, 100, 200))));

    printCaptured.accept("no filter");

    camera.setFilters(Color::brighter);
    printCaptured.accept("brighter");

    camera.setFilters(Color::darker);
    printCaptured.accept("darker");

    System.out.println("multiple filter");

    camera.setFilters(Color::brighter, Color::darker);
    printCaptured.accept("brighter and darker");
  }
}
