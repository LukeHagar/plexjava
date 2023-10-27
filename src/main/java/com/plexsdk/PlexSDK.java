package com.plexsdk;

import com.plexsdk.Environment;
import com.plexsdk.http.interceptors.ApiKeyInterceptor;
import com.plexsdk.http.interceptors.DefaultHeadersInterceptor;
import com.plexsdk.http.interceptors.RetryInterceptor;
import com.plexsdk.services.*;
import java.util.Map;
import okhttp3.OkHttpClient;

public class PlexSDK {

  public ActivitiesService activitiesService;
  public ButlerService butlerService;
  public HubsService hubsService;
  public LibraryService libraryService;
  public LogService logService;
  public MediaService mediaService;
  public PlaylistsService playlistsService;
  public SearchService searchService;
  public SecurityService securityService;
  public ServerService serverService;
  public SessionsService sessionsService;
  public UpdaterService updaterService;
  public VideoService videoService;

  private final ApiKeyInterceptor apiKeyInterceptor = new ApiKeyInterceptor();

  public PlexSDK() {
    final String serverUrl = Environment.DEFAULT.getUrl();
    final OkHttpClient httpClient = new OkHttpClient.Builder()
      .addInterceptor(new DefaultHeadersInterceptor())
      .addInterceptor(new RetryInterceptor())
      .addInterceptor(apiKeyInterceptor)
      .build();

    this.activitiesService = new ActivitiesService(httpClient, serverUrl);
    this.butlerService = new ButlerService(httpClient, serverUrl);
    this.hubsService = new HubsService(httpClient, serverUrl);
    this.libraryService = new LibraryService(httpClient, serverUrl);
    this.logService = new LogService(httpClient, serverUrl);
    this.mediaService = new MediaService(httpClient, serverUrl);
    this.playlistsService = new PlaylistsService(httpClient, serverUrl);
    this.searchService = new SearchService(httpClient, serverUrl);
    this.securityService = new SecurityService(httpClient, serverUrl);
    this.serverService = new ServerService(httpClient, serverUrl);
    this.sessionsService = new SessionsService(httpClient, serverUrl);
    this.updaterService = new UpdaterService(httpClient, serverUrl);
    this.videoService = new VideoService(httpClient, serverUrl);
  }

  public PlexSDK(String apiKey) {
    this(apiKey, null);
  }

  public PlexSDK(String apiKey, String apiKeyHeader) {
    this();
    setApiKey(apiKey);
    setApiKeyHeader(apiKeyHeader);
  }

  public void setBaseUrl(String url) {
    this.activitiesService.setBaseUrl(url);
    this.butlerService.setBaseUrl(url);
    this.hubsService.setBaseUrl(url);
    this.libraryService.setBaseUrl(url);
    this.logService.setBaseUrl(url);
    this.mediaService.setBaseUrl(url);
    this.playlistsService.setBaseUrl(url);
    this.searchService.setBaseUrl(url);
    this.securityService.setBaseUrl(url);
    this.serverService.setBaseUrl(url);
    this.sessionsService.setBaseUrl(url);
    this.updaterService.setBaseUrl(url);
    this.videoService.setBaseUrl(url);
  }

  public void setApiKey(String apiKey) {
    this.apiKeyInterceptor.setApiKey(apiKey);
  }

  public void setApiKeyHeader(String apiKeyHeader) {
    this.apiKeyInterceptor.setApiKeyHeader(apiKeyHeader);
  }
}
