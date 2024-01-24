/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetGlobalHubsMediaContainer {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Integer size;

    public GetGlobalHubsMediaContainer withSize(Integer size) {
        this.size = size;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowSync")
    public Boolean allowSync;

    public GetGlobalHubsMediaContainer withAllowSync(Boolean allowSync) {
        this.allowSync = allowSync;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifier")
    public String identifier;

    public GetGlobalHubsMediaContainer withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Hub")
    public Hub[] hub;

    public GetGlobalHubsMediaContainer withHub(Hub[] hub) {
        this.hub = hub;
        return this;
    }
    
    public GetGlobalHubsMediaContainer(){}
}