package com.agiledeveloper;

import java.util.List;

import io.vavr.Tuple;
import io.vavr.collection.Stream;

class Fibonacci {
  public static int numberAtPosition(int position) {
    
    return Stream.iterate(Tuple.of(0, 1), t -> Tuple.of(t._2, t._1 + t._2))
      .drop(position)
      .get()
      ._2;
    
  }             
  
  public static List<Integer> seriesUntilPosition(int position) {
    return Stream.range(0, position + 1)
      .map(Fibonacci::numberAtPosition)
      .toJavaList();
  }
}


