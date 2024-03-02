/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPinPlexResponseBody - X-Plex-Client-Identifier is missing
 */

public class GetPinPlexResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    public GetPinErrors[] errors;

    public GetPinPlexResponseBody withErrors(GetPinErrors[] errors) {
        this.errors = errors;
        return this;
    }
    
    public GetPinPlexResponseBody(){}
}