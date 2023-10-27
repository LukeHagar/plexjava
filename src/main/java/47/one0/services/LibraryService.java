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
public class LibraryService extends BaseService implements LibraryClient {
public LibraryService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Get Hash Value 
   * @param {String} url - This is the path to the local file, must be prefixed by `file://`
   * @param {Number} [type] - Item type
   */
  public ResponseWithHeaders<String> getFileHash(String url, Float type) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("library")
.addPathParameter("hashes")
.addRequiredQueryParameter("url", url)
.addOptionalQueryParameter("type", type)
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
   * @summary Get Recently Added 
   */
  public ResponseWithHeaders<47.one0.models.GetRecentlyAddedResponse> getRecentlyAdded() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("library")
.addPathParameter("recentlyAdded")
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    return new ResponseWithHeaders<47.one0.models.GetRecentlyAddedResponse>(ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<47.one0.models.GetRecentlyAddedResponse>() {}), response.headers());
}
  /**
   * @summary Get All Libraries 
   */
  public ResponseWithHeaders<String> getLibraries() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("library")
.addPathParameter("sections")
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
   * @summary Get Library Details 
   * @param {Number} sectionId - the Id of the library to query
   * @param {Number} [includeDetails] - Whether or not to include details for a section (types, filters, and sorts). 
Only exists for backwards compatibility, media providers other than the server libraries have it on always.

   */
  public ResponseWithHeaders<String> getLibrary(Float sectionId, Float includeDetails) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("library")
.addPathParameter("sections")
.addPathParameter(String.valueOf(sectionId))
.addOptionalQueryParameter("includeDetails", includeDetails)
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
   * @summary Delete Library Section 
   * @param {Number} sectionId - the Id of the library to query
   */
  public ResponseWithHeaders<String> deleteLibrary(Float sectionId) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("library")
.addPathParameter("sections")
.addPathParameter(String.valueOf(sectionId))
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
  /**
   * @summary Get Library Items 
   * @param {Number} sectionId - the Id of the library to query
   * @param {Number} [type] - item type
   * @param {String} [filter] - the filter parameter
   */
  public ResponseWithHeaders<String> getLibraryItems(Float sectionId, Float type, String filter) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("library")
.addPathParameter("sections")
.addPathParameter(String.valueOf(sectionId))
.addPathParameter("all")
.addOptionalQueryParameter("type", type)
.addOptionalQueryParameter("filter", filter)
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
   * @summary Refresh Library 
   * @param {Number} sectionId - the Id of the library to refresh
   */
  public ResponseWithHeaders<String> refreshLibrary(Float sectionId) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("library")
.addPathParameter("sections")
.addPathParameter(String.valueOf(sectionId))
.addPathParameter("refresh")
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
   * @summary Get Latest Library Items 
   * @param {Number} sectionId - the Id of the library to query
   * @param {Number} type - item type
   * @param {String} [filter] - the filter parameter
   */
  public ResponseWithHeaders<String> getLatestLibraryItems(Float sectionId, Float type, String filter) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("library")
.addPathParameter("sections")
.addPathParameter(String.valueOf(sectionId))
.addPathParameter("latest")
.addRequiredQueryParameter("type", type)
.addOptionalQueryParameter("filter", filter)
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
   * @summary Get Common Library Items 
   * @param {Number} sectionId - the Id of the library to query
   * @param {Number} type - item type
   * @param {String} [filter] - the filter parameter
   */
  public ResponseWithHeaders<String> getCommonLibraryItems(Float sectionId, Float type, String filter) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("library")
.addPathParameter("sections")
.addPathParameter(String.valueOf(sectionId))
.addPathParameter("common")
.addRequiredQueryParameter("type", type)
.addOptionalQueryParameter("filter", filter)
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
   * @summary Get Items Metadata 
   * @param {Number} ratingKey - the id of the library item to return the children of.
   */
  public ResponseWithHeaders<String> getMetadata(Float ratingKey) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("library")
.addPathParameter("metadata")
.addPathParameter(String.valueOf(ratingKey))
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
   * @summary Get Items Children 
   * @param {Number} ratingKey - the id of the library item to return the children of.
   */
  public ResponseWithHeaders<String> getMetadataChildren(Float ratingKey) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("library")
.addPathParameter("metadata")
.addPathParameter(String.valueOf(ratingKey))
.addPathParameter("children")
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
   * @summary Get On Deck 
   */
  public ResponseWithHeaders<47.one0.models.GetOnDeckResponse> getOnDeck() throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("library")
.addPathParameter("onDeck")
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    return new ResponseWithHeaders<47.one0.models.GetOnDeckResponse>(ModelConverter.convert(response, new com.fasterxml.jackson.core.type.TypeReference<47.one0.models.GetOnDeckResponse>() {}), response.headers());
}
}