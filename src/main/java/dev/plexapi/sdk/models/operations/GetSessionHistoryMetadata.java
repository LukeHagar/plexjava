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
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

public class GetSessionHistoryMetadata {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("historyKey")
    private Optional<String> historyKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ratingKey")
    private Optional<String> ratingKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("librarySectionID")
    private Optional<String> librarySectionID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentKey")
    private Optional<String> parentKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentKey")
    private Optional<String> grandparentKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentTitle")
    private Optional<String> grandparentTitle;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    private Optional<String> thumb;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentThumb")
    private Optional<String> parentThumb;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentThumb")
    private Optional<String> grandparentThumb;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("grandparentArt")
    private Optional<String> grandparentArt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("index")
    private Optional<Integer> index;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parentIndex")
    private Optional<Integer> parentIndex;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("originallyAvailableAt")
    private Optional<LocalDate> originallyAvailableAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("viewedAt")
    private Optional<Integer> viewedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accountID")
    private Optional<Integer> accountID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deviceID")
    private Optional<Integer> deviceID;

    @JsonCreator
    public GetSessionHistoryMetadata(
            @JsonProperty("historyKey") Optional<String> historyKey,
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("ratingKey") Optional<String> ratingKey,
            @JsonProperty("librarySectionID") Optional<String> librarySectionID,
            @JsonProperty("parentKey") Optional<String> parentKey,
            @JsonProperty("grandparentKey") Optional<String> grandparentKey,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("grandparentTitle") Optional<String> grandparentTitle,
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("thumb") Optional<String> thumb,
            @JsonProperty("parentThumb") Optional<String> parentThumb,
            @JsonProperty("grandparentThumb") Optional<String> grandparentThumb,
            @JsonProperty("grandparentArt") Optional<String> grandparentArt,
            @JsonProperty("index") Optional<Integer> index,
            @JsonProperty("parentIndex") Optional<Integer> parentIndex,
            @JsonProperty("originallyAvailableAt") Optional<LocalDate> originallyAvailableAt,
            @JsonProperty("viewedAt") Optional<Integer> viewedAt,
            @JsonProperty("accountID") Optional<Integer> accountID,
            @JsonProperty("deviceID") Optional<Integer> deviceID) {
        Utils.checkNotNull(historyKey, "historyKey");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(ratingKey, "ratingKey");
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        Utils.checkNotNull(parentKey, "parentKey");
        Utils.checkNotNull(grandparentKey, "grandparentKey");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(grandparentTitle, "grandparentTitle");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(thumb, "thumb");
        Utils.checkNotNull(parentThumb, "parentThumb");
        Utils.checkNotNull(grandparentThumb, "grandparentThumb");
        Utils.checkNotNull(grandparentArt, "grandparentArt");
        Utils.checkNotNull(index, "index");
        Utils.checkNotNull(parentIndex, "parentIndex");
        Utils.checkNotNull(originallyAvailableAt, "originallyAvailableAt");
        Utils.checkNotNull(viewedAt, "viewedAt");
        Utils.checkNotNull(accountID, "accountID");
        Utils.checkNotNull(deviceID, "deviceID");
        this.historyKey = historyKey;
        this.key = key;
        this.ratingKey = ratingKey;
        this.librarySectionID = librarySectionID;
        this.parentKey = parentKey;
        this.grandparentKey = grandparentKey;
        this.title = title;
        this.grandparentTitle = grandparentTitle;
        this.type = type;
        this.thumb = thumb;
        this.parentThumb = parentThumb;
        this.grandparentThumb = grandparentThumb;
        this.grandparentArt = grandparentArt;
        this.index = index;
        this.parentIndex = parentIndex;
        this.originallyAvailableAt = originallyAvailableAt;
        this.viewedAt = viewedAt;
        this.accountID = accountID;
        this.deviceID = deviceID;
    }
    
    public GetSessionHistoryMetadata() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> historyKey() {
        return historyKey;
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    @JsonIgnore
    public Optional<String> ratingKey() {
        return ratingKey;
    }

    @JsonIgnore
    public Optional<String> librarySectionID() {
        return librarySectionID;
    }

    @JsonIgnore
    public Optional<String> parentKey() {
        return parentKey;
    }

    @JsonIgnore
    public Optional<String> grandparentKey() {
        return grandparentKey;
    }

    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    @JsonIgnore
    public Optional<String> grandparentTitle() {
        return grandparentTitle;
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    @JsonIgnore
    public Optional<String> thumb() {
        return thumb;
    }

    @JsonIgnore
    public Optional<String> parentThumb() {
        return parentThumb;
    }

    @JsonIgnore
    public Optional<String> grandparentThumb() {
        return grandparentThumb;
    }

    @JsonIgnore
    public Optional<String> grandparentArt() {
        return grandparentArt;
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
    public Optional<LocalDate> originallyAvailableAt() {
        return originallyAvailableAt;
    }

    @JsonIgnore
    public Optional<Integer> viewedAt() {
        return viewedAt;
    }

    @JsonIgnore
    public Optional<Integer> accountID() {
        return accountID;
    }

    @JsonIgnore
    public Optional<Integer> deviceID() {
        return deviceID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetSessionHistoryMetadata withHistoryKey(String historyKey) {
        Utils.checkNotNull(historyKey, "historyKey");
        this.historyKey = Optional.ofNullable(historyKey);
        return this;
    }

    public GetSessionHistoryMetadata withHistoryKey(Optional<String> historyKey) {
        Utils.checkNotNull(historyKey, "historyKey");
        this.historyKey = historyKey;
        return this;
    }

    public GetSessionHistoryMetadata withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetSessionHistoryMetadata withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetSessionHistoryMetadata withRatingKey(String ratingKey) {
        Utils.checkNotNull(ratingKey, "ratingKey");
        this.ratingKey = Optional.ofNullable(ratingKey);
        return this;
    }

    public GetSessionHistoryMetadata withRatingKey(Optional<String> ratingKey) {
        Utils.checkNotNull(ratingKey, "ratingKey");
        this.ratingKey = ratingKey;
        return this;
    }

    public GetSessionHistoryMetadata withLibrarySectionID(String librarySectionID) {
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        this.librarySectionID = Optional.ofNullable(librarySectionID);
        return this;
    }

    public GetSessionHistoryMetadata withLibrarySectionID(Optional<String> librarySectionID) {
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        this.librarySectionID = librarySectionID;
        return this;
    }

    public GetSessionHistoryMetadata withParentKey(String parentKey) {
        Utils.checkNotNull(parentKey, "parentKey");
        this.parentKey = Optional.ofNullable(parentKey);
        return this;
    }

    public GetSessionHistoryMetadata withParentKey(Optional<String> parentKey) {
        Utils.checkNotNull(parentKey, "parentKey");
        this.parentKey = parentKey;
        return this;
    }

    public GetSessionHistoryMetadata withGrandparentKey(String grandparentKey) {
        Utils.checkNotNull(grandparentKey, "grandparentKey");
        this.grandparentKey = Optional.ofNullable(grandparentKey);
        return this;
    }

    public GetSessionHistoryMetadata withGrandparentKey(Optional<String> grandparentKey) {
        Utils.checkNotNull(grandparentKey, "grandparentKey");
        this.grandparentKey = grandparentKey;
        return this;
    }

    public GetSessionHistoryMetadata withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public GetSessionHistoryMetadata withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public GetSessionHistoryMetadata withGrandparentTitle(String grandparentTitle) {
        Utils.checkNotNull(grandparentTitle, "grandparentTitle");
        this.grandparentTitle = Optional.ofNullable(grandparentTitle);
        return this;
    }

    public GetSessionHistoryMetadata withGrandparentTitle(Optional<String> grandparentTitle) {
        Utils.checkNotNull(grandparentTitle, "grandparentTitle");
        this.grandparentTitle = grandparentTitle;
        return this;
    }

    public GetSessionHistoryMetadata withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public GetSessionHistoryMetadata withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetSessionHistoryMetadata withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = Optional.ofNullable(thumb);
        return this;
    }

    public GetSessionHistoryMetadata withThumb(Optional<String> thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = thumb;
        return this;
    }

    public GetSessionHistoryMetadata withParentThumb(String parentThumb) {
        Utils.checkNotNull(parentThumb, "parentThumb");
        this.parentThumb = Optional.ofNullable(parentThumb);
        return this;
    }

    public GetSessionHistoryMetadata withParentThumb(Optional<String> parentThumb) {
        Utils.checkNotNull(parentThumb, "parentThumb");
        this.parentThumb = parentThumb;
        return this;
    }

    public GetSessionHistoryMetadata withGrandparentThumb(String grandparentThumb) {
        Utils.checkNotNull(grandparentThumb, "grandparentThumb");
        this.grandparentThumb = Optional.ofNullable(grandparentThumb);
        return this;
    }

    public GetSessionHistoryMetadata withGrandparentThumb(Optional<String> grandparentThumb) {
        Utils.checkNotNull(grandparentThumb, "grandparentThumb");
        this.grandparentThumb = grandparentThumb;
        return this;
    }

    public GetSessionHistoryMetadata withGrandparentArt(String grandparentArt) {
        Utils.checkNotNull(grandparentArt, "grandparentArt");
        this.grandparentArt = Optional.ofNullable(grandparentArt);
        return this;
    }

    public GetSessionHistoryMetadata withGrandparentArt(Optional<String> grandparentArt) {
        Utils.checkNotNull(grandparentArt, "grandparentArt");
        this.grandparentArt = grandparentArt;
        return this;
    }

    public GetSessionHistoryMetadata withIndex(int index) {
        Utils.checkNotNull(index, "index");
        this.index = Optional.ofNullable(index);
        return this;
    }

    public GetSessionHistoryMetadata withIndex(Optional<Integer> index) {
        Utils.checkNotNull(index, "index");
        this.index = index;
        return this;
    }

    public GetSessionHistoryMetadata withParentIndex(int parentIndex) {
        Utils.checkNotNull(parentIndex, "parentIndex");
        this.parentIndex = Optional.ofNullable(parentIndex);
        return this;
    }

    public GetSessionHistoryMetadata withParentIndex(Optional<Integer> parentIndex) {
        Utils.checkNotNull(parentIndex, "parentIndex");
        this.parentIndex = parentIndex;
        return this;
    }

    public GetSessionHistoryMetadata withOriginallyAvailableAt(LocalDate originallyAvailableAt) {
        Utils.checkNotNull(originallyAvailableAt, "originallyAvailableAt");
        this.originallyAvailableAt = Optional.ofNullable(originallyAvailableAt);
        return this;
    }

    public GetSessionHistoryMetadata withOriginallyAvailableAt(Optional<LocalDate> originallyAvailableAt) {
        Utils.checkNotNull(originallyAvailableAt, "originallyAvailableAt");
        this.originallyAvailableAt = originallyAvailableAt;
        return this;
    }

    public GetSessionHistoryMetadata withViewedAt(int viewedAt) {
        Utils.checkNotNull(viewedAt, "viewedAt");
        this.viewedAt = Optional.ofNullable(viewedAt);
        return this;
    }

    public GetSessionHistoryMetadata withViewedAt(Optional<Integer> viewedAt) {
        Utils.checkNotNull(viewedAt, "viewedAt");
        this.viewedAt = viewedAt;
        return this;
    }

    public GetSessionHistoryMetadata withAccountID(int accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = Optional.ofNullable(accountID);
        return this;
    }

    public GetSessionHistoryMetadata withAccountID(Optional<Integer> accountID) {
        Utils.checkNotNull(accountID, "accountID");
        this.accountID = accountID;
        return this;
    }

    public GetSessionHistoryMetadata withDeviceID(int deviceID) {
        Utils.checkNotNull(deviceID, "deviceID");
        this.deviceID = Optional.ofNullable(deviceID);
        return this;
    }

    public GetSessionHistoryMetadata withDeviceID(Optional<Integer> deviceID) {
        Utils.checkNotNull(deviceID, "deviceID");
        this.deviceID = deviceID;
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
        GetSessionHistoryMetadata other = (GetSessionHistoryMetadata) o;
        return 
            Objects.deepEquals(this.historyKey, other.historyKey) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.ratingKey, other.ratingKey) &&
            Objects.deepEquals(this.librarySectionID, other.librarySectionID) &&
            Objects.deepEquals(this.parentKey, other.parentKey) &&
            Objects.deepEquals(this.grandparentKey, other.grandparentKey) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.grandparentTitle, other.grandparentTitle) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.thumb, other.thumb) &&
            Objects.deepEquals(this.parentThumb, other.parentThumb) &&
            Objects.deepEquals(this.grandparentThumb, other.grandparentThumb) &&
            Objects.deepEquals(this.grandparentArt, other.grandparentArt) &&
            Objects.deepEquals(this.index, other.index) &&
            Objects.deepEquals(this.parentIndex, other.parentIndex) &&
            Objects.deepEquals(this.originallyAvailableAt, other.originallyAvailableAt) &&
            Objects.deepEquals(this.viewedAt, other.viewedAt) &&
            Objects.deepEquals(this.accountID, other.accountID) &&
            Objects.deepEquals(this.deviceID, other.deviceID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            historyKey,
            key,
            ratingKey,
            librarySectionID,
            parentKey,
            grandparentKey,
            title,
            grandparentTitle,
            type,
            thumb,
            parentThumb,
            grandparentThumb,
            grandparentArt,
            index,
            parentIndex,
            originallyAvailableAt,
            viewedAt,
            accountID,
            deviceID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSessionHistoryMetadata.class,
                "historyKey", historyKey,
                "key", key,
                "ratingKey", ratingKey,
                "librarySectionID", librarySectionID,
                "parentKey", parentKey,
                "grandparentKey", grandparentKey,
                "title", title,
                "grandparentTitle", grandparentTitle,
                "type", type,
                "thumb", thumb,
                "parentThumb", parentThumb,
                "grandparentThumb", grandparentThumb,
                "grandparentArt", grandparentArt,
                "index", index,
                "parentIndex", parentIndex,
                "originallyAvailableAt", originallyAvailableAt,
                "viewedAt", viewedAt,
                "accountID", accountID,
                "deviceID", deviceID);
    }
    
    public final static class Builder {
 
        private Optional<String> historyKey = Optional.empty();
 
        private Optional<String> key = Optional.empty();
 
        private Optional<String> ratingKey = Optional.empty();
 
        private Optional<String> librarySectionID = Optional.empty();
 
        private Optional<String> parentKey = Optional.empty();
 
        private Optional<String> grandparentKey = Optional.empty();
 
        private Optional<String> title = Optional.empty();
 
        private Optional<String> grandparentTitle = Optional.empty();
 
        private Optional<String> type = Optional.empty();
 
        private Optional<String> thumb = Optional.empty();
 
        private Optional<String> parentThumb = Optional.empty();
 
        private Optional<String> grandparentThumb = Optional.empty();
 
        private Optional<String> grandparentArt = Optional.empty();
 
        private Optional<Integer> index = Optional.empty();
 
        private Optional<Integer> parentIndex = Optional.empty();
 
        private Optional<LocalDate> originallyAvailableAt = Optional.empty();
 
        private Optional<Integer> viewedAt = Optional.empty();
 
        private Optional<Integer> accountID = Optional.empty();
 
        private Optional<Integer> deviceID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder historyKey(String historyKey) {
            Utils.checkNotNull(historyKey, "historyKey");
            this.historyKey = Optional.ofNullable(historyKey);
            return this;
        }

        public Builder historyKey(Optional<String> historyKey) {
            Utils.checkNotNull(historyKey, "historyKey");
            this.historyKey = historyKey;
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

        public Builder librarySectionID(String librarySectionID) {
            Utils.checkNotNull(librarySectionID, "librarySectionID");
            this.librarySectionID = Optional.ofNullable(librarySectionID);
            return this;
        }

        public Builder librarySectionID(Optional<String> librarySectionID) {
            Utils.checkNotNull(librarySectionID, "librarySectionID");
            this.librarySectionID = librarySectionID;
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

        public Builder grandparentKey(String grandparentKey) {
            Utils.checkNotNull(grandparentKey, "grandparentKey");
            this.grandparentKey = Optional.ofNullable(grandparentKey);
            return this;
        }

        public Builder grandparentKey(Optional<String> grandparentKey) {
            Utils.checkNotNull(grandparentKey, "grandparentKey");
            this.grandparentKey = grandparentKey;
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

        public Builder grandparentTitle(String grandparentTitle) {
            Utils.checkNotNull(grandparentTitle, "grandparentTitle");
            this.grandparentTitle = Optional.ofNullable(grandparentTitle);
            return this;
        }

        public Builder grandparentTitle(Optional<String> grandparentTitle) {
            Utils.checkNotNull(grandparentTitle, "grandparentTitle");
            this.grandparentTitle = grandparentTitle;
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

        public Builder grandparentThumb(String grandparentThumb) {
            Utils.checkNotNull(grandparentThumb, "grandparentThumb");
            this.grandparentThumb = Optional.ofNullable(grandparentThumb);
            return this;
        }

        public Builder grandparentThumb(Optional<String> grandparentThumb) {
            Utils.checkNotNull(grandparentThumb, "grandparentThumb");
            this.grandparentThumb = grandparentThumb;
            return this;
        }

        public Builder grandparentArt(String grandparentArt) {
            Utils.checkNotNull(grandparentArt, "grandparentArt");
            this.grandparentArt = Optional.ofNullable(grandparentArt);
            return this;
        }

        public Builder grandparentArt(Optional<String> grandparentArt) {
            Utils.checkNotNull(grandparentArt, "grandparentArt");
            this.grandparentArt = grandparentArt;
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

        public Builder originallyAvailableAt(LocalDate originallyAvailableAt) {
            Utils.checkNotNull(originallyAvailableAt, "originallyAvailableAt");
            this.originallyAvailableAt = Optional.ofNullable(originallyAvailableAt);
            return this;
        }

        public Builder originallyAvailableAt(Optional<LocalDate> originallyAvailableAt) {
            Utils.checkNotNull(originallyAvailableAt, "originallyAvailableAt");
            this.originallyAvailableAt = originallyAvailableAt;
            return this;
        }

        public Builder viewedAt(int viewedAt) {
            Utils.checkNotNull(viewedAt, "viewedAt");
            this.viewedAt = Optional.ofNullable(viewedAt);
            return this;
        }

        public Builder viewedAt(Optional<Integer> viewedAt) {
            Utils.checkNotNull(viewedAt, "viewedAt");
            this.viewedAt = viewedAt;
            return this;
        }

        public Builder accountID(int accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = Optional.ofNullable(accountID);
            return this;
        }

        public Builder accountID(Optional<Integer> accountID) {
            Utils.checkNotNull(accountID, "accountID");
            this.accountID = accountID;
            return this;
        }

        public Builder deviceID(int deviceID) {
            Utils.checkNotNull(deviceID, "deviceID");
            this.deviceID = Optional.ofNullable(deviceID);
            return this;
        }

        public Builder deviceID(Optional<Integer> deviceID) {
            Utils.checkNotNull(deviceID, "deviceID");
            this.deviceID = deviceID;
            return this;
        }
        
        public GetSessionHistoryMetadata build() {
            return new GetSessionHistoryMetadata(
                historyKey,
                key,
                ratingKey,
                librarySectionID,
                parentKey,
                grandparentKey,
                title,
                grandparentTitle,
                type,
                thumb,
                parentThumb,
                grandparentThumb,
                grandparentArt,
                index,
                parentIndex,
                originallyAvailableAt,
                viewedAt,
                accountID,
                deviceID);
        }
    }
}

