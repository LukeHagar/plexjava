/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.JSON;

/**
 * Playlists are ordered collections of media. They can be dumb (just a list of media) or smart (based on a media query, such as "all albums from 2017"). 
 * They can be organized in (optionally nesting) folders.
 * Retrieving a playlist, or its items, will trigger a refresh of its metadata. 
 * This may cause the duration and number of items to change.
 * 
 */
public class Playlists {
	
	private SDKConfiguration sdkConfiguration;

	public Playlists(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create a Playlist
     * Create a new playlist. By default the playlist is blank. To create a playlist along with a first item, pass:
     * - `uri` - The content URI for what we're playing (e.g. `library://...`).
     * - `playQueueID` - To create a playlist from an existing play queue.
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.CreatePlaylistResponse createPlaylist(org.openapis.openapi.models.operations.CreatePlaylistRequest request) throws Exception {
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/playlists");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.CreatePlaylistRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.CreatePlaylistResponse res = new org.openapis.openapi.models.operations.CreatePlaylistResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.CreatePlaylistResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.CreatePlaylistResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Get All Playlists
     * Get All Playlists given the specified filters.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetPlaylistsResponse getPlaylists() throws Exception {
        return this.getPlaylists(null, null);
    }

    /**
     * Get All Playlists
     * Get All Playlists given the specified filters.
     * @param smart type of playlists to return (default is all).
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetPlaylistsResponse getPlaylists(org.openapis.openapi.models.operations.QueryParamSmart smart) throws Exception {
        return this.getPlaylists(null, smart);
    }

    /**
     * Get All Playlists
     * Get All Playlists given the specified filters.
     * @param playlistType limit to a type of playlist.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetPlaylistsResponse getPlaylists(org.openapis.openapi.models.operations.PlaylistType playlistType) throws Exception {
        return this.getPlaylists(playlistType, null);
    }

    /**
     * Get All Playlists
     * Get All Playlists given the specified filters.
     * @param playlistType limit to a type of playlist.
     * @param smart type of playlists to return (default is all).
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetPlaylistsResponse getPlaylists(org.openapis.openapi.models.operations.PlaylistType playlistType, org.openapis.openapi.models.operations.QueryParamSmart smart) throws Exception {
        org.openapis.openapi.models.operations.GetPlaylistsRequest request = new org.openapis.openapi.models.operations.GetPlaylistsRequest();
        request.playlistType=playlistType;
        request.smart=smart;
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/playlists/all");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.GetPlaylistsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.GetPlaylistsResponse res = new org.openapis.openapi.models.operations.GetPlaylistsResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.GetPlaylistsResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.GetPlaylistsResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Retrieve Playlist
     * Gets detailed metadata for a playlist. A playlist for many purposes (rating, editing metadata, tagging), can be treated like a regular metadata item:
     * Smart playlist details contain the `content` attribute. This is the content URI for the generator. This can then be parsed by a client to provide smart playlist editing.
     * 
     * @param playlistID the ID of the playlist
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetPlaylistResponse getPlaylist(Double playlistID) throws Exception {
        org.openapis.openapi.models.operations.GetPlaylistRequest request = new org.openapis.openapi.models.operations.GetPlaylistRequest(playlistID);
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.GetPlaylistRequest.class, baseUrl, "/playlists/{playlistID}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.GetPlaylistResponse res = new org.openapis.openapi.models.operations.GetPlaylistResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.GetPlaylistResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.GetPlaylistResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Deletes a Playlist
     * This endpoint will delete a playlist
     * 
     * @param playlistID the ID of the playlist
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.DeletePlaylistResponse deletePlaylist(Double playlistID) throws Exception {
        org.openapis.openapi.models.operations.DeletePlaylistRequest request = new org.openapis.openapi.models.operations.DeletePlaylistRequest(playlistID);
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.DeletePlaylistRequest.class, baseUrl, "/playlists/{playlistID}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.DeletePlaylistResponse res = new org.openapis.openapi.models.operations.DeletePlaylistResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.DeletePlaylistResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.DeletePlaylistResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Update a Playlist
     * From PMS version 1.9.1 clients can also edit playlist metadata using this endpoint as they would via `PUT /library/metadata/{playlistID}`
     * 
     * @param playlistID the ID of the playlist
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.UpdatePlaylistResponse updatePlaylist(Double playlistID) throws Exception {
        org.openapis.openapi.models.operations.UpdatePlaylistRequest request = new org.openapis.openapi.models.operations.UpdatePlaylistRequest(playlistID);
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.UpdatePlaylistRequest.class, baseUrl, "/playlists/{playlistID}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.UpdatePlaylistResponse res = new org.openapis.openapi.models.operations.UpdatePlaylistResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.UpdatePlaylistResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.UpdatePlaylistResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Retrieve Playlist Contents
     * Gets the contents of a playlist. Should be paged by clients via standard mechanisms. 
     * By default leaves are returned (e.g. episodes, movies). In order to return other types you can use the `type` parameter. 
     * For example, you could use this to display a list of recently added albums vis a smart playlist. 
     * Note that for dumb playlists, items have a `playlistItemID` attribute which is used for deleting or moving items.
     * 
     * @param playlistID the ID of the playlist
     * @param type the metadata type of the item to return
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetPlaylistContentsResponse getPlaylistContents(Double playlistID, Double type) throws Exception {
        org.openapis.openapi.models.operations.GetPlaylistContentsRequest request = new org.openapis.openapi.models.operations.GetPlaylistContentsRequest(playlistID, type);
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.GetPlaylistContentsRequest.class, baseUrl, "/playlists/{playlistID}/items", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.GetPlaylistContentsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.GetPlaylistContentsResponse res = new org.openapis.openapi.models.operations.GetPlaylistContentsResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.GetPlaylistContentsResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.GetPlaylistContentsResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Delete Playlist Contents
     * Clears a playlist, only works with dumb playlists. Returns the playlist.
     * 
     * @param playlistID the ID of the playlist
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.ClearPlaylistContentsResponse clearPlaylistContents(Double playlistID) throws Exception {
        org.openapis.openapi.models.operations.ClearPlaylistContentsRequest request = new org.openapis.openapi.models.operations.ClearPlaylistContentsRequest(playlistID);
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.ClearPlaylistContentsRequest.class, baseUrl, "/playlists/{playlistID}/items", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.ClearPlaylistContentsResponse res = new org.openapis.openapi.models.operations.ClearPlaylistContentsResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.ClearPlaylistContentsResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.ClearPlaylistContentsResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Adding to a Playlist
     * Adds a generator to a playlist, same parameters as the POST above. With a dumb playlist, this adds the specified items to the playlist. 
     * With a smart playlist, passing a new `uri` parameter replaces the rules for the playlist. Returns the playlist.
     * 
     * @param playlistID the ID of the playlist
     * @param uri the content URI for the playlist
     * @param playQueueID the play queue to add to a playlist
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.AddPlaylistContentsResponse addPlaylistContents(Double playlistID, String uri, Double playQueueID) throws Exception {
        org.openapis.openapi.models.operations.AddPlaylistContentsRequest request = new org.openapis.openapi.models.operations.AddPlaylistContentsRequest(playlistID, uri, playQueueID);
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.AddPlaylistContentsRequest.class, baseUrl, "/playlists/{playlistID}/items", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.AddPlaylistContentsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.AddPlaylistContentsResponse res = new org.openapis.openapi.models.operations.AddPlaylistContentsResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.AddPlaylistContentsResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.AddPlaylistContentsResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Upload Playlist
     * Imports m3u playlists by passing a path on the server to scan for m3u-formatted playlist files, or a path to a single playlist file.
     * 
     * @param path absolute path to a directory on the server where m3u files are stored, or the absolute path to a playlist file on the server. 
    If the `path` argument is a directory, that path will be scanned for playlist files to be processed. 
    Each file in that directory creates a separate playlist, with a name based on the filename of the file that created it. 
    The GUID of each playlist is based on the filename. 
    If the `path` argument is a file, that file will be used to create a new playlist, with the name based on the filename of the file that created it. 
    The GUID of each playlist is based on the filename.

     * @param force force overwriting of duplicate playlists. By default, a playlist file uploaded with the same path will overwrite the existing playlist. 
    The `force` argument is used to disable overwriting. If the `force` argument is set to 0, a new playlist will be created suffixed with the date and time that the duplicate was uploaded.

     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.UploadPlaylistResponse uploadPlaylist(String path, org.openapis.openapi.models.operations.Force force) throws Exception {
        org.openapis.openapi.models.operations.UploadPlaylistRequest request = new org.openapis.openapi.models.operations.UploadPlaylistRequest(path, force);
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/playlists/upload");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.UploadPlaylistRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.UploadPlaylistResponse res = new org.openapis.openapi.models.operations.UploadPlaylistResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.UploadPlaylistResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.UploadPlaylistResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }
}