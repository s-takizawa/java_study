package fpij;

import java.util.function.Consumer;

public class FluentMailer {
  private FluentMailer() {
  }

  public FluentMailer from(final String address) {
    System.out.println("from...");
    return this;
  }

  public FluentMailer to(final String address) {
    System.out.println("to...");
    return this;
  }

  public FluentMailer subject(final String line) {
    System.out.println("subject...");
    return this;
  }

  public FluentMailer body(final String msg) {
    System.out.println("body...");
    return this;
  }

  public static void send(final Consumer<FluentMailer> block) {
    final FluentMailer mailer = new FluentMailer();
    block.accept(mailer);
    System.out.println("sending...");
  }

  public static void funcMain() {
    FluentMailer.send(mailer -> mailer.from("from@a.com")
        .to("to@b.com")
        .subject("build notification")
        .body("much better"));
  }
}
