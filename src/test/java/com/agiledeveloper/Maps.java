package com.agiledeveloper;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Maps {

  public static class MyEntry<K, V> {
    public final K key;
    public final V value;

    public MyEntry(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }

  public static Map<Integer, List<String>> listByScore(Map<String, Integer> scores) {
    return io.vavr.collection.HashSet.ofAll(scores.keySet())
      .groupBy(scores::get)
      .mapValues(s -> s.toJavaList())
      .toJavaMap();
  }

  public static Map<Integer, Set<String>> setByScore(Map<String, Integer> scores) {
    return io.vavr.collection.HashSet.ofAll(scores.keySet())
      .groupBy(scores::get)
      .mapValues(s -> s.toSet().map(String::toUpperCase).toJavaSet())//need to upcast from the specific Set type
      .toJavaMap();
  }

  public static Map<Integer, Integer> countScores(Map<String, Integer> scores) {
    return io.vavr.collection.HashSet.ofAll(scores.keySet())
      .groupBy(scores::get)
      .mapValues(s -> s.size())
      .toJavaMap();
  }

  public static Map<Integer, Set<Integer>> numberOfLetters(Map<String, Integer> scores) {
    return io.vavr.collection.HashSet.ofAll(scores.keySet())
      .groupBy(scores::get)
      .mapValues(s -> s.toSet().map(String::length).toJavaSet())
      .toJavaMap();
  }

  public static Map<Integer, Integer> maxNumberOfLetters(Map<String, Integer> scores) {
    return io.vavr.collection.HashSet.ofAll(scores.keySet())
      .groupBy(scores::get)
      .mapValues(s -> s.map(String::length).max().getOrElse(0))
      .toJavaMap();
  }
}