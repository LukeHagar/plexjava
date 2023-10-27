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
public class LogService extends BaseService implements LogClient {
public LogService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Logging a single line message. 
   * @param {Number} level - An integer log level to write to the PMS log with.  
0: Error  
1: Warning  
2: Info 
3: Debug  
4: Verbose

   * @param {String} message - The text of the message to write to the log.
   * @param {String} source - a string indicating the source of the message.
   */
  public ResponseWithHeaders<String> logLine(Float level, String message, String source) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("log")
.addRequiredQueryParameter("level", level)
.addRequiredQueryParameter("message", message)
.addRequiredQueryParameter("source", source)
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
   * @summary Logging a multi-line message 
   */
  public ResponseWithHeaders<String> logMultiLine() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("log")
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
  /**
   * @summary Enabling Papertrail 
   */
  public ResponseWithHeaders<String> enablePaperTrail() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("log")
.addPathParameter("networked")
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