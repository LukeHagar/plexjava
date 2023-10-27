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

public class ServerService extends BaseService implements ServerClient {

  public ServerService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary Server Capabilities
   */
  public ResponseWithHeaders<
    com.plexsdk.models.GetServerCapabilitiesResponse
  > getServerCapabilities() throws ApiException {
    String url = HttpUrl.builder(this.serverUrl).build();
    Request request = new Request.Builder().url(url).get().build();
    Response response = this.execute(request);

    return new ResponseWithHeaders<com.plexsdk.models.GetServerCapabilitiesResponse>(
      ModelConverter.convert(
        response,
        new com.fasterxml.jackson.core.type.TypeReference<
          com.plexsdk.models.GetServerCapabilitiesResponse
        >() {}
      ),
      response.headers()
    );
  }

  /**
   * @summary Get Server Preferences
   */
  public ResponseWithHeaders<String> getServerPreferences() throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter(":")
      .addPathParameter("prefs")
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
   * @summary Get Available Clients
   */
  public ResponseWithHeaders<
    java.util.List<com.plexsdk.models.GetAvailableClientsResponse>
  > getAvailableClients() throws ApiException {
    String url = HttpUrl.builder(this.serverUrl).addPathParameter("clients").build();
    Request request = new Request.Builder().url(url).get().build();
    Response response = this.execute(request);

    return new ResponseWithHeaders<java.util.List<com.plexsdk.models.GetAvailableClientsResponse>>(
      ModelConverter.convert(
        response,
        new com.fasterxml.jackson.core.type.TypeReference<
          java.util.List<com.plexsdk.models.GetAvailableClientsResponse>
        >() {}
      ),
      response.headers()
    );
  }

  /**
   * @summary Get Devices
   */
  public ResponseWithHeaders<com.plexsdk.models.GetDevicesResponse> getDevices()
    throws ApiException {
    String url = HttpUrl.builder(this.serverUrl).addPathParameter("devices").build();
    Request request = new Request.Builder().url(url).get().build();
    Response response = this.execute(request);

    return new ResponseWithHeaders<com.plexsdk.models.GetDevicesResponse>(
      ModelConverter.convert(
        response,
        new com.fasterxml.jackson.core.type.TypeReference<
          com.plexsdk.models.GetDevicesResponse
        >() {}
      ),
      response.headers()
    );
  }

  /**
   * @summary Get Server Identity
   */
  public ResponseWithHeaders<com.plexsdk.models.GetServerIdentityResponse> getServerIdentity()
    throws ApiException {
    String url = HttpUrl.builder(this.serverUrl).addPathParameter("identity").build();
    Request request = new Request.Builder().url(url).get().build();
    Response response = this.execute(request);

    return new ResponseWithHeaders<com.plexsdk.models.GetServerIdentityResponse>(
      ModelConverter.convert(
        response,
        new com.fasterxml.jackson.core.type.TypeReference<
          com.plexsdk.models.GetServerIdentityResponse
        >() {}
      ),
      response.headers()
    );
  }

  /**
   * @summary Get MyPlex Account
   */
  public ResponseWithHeaders<com.plexsdk.models.GetMyPlexAccountResponse> getMyPlexAccount()
    throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("myplex")
      .addPathParameter("account")
      .build();
    Request request = new Request.Builder().url(url).get().build();
    Response response = this.execute(request);

    return new ResponseWithHeaders<com.plexsdk.models.GetMyPlexAccountResponse>(
      ModelConverter.convert(
        response,
        new com.fasterxml.jackson.core.type.TypeReference<
          com.plexsdk.models.GetMyPlexAccountResponse
        >() {}
      ),
      response.headers()
    );
  }

  /**
   * @summary Get a Resized Photo
   * @param {Number} width - The width for the resized photo
   * @param {Number} height - The height for the resized photo
   * @param {Integer} opacity - The opacity for the resized photo
   * @param {Number} blur - The width for the resized photo
   * @param {Number} minSize - images are always scaled proportionally. A value of '1' in minSize will make the smaller native dimension the dimension resized against.
   * @param {Number} upscale - allow images to be resized beyond native dimensions.
   * @param {String} url - path to image within Plex
   */
  public ResponseWithHeaders<String> getResizedPhoto(
    Float width,
    Float height,
    Integer opacity,
    Float blur,
    Float minSize,
    Float upscale,
    String url
  ) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
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
   * @summary Get Server List
   */
  public ResponseWithHeaders<com.plexsdk.models.GetServerListResponse> getServerList()
    throws ApiException {
    String url = HttpUrl.builder(this.serverUrl).addPathParameter("servers").build();
    Request request = new Request.Builder().url(url).get().build();
    Response response = this.execute(request);

    return new ResponseWithHeaders<com.plexsdk.models.GetServerListResponse>(
      ModelConverter.convert(
        response,
        new com.fasterxml.jackson.core.type.TypeReference<
          com.plexsdk.models.GetServerListResponse
        >() {}
      ),
      response.headers()
    );
  }
}
