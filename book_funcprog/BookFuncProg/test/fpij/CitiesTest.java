package fpij;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CitiesTest {

  @Test
  public void test_findChicagoDeclarative() {
    List<String> cities = Arrays.asList("Albany", "Boulder", "Chicago", "Denver", "Eugene");

    boolean ret = Cities.findChicagoDeclarative(cities);
    assertTrue(ret);

    List<String> cities2 = Arrays.asList("tokyo", "saitama" , "kanagawa");
    boolean ret2 = Cities.findChicagoDeclarative(cities2);
    assertFalse(ret2);
  }

}
