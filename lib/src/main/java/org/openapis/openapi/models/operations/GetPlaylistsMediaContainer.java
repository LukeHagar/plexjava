/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetPlaylistsMediaContainer {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Integer size;

    public GetPlaylistsMediaContainer withSize(Integer size) {
        this.size = size;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Metadata")
    public GetPlaylistsMetadata[] metadata;

    public GetPlaylistsMediaContainer withMetadata(GetPlaylistsMetadata[] metadata) {
        this.metadata = metadata;
        return this;
    }
    
    public GetPlaylistsMediaContainer(){}
}
