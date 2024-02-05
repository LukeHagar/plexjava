/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetLibraryHubsDirector {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    public String tag;

    public GetLibraryHubsDirector withTag(String tag) {
        this.tag = tag;
        return this;
    }
    
    public GetLibraryHubsDirector(){}
}
