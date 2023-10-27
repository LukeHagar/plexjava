package com.plexsdk.http;

import com.plexsdk.exceptions.ApiException;
import java.util.List;

public interface ServerClient {
  ResponseWithHeaders<com.plexsdk.models.GetServerCapabilitiesResponse> getServerCapabilities()
    throws ApiException;
  ResponseWithHeaders<String> getServerPreferences() throws ApiException;
  ResponseWithHeaders<
    java.util.List<com.plexsdk.models.GetAvailableClientsResponse>
  > getAvailableClients() throws ApiException;
  ResponseWithHeaders<com.plexsdk.models.GetDevicesResponse> getDevices() throws ApiException;
  ResponseWithHeaders<com.plexsdk.models.GetServerIdentityResponse> getServerIdentity()
    throws ApiException;
  ResponseWithHeaders<com.plexsdk.models.GetMyPlexAccountResponse> getMyPlexAccount()
    throws ApiException;
  ResponseWithHeaders<String> getResizedPhoto(
    Float width,
    Float height,
    Integer opacity,
    Float blur,
    Float minSize,
    Float upscale,
    String url
  ) throws ApiException;
  ResponseWithHeaders<com.plexsdk.models.GetServerListResponse> getServerList() throws ApiException;
}
