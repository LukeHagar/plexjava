/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetRecentlyAddedResponseBody - The recently added content
 */

public class GetRecentlyAddedResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MediaContainer")
    public GetRecentlyAddedMediaContainer mediaContainer;

    public GetRecentlyAddedResponseBody withMediaContainer(GetRecentlyAddedMediaContainer mediaContainer) {
        this.mediaContainer = mediaContainer;
        return this;
    }
    
    public GetRecentlyAddedResponseBody(){}
}