/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPlaylistsResponseBody - returns all playlists
 */

public class GetPlaylistsResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MediaContainer")
    public GetPlaylistsMediaContainer mediaContainer;

    public GetPlaylistsResponseBody withMediaContainer(GetPlaylistsMediaContainer mediaContainer) {
        this.mediaContainer = mediaContainer;
        return this;
    }
    
    public GetPlaylistsResponseBody(){}
}
