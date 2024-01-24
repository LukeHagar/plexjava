/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetPlaylistsMetadata {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ratingKey")
    public String ratingKey;

    public GetPlaylistsMetadata withRatingKey(String ratingKey) {
        this.ratingKey = ratingKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;

    public GetPlaylistsMetadata withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("guid")
    public String guid;

    public GetPlaylistsMetadata withGuid(String guid) {
        this.guid = guid;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;

    public GetPlaylistsMetadata withType(String type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public GetPlaylistsMetadata withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("summary")
    public String summary;

    public GetPlaylistsMetadata withSummary(String summary) {
        this.summary = summary;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("smart")
    public Boolean smart;

    public GetPlaylistsMetadata withSmart(Boolean smart) {
        this.smart = smart;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("playlistType")
    public String playlistType;

    public GetPlaylistsMetadata withPlaylistType(String playlistType) {
        this.playlistType = playlistType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("composite")
    public String composite;

    public GetPlaylistsMetadata withComposite(String composite) {
        this.composite = composite;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    public String icon;

    public GetPlaylistsMetadata withIcon(String icon) {
        this.icon = icon;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("viewCount")
    public Integer viewCount;

    public GetPlaylistsMetadata withViewCount(Integer viewCount) {
        this.viewCount = viewCount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastViewedAt")
    public Integer lastViewedAt;

    public GetPlaylistsMetadata withLastViewedAt(Integer lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Integer duration;

    public GetPlaylistsMetadata withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("leafCount")
    public Integer leafCount;

    public GetPlaylistsMetadata withLeafCount(Integer leafCount) {
        this.leafCount = leafCount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addedAt")
    public Integer addedAt;

    public GetPlaylistsMetadata withAddedAt(Integer addedAt) {
        this.addedAt = addedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updatedAt")
    public Integer updatedAt;

    public GetPlaylistsMetadata withUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public GetPlaylistsMetadata(){}
}