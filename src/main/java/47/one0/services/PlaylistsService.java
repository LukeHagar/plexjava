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
public class PlaylistsService extends BaseService implements PlaylistsClient {
public PlaylistsService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Create a Playlist 
   * @param {String} title - name of the playlist
   * @param {String} type - type of playlist to create
   * @param {Integer} smart - whether the playlist is smart or not
   * @param {String} [uri] - the content URI for the playlist
   * @param {Number} [playQueueID] - the play queue to copy to a playlist
   */
  public ResponseWithHeaders<String> createPlaylist(String title, String type, Integer smart, String uri, Float playQueueID) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("playlists")
.addRequiredQueryParameter("title", title)
.addRequiredQueryParameter("type", type)
.addRequiredQueryParameter("smart", smart)
.addOptionalQueryParameter("uri", uri)
.addOptionalQueryParameter("playQueueID", playQueueID)
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
   * @summary Get All Playlists 
   * @param {String} [playlistType] - limit to a type of playlist.
   * @param {Integer} [smart] - type of playlists to return (default is all).
   */
  public ResponseWithHeaders<String> getPlaylists(String playlistType, Integer smart) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("playlists")
.addPathParameter("all")
.addOptionalQueryParameter("playlistType", playlistType)
.addOptionalQueryParameter("smart", smart)
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
   * @summary Retrieve Playlist 
   * @param {Number} playlistID - the ID of the playlist
   */
  public ResponseWithHeaders<String> getPlaylist(Float playlistID) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("playlists")
.addPathParameter(String.valueOf(playlistID))
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
   * @summary Update a Playlist 
   * @param {Number} playlistID - the ID of the playlist
   */
  public ResponseWithHeaders<String> updatePlaylist(Float playlistID) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("playlists")
.addPathParameter(String.valueOf(playlistID))
.build();
RequestBody requestBody = RequestBody.create(
          Objects.requireNonNull(ModelConverter.modelToJson(new BaseModel() {})),
          okhttp3.MediaType.parse("application/json; charset=utf-8")
        );
Request request = new Request.Builder().url(url)
.put(requestBody)
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
   * @summary Deletes a Playlist 
   * @param {Number} playlistID - the ID of the playlist
   */
  public ResponseWithHeaders<String> deletePlaylist(Float playlistID) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("playlists")
.addPathParameter(String.valueOf(playlistID))
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
   * @summary Retrieve Playlist Contents 
   * @param {Number} playlistID - the ID of the playlist
   * @param {Number} type - the metadata type of the item to return
   */
  public ResponseWithHeaders<String> getPlaylistContents(Float playlistID, Float type) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("playlists")
.addPathParameter(String.valueOf(playlistID))
.addPathParameter("items")
.addRequiredQueryParameter("type", type)
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
   * @summary Adding to a Playlist 
   * @param {Number} playlistID - the ID of the playlist
   * @param {String} uri - the content URI for the playlist
   * @param {Number} playQueueID - the play queue to add to a playlist
   */
  public ResponseWithHeaders<String> addPlaylistContents(Float playlistID, String uri, Float playQueueID) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("playlists")
.addPathParameter(String.valueOf(playlistID))
.addPathParameter("items")
.addRequiredQueryParameter("uri", uri)
.addRequiredQueryParameter("playQueueID", playQueueID)
.build();
RequestBody requestBody = RequestBody.create(
          Objects.requireNonNull(ModelConverter.modelToJson(new BaseModel() {})),
          okhttp3.MediaType.parse("application/json; charset=utf-8")
        );
Request request = new Request.Builder().url(url)
.put(requestBody)
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
   * @summary Delete Playlist Contents 
   * @param {Number} playlistID - the ID of the playlist
   */
  public ResponseWithHeaders<String> clearPlaylistContents(Float playlistID) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("playlists")
.addPathParameter(String.valueOf(playlistID))
.addPathParameter("items")
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
   * @summary Upload Playlist 
   * @param {String} path - absolute path to a directory on the server where m3u files are stored, or the absolute path to a playlist file on the server. 
If the `path` argument is a directory, that path will be scanned for playlist files to be processed. 
Each file in that directory creates a separate playlist, with a name based on the filename of the file that created it. 
The GUID of each playlist is based on the filename. 
If the `path` argument is a file, that file will be used to create a new playlist, with the name based on the filename of the file that created it. 
The GUID of each playlist is based on the filename.

   * @param {Integer} force - force overwriting of duplicate playlists. By default, a playlist file uploaded with the same path will overwrite the existing playlist. 
The `force` argument is used to disable overwriting. If the `force` argument is set to 0, a new playlist will be created suffixed with the date and time that the duplicate was uploaded.

   */
  public ResponseWithHeaders<String> uploadPlaylist(String path, Integer force) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("playlists")
.addPathParameter("upload")
.addRequiredQueryParameter("path", path)
.addRequiredQueryParameter("force", force)
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
}