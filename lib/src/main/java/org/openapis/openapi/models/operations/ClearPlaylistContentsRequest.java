/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class ClearPlaylistContentsRequest {
    /**
     * the ID of the playlist
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=playlistID")
    public Double playlistID;

    public ClearPlaylistContentsRequest withPlaylistID(Double playlistID) {
        this.playlistID = playlistID;
        return this;
    }
    
    public ClearPlaylistContentsRequest(@JsonProperty("playlistID") Double playlistID) {
        this.playlistID = playlistID;
  }
}
