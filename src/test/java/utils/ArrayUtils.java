package utils;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public final class ArrayUtils {

  private ArrayUtils() {}

  public static <T> Set<T> arrayToSet(T[] array) {
    return Arrays.stream(array).collect(Collectors.toSet());
  }

  public static <T> Set<Set<T>> arraysToSets(T[][] arrays) {
    return Arrays
      .stream(arrays)
      .map(array -> Arrays.stream(array).collect(Collectors.toSet()))
      .collect(Collectors.toSet());
  }
}
