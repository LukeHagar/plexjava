package com.plexsdk.hooks.model;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Liblab's representation of a response
 */
public class Response {

  private int statusCode;
  private String body;
  private Map<String, String> headers;

  public Response(int statusCode, String body, Map<String, String> headers) {
    this.statusCode = statusCode;
    this.body = body;
    this.headers = headers;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  public static Response toHookResponse(okhttp3.Response response) {
    Map<String, String> responseHeaders = response
      .headers()
      .toMultimap()
      .entrySet()
      .stream()
      .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().get(0)));

    return new Response(
      response.code(),
      response.body() != null ? Objects.requireNonNull(response.body()).toString() : null,
      responseHeaders
    );
  }
}
