/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetServerPreferencesResponseBody - Server Preferences
 */

public class GetServerPreferencesResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("MediaContainer")
    public GetServerPreferencesMediaContainer mediaContainer;

    public GetServerPreferencesResponseBody withMediaContainer(GetServerPreferencesMediaContainer mediaContainer) {
        this.mediaContainer = mediaContainer;
        return this;
    }
    
    public GetServerPreferencesResponseBody(){}
}
