/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetUpdateStatusResponseBody - The Server Updates
 */

public class GetUpdateStatusResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MediaContainer")
    public GetUpdateStatusMediaContainer mediaContainer;

    public GetUpdateStatusResponseBody withMediaContainer(GetUpdateStatusMediaContainer mediaContainer) {
        this.mediaContainer = mediaContainer;
        return this;
    }
    
    public GetUpdateStatusResponseBody(){}
}
