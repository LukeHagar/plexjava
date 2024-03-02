/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetOnDeckResponseBody - The on Deck content
 */

public class GetOnDeckResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MediaContainer")
    public GetOnDeckMediaContainer mediaContainer;

    public GetOnDeckResponseBody withMediaContainer(GetOnDeckMediaContainer mediaContainer) {
        this.mediaContainer = mediaContainer;
        return this;
    }
    
    public GetOnDeckResponseBody(){}
}