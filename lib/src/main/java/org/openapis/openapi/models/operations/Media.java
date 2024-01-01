/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Media {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Double id;

    public Media withId(Double id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Double duration;

    public Media withDuration(Double duration) {
        this.duration = duration;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bitrate")
    public Double bitrate;

    public Media withBitrate(Double bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("width")
    public Double width;

    public Media withWidth(Double width) {
        this.width = width;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("height")
    public Double height;

    public Media withHeight(Double height) {
        this.height = height;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aspectRatio")
    public Double aspectRatio;

    public Media withAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioChannels")
    public Double audioChannels;

    public Media withAudioChannels(Double audioChannels) {
        this.audioChannels = audioChannels;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioCodec")
    public String audioCodec;

    public Media withAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoCodec")
    public String videoCodec;

    public Media withVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoResolution")
    public Double videoResolution;

    public Media withVideoResolution(Double videoResolution) {
        this.videoResolution = videoResolution;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    public String container;

    public Media withContainer(String container) {
        this.container = container;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoFrameRate")
    public String videoFrameRate;

    public Media withVideoFrameRate(String videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("optimizedForStreaming")
    public Double optimizedForStreaming;

    public Media withOptimizedForStreaming(Double optimizedForStreaming) {
        this.optimizedForStreaming = optimizedForStreaming;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has64bitOffsets")
    public Boolean has64bitOffsets;

    public Media withHas64bitOffsets(Boolean has64bitOffsets) {
        this.has64bitOffsets = has64bitOffsets;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoProfile")
    public String videoProfile;

    public Media withVideoProfile(String videoProfile) {
        this.videoProfile = videoProfile;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Part")
    public Part[] part;

    public Media withPart(Part[] part) {
        this.part = part;
        return this;
    }
    
    public Media(){}
}
