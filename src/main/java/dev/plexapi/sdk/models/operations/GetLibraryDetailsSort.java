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
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class GetLibraryDetailsSort {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default")
    private Optional<String> default_;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultDirection")
    private Optional<String> defaultDirection;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("descKey")
    private Optional<String> descKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("firstCharacterKey")
    private Optional<String> firstCharacterKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonCreator
    public GetLibraryDetailsSort(
            @JsonProperty("default") Optional<String> default_,
            @JsonProperty("defaultDirection") Optional<String> defaultDirection,
            @JsonProperty("descKey") Optional<String> descKey,
            @JsonProperty("firstCharacterKey") Optional<String> firstCharacterKey,
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("title") Optional<String> title) {
        Utils.checkNotNull(default_, "default_");
        Utils.checkNotNull(defaultDirection, "defaultDirection");
        Utils.checkNotNull(descKey, "descKey");
        Utils.checkNotNull(firstCharacterKey, "firstCharacterKey");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(title, "title");
        this.default_ = default_;
        this.defaultDirection = defaultDirection;
        this.descKey = descKey;
        this.firstCharacterKey = firstCharacterKey;
        this.key = key;
        this.title = title;
    }
    
    public GetLibraryDetailsSort() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> default_() {
        return default_;
    }

    @JsonIgnore
    public Optional<String> defaultDirection() {
        return defaultDirection;
    }

    @JsonIgnore
    public Optional<String> descKey() {
        return descKey;
    }

    @JsonIgnore
    public Optional<String> firstCharacterKey() {
        return firstCharacterKey;
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLibraryDetailsSort withDefault(String default_) {
        Utils.checkNotNull(default_, "default_");
        this.default_ = Optional.ofNullable(default_);
        return this;
    }

    public GetLibraryDetailsSort withDefault(Optional<String> default_) {
        Utils.checkNotNull(default_, "default_");
        this.default_ = default_;
        return this;
    }

    public GetLibraryDetailsSort withDefaultDirection(String defaultDirection) {
        Utils.checkNotNull(defaultDirection, "defaultDirection");
        this.defaultDirection = Optional.ofNullable(defaultDirection);
        return this;
    }

    public GetLibraryDetailsSort withDefaultDirection(Optional<String> defaultDirection) {
        Utils.checkNotNull(defaultDirection, "defaultDirection");
        this.defaultDirection = defaultDirection;
        return this;
    }

    public GetLibraryDetailsSort withDescKey(String descKey) {
        Utils.checkNotNull(descKey, "descKey");
        this.descKey = Optional.ofNullable(descKey);
        return this;
    }

    public GetLibraryDetailsSort withDescKey(Optional<String> descKey) {
        Utils.checkNotNull(descKey, "descKey");
        this.descKey = descKey;
        return this;
    }

    public GetLibraryDetailsSort withFirstCharacterKey(String firstCharacterKey) {
        Utils.checkNotNull(firstCharacterKey, "firstCharacterKey");
        this.firstCharacterKey = Optional.ofNullable(firstCharacterKey);
        return this;
    }

    public GetLibraryDetailsSort withFirstCharacterKey(Optional<String> firstCharacterKey) {
        Utils.checkNotNull(firstCharacterKey, "firstCharacterKey");
        this.firstCharacterKey = firstCharacterKey;
        return this;
    }

    public GetLibraryDetailsSort withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetLibraryDetailsSort withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetLibraryDetailsSort withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public GetLibraryDetailsSort withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
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
        GetLibraryDetailsSort other = (GetLibraryDetailsSort) o;
        return 
            Objects.deepEquals(this.default_, other.default_) &&
            Objects.deepEquals(this.defaultDirection, other.defaultDirection) &&
            Objects.deepEquals(this.descKey, other.descKey) &&
            Objects.deepEquals(this.firstCharacterKey, other.firstCharacterKey) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.title, other.title);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            default_,
            defaultDirection,
            descKey,
            firstCharacterKey,
            key,
            title);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLibraryDetailsSort.class,
                "default_", default_,
                "defaultDirection", defaultDirection,
                "descKey", descKey,
                "firstCharacterKey", firstCharacterKey,
                "key", key,
                "title", title);
    }
    
    public final static class Builder {
 
        private Optional<String> default_ = Optional.empty();
 
        private Optional<String> defaultDirection = Optional.empty();
 
        private Optional<String> descKey = Optional.empty();
 
        private Optional<String> firstCharacterKey = Optional.empty();
 
        private Optional<String> key = Optional.empty();
 
        private Optional<String> title = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder default_(String default_) {
            Utils.checkNotNull(default_, "default_");
            this.default_ = Optional.ofNullable(default_);
            return this;
        }

        public Builder default_(Optional<String> default_) {
            Utils.checkNotNull(default_, "default_");
            this.default_ = default_;
            return this;
        }

        public Builder defaultDirection(String defaultDirection) {
            Utils.checkNotNull(defaultDirection, "defaultDirection");
            this.defaultDirection = Optional.ofNullable(defaultDirection);
            return this;
        }

        public Builder defaultDirection(Optional<String> defaultDirection) {
            Utils.checkNotNull(defaultDirection, "defaultDirection");
            this.defaultDirection = defaultDirection;
            return this;
        }

        public Builder descKey(String descKey) {
            Utils.checkNotNull(descKey, "descKey");
            this.descKey = Optional.ofNullable(descKey);
            return this;
        }

        public Builder descKey(Optional<String> descKey) {
            Utils.checkNotNull(descKey, "descKey");
            this.descKey = descKey;
            return this;
        }

        public Builder firstCharacterKey(String firstCharacterKey) {
            Utils.checkNotNull(firstCharacterKey, "firstCharacterKey");
            this.firstCharacterKey = Optional.ofNullable(firstCharacterKey);
            return this;
        }

        public Builder firstCharacterKey(Optional<String> firstCharacterKey) {
            Utils.checkNotNull(firstCharacterKey, "firstCharacterKey");
            this.firstCharacterKey = firstCharacterKey;
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
        
        public GetLibraryDetailsSort build() {
            return new GetLibraryDetailsSort(
                default_,
                defaultDirection,
                descKey,
                firstCharacterKey,
                key,
                title);
        }
    }
}

