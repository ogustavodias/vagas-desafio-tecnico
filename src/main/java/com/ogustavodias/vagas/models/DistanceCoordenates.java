package com.ogustavodias.vagas.models;

import java.util.HashMap;
import java.util.Map;

public class DistanceCoordenates {

  private static Map<String, Map<String, Integer>> distances;

  static {
    distances = new HashMap<>();

    Map<String, Integer> A = new HashMap<>();
    A.put("B", 5);
    A.put("C", 12);
    A.put("D", 8);
    A.put("E", 16);
    A.put("F", 16);
    distances.put("A", A);

    Map<String, Integer> B = new HashMap<>();
    B.put("A", 5);
    B.put("C", 7);
    B.put("D", 3);
    B.put("E", 12);
    B.put("F", 11);
    distances.put("B", B);

    Map<String, Integer> C = new HashMap<>();
    C.put("A", 12);
    C.put("B", 7);
    C.put("D", 10);
    C.put("E", 4);
    C.put("F", 18);
    distances.put("C", C);

    Map<String, Integer> D = new HashMap<>();
    D.put("A", 8);
    D.put("B", 3);
    D.put("C", 10);
    D.put("E", 10);
    D.put("F", 8);
    distances.put("D", D);

    Map<String, Integer> E = new HashMap<>();
    E.put("A", 16);
    E.put("B", 11);
    E.put("C", 4);
    E.put("D", 10);
    E.put("F", 18);
    distances.put("E", E);

    Map<String, Integer> F = new HashMap<>();
    F.put("A", 16);
    F.put("B", 11);
    F.put("C", 18);
    F.put("D", 8);
    F.put("E", 18);
    distances.put("F", F);
  }

  public static Integer getDistanceOf(String origin, String destination) {
    return distances.get(origin).get(destination);
  }

  public static Integer getScoreOfDistance(String origin, String destination) {
    Integer minDistance = origin == destination ? 0 : getDistanceOf(origin, destination);

    if (minDistance <= 5)
      return 100;
    else if (minDistance <= 10)
      return 75;
    else if (minDistance <= 15)
      return 50;
    else if (minDistance <= 20)
      return 25;
    else
      return 0;
  }

  public static Map<String, Map<String, Integer>> getDistances() {
    return distances;
  }

}
