package com.agiledeveloper;

import java.util.List;

import io.vavr.collection.Stream;

class Triple {
  public static String getTriple(int m, int n) {   
    int a = m * m - n * n;
    int b = 2 * m * n;
    int c = m * m + n * n;
    
    return String.format("%d %d %d", a, b, c);
  }
  
  public static List<String> computeTriples(int numberOfValues) {
    return Stream.range(2, 2 + numberOfValues)
      .flatMap(m ->
        Stream.range(1, m)
          .map(n -> getTriple(m, n))
      )
      .take(numberOfValues)
      .asJava();
  }
}