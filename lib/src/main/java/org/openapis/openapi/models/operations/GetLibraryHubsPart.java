/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetLibraryHubsPart {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Integer id;

    public GetLibraryHubsPart withId(Integer id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;

    public GetLibraryHubsPart withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Integer duration;

    public GetLibraryHubsPart withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    public String file;

    public GetLibraryHubsPart withFile(String file) {
        this.file = file;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Integer size;

    public GetLibraryHubsPart withSize(Integer size) {
        this.size = size;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioProfile")
    public String audioProfile;

    public GetLibraryHubsPart withAudioProfile(String audioProfile) {
        this.audioProfile = audioProfile;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    public String container;

    public GetLibraryHubsPart withContainer(String container) {
        this.container = container;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has64bitOffsets")
    public Boolean has64bitOffsets;

    public GetLibraryHubsPart withHas64bitOffsets(Boolean has64bitOffsets) {
        this.has64bitOffsets = has64bitOffsets;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("optimizedForStreaming")
    public Boolean optimizedForStreaming;

    public GetLibraryHubsPart withOptimizedForStreaming(Boolean optimizedForStreaming) {
        this.optimizedForStreaming = optimizedForStreaming;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoProfile")
    public String videoProfile;

    public GetLibraryHubsPart withVideoProfile(String videoProfile) {
        this.videoProfile = videoProfile;
        return this;
    }
    
    public GetLibraryHubsPart(){}
}
