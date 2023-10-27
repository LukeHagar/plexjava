package com.plexsdk.http.interceptors;

import com.plexsdk.Configuration;
import java.io.IOException;
import lombok.Getter;
import lombok.Setter;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class ApiKeyInterceptor implements Interceptor {

  @Getter
  @Setter
  private String apiKey;

  @Getter
  @Setter
  private String apiKeyHeader;

  @Override
  public Response intercept(Chain chain) throws IOException {
    return chain.proceed(addApiKeyToRequest(chain.request()));
  }

  private Request addApiKeyToRequest(Request request) {
    return this.apiKey != null && !this.apiKey.isEmpty()
      ? request.newBuilder().addHeader(resolveHeader(), this.apiKey).build()
      : request;
  }

  private String resolveHeader() {
    return this.apiKeyHeader != null && !this.apiKeyHeader.isEmpty()
      ? this.apiKeyHeader
      : Configuration.DEFAULT_API_KEY_HEADER;
  }
}
