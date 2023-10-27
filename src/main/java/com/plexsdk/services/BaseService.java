package com.plexsdk.services;

import com.plexsdk.Configuration;
import com.plexsdk.exceptions.ApiException;
import com.plexsdk.http.ModelConverter;
import com.plexsdk.models.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class BaseService {

  protected OkHttpClient httpClient;
  protected String serverUrl;

  public BaseService(OkHttpClient httpClient, String serverUrl) {
    this.httpClient = httpClient;
    this.serverUrl = serverUrl;
  }

  public void setBaseUrl(String serverUrl) {
    this.serverUrl = serverUrl;
  }

  protected Response execute(Request request) throws ApiException {
    Response response;
    try {
      response = this.httpClient.newCall(request).execute();
    } catch (IOException e) {
      ApiException apiException = new ApiException(e.getMessage());

      throw apiException;
    }
    if (response.isSuccessful()) {
      return response;
    } else {
      ApiException apiException = new ApiException(response.code());

      throw apiException;
    }
  }
}
