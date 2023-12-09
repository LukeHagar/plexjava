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
public class ServerService extends BaseService implements ServerClient {
public ServerService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Server Capabilities 
   */
  public ResponseWithHeaders<47.one0.models.GetServerCapabilitiesResponse> getServerCapabilities() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    return new ResponseWithHeaders<47.one0.models.GetServerCapabilitiesResponse>(ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<47.one0.models.GetServerCapabilitiesResponse>() {}), response.headers());
}
  /**
   * @summary Get Server Preferences 
   */
  public ResponseWithHeaders<String> getServerPreferences() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter(":")
.addPathParameter("prefs")
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
   * @summary Get Available Clients 
   */
  public ResponseWithHeaders<java.util.List<47.one0.models.GetAvailableClientsResponse>> getAvailableClients() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("clients")
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    return new ResponseWithHeaders<java.util.List<47.one0.models.GetAvailableClientsResponse>>(ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<java.util.List<47.one0.models.GetAvailableClientsResponse>>() {}), response.headers());
}
  /**
   * @summary Get Devices 
   */
  public ResponseWithHeaders<47.one0.models.GetDevicesResponse> getDevices() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("devices")
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    return new ResponseWithHeaders<47.one0.models.GetDevicesResponse>(ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<47.one0.models.GetDevicesResponse>() {}), response.headers());
}
  /**
   * @summary Get Server Identity 
   */
  public ResponseWithHeaders<47.one0.models.GetServerIdentityResponse> getServerIdentity() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("identity")
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    return new ResponseWithHeaders<47.one0.models.GetServerIdentityResponse>(ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<47.one0.models.GetServerIdentityResponse>() {}), response.headers());
}
  /**
   * @summary Get MyPlex Account 
   */
  public ResponseWithHeaders<47.one0.models.GetMyPlexAccountResponse> getMyPlexAccount() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("myplex")
.addPathParameter("account")
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    return new ResponseWithHeaders<47.one0.models.GetMyPlexAccountResponse>(ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<47.one0.models.GetMyPlexAccountResponse>() {}), response.headers());
}
  /**
   * @summary Get a Resized Photo 
   * @param {Number} width - The width for the resized photo
   * @param {Number} height - The height for the resized photo
   * @param {Integer} opacity - The opacity for the resized photo
   * @param {Number} blur - The width for the resized photo
   * @param {Integer} minSize - images are always scaled proportionally. A value of '1' in minSize will make the smaller native dimension the dimension resized against.
   * @param {Integer} upscale - allow images to be resized beyond native dimensions.
   * @param {String} url - path to image within Plex
   */
  public ResponseWithHeaders<String> getResizedPhoto(Float width, Float height, Integer opacity, Float blur, Integer minSize, Integer upscale, String url) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("photo")
.addPathParameter(":")
.addPathParameter("transcode")
.addRequiredQueryParameter("width", width)
.addRequiredQueryParameter("height", height)
.addRequiredQueryParameter("opacity", opacity)
.addRequiredQueryParameter("blur", blur)
.addRequiredQueryParameter("minSize", minSize)
.addRequiredQueryParameter("upscale", upscale)
.addRequiredQueryParameter("url", url)
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
   * @summary Get Server List 
   */
  public ResponseWithHeaders<47.one0.models.GetServerListResponse> getServerList() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("servers")
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    return new ResponseWithHeaders<47.one0.models.GetServerListResponse>(ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<47.one0.models.GetServerListResponse>() {}), response.headers());
}
}