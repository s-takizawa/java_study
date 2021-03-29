package abstractfactory.listfactory;

import abstractfactory.factory.Tray;

public class ListTray extends Tray {

  public ListTray(String caption) {
    super(caption);
  }

  @Override
  public String makeHTML() {
    StringBuffer sb = new StringBuffer();
    sb.append("<li>\n");
    sb.append(caption + "\n");
    sb.append("<ul>\n");

    tray.forEach(itm -> sb.append(itm.makeHTML()));
    sb.append("</ul>\n");
    sb.append("</li>\n");

    return sb.toString();
  }

}
