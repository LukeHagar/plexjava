package 47.one0.http.util;

    import static 47.one0.http.ModelConverter.modelToJson;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Provides static methods to convert values (object, array, boxed types) into string representation for http url.
 * Usually used for converting objects to be http url friendly (e.g. query or header parameters)
 */
public class HttpArgumentConverter {

  /**
   * Converts any value (object, array, primitive) into a string representation.
   *
   * @param value The value (object, array or primitive) to be converted.
   * @return A string representation of the input value in a format that can be used as url query or header parameter value.
   */
  public static String toStringArgument(final Object value) {
    if (value == null) {
      return "";
    }
    if (
      value instanceof String ||
      value instanceof Number ||
      value instanceof Boolean ||
      value instanceof Enum<?>
    ) {
      return String.valueOf(value);
    }
    if (value instanceof List<?>) {
      List<?> list = (List<?>) value;
      return list
        .stream()
        .map(HttpArgumentConverter::toStringArgument)
        .collect(Collectors.joining(","));
    }

    return modelToJson(value);
  }
}
