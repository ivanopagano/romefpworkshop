package com.agiledeveloper;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class NextInSeries {
  public final int current;
  public final int next;
  
  public NextInSeries(int theCurrent, int theNext) {
    current = theCurrent;
    next = theNext;
  }
                   
  public NextInSeries nextValue() {
    return new NextInSeries(next, current + next);
  }
}

class Fibonacci {
  public static int numberAtPosition(int position) {
    
    NextInSeries initial = new NextInSeries(0, 1);
    
    return IntStream.range(0, position)
     .mapToObj(ignore -> new NextInSeries(0, 0))
     .reduce(initial, (result, ignore) -> result.nextValue())
     .next;
  }             
  
  public static List<Integer> seriesUntilPosition(int position) {
    return IntStream.rangeClosed(0, position)
      .mapToObj(index -> numberAtPosition(index))
      .collect(toList());
  } 
}


