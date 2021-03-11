package fpij;

public class MailBuilder {

  public MailBuilder from(final String address) {
    System.out.println("from...");
    return this;
  }

  public MailBuilder to(final String address) {
    System.out.println("to...");
    return this;
  }

  public MailBuilder subject(final String line) {
    System.out.println("subject...");
    return this;
  }

  public MailBuilder body(final String msg) {
    System.out.println("body...");
    return this;
  }

  public void send() {
    System.out.println("send");
  }

  public static void funcMain() {
    MailBuilder mailBuilder = new MailBuilder();
    mailBuilder.from("hoge@a.com")
        .to("fuga@b.com")
        .subject("title des")
        .body("hello")
        .send();
  }
}
