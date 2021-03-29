package abstractfactory.listfactory;

import abstractfactory.factory.Page;

public class ListPage extends Page {

  public ListPage(String title, String author) {
    super(title, author);
  }

  @Override
  public String makeHTML() {
    StringBuffer sb = new StringBuffer();
    sb.append("<html><head><title>" + title + "</title></head>\n");
    sb.append("<body>\n");
    sb.append("<h1>" + title + "</h1>\n");
    sb.append("<ul>\n");

    content.forEach(itm -> sb.append(itm.makeHTML()));
    sb.append("</ul>\n");
    sb.append("<hr><address>" + author + "</address>");
    sb.append("</body></html>\n");

    return sb.toString();
  }

}
