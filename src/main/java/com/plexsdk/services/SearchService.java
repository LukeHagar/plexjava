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

public class SearchService extends BaseService implements SearchClient {

  public SearchService(OkHttpClient httpClient, String serverUrl) {
    super(httpClient, serverUrl);
  }

  /**
   * @summary Perform a search
   * @param {String} query - The query term
   * @param {Number} [sectionId] - This gives context to the search, and can result in re-ordering of search result hubs
   * @param {Number} [limit] - The number of items to return per hub
   */
  public ResponseWithHeaders<String> performSearch(String query, Float sectionId, Float limit)
    throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("hubs")
      .addPathParameter("search")
      .addRequiredQueryParameter("query", query)
      .addOptionalQueryParameter("sectionId", sectionId)
      .addOptionalQueryParameter("limit", limit)
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
   * @summary Perform a voice search
   * @param {String} query - The query term
   * @param {Number} [sectionId] - This gives context to the search, and can result in re-ordering of search result hubs
   * @param {Number} [limit] - The number of items to return per hub
   */
  public ResponseWithHeaders<String> performVoiceSearch(String query, Float sectionId, Float limit)
    throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("hubs")
      .addPathParameter("search")
      .addPathParameter("voice")
      .addRequiredQueryParameter("query", query)
      .addOptionalQueryParameter("sectionId", sectionId)
      .addOptionalQueryParameter("limit", limit)
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
   * @summary Get Search Results
   * @param {String} query - The search query string to use
   */
  public ResponseWithHeaders<com.plexsdk.models.GetSearchResultsResponse> getSearchResults(
    String query
  ) throws ApiException {
    String url = HttpUrl
      .builder(this.serverUrl)
      .addPathParameter("search")
      .addRequiredQueryParameter("query", query)
      .build();
    Request request = new Request.Builder().url(url).get().build();
    Response response = this.execute(request);

    return new ResponseWithHeaders<com.plexsdk.models.GetSearchResultsResponse>(
      ModelConverter.convert(
        response,
        new com.fasterxml.jackson.core.type.TypeReference<
          com.plexsdk.models.GetSearchResultsResponse
        >() {}
      ),
      response.headers()
    );
  }
}
