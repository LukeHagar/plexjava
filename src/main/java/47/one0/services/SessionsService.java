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
public class SessionsService extends BaseService implements SessionsClient {
public SessionsService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Get Active Sessions 
   */
  public ResponseWithHeaders<String> getSessions() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("status")
.addPathParameter("sessions")
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
   * @summary Get Session History 
   */
  public ResponseWithHeaders<String> getSessionHistory() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("status")
.addPathParameter("sessions")
.addPathParameter("history")
.addPathParameter("all")
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
   * @summary Get Transcode Sessions 
   */
  public ResponseWithHeaders<47.one0.models.GetTranscodeSessionsResponse> getTranscodeSessions() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("transcode")
.addPathParameter("sessions")
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    return new ResponseWithHeaders<47.one0.models.GetTranscodeSessionsResponse>(ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<47.one0.models.GetTranscodeSessionsResponse>() {}), response.headers());
}
  /**
   * @summary Stop a Transcode Session 
   * @param {String} sessionKey - the Key of the transcode session to stop
   */
  public ResponseWithHeaders<String> stopTranscodeSession(String sessionKey) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("transcode")
.addPathParameter("sessions")
.addPathParameter(String.valueOf(sessionKey))
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