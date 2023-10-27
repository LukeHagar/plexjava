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
public class ActivitiesService extends BaseService implements ActivitiesClient {
public ActivitiesService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Get Server Activities 
   */
  public ResponseWithHeaders<47.one0.models.GetServerActivitiesResponse> getServerActivities() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("activities")
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    return new ResponseWithHeaders<47.one0.models.GetServerActivitiesResponse>(ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<47.one0.models.GetServerActivitiesResponse>() {}), response.headers());
}
  /**
   * @summary Cancel Server Activities 
   * @param {String} activityUUID - The UUID of the activity to cancel.
   */
  public ResponseWithHeaders<String> cancelServerActivities(String activityUUID) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("activities")
.addPathParameter(String.valueOf(activityUUID))
.build();
Request request = new Request.Builder().url(url)
.delete()
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