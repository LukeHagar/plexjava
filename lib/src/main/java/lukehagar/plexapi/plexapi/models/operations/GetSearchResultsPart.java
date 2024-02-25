/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetSearchResultsPart {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Double id;

    public GetSearchResultsPart withId(Double id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;

    public GetSearchResultsPart withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Double duration;

    public GetSearchResultsPart withDuration(Double duration) {
        this.duration = duration;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    public String file;

    public GetSearchResultsPart withFile(String file) {
        this.file = file;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Double size;

    public GetSearchResultsPart withSize(Double size) {
        this.size = size;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioProfile")
    public String audioProfile;

    public GetSearchResultsPart withAudioProfile(String audioProfile) {
        this.audioProfile = audioProfile;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    public String container;

    public GetSearchResultsPart withContainer(String container) {
        this.container = container;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoProfile")
    public String videoProfile;

    public GetSearchResultsPart withVideoProfile(String videoProfile) {
        this.videoProfile = videoProfile;
        return this;
    }
    
    public GetSearchResultsPart(){}
}
