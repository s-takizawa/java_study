package fpij;

import java.io.IOException;

public class WatchFileChange {

  public static void funcMain() throws IOException {
    //    final Path a_path = Paths.get(".");
    //    final WatchService ws1 = a_path.getFileSystem().newWatchService();
    //    a_path.register(ws1, StandardWatchEventKinds.ENTRY_MODIFY);
    //
    //    System.out.println("Report any file change within next 1 minute...");
    //
    //    try {
    //      final WatchKey watchKey = ws1.poll(1, TimeUnit.MINUTES);
    //
    //      if (watchKey != null) {
    //        watchKey.pollEvents()
    //            .stream()
    //            .forEach(eve -> System.out.println(eve.context()));
    //      }
    //
    //    } catch (InterruptedException e) {
    //      // TODO 自動生成された catch ブロック
    //      e.printStackTrace();
    //    }
  }

}
