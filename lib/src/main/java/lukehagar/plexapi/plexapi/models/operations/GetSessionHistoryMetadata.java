/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;


public class GetSessionHistoryMetadata {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("historyKey")
    public String historyKey;

    public GetSessionHistoryMetadata withHistoryKey(String historyKey) {
        this.historyKey = historyKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;

    public GetSessionHistoryMetadata withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ratingKey")
    public String ratingKey;

    public GetSessionHistoryMetadata withRatingKey(String ratingKey) {
        this.ratingKey = ratingKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("librarySectionID")
    public String librarySectionID;

    public GetSessionHistoryMetadata withLibrarySectionID(String librarySectionID) {
        this.librarySectionID = librarySectionID;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentKey")
    public String parentKey;

    public GetSessionHistoryMetadata withParentKey(String parentKey) {
        this.parentKey = parentKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentKey")
    public String grandparentKey;

    public GetSessionHistoryMetadata withGrandparentKey(String grandparentKey) {
        this.grandparentKey = grandparentKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public GetSessionHistoryMetadata withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentTitle")
    public String grandparentTitle;

    public GetSessionHistoryMetadata withGrandparentTitle(String grandparentTitle) {
        this.grandparentTitle = grandparentTitle;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;

    public GetSessionHistoryMetadata withType(String type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    public String thumb;

    public GetSessionHistoryMetadata withThumb(String thumb) {
        this.thumb = thumb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentThumb")
    public String parentThumb;

    public GetSessionHistoryMetadata withParentThumb(String parentThumb) {
        this.parentThumb = parentThumb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentThumb")
    public String grandparentThumb;

    public GetSessionHistoryMetadata withGrandparentThumb(String grandparentThumb) {
        this.grandparentThumb = grandparentThumb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentArt")
    public String grandparentArt;

    public GetSessionHistoryMetadata withGrandparentArt(String grandparentArt) {
        this.grandparentArt = grandparentArt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public Integer index;

    public GetSessionHistoryMetadata withIndex(Integer index) {
        this.index = index;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentIndex")
    public Integer parentIndex;

    public GetSessionHistoryMetadata withParentIndex(Integer parentIndex) {
        this.parentIndex = parentIndex;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("originallyAvailableAt")
    public LocalDate originallyAvailableAt;

    public GetSessionHistoryMetadata withOriginallyAvailableAt(LocalDate originallyAvailableAt) {
        this.originallyAvailableAt = originallyAvailableAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("viewedAt")
    public Integer viewedAt;

    public GetSessionHistoryMetadata withViewedAt(Integer viewedAt) {
        this.viewedAt = viewedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountID")
    public Integer accountID;

    public GetSessionHistoryMetadata withAccountID(Integer accountID) {
        this.accountID = accountID;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deviceID")
    public Integer deviceID;

    public GetSessionHistoryMetadata withDeviceID(Integer deviceID) {
        this.deviceID = deviceID;
        return this;
    }
    
    public GetSessionHistoryMetadata(){}
}