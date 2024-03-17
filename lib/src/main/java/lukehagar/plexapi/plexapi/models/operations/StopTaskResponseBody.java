/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StopTaskResponseBody - Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
 */

public class StopTaskResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    public StopTaskErrors[] errors;

    public StopTaskResponseBody withErrors(StopTaskErrors[] errors) {
        this.errors = errors;
        return this;
    }
    
    public StopTaskResponseBody(){}
}
