/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import lukehagar.plexapi.plexapi.utils.DateTimeDeserializer;
import lukehagar.plexapi.plexapi.utils.DateTimeSerializer;


public class GetOnDeckMetadata {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowSync")
    public Boolean allowSync;

    public GetOnDeckMetadata withAllowSync(Boolean allowSync) {
        this.allowSync = allowSync;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("librarySectionID")
    public Double librarySectionID;

    public GetOnDeckMetadata withLibrarySectionID(Double librarySectionID) {
        this.librarySectionID = librarySectionID;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("librarySectionTitle")
    public String librarySectionTitle;

    public GetOnDeckMetadata withLibrarySectionTitle(String librarySectionTitle) {
        this.librarySectionTitle = librarySectionTitle;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("librarySectionUUID")
    public String librarySectionUUID;

    public GetOnDeckMetadata withLibrarySectionUUID(String librarySectionUUID) {
        this.librarySectionUUID = librarySectionUUID;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ratingKey")
    public Double ratingKey;

    public GetOnDeckMetadata withRatingKey(Double ratingKey) {
        this.ratingKey = ratingKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;

    public GetOnDeckMetadata withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentRatingKey")
    public Double parentRatingKey;

    public GetOnDeckMetadata withParentRatingKey(Double parentRatingKey) {
        this.parentRatingKey = parentRatingKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentRatingKey")
    public Double grandparentRatingKey;

    public GetOnDeckMetadata withGrandparentRatingKey(Double grandparentRatingKey) {
        this.grandparentRatingKey = grandparentRatingKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("guid")
    public String guid;

    public GetOnDeckMetadata withGuid(String guid) {
        this.guid = guid;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentGuid")
    public String parentGuid;

    public GetOnDeckMetadata withParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentGuid")
    public String grandparentGuid;

    public GetOnDeckMetadata withGrandparentGuid(String grandparentGuid) {
        this.grandparentGuid = grandparentGuid;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;

    public GetOnDeckMetadata withType(String type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public GetOnDeckMetadata withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentKey")
    public String grandparentKey;

    public GetOnDeckMetadata withGrandparentKey(String grandparentKey) {
        this.grandparentKey = grandparentKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentKey")
    public String parentKey;

    public GetOnDeckMetadata withParentKey(String parentKey) {
        this.parentKey = parentKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("librarySectionKey")
    public String librarySectionKey;

    public GetOnDeckMetadata withLibrarySectionKey(String librarySectionKey) {
        this.librarySectionKey = librarySectionKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentTitle")
    public String grandparentTitle;

    public GetOnDeckMetadata withGrandparentTitle(String grandparentTitle) {
        this.grandparentTitle = grandparentTitle;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentTitle")
    public String parentTitle;

    public GetOnDeckMetadata withParentTitle(String parentTitle) {
        this.parentTitle = parentTitle;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contentRating")
    public String contentRating;

    public GetOnDeckMetadata withContentRating(String contentRating) {
        this.contentRating = contentRating;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("summary")
    public String summary;

    public GetOnDeckMetadata withSummary(String summary) {
        this.summary = summary;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    public Double index;

    public GetOnDeckMetadata withIndex(Double index) {
        this.index = index;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentIndex")
    public Double parentIndex;

    public GetOnDeckMetadata withParentIndex(Double parentIndex) {
        this.parentIndex = parentIndex;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastViewedAt")
    public Double lastViewedAt;

    public GetOnDeckMetadata withLastViewedAt(Double lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("year")
    public Double year;

    public GetOnDeckMetadata withYear(Double year) {
        this.year = year;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    public String thumb;

    public GetOnDeckMetadata withThumb(String thumb) {
        this.thumb = thumb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("art")
    public String art;

    public GetOnDeckMetadata withArt(String art) {
        this.art = art;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentThumb")
    public String parentThumb;

    public GetOnDeckMetadata withParentThumb(String parentThumb) {
        this.parentThumb = parentThumb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentThumb")
    public String grandparentThumb;

    public GetOnDeckMetadata withGrandparentThumb(String grandparentThumb) {
        this.grandparentThumb = grandparentThumb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentArt")
    public String grandparentArt;

    public GetOnDeckMetadata withGrandparentArt(String grandparentArt) {
        this.grandparentArt = grandparentArt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentTheme")
    public String grandparentTheme;

    public GetOnDeckMetadata withGrandparentTheme(String grandparentTheme) {
        this.grandparentTheme = grandparentTheme;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Double duration;

    public GetOnDeckMetadata withDuration(Double duration) {
        this.duration = duration;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("originallyAvailableAt")
    public OffsetDateTime originallyAvailableAt;

    public GetOnDeckMetadata withOriginallyAvailableAt(OffsetDateTime originallyAvailableAt) {
        this.originallyAvailableAt = originallyAvailableAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addedAt")
    public Double addedAt;

    public GetOnDeckMetadata withAddedAt(Double addedAt) {
        this.addedAt = addedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updatedAt")
    public Double updatedAt;

    public GetOnDeckMetadata withUpdatedAt(Double updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Media")
    public GetOnDeckMedia[] media;

    public GetOnDeckMetadata withMedia(GetOnDeckMedia[] media) {
        this.media = media;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Guid")
    public GetOnDeckGuids[] guids;

    public GetOnDeckMetadata withGuids(GetOnDeckGuids[] guids) {
        this.guids = guids;
        return this;
    }
    
    public GetOnDeckMetadata(){}
}
