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
public class HubsService extends BaseService implements HubsClient {
public HubsService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Get Global Hubs 
   * @param {Number} [count] - The number of items to return with each hub.
   * @param {Number} [onlyTransient] - Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added).
   */
  public ResponseWithHeaders<String> getGlobalHubs(Float count, Float onlyTransient) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("hubs")
.addOptionalQueryParameter("count", count)
.addOptionalQueryParameter("onlyTransient", onlyTransient)
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
   * @summary Get library specific hubs 
   * @param {Number} sectionId - the Id of the library to query
   * @param {Number} [count] - The number of items to return with each hub.
   * @param {Number} [onlyTransient] - Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added).
   */
  public ResponseWithHeaders<String> getLibraryHubs(Float sectionId, Float count, Float onlyTransient) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("hubs")
.addPathParameter("sections")
.addPathParameter(String.valueOf(sectionId))
.addOptionalQueryParameter("count", count)
.addOptionalQueryParameter("onlyTransient", onlyTransient)
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
}