package abstractfactory.tablefactory;

import abstractfactory.factory.Page;

public class TablePage extends Page {

  public TablePage(String title, String author) {
    super(title, author);
  }

  @Override
  public String makeHTML() {
    StringBuilder sb = new StringBuilder();

    sb.append("<html><head><title>" + title + "</title></head>\n");
    sb.append("<body>\n");
    sb.append("<h1>" + title + "</h1>\n");
    sb.append("<table width=\"80%\" border=\"3\">\n");

    content.forEach(itm -> sb.append("<tr>" + itm.makeHTML() + "</tr>"));
    sb.append("</table>\n");
    sb.append("<hr><address>" + author + "</address>");
    sb.append("</body></html>\n");

    return sb.toString();
  }

}
