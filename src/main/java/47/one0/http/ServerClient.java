package 47.one0.http;

import java.util.List;

import 47.one0.exceptions.ApiException;

public interface ServerClient {

   ResponseWithHeaders<47.one0.models.GetServerCapabilitiesResponse> getServerCapabilities() throws ApiException;
   ResponseWithHeaders<String> getServerPreferences() throws ApiException;
   ResponseWithHeaders<java.util.List<47.one0.models.GetAvailableClientsResponse>> getAvailableClients() throws ApiException;
   ResponseWithHeaders<47.one0.models.GetDevicesResponse> getDevices() throws ApiException;
   ResponseWithHeaders<47.one0.models.GetServerIdentityResponse> getServerIdentity() throws ApiException;
   ResponseWithHeaders<47.one0.models.GetMyPlexAccountResponse> getMyPlexAccount() throws ApiException;
   ResponseWithHeaders<String> getResizedPhoto(Float width, Float height, Integer opacity, Float blur, Integer minSize, Integer upscale, String url) throws ApiException;
   ResponseWithHeaders<47.one0.models.GetServerListResponse> getServerList() throws ApiException;


}