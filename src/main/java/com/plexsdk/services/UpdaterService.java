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

public class UpdaterService extends BaseService implements UpdaterClient {

  public UpdaterService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary Querying status of updates
   */
  public ResponseWithHeaders<String> getUpdateStatus() throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("updater")
      .addPathParameter("status")
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
   * @summary Checking for updates
   * @param {Download} [download] - Indicate that you want to start download any updates found.
   */
  public ResponseWithHeaders<String> checkForUpdates(String download) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("updater")
      .addPathParameter("check")
      .addOptionalQueryParameter("download", download)
      .build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(new BaseModel() {})),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).put(requestBody).build();
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
   * @summary Apply Updates
   * @param {Tonight} [tonight] - Indicate that you want the update to run during the next Butler execution. Omitting this or setting it to false indicates that the update should install
   * @param {Skip} [skip] - Indicate that the latest version should be marked as skipped. The <Release> entry for this version will have the `state` set to `skipped`.
   */
  public ResponseWithHeaders<String> applyUpdates(String tonight, String skip) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("updater")
      .addPathParameter("apply")
      .addOptionalQueryParameter("tonight", tonight)
      .addOptionalQueryParameter("skip", skip)
      .build();
    RequestBody requestBody = RequestBody.create(
      Objects.requireNonNull(ModelConverter.modelToJson(new BaseModel() {})),
      okhttp3.MediaType.parse("application/json; charset=utf-8")
    );
    Request request = new Request.Builder().url(url).put(requestBody).build();
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
