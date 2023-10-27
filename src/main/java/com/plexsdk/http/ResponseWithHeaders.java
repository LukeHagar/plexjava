package com.plexsdk.http;

import okhttp3.Headers;

public class ResponseWithHeaders<T> {

  private T data;
  private Headers headers;

  public ResponseWithHeaders(T data, Headers headers) {
    this.data = data;
    this.headers = headers;
  }

  public T getData() {
    return data;
  }

  public Headers getHeaders() {
    return headers;
  }
}
