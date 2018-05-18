package com.agiledeveloper;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Pair {
  public final int _1;
  public final int _2;
  
  public Pair(int first, int sec) {
    _1 = first;
    _2 = sec;
  }
}


class Triple {
  public static String getTriple(int m, int n) {   
    int a = m * m - n * n;
    int b = 2 * m * n;
    int c = m * m + n * n;
    
    return String.format("%d %d %d", a, b, c);
  }
  
  public static List<String> computeTriples(int numberOfValues) {

    return IntStream.range(2, 2 + numberOfValues)
      .boxed()
      .flatMap(m -> 
        IntStream.range(1, m)
          .mapToObj(n -> new Pair(m, n))
        )
      .map(p -> getTriple(p._1, p._2))
      .limit(numberOfValues)
      .collect(toList());
 }  
}