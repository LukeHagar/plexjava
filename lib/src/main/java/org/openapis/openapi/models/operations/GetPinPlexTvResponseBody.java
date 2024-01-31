/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPinPlexTvResponseBody - X-Plex-Client-Identifier is missing
 */

public class GetPinPlexTvResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    public GetPinErrors[] errors;

    public GetPinPlexTvResponseBody withErrors(GetPinErrors[] errors) {
        this.errors = errors;
        return this;
    }
    
    public GetPinPlexTvResponseBody(){}
}
