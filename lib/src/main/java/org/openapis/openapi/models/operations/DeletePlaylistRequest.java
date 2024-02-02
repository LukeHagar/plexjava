/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class DeletePlaylistRequest {
    /**
     * the ID of the playlist
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=playlistID")
    public Double playlistID;

    public DeletePlaylistRequest withPlaylistID(Double playlistID) {
        this.playlistID = playlistID;
        return this;
    }
    
    public DeletePlaylistRequest(@JsonProperty("playlistID") Double playlistID) {
        this.playlistID = playlistID;
  }
}
