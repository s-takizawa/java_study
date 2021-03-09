package fpij;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DiscountFunctinalTest {

  DiscountFunctinal df;

  @Before
  public void setUpBeforeClass() throws Exception {
    df = new DiscountFunctinal();
  }

  @Test
  public void test_getTotalDicscountPrice() {

    List<BigDecimal> prices = Arrays.asList(
        new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
        new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
        new BigDecimal("45"), new BigDecimal("12"));

    var ret = df.getTotalDicscountPrice(prices);
    assertEquals(ret, new BigDecimal(67.5));
  }

}
