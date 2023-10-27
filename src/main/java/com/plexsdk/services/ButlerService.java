package com.plexsdk.services;

import com.plexsdk.exceptions.ApiException;
import com.plexsdk.http.*;
import com.plexsdk.http.util.HttpHeaders;
import com.plexsdk.http.util.HttpUrl;
import com.plexsdk.models.BaseModel;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ButlerService extends BaseService implements ButlerClient {

  public ButlerService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary Get Butler tasks
   */
  public ResponseWithHeaders<com.plexsdk.models.GetButlerTasksResponse> getButlerTasks()
    throws ApiException {
    String url = HttpUrl.builder(this.serverUrl).addPathParameter("butler").build();
    Request request = new Request.Builder().url(url).get().build();
    Response response = this.execute(request);

    return new ResponseWithHeaders<com.plexsdk.models.GetButlerTasksResponse>(
      ModelConverter.convert(
        response,
        new com.fasterxml.jackson.core.type.TypeReference<
          com.plexsdk.models.GetButlerTasksResponse
        >() {}
      ),
      response.headers()
    );
  }

  /**
   * @summary Start all Butler tasks
   */
  public ResponseWithHeaders<String> startAllTasks() throws ApiException {
    String url = HttpUrl.builder(this.serverUrl).addPathParameter("butler").build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(new BaseModel() {})),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).post(requestBody).build();
    Response response = this.execute(request);

    try {
      return new ResponseWithHeaders<java.lang.String>(
        response.body().string(),
        response.headers()
      );
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * @summary Stop all Butler tasks
   */
  public ResponseWithHeaders<String> stopAllTasks() throws ApiException {
    String url = HttpUrl.builder(this.serverUrl).addPathParameter("butler").build();
    Request request = new Request.Builder().url(url).delete().build();
    Response response = this.execute(request);

    try {
      return new ResponseWithHeaders<java.lang.String>(
        response.body().string(),
        response.headers()
      );
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * @summary Start a single Butler task
   * @param {String} taskName - the name of the task to be started.
   */
  public ResponseWithHeaders<String> startTask(String taskName) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("butler")
      .addPathParameter(String.valueOf(taskName))
      .build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(new BaseModel() {})),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).post(requestBody).build();
    Response response = this.execute(request);

    try {
      return new ResponseWithHeaders<java.lang.String>(
        response.body().string(),
        response.headers()
      );
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * @summary Stop a single Butler task
   * @param {String} taskName - The name of the task to be started.
   */
  public ResponseWithHeaders<String> stopTask(String taskName) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("butler")
      .addPathParameter(String.valueOf(taskName))
      .build();
    Request request = new Request.Builder().url(url).delete().build();
    Response response = this.execute(request);

    try {
      return new ResponseWithHeaders<java.lang.String>(
        response.body().string(),
        response.headers()
      );
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
