/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetServerPreferencesResponseBody - Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
 */

public class GetServerPreferencesResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    public GetServerPreferencesErrors[] errors;

    public GetServerPreferencesResponseBody withErrors(GetServerPreferencesErrors[] errors) {
        this.errors = errors;
        return this;
    }
    
    public GetServerPreferencesResponseBody(){}
}
