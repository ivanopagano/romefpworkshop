package com.agiledeveloper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount {
  public static long count(String path, String searchWord) {
    try {
      final Path resources = Paths.get("src/test/resources");
      final Path p = resources.resolve(path);
      return Files.lines(p)
              .filter(line -> line.contains(searchWord))
              .count();
    } catch(IOException ex) {
      throw new RuntimeException(new FileNotFoundException(ex.getMessage()));
    }
  }
}
