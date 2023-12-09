package 47.one0.services;

import java.util.Map;
import java.io.IOException;
import 47.one0.exceptions.ApiException;
import 47.one0.models.BaseModel;
import java.util.List;
import java.util.Objects;
import 47.one0.http.*;
import okhttp3.Headers;
import 47.one0.http.util.HttpUrl;
import 47.one0.http.util.HttpHeaders;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
public class UpdaterService extends BaseService implements UpdaterClient {
public UpdaterService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Querying status of updates 
   */
  public ResponseWithHeaders<String> getUpdateStatus() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("updater")
.addPathParameter("status")
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    try {
      return new ResponseWithHeaders<java.lang.String>(response.body().string(), response.headers());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
}
  /**
   * @summary Checking for updates 
   * @param {Integer} [download] - Indicate that you want to start download any updates found.
   */
  public ResponseWithHeaders<String> checkForUpdates(Integer download) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("updater")
.addPathParameter("check")
.addOptionalQueryParameter("download", download)
.build();
RequestBody requestBody = RequestBody.create(
          Objects.requireNonNull(ModelConverter.modelToJson(new BaseModel() {})),
          okhttp3.MediaType.parse("application/json; charset=utf-8")
        );
Request request = new Request.Builder().url(url)
.put(requestBody)
.build();
Response response = this.execute(request);

    try {
      return new ResponseWithHeaders<java.lang.String>(response.body().string(), response.headers());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
}
  /**
   * @summary Apply Updates 
   * @param {Integer} [tonight] - Indicate that you want the update to run during the next Butler execution. Omitting this or setting it to false indicates that the update should install
   * @param {Integer} [skip] - Indicate that the latest version should be marked as skipped. The <Release> entry for this version will have the `state` set to `skipped`.
   */
  public ResponseWithHeaders<String> applyUpdates(Integer tonight, Integer skip) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("updater")
.addPathParameter("apply")
.addOptionalQueryParameter("tonight", tonight)
.addOptionalQueryParameter("skip", skip)
.build();
RequestBody requestBody = RequestBody.create(
          Objects.requireNonNull(ModelConverter.modelToJson(new BaseModel() {})),
          okhttp3.MediaType.parse("application/json; charset=utf-8")
        );
Request request = new Request.Builder().url(url)
.put(requestBody)
.build();
Response response = this.execute(request);

    try {
      return new ResponseWithHeaders<java.lang.String>(response.body().string(), response.headers());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
}
}