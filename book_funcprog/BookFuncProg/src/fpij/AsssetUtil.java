package fpij;

import java.util.Arrays;
import java.util.List;

import fpij.Asset.AssetType;

public class AsssetUtil {

  public static void funcMain() {

    final List<Asset> assets = Arrays.asList(
        new Asset(Asset.AssetType.BOND, 1000),
        new Asset(Asset.AssetType.BOND, 2000),
        new Asset(Asset.AssetType.STOCK, 3000),
        new Asset(Asset.AssetType.STOCK, 4000));

    System.out.println("Total of all assets: " + totalAssetValues(assets));
    System.out.println("Total of all bonds: " + totalBondValues(assets));
  }

  public static int totalAssetValues(final List<Asset> assets) {
    return assets.stream()
        .mapToInt(as -> as.getType() == AssetType.STOCK ? as.getValue() : 0)
        .sum();
  }

  public static int totalBondValues(final List<Asset> assets) {
    return assets.stream()
        .mapToInt(as -> as.getType() == AssetType.BOND ? as.getValue() : 0)
        .sum();
  }
}
