/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import lukehagar.plexapi.plexapi.utils.Utils;


public class SearchLibraryMetadata {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ratingKey")
    private Optional<? extends String> ratingKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<? extends String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentRatingKey")
    private Optional<? extends String> parentRatingKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("guid")
    private Optional<? extends String> guid;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentGuid")
    private Optional<? extends String> parentGuid;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentStudio")
    private Optional<? extends String> parentStudio;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<? extends String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentKey")
    private Optional<? extends String> parentKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentTitle")
    private Optional<? extends String> parentTitle;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("summary")
    private Optional<? extends String> summary;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    private Optional<? extends Integer> index;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentIndex")
    private Optional<? extends Integer> parentIndex;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentYear")
    private Optional<? extends Integer> parentYear;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    private Optional<? extends String> thumb;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("art")
    private Optional<? extends String> art;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentThumb")
    private Optional<? extends String> parentThumb;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentTheme")
    private Optional<? extends String> parentTheme;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addedAt")
    private Optional<? extends Integer> addedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updatedAt")
    private Optional<? extends Integer> updatedAt;

    public SearchLibraryMetadata(
            @JsonProperty("ratingKey") Optional<? extends String> ratingKey,
            @JsonProperty("key") Optional<? extends String> key,
            @JsonProperty("parentRatingKey") Optional<? extends String> parentRatingKey,
            @JsonProperty("guid") Optional<? extends String> guid,
            @JsonProperty("parentGuid") Optional<? extends String> parentGuid,
            @JsonProperty("parentStudio") Optional<? extends String> parentStudio,
            @JsonProperty("type") Optional<? extends String> type,
            @JsonProperty("title") Optional<? extends String> title,
            @JsonProperty("parentKey") Optional<? extends String> parentKey,
            @JsonProperty("parentTitle") Optional<? extends String> parentTitle,
            @JsonProperty("summary") Optional<? extends String> summary,
            @JsonProperty("index") Optional<? extends Integer> index,
            @JsonProperty("parentIndex") Optional<? extends Integer> parentIndex,
            @JsonProperty("parentYear") Optional<? extends Integer> parentYear,
            @JsonProperty("thumb") Optional<? extends String> thumb,
            @JsonProperty("art") Optional<? extends String> art,
            @JsonProperty("parentThumb") Optional<? extends String> parentThumb,
            @JsonProperty("parentTheme") Optional<? extends String> parentTheme,
            @JsonProperty("addedAt") Optional<? extends Integer> addedAt,
            @JsonProperty("updatedAt") Optional<? extends Integer> updatedAt) {
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

    public Optional<? extends String> ratingKey() {
        return ratingKey;
    }

    public Optional<? extends String> key() {
        return key;
    }

    public Optional<? extends String> parentRatingKey() {
        return parentRatingKey;
    }

    public Optional<? extends String> guid() {
        return guid;
    }

    public Optional<? extends String> parentGuid() {
        return parentGuid;
    }

    public Optional<? extends String> parentStudio() {
        return parentStudio;
    }

    public Optional<? extends String> type() {
        return type;
    }

    public Optional<? extends String> title() {
        return title;
    }

    public Optional<? extends String> parentKey() {
        return parentKey;
    }

    public Optional<? extends String> parentTitle() {
        return parentTitle;
    }

    public Optional<? extends String> summary() {
        return summary;
    }

    public Optional<? extends Integer> index() {
        return index;
    }

    public Optional<? extends Integer> parentIndex() {
        return parentIndex;
    }

    public Optional<? extends Integer> parentYear() {
        return parentYear;
    }

    public Optional<? extends String> thumb() {
        return thumb;
    }

    public Optional<? extends String> art() {
        return art;
    }

    public Optional<? extends String> parentThumb() {
        return parentThumb;
    }

    public Optional<? extends String> parentTheme() {
        return parentTheme;
    }

    public Optional<? extends Integer> addedAt() {
        return addedAt;
    }

    public Optional<? extends Integer> updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SearchLibraryMetadata withRatingKey(String ratingKey) {
        Utils.checkNotNull(ratingKey, "ratingKey");
        this.ratingKey = Optional.ofNullable(ratingKey);
        return this;
    }

    public SearchLibraryMetadata withRatingKey(Optional<? extends String> ratingKey) {
        Utils.checkNotNull(ratingKey, "ratingKey");
        this.ratingKey = ratingKey;
        return this;
    }

    public SearchLibraryMetadata withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public SearchLibraryMetadata withKey(Optional<? extends String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public SearchLibraryMetadata withParentRatingKey(String parentRatingKey) {
        Utils.checkNotNull(parentRatingKey, "parentRatingKey");
        this.parentRatingKey = Optional.ofNullable(parentRatingKey);
        return this;
    }

    public SearchLibraryMetadata withParentRatingKey(Optional<? extends String> parentRatingKey) {
        Utils.checkNotNull(parentRatingKey, "parentRatingKey");
        this.parentRatingKey = parentRatingKey;
        return this;
    }

    public SearchLibraryMetadata withGuid(String guid) {
        Utils.checkNotNull(guid, "guid");
        this.guid = Optional.ofNullable(guid);
        return this;
    }

    public SearchLibraryMetadata withGuid(Optional<? extends String> guid) {
        Utils.checkNotNull(guid, "guid");
        this.guid = guid;
        return this;
    }

    public SearchLibraryMetadata withParentGuid(String parentGuid) {
        Utils.checkNotNull(parentGuid, "parentGuid");
        this.parentGuid = Optional.ofNullable(parentGuid);
        return this;
    }

    public SearchLibraryMetadata withParentGuid(Optional<? extends String> parentGuid) {
        Utils.checkNotNull(parentGuid, "parentGuid");
        this.parentGuid = parentGuid;
        return this;
    }

    public SearchLibraryMetadata withParentStudio(String parentStudio) {
        Utils.checkNotNull(parentStudio, "parentStudio");
        this.parentStudio = Optional.ofNullable(parentStudio);
        return this;
    }

    public SearchLibraryMetadata withParentStudio(Optional<? extends String> parentStudio) {
        Utils.checkNotNull(parentStudio, "parentStudio");
        this.parentStudio = parentStudio;
        return this;
    }

    public SearchLibraryMetadata withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public SearchLibraryMetadata withType(Optional<? extends String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public SearchLibraryMetadata withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public SearchLibraryMetadata withTitle(Optional<? extends String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public SearchLibraryMetadata withParentKey(String parentKey) {
        Utils.checkNotNull(parentKey, "parentKey");
        this.parentKey = Optional.ofNullable(parentKey);
        return this;
    }

    public SearchLibraryMetadata withParentKey(Optional<? extends String> parentKey) {
        Utils.checkNotNull(parentKey, "parentKey");
        this.parentKey = parentKey;
        return this;
    }

    public SearchLibraryMetadata withParentTitle(String parentTitle) {
        Utils.checkNotNull(parentTitle, "parentTitle");
        this.parentTitle = Optional.ofNullable(parentTitle);
        return this;
    }

    public SearchLibraryMetadata withParentTitle(Optional<? extends String> parentTitle) {
        Utils.checkNotNull(parentTitle, "parentTitle");
        this.parentTitle = parentTitle;
        return this;
    }

    public SearchLibraryMetadata withSummary(String summary) {
        Utils.checkNotNull(summary, "summary");
        this.summary = Optional.ofNullable(summary);
        return this;
    }

    public SearchLibraryMetadata withSummary(Optional<? extends String> summary) {
        Utils.checkNotNull(summary, "summary");
        this.summary = summary;
        return this;
    }

    public SearchLibraryMetadata withIndex(int index) {
        Utils.checkNotNull(index, "index");
        this.index = Optional.ofNullable(index);
        return this;
    }

    public SearchLibraryMetadata withIndex(Optional<? extends Integer> index) {
        Utils.checkNotNull(index, "index");
        this.index = index;
        return this;
    }

    public SearchLibraryMetadata withParentIndex(int parentIndex) {
        Utils.checkNotNull(parentIndex, "parentIndex");
        this.parentIndex = Optional.ofNullable(parentIndex);
        return this;
    }

    public SearchLibraryMetadata withParentIndex(Optional<? extends Integer> parentIndex) {
        Utils.checkNotNull(parentIndex, "parentIndex");
        this.parentIndex = parentIndex;
        return this;
    }

    public SearchLibraryMetadata withParentYear(int parentYear) {
        Utils.checkNotNull(parentYear, "parentYear");
        this.parentYear = Optional.ofNullable(parentYear);
        return this;
    }

    public SearchLibraryMetadata withParentYear(Optional<? extends Integer> parentYear) {
        Utils.checkNotNull(parentYear, "parentYear");
        this.parentYear = parentYear;
        return this;
    }

    public SearchLibraryMetadata withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = Optional.ofNullable(thumb);
        return this;
    }

    public SearchLibraryMetadata withThumb(Optional<? extends String> thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = thumb;
        return this;
    }

    public SearchLibraryMetadata withArt(String art) {
        Utils.checkNotNull(art, "art");
        this.art = Optional.ofNullable(art);
        return this;
    }

    public SearchLibraryMetadata withArt(Optional<? extends String> art) {
        Utils.checkNotNull(art, "art");
        this.art = art;
        return this;
    }

    public SearchLibraryMetadata withParentThumb(String parentThumb) {
        Utils.checkNotNull(parentThumb, "parentThumb");
        this.parentThumb = Optional.ofNullable(parentThumb);
        return this;
    }

    public SearchLibraryMetadata withParentThumb(Optional<? extends String> parentThumb) {
        Utils.checkNotNull(parentThumb, "parentThumb");
        this.parentThumb = parentThumb;
        return this;
    }

    public SearchLibraryMetadata withParentTheme(String parentTheme) {
        Utils.checkNotNull(parentTheme, "parentTheme");
        this.parentTheme = Optional.ofNullable(parentTheme);
        return this;
    }

    public SearchLibraryMetadata withParentTheme(Optional<? extends String> parentTheme) {
        Utils.checkNotNull(parentTheme, "parentTheme");
        this.parentTheme = parentTheme;
        return this;
    }

    public SearchLibraryMetadata withAddedAt(int addedAt) {
        Utils.checkNotNull(addedAt, "addedAt");
        this.addedAt = Optional.ofNullable(addedAt);
        return this;
    }

    public SearchLibraryMetadata withAddedAt(Optional<? extends Integer> addedAt) {
        Utils.checkNotNull(addedAt, "addedAt");
        this.addedAt = addedAt;
        return this;
    }

    public SearchLibraryMetadata withUpdatedAt(int updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    public SearchLibraryMetadata withUpdatedAt(Optional<? extends Integer> updatedAt) {
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
        SearchLibraryMetadata other = (SearchLibraryMetadata) o;
        return 
            java.util.Objects.deepEquals(this.ratingKey, other.ratingKey) &&
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.parentRatingKey, other.parentRatingKey) &&
            java.util.Objects.deepEquals(this.guid, other.guid) &&
            java.util.Objects.deepEquals(this.parentGuid, other.parentGuid) &&
            java.util.Objects.deepEquals(this.parentStudio, other.parentStudio) &&
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.title, other.title) &&
            java.util.Objects.deepEquals(this.parentKey, other.parentKey) &&
            java.util.Objects.deepEquals(this.parentTitle, other.parentTitle) &&
            java.util.Objects.deepEquals(this.summary, other.summary) &&
            java.util.Objects.deepEquals(this.index, other.index) &&
            java.util.Objects.deepEquals(this.parentIndex, other.parentIndex) &&
            java.util.Objects.deepEquals(this.parentYear, other.parentYear) &&
            java.util.Objects.deepEquals(this.thumb, other.thumb) &&
            java.util.Objects.deepEquals(this.art, other.art) &&
            java.util.Objects.deepEquals(this.parentThumb, other.parentThumb) &&
            java.util.Objects.deepEquals(this.parentTheme, other.parentTheme) &&
            java.util.Objects.deepEquals(this.addedAt, other.addedAt) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
        return Utils.toString(SearchLibraryMetadata.class,
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
 
        private Optional<? extends String> ratingKey = Optional.empty();
 
        private Optional<? extends String> key = Optional.empty();
 
        private Optional<? extends String> parentRatingKey = Optional.empty();
 
        private Optional<? extends String> guid = Optional.empty();
 
        private Optional<? extends String> parentGuid = Optional.empty();
 
        private Optional<? extends String> parentStudio = Optional.empty();
 
        private Optional<? extends String> type = Optional.empty();
 
        private Optional<? extends String> title = Optional.empty();
 
        private Optional<? extends String> parentKey = Optional.empty();
 
        private Optional<? extends String> parentTitle = Optional.empty();
 
        private Optional<? extends String> summary = Optional.empty();
 
        private Optional<? extends Integer> index = Optional.empty();
 
        private Optional<? extends Integer> parentIndex = Optional.empty();
 
        private Optional<? extends Integer> parentYear = Optional.empty();
 
        private Optional<? extends String> thumb = Optional.empty();
 
        private Optional<? extends String> art = Optional.empty();
 
        private Optional<? extends String> parentThumb = Optional.empty();
 
        private Optional<? extends String> parentTheme = Optional.empty();
 
        private Optional<? extends Integer> addedAt = Optional.empty();
 
        private Optional<? extends Integer> updatedAt = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder ratingKey(String ratingKey) {
            Utils.checkNotNull(ratingKey, "ratingKey");
            this.ratingKey = Optional.ofNullable(ratingKey);
            return this;
        }

        public Builder ratingKey(Optional<? extends String> ratingKey) {
            Utils.checkNotNull(ratingKey, "ratingKey");
            this.ratingKey = ratingKey;
            return this;
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<? extends String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder parentRatingKey(String parentRatingKey) {
            Utils.checkNotNull(parentRatingKey, "parentRatingKey");
            this.parentRatingKey = Optional.ofNullable(parentRatingKey);
            return this;
        }

        public Builder parentRatingKey(Optional<? extends String> parentRatingKey) {
            Utils.checkNotNull(parentRatingKey, "parentRatingKey");
            this.parentRatingKey = parentRatingKey;
            return this;
        }

        public Builder guid(String guid) {
            Utils.checkNotNull(guid, "guid");
            this.guid = Optional.ofNullable(guid);
            return this;
        }

        public Builder guid(Optional<? extends String> guid) {
            Utils.checkNotNull(guid, "guid");
            this.guid = guid;
            return this;
        }

        public Builder parentGuid(String parentGuid) {
            Utils.checkNotNull(parentGuid, "parentGuid");
            this.parentGuid = Optional.ofNullable(parentGuid);
            return this;
        }

        public Builder parentGuid(Optional<? extends String> parentGuid) {
            Utils.checkNotNull(parentGuid, "parentGuid");
            this.parentGuid = parentGuid;
            return this;
        }

        public Builder parentStudio(String parentStudio) {
            Utils.checkNotNull(parentStudio, "parentStudio");
            this.parentStudio = Optional.ofNullable(parentStudio);
            return this;
        }

        public Builder parentStudio(Optional<? extends String> parentStudio) {
            Utils.checkNotNull(parentStudio, "parentStudio");
            this.parentStudio = parentStudio;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<? extends String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder parentKey(String parentKey) {
            Utils.checkNotNull(parentKey, "parentKey");
            this.parentKey = Optional.ofNullable(parentKey);
            return this;
        }

        public Builder parentKey(Optional<? extends String> parentKey) {
            Utils.checkNotNull(parentKey, "parentKey");
            this.parentKey = parentKey;
            return this;
        }

        public Builder parentTitle(String parentTitle) {
            Utils.checkNotNull(parentTitle, "parentTitle");
            this.parentTitle = Optional.ofNullable(parentTitle);
            return this;
        }

        public Builder parentTitle(Optional<? extends String> parentTitle) {
            Utils.checkNotNull(parentTitle, "parentTitle");
            this.parentTitle = parentTitle;
            return this;
        }

        public Builder summary(String summary) {
            Utils.checkNotNull(summary, "summary");
            this.summary = Optional.ofNullable(summary);
            return this;
        }

        public Builder summary(Optional<? extends String> summary) {
            Utils.checkNotNull(summary, "summary");
            this.summary = summary;
            return this;
        }

        public Builder index(int index) {
            Utils.checkNotNull(index, "index");
            this.index = Optional.ofNullable(index);
            return this;
        }

        public Builder index(Optional<? extends Integer> index) {
            Utils.checkNotNull(index, "index");
            this.index = index;
            return this;
        }

        public Builder parentIndex(int parentIndex) {
            Utils.checkNotNull(parentIndex, "parentIndex");
            this.parentIndex = Optional.ofNullable(parentIndex);
            return this;
        }

        public Builder parentIndex(Optional<? extends Integer> parentIndex) {
            Utils.checkNotNull(parentIndex, "parentIndex");
            this.parentIndex = parentIndex;
            return this;
        }

        public Builder parentYear(int parentYear) {
            Utils.checkNotNull(parentYear, "parentYear");
            this.parentYear = Optional.ofNullable(parentYear);
            return this;
        }

        public Builder parentYear(Optional<? extends Integer> parentYear) {
            Utils.checkNotNull(parentYear, "parentYear");
            this.parentYear = parentYear;
            return this;
        }

        public Builder thumb(String thumb) {
            Utils.checkNotNull(thumb, "thumb");
            this.thumb = Optional.ofNullable(thumb);
            return this;
        }

        public Builder thumb(Optional<? extends String> thumb) {
            Utils.checkNotNull(thumb, "thumb");
            this.thumb = thumb;
            return this;
        }

        public Builder art(String art) {
            Utils.checkNotNull(art, "art");
            this.art = Optional.ofNullable(art);
            return this;
        }

        public Builder art(Optional<? extends String> art) {
            Utils.checkNotNull(art, "art");
            this.art = art;
            return this;
        }

        public Builder parentThumb(String parentThumb) {
            Utils.checkNotNull(parentThumb, "parentThumb");
            this.parentThumb = Optional.ofNullable(parentThumb);
            return this;
        }

        public Builder parentThumb(Optional<? extends String> parentThumb) {
            Utils.checkNotNull(parentThumb, "parentThumb");
            this.parentThumb = parentThumb;
            return this;
        }

        public Builder parentTheme(String parentTheme) {
            Utils.checkNotNull(parentTheme, "parentTheme");
            this.parentTheme = Optional.ofNullable(parentTheme);
            return this;
        }

        public Builder parentTheme(Optional<? extends String> parentTheme) {
            Utils.checkNotNull(parentTheme, "parentTheme");
            this.parentTheme = parentTheme;
            return this;
        }

        public Builder addedAt(int addedAt) {
            Utils.checkNotNull(addedAt, "addedAt");
            this.addedAt = Optional.ofNullable(addedAt);
            return this;
        }

        public Builder addedAt(Optional<? extends Integer> addedAt) {
            Utils.checkNotNull(addedAt, "addedAt");
            this.addedAt = addedAt;
            return this;
        }

        public Builder updatedAt(int updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        public Builder updatedAt(Optional<? extends Integer> updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public SearchLibraryMetadata build() {
            return new SearchLibraryMetadata(
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

