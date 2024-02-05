/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MarkPlayedResponseBody - Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
 */

public class MarkPlayedResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    public MarkPlayedErrors[] errors;

    public MarkPlayedResponseBody withErrors(MarkPlayedErrors[] errors) {
        this.errors = errors;
        return this;
    }
    
    public MarkPlayedResponseBody(){}
}
