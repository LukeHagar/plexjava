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

public class SessionsService extends BaseService implements SessionsClient {

  public SessionsService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary Get Active Sessions
   */
  public ResponseWithHeaders<String> getSessions() throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("status")
      .addPathParameter("sessions")
      .build();
    Request request = new Request.Builder().url(url).get().build();
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
   * @summary Get Session History
   */
  public ResponseWithHeaders<String> getSessionHistory() throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("status")
      .addPathParameter("sessions")
      .addPathParameter("history")
      .addPathParameter("all")
      .build();
    Request request = new Request.Builder().url(url).get().build();
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
   * @summary Get Transcode Sessions
   */
  public ResponseWithHeaders<
    com.plexsdk.models.GetTranscodeSessionsResponse
  > getTranscodeSessions() throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("transcode")
      .addPathParameter("sessions")
      .build();
    Request request = new Request.Builder().url(url).get().build();
    Response response = this.execute(request);

    return new ResponseWithHeaders<com.plexsdk.models.GetTranscodeSessionsResponse>(
      ModelConverter.convert(
        response,
        new com.fasterxml.jackson.core.type.TypeReference<
          com.plexsdk.models.GetTranscodeSessionsResponse
        >() {}
      ),
      response.headers()
    );
  }

  /**
   * @summary Stop a Transcode Session
   * @param {String} sessionKey - the Key of the transcode session to stop
   */
  public ResponseWithHeaders<String> stopTranscodeSession(String sessionKey) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("transcode")
      .addPathParameter("sessions")
      .addPathParameter(String.valueOf(sessionKey))
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
