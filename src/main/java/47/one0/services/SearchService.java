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
public class SearchService extends BaseService implements SearchClient {
public SearchService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Perform a search 
   * @param {String} query - The query term
   * @param {Number} [sectionId] - This gives context to the search, and can result in re-ordering of search result hubs
   * @param {Number} [limit] - The number of items to return per hub
   */
  public ResponseWithHeaders<String> performSearch(String query, Float sectionId, Float limit) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("hubs")
.addPathParameter("search")
.addRequiredQueryParameter("query", query)
.addOptionalQueryParameter("sectionId", sectionId)
.addOptionalQueryParameter("limit", limit)
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
   * @summary Perform a voice search 
   * @param {String} query - The query term
   * @param {Number} [sectionId] - This gives context to the search, and can result in re-ordering of search result hubs
   * @param {Number} [limit] - The number of items to return per hub
   */
  public ResponseWithHeaders<String> performVoiceSearch(String query, Float sectionId, Float limit) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("hubs")
.addPathParameter("search")
.addPathParameter("voice")
.addRequiredQueryParameter("query", query)
.addOptionalQueryParameter("sectionId", sectionId)
.addOptionalQueryParameter("limit", limit)
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
   * @summary Get Search Results 
   * @param {String} query - The search query string to use
   */
  public ResponseWithHeaders<47.one0.models.GetSearchResultsResponse> getSearchResults(String query) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("search")
.addRequiredQueryParameter("query", query)
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    return new ResponseWithHeaders<47.one0.models.GetSearchResultsResponse>(ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<47.one0.models.GetSearchResultsResponse>() {}), response.headers());
}
}