package fpij;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * DiscountFunctinal
 */
public class DiscountFunctinal {

  /**
   *
   */
  public void funcMain() {
    List<BigDecimal> prices = Arrays.asList(
        new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
        new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
        new BigDecimal("45"), new BigDecimal("12"));

    var ret = getTotalDicscountPrice(prices);
    System.out.println("DiscountFunctinal:" + ret);
  }

  /**
   * @param price_list
   * @return
   */
  public BigDecimal getTotalDicscountPrice(List<BigDecimal> price_list) {
    BigDecimal ret = price_list.stream()
        .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
        .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
        .reduce(BigDecimal.ZERO, BigDecimal::add);

    return ret;
  }

}
