package 47.one0.http;

import java.util.List;

import 47.one0.exceptions.ApiException;

public interface PlaylistsClient {

   ResponseWithHeaders<String> createPlaylist(String title, String type, Integer smart, String uri, Float playQueueID) throws ApiException;
   ResponseWithHeaders<String> getPlaylists(String playlistType, Integer smart) throws ApiException;
   ResponseWithHeaders<String> getPlaylist(Float playlistID) throws ApiException;
   ResponseWithHeaders<String> updatePlaylist(Float playlistID) throws ApiException;
   ResponseWithHeaders<String> deletePlaylist(Float playlistID) throws ApiException;
   ResponseWithHeaders<String> getPlaylistContents(Float playlistID, Float type) throws ApiException;
   ResponseWithHeaders<String> addPlaylistContents(Float playlistID, String uri, Float playQueueID) throws ApiException;
   ResponseWithHeaders<String> clearPlaylistContents(Float playlistID) throws ApiException;
   ResponseWithHeaders<String> uploadPlaylist(String path, Integer force) throws ApiException;


}