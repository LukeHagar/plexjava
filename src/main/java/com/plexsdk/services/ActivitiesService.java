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

public class ActivitiesService extends BaseService implements ActivitiesClient {

  public ActivitiesService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary Get Server Activities
   */
  public ResponseWithHeaders<com.plexsdk.models.GetServerActivitiesResponse> getServerActivities()
    throws ApiException {
    String url = HttpUrl.builder(this.serverUrl).addPathParameter("activities").build();
    Request request = new Request.Builder().url(url).get().build();
    Response response = this.execute(request);

    return new ResponseWithHeaders<com.plexsdk.models.GetServerActivitiesResponse>(
      ModelConverter.convert(
        response,
        new com.fasterxml.jackson.core.type.TypeReference<
          com.plexsdk.models.GetServerActivitiesResponse
        >() {}
      ),
      response.headers()
    );
  }

  /**
   * @summary Cancel Server Activities
   * @param {String} activityUUID - The UUID of the activity to cancel.
   */
  public ResponseWithHeaders<String> cancelServerActivities(String activityUUID)
    throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("activities")
      .addPathParameter(String.valueOf(activityUUID))
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
