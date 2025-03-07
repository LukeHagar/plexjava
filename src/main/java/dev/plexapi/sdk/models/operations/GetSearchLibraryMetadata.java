/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class GetSearchLibraryMetadata {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ratingKey")
    private Optional<String> ratingKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentRatingKey")
    private Optional<String> parentRatingKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("guid")
    private Optional<String> guid;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentGuid")
    private Optional<String> parentGuid;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentStudio")
    private Optional<String> parentStudio;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentKey")
    private Optional<String> parentKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentTitle")
    private Optional<String> parentTitle;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("summary")
    private Optional<String> summary;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    private Optional<Integer> index;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentIndex")
    private Optional<Integer> parentIndex;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentYear")
    private Optional<Integer> parentYear;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    private Optional<String> thumb;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("art")
    private Optional<String> art;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentThumb")
    private Optional<String> parentThumb;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentTheme")
    private Optional<String> parentTheme;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addedAt")
    private Optional<Integer> addedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updatedAt")
    private Optional<Integer> updatedAt;

    @JsonCreator
    public GetSearchLibraryMetadata(
            @JsonProperty("ratingKey") Optional<String> ratingKey,
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("parentRatingKey") Optional<String> parentRatingKey,
            @JsonProperty("guid") Optional<String> guid,
            @JsonProperty("parentGuid") Optional<String> parentGuid,
            @JsonProperty("parentStudio") Optional<String> parentStudio,
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("parentKey") Optional<String> parentKey,
            @JsonProperty("parentTitle") Optional<String> parentTitle,
            @JsonProperty("summary") Optional<String> summary,
            @JsonProperty("index") Optional<Integer> index,
            @JsonProperty("parentIndex") Optional<Integer> parentIndex,
            @JsonProperty("parentYear") Optional<Integer> parentYear,
            @JsonProperty("thumb") Optional<String> thumb,
            @JsonProperty("art") Optional<String> art,
            @JsonProperty("parentThumb") Optional<String> parentThumb,
            @JsonProperty("parentTheme") Optional<String> parentTheme,
            @JsonProperty("addedAt") Optional<Integer> addedAt,
            @JsonProperty("updatedAt") Optional<Integer> updatedAt) {
        Utils.checkNotNull(ratingKey, "ratingKey");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(parentRatingKey, "parentRatingKey");
        Utils.checkNotNull(guid, "guid");
        Utils.checkNotNull(parentGuid, "parentGuid");
        Utils.checkNotNull(parentStudio, "parentStudio");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(parentKey, "parentKey");
        Utils.checkNotNull(parentTitle, "parentTitle");
        Utils.checkNotNull(summary, "summary");
        Utils.checkNotNull(index, "index");
        Utils.checkNotNull(parentIndex, "parentIndex");
        Utils.checkNotNull(parentYear, "parentYear");
        Utils.checkNotNull(thumb, "thumb");
        Utils.checkNotNull(art, "art");
        Utils.checkNotNull(parentThumb, "parentThumb");
        Utils.checkNotNull(parentTheme, "parentTheme");
        Utils.checkNotNull(addedAt, "addedAt");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.ratingKey = ratingKey;
        this.key = key;
        this.parentRatingKey = parentRatingKey;
        this.guid = guid;
        this.parentGuid = parentGuid;
        this.parentStudio = parentStudio;
        this.type = type;
        this.title = title;
        this.parentKey = parentKey;
        this.parentTitle = parentTitle;
        this.summary = summary;
        this.index = index;
        this.parentIndex = parentIndex;
        this.parentYear = parentYear;
        this.thumb = thumb;
        this.art = art;
        this.parentThumb = parentThumb;
        this.parentTheme = parentTheme;
        this.addedAt = addedAt;
        this.updatedAt = updatedAt;
    }
    
    public GetSearchLibraryMetadata() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> ratingKey() {
        return ratingKey;
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    @JsonIgnore
    public Optional<String> parentRatingKey() {
        return parentRatingKey;
    }

    @JsonIgnore
    public Optional<String> guid() {
        return guid;
    }

    @JsonIgnore
    public Optional<String> parentGuid() {
        return parentGuid;
    }

    @JsonIgnore
    public Optional<String> parentStudio() {
        return parentStudio;
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    @JsonIgnore
    public Optional<String> parentKey() {
        return parentKey;
    }

    @JsonIgnore
    public Optional<String> parentTitle() {
        return parentTitle;
    }

    @JsonIgnore
    public Optional<String> summary() {
        return summary;
    }

    @JsonIgnore
    public Optional<Integer> index() {
        return index;
    }

    @JsonIgnore
    public Optional<Integer> parentIndex() {
        return parentIndex;
    }

    @JsonIgnore
    public Optional<Integer> parentYear() {
        return parentYear;
    }

    @JsonIgnore
    public Optional<String> thumb() {
        return thumb;
    }

    @JsonIgnore
    public Optional<String> art() {
        return art;
    }

    @JsonIgnore
    public Optional<String> parentThumb() {
        return parentThumb;
    }

    @JsonIgnore
    public Optional<String> parentTheme() {
        return parentTheme;
    }

    @JsonIgnore
    public Optional<Integer> addedAt() {
        return addedAt;
    }

    @JsonIgnore
    public Optional<Integer> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetSearchLibraryMetadata withRatingKey(String ratingKey) {
        Utils.checkNotNull(ratingKey, "ratingKey");
        this.ratingKey = Optional.ofNullable(ratingKey);
        return this;
    }

    public GetSearchLibraryMetadata withRatingKey(Optional<String> ratingKey) {
        Utils.checkNotNull(ratingKey, "ratingKey");
        this.ratingKey = ratingKey;
        return this;
    }

    public GetSearchLibraryMetadata withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetSearchLibraryMetadata withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetSearchLibraryMetadata withParentRatingKey(String parentRatingKey) {
        Utils.checkNotNull(parentRatingKey, "parentRatingKey");
        this.parentRatingKey = Optional.ofNullable(parentRatingKey);
        return this;
    }

    public GetSearchLibraryMetadata withParentRatingKey(Optional<String> parentRatingKey) {
        Utils.checkNotNull(parentRatingKey, "parentRatingKey");
        this.parentRatingKey = parentRatingKey;
        return this;
    }

    public GetSearchLibraryMetadata withGuid(String guid) {
        Utils.checkNotNull(guid, "guid");
        this.guid = Optional.ofNullable(guid);
        return this;
    }

    public GetSearchLibraryMetadata withGuid(Optional<String> guid) {
        Utils.checkNotNull(guid, "guid");
        this.guid = guid;
        return this;
    }

    public GetSearchLibraryMetadata withParentGuid(String parentGuid) {
        Utils.checkNotNull(parentGuid, "parentGuid");
        this.parentGuid = Optional.ofNullable(parentGuid);
        return this;
    }

    public GetSearchLibraryMetadata withParentGuid(Optional<String> parentGuid) {
        Utils.checkNotNull(parentGuid, "parentGuid");
        this.parentGuid = parentGuid;
        return this;
    }

    public GetSearchLibraryMetadata withParentStudio(String parentStudio) {
        Utils.checkNotNull(parentStudio, "parentStudio");
        this.parentStudio = Optional.ofNullable(parentStudio);
        return this;
    }

    public GetSearchLibraryMetadata withParentStudio(Optional<String> parentStudio) {
        Utils.checkNotNull(parentStudio, "parentStudio");
        this.parentStudio = parentStudio;
        return this;
    }

    public GetSearchLibraryMetadata withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public GetSearchLibraryMetadata withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetSearchLibraryMetadata withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public GetSearchLibraryMetadata withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public GetSearchLibraryMetadata withParentKey(String parentKey) {
        Utils.checkNotNull(parentKey, "parentKey");
        this.parentKey = Optional.ofNullable(parentKey);
        return this;
    }

    public GetSearchLibraryMetadata withParentKey(Optional<String> parentKey) {
        Utils.checkNotNull(parentKey, "parentKey");
        this.parentKey = parentKey;
        return this;
    }

    public GetSearchLibraryMetadata withParentTitle(String parentTitle) {
        Utils.checkNotNull(parentTitle, "parentTitle");
        this.parentTitle = Optional.ofNullable(parentTitle);
        return this;
    }

    public GetSearchLibraryMetadata withParentTitle(Optional<String> parentTitle) {
        Utils.checkNotNull(parentTitle, "parentTitle");
        this.parentTitle = parentTitle;
        return this;
    }

    public GetSearchLibraryMetadata withSummary(String summary) {
        Utils.checkNotNull(summary, "summary");
        this.summary = Optional.ofNullable(summary);
        return this;
    }

    public GetSearchLibraryMetadata withSummary(Optional<String> summary) {
        Utils.checkNotNull(summary, "summary");
        this.summary = summary;
        return this;
    }

    public GetSearchLibraryMetadata withIndex(int index) {
        Utils.checkNotNull(index, "index");
        this.index = Optional.ofNullable(index);
        return this;
    }

    public GetSearchLibraryMetadata withIndex(Optional<Integer> index) {
        Utils.checkNotNull(index, "index");
        this.index = index;
        return this;
    }

    public GetSearchLibraryMetadata withParentIndex(int parentIndex) {
        Utils.checkNotNull(parentIndex, "parentIndex");
        this.parentIndex = Optional.ofNullable(parentIndex);
        return this;
    }

    public GetSearchLibraryMetadata withParentIndex(Optional<Integer> parentIndex) {
        Utils.checkNotNull(parentIndex, "parentIndex");
        this.parentIndex = parentIndex;
        return this;
    }

    public GetSearchLibraryMetadata withParentYear(int parentYear) {
        Utils.checkNotNull(parentYear, "parentYear");
        this.parentYear = Optional.ofNullable(parentYear);
        return this;
    }

    public GetSearchLibraryMetadata withParentYear(Optional<Integer> parentYear) {
        Utils.checkNotNull(parentYear, "parentYear");
        this.parentYear = parentYear;
        return this;
    }

    public GetSearchLibraryMetadata withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = Optional.ofNullable(thumb);
        return this;
    }

    public GetSearchLibraryMetadata withThumb(Optional<String> thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = thumb;
        return this;
    }

    public GetSearchLibraryMetadata withArt(String art) {
        Utils.checkNotNull(art, "art");
        this.art = Optional.ofNullable(art);
        return this;
    }

    public GetSearchLibraryMetadata withArt(Optional<String> art) {
        Utils.checkNotNull(art, "art");
        this.art = art;
        return this;
    }

    public GetSearchLibraryMetadata withParentThumb(String parentThumb) {
        Utils.checkNotNull(parentThumb, "parentThumb");
        this.parentThumb = Optional.ofNullable(parentThumb);
        return this;
    }

    public GetSearchLibraryMetadata withParentThumb(Optional<String> parentThumb) {
        Utils.checkNotNull(parentThumb, "parentThumb");
        this.parentThumb = parentThumb;
        return this;
    }

    public GetSearchLibraryMetadata withParentTheme(String parentTheme) {
        Utils.checkNotNull(parentTheme, "parentTheme");
        this.parentTheme = Optional.ofNullable(parentTheme);
        return this;
    }

    public GetSearchLibraryMetadata withParentTheme(Optional<String> parentTheme) {
        Utils.checkNotNull(parentTheme, "parentTheme");
        this.parentTheme = parentTheme;
        return this;
    }

    public GetSearchLibraryMetadata withAddedAt(int addedAt) {
        Utils.checkNotNull(addedAt, "addedAt");
        this.addedAt = Optional.ofNullable(addedAt);
        return this;
    }

    public GetSearchLibraryMetadata withAddedAt(Optional<Integer> addedAt) {
        Utils.checkNotNull(addedAt, "addedAt");
        this.addedAt = addedAt;
        return this;
    }

    public GetSearchLibraryMetadata withUpdatedAt(int updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public GetSearchLibraryMetadata withUpdatedAt(Optional<Integer> updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSearchLibraryMetadata other = (GetSearchLibraryMetadata) o;
        return 
            Objects.deepEquals(this.ratingKey, other.ratingKey) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.parentRatingKey, other.parentRatingKey) &&
            Objects.deepEquals(this.guid, other.guid) &&
            Objects.deepEquals(this.parentGuid, other.parentGuid) &&
            Objects.deepEquals(this.parentStudio, other.parentStudio) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.parentKey, other.parentKey) &&
            Objects.deepEquals(this.parentTitle, other.parentTitle) &&
            Objects.deepEquals(this.summary, other.summary) &&
            Objects.deepEquals(this.index, other.index) &&
            Objects.deepEquals(this.parentIndex, other.parentIndex) &&
            Objects.deepEquals(this.parentYear, other.parentYear) &&
            Objects.deepEquals(this.thumb, other.thumb) &&
            Objects.deepEquals(this.art, other.art) &&
            Objects.deepEquals(this.parentThumb, other.parentThumb) &&
            Objects.deepEquals(this.parentTheme, other.parentTheme) &&
            Objects.deepEquals(this.addedAt, other.addedAt) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            ratingKey,
            key,
            parentRatingKey,
            guid,
            parentGuid,
            parentStudio,
            type,
            title,
            parentKey,
            parentTitle,
            summary,
            index,
            parentIndex,
            parentYear,
            thumb,
            art,
            parentThumb,
            parentTheme,
            addedAt,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSearchLibraryMetadata.class,
                "ratingKey", ratingKey,
                "key", key,
                "parentRatingKey", parentRatingKey,
                "guid", guid,
                "parentGuid", parentGuid,
                "parentStudio", parentStudio,
                "type", type,
                "title", title,
                "parentKey", parentKey,
                "parentTitle", parentTitle,
                "summary", summary,
                "index", index,
                "parentIndex", parentIndex,
                "parentYear", parentYear,
                "thumb", thumb,
                "art", art,
                "parentThumb", parentThumb,
                "parentTheme", parentTheme,
                "addedAt", addedAt,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<String> ratingKey = Optional.empty();
 
        private Optional<String> key = Optional.empty();
 
        private Optional<String> parentRatingKey = Optional.empty();
 
        private Optional<String> guid = Optional.empty();
 
        private Optional<String> parentGuid = Optional.empty();
 
        private Optional<String> parentStudio = Optional.empty();
 
        private Optional<String> type = Optional.empty();
 
        private Optional<String> title = Optional.empty();
 
        private Optional<String> parentKey = Optional.empty();
 
        private Optional<String> parentTitle = Optional.empty();
 
        private Optional<String> summary = Optional.empty();
 
        private Optional<Integer> index = Optional.empty();
 
        private Optional<Integer> parentIndex = Optional.empty();
 
        private Optional<Integer> parentYear = Optional.empty();
 
        private Optional<String> thumb = Optional.empty();
 
        private Optional<String> art = Optional.empty();
 
        private Optional<String> parentThumb = Optional.empty();
 
        private Optional<String> parentTheme = Optional.empty();
 
        private Optional<Integer> addedAt = Optional.empty();
 
        private Optional<Integer> updatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder ratingKey(String ratingKey) {
            Utils.checkNotNull(ratingKey, "ratingKey");
            this.ratingKey = Optional.ofNullable(ratingKey);
            return this;
        }

        public Builder ratingKey(Optional<String> ratingKey) {
            Utils.checkNotNull(ratingKey, "ratingKey");
            this.ratingKey = ratingKey;
            return this;
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder parentRatingKey(String parentRatingKey) {
            Utils.checkNotNull(parentRatingKey, "parentRatingKey");
            this.parentRatingKey = Optional.ofNullable(parentRatingKey);
            return this;
        }

        public Builder parentRatingKey(Optional<String> parentRatingKey) {
            Utils.checkNotNull(parentRatingKey, "parentRatingKey");
            this.parentRatingKey = parentRatingKey;
            return this;
        }

        public Builder guid(String guid) {
            Utils.checkNotNull(guid, "guid");
            this.guid = Optional.ofNullable(guid);
            return this;
        }

        public Builder guid(Optional<String> guid) {
            Utils.checkNotNull(guid, "guid");
            this.guid = guid;
            return this;
        }

        public Builder parentGuid(String parentGuid) {
            Utils.checkNotNull(parentGuid, "parentGuid");
            this.parentGuid = Optional.ofNullable(parentGuid);
            return this;
        }

        public Builder parentGuid(Optional<String> parentGuid) {
            Utils.checkNotNull(parentGuid, "parentGuid");
            this.parentGuid = parentGuid;
            return this;
        }

        public Builder parentStudio(String parentStudio) {
            Utils.checkNotNull(parentStudio, "parentStudio");
            this.parentStudio = Optional.ofNullable(parentStudio);
            return this;
        }

        public Builder parentStudio(Optional<String> parentStudio) {
            Utils.checkNotNull(parentStudio, "parentStudio");
            this.parentStudio = parentStudio;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder parentKey(String parentKey) {
            Utils.checkNotNull(parentKey, "parentKey");
            this.parentKey = Optional.ofNullable(parentKey);
            return this;
        }

        public Builder parentKey(Optional<String> parentKey) {
            Utils.checkNotNull(parentKey, "parentKey");
            this.parentKey = parentKey;
            return this;
        }

        public Builder parentTitle(String parentTitle) {
            Utils.checkNotNull(parentTitle, "parentTitle");
            this.parentTitle = Optional.ofNullable(parentTitle);
            return this;
        }

        public Builder parentTitle(Optional<String> parentTitle) {
            Utils.checkNotNull(parentTitle, "parentTitle");
            this.parentTitle = parentTitle;
            return this;
        }

        public Builder summary(String summary) {
            Utils.checkNotNull(summary, "summary");
            this.summary = Optional.ofNullable(summary);
            return this;
        }

        public Builder summary(Optional<String> summary) {
            Utils.checkNotNull(summary, "summary");
            this.summary = summary;
            return this;
        }

        public Builder index(int index) {
            Utils.checkNotNull(index, "index");
            this.index = Optional.ofNullable(index);
            return this;
        }

        public Builder index(Optional<Integer> index) {
            Utils.checkNotNull(index, "index");
            this.index = index;
            return this;
        }

        public Builder parentIndex(int parentIndex) {
            Utils.checkNotNull(parentIndex, "parentIndex");
            this.parentIndex = Optional.ofNullable(parentIndex);
            return this;
        }

        public Builder parentIndex(Optional<Integer> parentIndex) {
            Utils.checkNotNull(parentIndex, "parentIndex");
            this.parentIndex = parentIndex;
            return this;
        }

        public Builder parentYear(int parentYear) {
            Utils.checkNotNull(parentYear, "parentYear");
            this.parentYear = Optional.ofNullable(parentYear);
            return this;
        }

        public Builder parentYear(Optional<Integer> parentYear) {
            Utils.checkNotNull(parentYear, "parentYear");
            this.parentYear = parentYear;
            return this;
        }

        public Builder thumb(String thumb) {
            Utils.checkNotNull(thumb, "thumb");
            this.thumb = Optional.ofNullable(thumb);
            return this;
        }

        public Builder thumb(Optional<String> thumb) {
            Utils.checkNotNull(thumb, "thumb");
            this.thumb = thumb;
            return this;
        }

        public Builder art(String art) {
            Utils.checkNotNull(art, "art");
            this.art = Optional.ofNullable(art);
            return this;
        }

        public Builder art(Optional<String> art) {
            Utils.checkNotNull(art, "art");
            this.art = art;
            return this;
        }

        public Builder parentThumb(String parentThumb) {
            Utils.checkNotNull(parentThumb, "parentThumb");
            this.parentThumb = Optional.ofNullable(parentThumb);
            return this;
        }

        public Builder parentThumb(Optional<String> parentThumb) {
            Utils.checkNotNull(parentThumb, "parentThumb");
            this.parentThumb = parentThumb;
            return this;
        }

        public Builder parentTheme(String parentTheme) {
            Utils.checkNotNull(parentTheme, "parentTheme");
            this.parentTheme = Optional.ofNullable(parentTheme);
            return this;
        }

        public Builder parentTheme(Optional<String> parentTheme) {
            Utils.checkNotNull(parentTheme, "parentTheme");
            this.parentTheme = parentTheme;
            return this;
        }

        public Builder addedAt(int addedAt) {
            Utils.checkNotNull(addedAt, "addedAt");
            this.addedAt = Optional.ofNullable(addedAt);
            return this;
        }

        public Builder addedAt(Optional<Integer> addedAt) {
            Utils.checkNotNull(addedAt, "addedAt");
            this.addedAt = addedAt;
            return this;
        }

        public Builder updatedAt(int updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        public Builder updatedAt(Optional<Integer> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public GetSearchLibraryMetadata build() {
            return new GetSearchLibraryMetadata(
                ratingKey,
                key,
                parentRatingKey,
                guid,
                parentGuid,
                parentStudio,
                type,
                title,
                parentKey,
                parentTitle,
                summary,
                index,
                parentIndex,
                parentYear,
                thumb,
                art,
                parentThumb,
                parentTheme,
                addedAt,
                updatedAt);
        }
    }
}

