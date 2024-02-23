/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SearchLibraryMetadata {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ratingKey")
    public String ratingKey;

    public SearchLibraryMetadata withRatingKey(String ratingKey) {
        this.ratingKey = ratingKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;

    public SearchLibraryMetadata withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentRatingKey")
    public String parentRatingKey;

    public SearchLibraryMetadata withParentRatingKey(String parentRatingKey) {
        this.parentRatingKey = parentRatingKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("guid")
    public String guid;

    public SearchLibraryMetadata withGuid(String guid) {
        this.guid = guid;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentGuid")
    public String parentGuid;

    public SearchLibraryMetadata withParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentStudio")
    public String parentStudio;

    public SearchLibraryMetadata withParentStudio(String parentStudio) {
        this.parentStudio = parentStudio;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;

    public SearchLibraryMetadata withType(String type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public SearchLibraryMetadata withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentKey")
    public String parentKey;

    public SearchLibraryMetadata withParentKey(String parentKey) {
        this.parentKey = parentKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentTitle")
    public String parentTitle;

    public SearchLibraryMetadata withParentTitle(String parentTitle) {
        this.parentTitle = parentTitle;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("summary")
    public String summary;

    public SearchLibraryMetadata withSummary(String summary) {
        this.summary = summary;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public Integer index;

    public SearchLibraryMetadata withIndex(Integer index) {
        this.index = index;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentIndex")
    public Integer parentIndex;

    public SearchLibraryMetadata withParentIndex(Integer parentIndex) {
        this.parentIndex = parentIndex;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentYear")
    public Integer parentYear;

    public SearchLibraryMetadata withParentYear(Integer parentYear) {
        this.parentYear = parentYear;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    public String thumb;

    public SearchLibraryMetadata withThumb(String thumb) {
        this.thumb = thumb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("art")
    public String art;

    public SearchLibraryMetadata withArt(String art) {
        this.art = art;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentThumb")
    public String parentThumb;

    public SearchLibraryMetadata withParentThumb(String parentThumb) {
        this.parentThumb = parentThumb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentTheme")
    public String parentTheme;

    public SearchLibraryMetadata withParentTheme(String parentTheme) {
        this.parentTheme = parentTheme;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addedAt")
    public Integer addedAt;

    public SearchLibraryMetadata withAddedAt(Integer addedAt) {
        this.addedAt = addedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updatedAt")
    public Integer updatedAt;

    public SearchLibraryMetadata withUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public SearchLibraryMetadata(){}
}
