/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetLibraryItemsResponseBody - Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
 */

public class GetLibraryItemsResponseBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    public GetLibraryItemsErrors[] errors;

    public GetLibraryItemsResponseBody withErrors(GetLibraryItemsErrors[] errors) {
        this.errors = errors;
        return this;
    }
    
    public GetLibraryItemsResponseBody(){}
}