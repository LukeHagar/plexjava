/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdatePlaylistResponseBody - Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
 */

public class UpdatePlaylistResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    public UpdatePlaylistErrors[] errors;

    public UpdatePlaylistResponseBody withErrors(UpdatePlaylistErrors[] errors) {
        this.errors = errors;
        return this;
    }
    
    public UpdatePlaylistResponseBody(){}
}
