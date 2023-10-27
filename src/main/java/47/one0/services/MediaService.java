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
public class MediaService extends BaseService implements MediaClient {
public MediaService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Mark Media Played 
   * @param {Number} key - The media key to mark as played
   */
  public ResponseWithHeaders<String> markPlayed(Float key) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter(":")
.addPathParameter("scrobble")
.addRequiredQueryParameter("key", key)
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
   * @summary Mark Media Unplayed 
   * @param {Number} key - The media key to mark as Unplayed
   */
  public ResponseWithHeaders<String> markUnplayed(Float key) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter(":")
.addPathParameter("unscrobble")
.addRequiredQueryParameter("key", key)
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
   * @summary Update Media Play Progress 
   * @param {String} key - the media key
   * @param {Number} time - The time, in milliseconds, used to set the media playback progress.
   * @param {String} state - The playback state of the media item.
   */
  public ResponseWithHeaders<String> updatePlayProgress(String key, Float time, String state) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter(":")
.addPathParameter("progress")
.addRequiredQueryParameter("key", key)
.addRequiredQueryParameter("time", time)
.addRequiredQueryParameter("state", state)
.build();
RequestBody requestBody = RequestBody.create(
          Objects.requireNonNull(ModelConverter.modelToJson(new BaseModel() {})),
          okhttp3.MediaType.parse("application/json; charset=utf-8")
        );
Request request = new Request.Builder().url(url)
.post(requestBody)
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