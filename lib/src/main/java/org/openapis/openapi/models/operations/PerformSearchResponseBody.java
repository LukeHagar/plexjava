/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PerformSearchResponseBody - Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
 */

public class PerformSearchResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    public PerformSearchErrors[] errors;

    public PerformSearchResponseBody withErrors(PerformSearchErrors[] errors) {
        this.errors = errors;
        return this;
    }
    
    public PerformSearchResponseBody(){}
}
