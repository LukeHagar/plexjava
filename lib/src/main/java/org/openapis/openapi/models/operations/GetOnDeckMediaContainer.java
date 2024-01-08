/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetOnDeckMediaContainer {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Double size;

    public GetOnDeckMediaContainer withSize(Double size) {
        this.size = size;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowSync")
    public Boolean allowSync;

    public GetOnDeckMediaContainer withAllowSync(Boolean allowSync) {
        this.allowSync = allowSync;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifier")
    public String identifier;

    public GetOnDeckMediaContainer withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaTagPrefix")
    public String mediaTagPrefix;

    public GetOnDeckMediaContainer withMediaTagPrefix(String mediaTagPrefix) {
        this.mediaTagPrefix = mediaTagPrefix;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaTagVersion")
    public Double mediaTagVersion;

    public GetOnDeckMediaContainer withMediaTagVersion(Double mediaTagVersion) {
        this.mediaTagVersion = mediaTagVersion;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mixedParents")
    public Boolean mixedParents;

    public GetOnDeckMediaContainer withMixedParents(Boolean mixedParents) {
        this.mixedParents = mixedParents;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Metadata")
    public GetOnDeckMetadata[] metadata;

    public GetOnDeckMediaContainer withMetadata(GetOnDeckMetadata[] metadata) {
        this.metadata = metadata;
        return this;
    }
    
    public GetOnDeckMediaContainer(){}
}