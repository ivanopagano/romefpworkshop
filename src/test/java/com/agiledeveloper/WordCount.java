package com.agiledeveloper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.stream.Stream;

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
