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

public class SecurityService extends BaseService implements SecurityClient {

  public SecurityService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary Get a Transient Token.
   * @param {String} type - `delegation` - This is the only supported `type` parameter.
   * @param {String} scope - `all` - This is the only supported `scope` parameter.
   */
  public ResponseWithHeaders<String> getTransientToken(String type, String scope)
    throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("security")
      .addPathParameter("token")
      .addRequiredQueryParameter("type", type)
      .addRequiredQueryParameter("scope", scope)
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
   * @summary Get Source Connection Information
   * @param {String} source - The source identifier with an included prefix.
   */
  public ResponseWithHeaders<String> getSourceConnectionInformation(String source)
    throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("security")
      .addPathParameter("resources")
      .addRequiredQueryParameter("source", source)
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
}
