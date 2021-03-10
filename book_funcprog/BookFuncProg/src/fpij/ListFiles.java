package fpij;

import static java.util.stream.Collectors.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListFiles {

  public void funcMain() throws IOException {

    var temp_list = Files.list(Paths.get("."))
        .filter(Files::isDirectory)
        .collect(Collectors.toList());
    //        .forEach(System.out::println);
    System.out.println(temp_list);

    System.out.println("------");
    final String[] files = new File("src\\fpij")
        .list(new java.io.FilenameFilter() {
          public boolean accept(final File dir, final String name) {
            return name.endsWith(".java");
          }
        });
    System.out.println(files);

    System.out.println("------");
    Files.newDirectoryStream(Paths.get("src\\fpij"), path -> path.toString().endsWith(".java"))
        .forEach(System.out::println);

    System.out.println("------");
    List<File> a_files = new ArrayList<>();

    File[] filesInCurrentDir = new File(".").listFiles();
    for (File file : filesInCurrentDir) {
      File[] filesInSubDIr = file.listFiles();
      if (filesInSubDIr != null) {
        a_files.addAll(Arrays.asList(filesInSubDIr));
      } else {
        a_files.add(file);
      }
    }
    System.out.println("Count:" + a_files.size());

    System.out.println("------");
    List<File> b_files = Stream.of(new File(".").listFiles())
        .flatMap(f -> f.listFiles() == null ? Stream.of(f) : Stream.of(f.listFiles()))
        .collect(toList());

    System.out.println("Count:" + b_files.size());
  }

}
