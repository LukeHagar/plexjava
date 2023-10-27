package 47.one0.hooks.model;

import 47.one0.http.ModelConverter;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import okhttp3.Headers;
import okhttp3.RequestBody;


/**
 * Liblab's representation of a request
 */
public class Request {
  private String method;
  private String url;
  private String body;
  private Map<String, String> headers;

  public Request(String method, String url, String body, Map<String, String> headers) {
      this.method = method;
      this.url = url;
      this.body = body;
      this.headers = headers;
  }

  public String getMethod() {
      return method;
  }

  public void setMethod(String method) {
      this.method = method;
  }

  public String getUrl() {
      return url;
  }

  public void setUrl(String url) {
      this.url = url;
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

  public static Request toHookRequest(okhttp3.Request request) {
      Map<String, String> hookHeaders = request
              .headers()
              .toMultimap()
              .entrySet()
              .stream()
              .collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().get(0)));
      return new Request(
              request.method(),
              request.url().toString(),
              request.body() != null ? Objects.requireNonNull(request.body()).toString() : "",
              hookHeaders
      );
  }

  public static okhttp3.Request toOkHttpRequest(Request hookRequest) {
      Headers.Builder headersBuilder = new Headers.Builder();
      hookRequest.getHeaders().forEach(headersBuilder::add);

      if (hookRequest.getBody() != null && !hookRequest.getBody().isEmpty()) {
          RequestBody requestBody = RequestBody.create(
                  Objects.requireNonNull(ModelConverter.modelToJson(hookRequest.getBody())),
                  okhttp3.MediaType.parse("application/json; charset=utf-8")
          );
          return new okhttp3.Request.Builder().method(hookRequest.getMethod(), requestBody).headers(headersBuilder.build()).url(hookRequest.url).build();
      } else {
          return new okhttp3.Request.Builder().method(hookRequest.getMethod(), null).headers(headersBuilder.build()).url(hookRequest.url).build();
      }
  }
}
