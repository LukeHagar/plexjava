package com.plexsdk.http;

import com.plexsdk.exceptions.ApiException;
import java.util.List;

public interface PlaylistsClient {
  ResponseWithHeaders<String> createPlaylist(
    String title,
    String type,
    Float smart,
    String uri,
    Float playQueueID
  ) throws ApiException;
  ResponseWithHeaders<String> getPlaylists(String playlistType, Float smart) throws ApiException;
  ResponseWithHeaders<String> getPlaylist(Float playlistID) throws ApiException;
  ResponseWithHeaders<String> updatePlaylist(Float playlistID) throws ApiException;
  ResponseWithHeaders<String> deletePlaylist(Float playlistID) throws ApiException;
  ResponseWithHeaders<String> getPlaylistContents(Float playlistID, Float type) throws ApiException;
  ResponseWithHeaders<String> addPlaylistContents(Float playlistID, String uri, Float playQueueID)
    throws ApiException;
  ResponseWithHeaders<String> clearPlaylistContents(Float playlistID) throws ApiException;
  ResponseWithHeaders<String> uploadPlaylist(String path, Float force) throws ApiException;
}
