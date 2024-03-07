/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Part {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Double id;

    public Part withId(Double id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;

    public Part withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Double duration;

    public Part withDuration(Double duration) {
        this.duration = duration;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    public String file;

    public Part withFile(String file) {
        this.file = file;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Double size;

    public Part withSize(Double size) {
        this.size = size;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    public String container;

    public Part withContainer(String container) {
        this.container = container;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has64bitOffsets")
    public Boolean has64bitOffsets;

    public Part withHas64bitOffsets(Boolean has64bitOffsets) {
        this.has64bitOffsets = has64bitOffsets;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hasThumbnail")
    public Double hasThumbnail;

    public Part withHasThumbnail(Double hasThumbnail) {
        this.hasThumbnail = hasThumbnail;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("optimizedForStreaming")
    public Boolean optimizedForStreaming;

    public Part withOptimizedForStreaming(Boolean optimizedForStreaming) {
        this.optimizedForStreaming = optimizedForStreaming;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoProfile")
    public String videoProfile;

    public Part withVideoProfile(String videoProfile) {
        this.videoProfile = videoProfile;
        return this;
    }
    
    public Part(){}
}
