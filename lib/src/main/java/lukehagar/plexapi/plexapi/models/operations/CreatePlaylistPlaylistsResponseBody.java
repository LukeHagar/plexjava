/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreatePlaylistPlaylistsResponseBody - Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
 */

public class CreatePlaylistPlaylistsResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    public CreatePlaylistErrors[] errors;

    public CreatePlaylistPlaylistsResponseBody withErrors(CreatePlaylistErrors[] errors) {
        this.errors = errors;
        return this;
    }
    
    public CreatePlaylistPlaylistsResponseBody(){}
}