package abstractfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

public class Main {

  public static void main(String[] args) {
    //    if (args.length != 1) {
    //      System.out.println("Usage: java Main class.name.of.ConcreateFactory");
    //      System.out.println("example: java Main listfactory.ListFactory");
    //  System.out.println("example: java Main tablefactory.TableFactory");
    //
    //      System.exit(0);
    //    }

    //    Factory factory = Factory.getFactory("abstractfactory.listfactory.ListFactory"); // ListFactory
    Factory factory = Factory.getFactory("abstractfactory.tablefactory.TableFactory"); // TableFactory

    Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
    Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp/");

    Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahooo.com/");
    Link jp_yahoo = factory.createLink("yahoo!Japan", "http:://www.yahoo.co.jp/");
    Link excite = factory.createLink("Excite", "http://www.excite.com/");
    Link google = factory.createLink("Google", "http://www.google.com/");

    Tray traynews = factory.createTray("新聞");
    traynews.add(asahi);
    traynews.add(yomiuri);

    Tray trayyahoo = factory.createTray("Yahoo!");
    trayyahoo.add(us_yahoo);
    trayyahoo.add(jp_yahoo);

    Tray traysearch = factory.createTray("サーチエンジン");
    traysearch.add(trayyahoo);
    traysearch.add(excite);
    traysearch.add(google);

    String pagename = factory.getPageName();
    Page page = factory.createPage(pagename, "山田　太郎");
    page.add(traynews);
    page.add(traysearch);
    page.output();

  }

}
