package builder;

import java.util.Arrays;

public class TextBuilder extends Builder {
  private StringBuffer sb = new StringBuffer();

  @Override
  public void makeTitle(String title) {
    sb.append("==================\n");
    sb.append("[" + title + "]\n");
    sb.append("\n");
  }

  @Override
  public void makeString(String str) {
    sb.append("■" + str + "\n");
    sb.append("\n");
  }

  @Override
  public void makeItems(String[] items) {
    Arrays.stream(items).forEach(s -> sb.append("  ・" + s + "\n"));
    sb.append("\n");
  }

  @Override
  public void close() {
    sb.append("==================\n");
  }

  @Override
  public String getResult() {
    return sb.toString();
  }

}
