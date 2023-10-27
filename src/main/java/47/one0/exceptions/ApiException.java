package 47.one0.exceptions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * This is the base class for all exceptions that represent an error response from the server.
 */
public class ApiException extends RuntimeException {
    private static final Map<Integer, String> ERROR_MAP = Collections.unmodifiableMap(new HashMap<Integer, String>() {
      {
        put(401, "Unauthorized");
        put(403, "Forbidden");
        put(404, "Not Found");
        put(405, "Method Not Allowed");
        put(406, "Not Acceptable");
        put(409, "Conflict");
        put(410, "Gone");
        put(500, "Internal Server Error");
        put(502, "Bad Gateway");
        put(503, "Service Unavailable");
        put(504, "Gateway Timeout");
      }
    });

    private final int statusCode;

    public ApiException(int code) {
      super(getExceptionMessage(code));
      this.statusCode = code;
    }

    public ApiException(String message) {
      super(message);
      this.statusCode = 0;
    }

    public ApiException(String message, Throwable t) {
      super(message, t);
      this.statusCode = 0;
    }

    public ApiException(int code, String message) {
      super(message);
      this.statusCode = code;
    }

    public int getStatusCode() {
      return this.statusCode;
    }

    static String getExceptionMessage(int code) {
      return ERROR_MAP.getOrDefault(code, "Unknown Error");
    }
  }
