package abstractfactory.tablefactory;

import abstractfactory.factory.Tray;

public class TableTray extends Tray {

  public TableTray(String caption) {
    super(caption);
  }

  @Override
  public String makeHTML() {
    StringBuffer sb = new StringBuffer();
    sb.append("<td>");
    sb.append("<table width=\"100%\" border=\"1\"><tr>");
    sb.append("<td><b>" + caption + "</b></td>");
    sb.append("</tr>\n");
    sb.append("<tr>\n");

    tray.forEach(itm -> sb.append(itm.makeHTML()));
    sb.append("</tr></table>");
    sb.append("</td>");

    return sb.toString();
  }

}
