package com.plexsdk.http.interceptors;

import java.io.IOException;
import java.util.stream.IntStream;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class RetryInterceptor implements Interceptor {

  private static final int MAX_RETRIES = 3;
  private static final double RETRY_DELAY = 150;
  private static final int[] RETRYABLE_CODES = { 500, 503, 504 };

  @Override
  public Response intercept(Chain chain) throws IOException {
    // Try the request and if it fails use exponential backoff to retry
    Request request = chain.request();
    Response response = chain.proceed(request);
    int tryCount = 1;
    while (!response.isSuccessful() && isRetryable(response) && tryCount - 1 < MAX_RETRIES) {
      try {
        Thread.sleep((long) Math.pow(RETRY_DELAY, tryCount - 1));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      response.close();
      response = chain.proceed(request);
      tryCount++;
    }
    return response;
  }

  private boolean isRetryable(Response response) {
    final int statusCode = response.code();
    return IntStream.of(RETRYABLE_CODES).anyMatch(x -> x == statusCode);
  }
}
