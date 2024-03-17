/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetSessionsMedia {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioChannels")
    public Integer audioChannels;

    public GetSessionsMedia withAudioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioCodec")
    public String audioCodec;

    public GetSessionsMedia withAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bitrate")
    public Integer bitrate;

    public GetSessionsMedia withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    public String container;

    public GetSessionsMedia withContainer(String container) {
        this.container = container;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Integer duration;

    public GetSessionsMedia withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public GetSessionsMedia withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selected")
    public Boolean selected;

    public GetSessionsMedia withSelected(Boolean selected) {
        this.selected = selected;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Part")
    public GetSessionsPart[] part;

    public GetSessionsMedia withPart(GetSessionsPart[] part) {
        this.part = part;
        return this;
    }
    
    public GetSessionsMedia(){}
}
