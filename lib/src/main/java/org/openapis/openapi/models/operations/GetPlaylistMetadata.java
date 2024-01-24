/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetPlaylistMetadata {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content")
    public String content;

    public GetPlaylistMetadata withContent(String content) {
        this.content = content;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ratingKey")
    public String ratingKey;

    public GetPlaylistMetadata withRatingKey(String ratingKey) {
        this.ratingKey = ratingKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;

    public GetPlaylistMetadata withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("guid")
    public String guid;

    public GetPlaylistMetadata withGuid(String guid) {
        this.guid = guid;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;

    public GetPlaylistMetadata withType(String type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public GetPlaylistMetadata withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("summary")
    public String summary;

    public GetPlaylistMetadata withSummary(String summary) {
        this.summary = summary;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("smart")
    public Boolean smart;

    public GetPlaylistMetadata withSmart(Boolean smart) {
        this.smart = smart;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("playlistType")
    public String playlistType;

    public GetPlaylistMetadata withPlaylistType(String playlistType) {
        this.playlistType = playlistType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("composite")
    public String composite;

    public GetPlaylistMetadata withComposite(String composite) {
        this.composite = composite;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    public String icon;

    public GetPlaylistMetadata withIcon(String icon) {
        this.icon = icon;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Integer duration;

    public GetPlaylistMetadata withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("leafCount")
    public Integer leafCount;

    public GetPlaylistMetadata withLeafCount(Integer leafCount) {
        this.leafCount = leafCount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addedAt")
    public Integer addedAt;

    public GetPlaylistMetadata withAddedAt(Integer addedAt) {
        this.addedAt = addedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updatedAt")
    public Integer updatedAt;

    public GetPlaylistMetadata withUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public GetPlaylistMetadata(){}
}