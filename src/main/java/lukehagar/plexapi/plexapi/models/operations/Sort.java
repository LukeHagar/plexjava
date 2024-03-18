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


public class Sort {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default")
    private Optional<? extends String> default_;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultDirection")
    private Optional<? extends String> defaultDirection;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("descKey")
    private Optional<? extends String> descKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("firstCharacterKey")
    private Optional<? extends String> firstCharacterKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<? extends String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<? extends String> title;

    public Sort(
            @JsonProperty("default") Optional<? extends String> default_,
            @JsonProperty("defaultDirection") Optional<? extends String> defaultDirection,
            @JsonProperty("descKey") Optional<? extends String> descKey,
            @JsonProperty("firstCharacterKey") Optional<? extends String> firstCharacterKey,
            @JsonProperty("key") Optional<? extends String> key,
            @JsonProperty("title") Optional<? extends String> title) {
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

    public Optional<? extends String> default_() {
        return default_;
    }

    public Optional<? extends String> defaultDirection() {
        return defaultDirection;
    }

    public Optional<? extends String> descKey() {
        return descKey;
    }

    public Optional<? extends String> firstCharacterKey() {
        return firstCharacterKey;
    }

    public Optional<? extends String> key() {
        return key;
    }

    public Optional<? extends String> title() {
        return title;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Sort withDefault(String default_) {
        Utils.checkNotNull(default_, "default_");
        this.default_ = Optional.ofNullable(default_);
        return this;
    }

    public Sort withDefault(Optional<? extends String> default_) {
        Utils.checkNotNull(default_, "default_");
        this.default_ = default_;
        return this;
    }

    public Sort withDefaultDirection(String defaultDirection) {
        Utils.checkNotNull(defaultDirection, "defaultDirection");
        this.defaultDirection = Optional.ofNullable(defaultDirection);
        return this;
    }

    public Sort withDefaultDirection(Optional<? extends String> defaultDirection) {
        Utils.checkNotNull(defaultDirection, "defaultDirection");
        this.defaultDirection = defaultDirection;
        return this;
    }

    public Sort withDescKey(String descKey) {
        Utils.checkNotNull(descKey, "descKey");
        this.descKey = Optional.ofNullable(descKey);
        return this;
    }

    public Sort withDescKey(Optional<? extends String> descKey) {
        Utils.checkNotNull(descKey, "descKey");
        this.descKey = descKey;
        return this;
    }

    public Sort withFirstCharacterKey(String firstCharacterKey) {
        Utils.checkNotNull(firstCharacterKey, "firstCharacterKey");
        this.firstCharacterKey = Optional.ofNullable(firstCharacterKey);
        return this;
    }

    public Sort withFirstCharacterKey(Optional<? extends String> firstCharacterKey) {
        Utils.checkNotNull(firstCharacterKey, "firstCharacterKey");
        this.firstCharacterKey = firstCharacterKey;
        return this;
    }

    public Sort withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public Sort withKey(Optional<? extends String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public Sort withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public Sort withTitle(Optional<? extends String> title) {
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
        Sort other = (Sort) o;
        return 
            java.util.Objects.deepEquals(this.default_, other.default_) &&
            java.util.Objects.deepEquals(this.defaultDirection, other.defaultDirection) &&
            java.util.Objects.deepEquals(this.descKey, other.descKey) &&
            java.util.Objects.deepEquals(this.firstCharacterKey, other.firstCharacterKey) &&
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.title, other.title);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            default_,
            defaultDirection,
            descKey,
            firstCharacterKey,
            key,
            title);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Sort.class,
                "default_", default_,
                "defaultDirection", defaultDirection,
                "descKey", descKey,
                "firstCharacterKey", firstCharacterKey,
                "key", key,
                "title", title);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> default_ = Optional.empty();
 
        private Optional<? extends String> defaultDirection = Optional.empty();
 
        private Optional<? extends String> descKey = Optional.empty();
 
        private Optional<? extends String> firstCharacterKey = Optional.empty();
 
        private Optional<? extends String> key = Optional.empty();
 
        private Optional<? extends String> title = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder default_(String default_) {
            Utils.checkNotNull(default_, "default_");
            this.default_ = Optional.ofNullable(default_);
            return this;
        }

        public Builder default_(Optional<? extends String> default_) {
            Utils.checkNotNull(default_, "default_");
            this.default_ = default_;
            return this;
        }

        public Builder defaultDirection(String defaultDirection) {
            Utils.checkNotNull(defaultDirection, "defaultDirection");
            this.defaultDirection = Optional.ofNullable(defaultDirection);
            return this;
        }

        public Builder defaultDirection(Optional<? extends String> defaultDirection) {
            Utils.checkNotNull(defaultDirection, "defaultDirection");
            this.defaultDirection = defaultDirection;
            return this;
        }

        public Builder descKey(String descKey) {
            Utils.checkNotNull(descKey, "descKey");
            this.descKey = Optional.ofNullable(descKey);
            return this;
        }

        public Builder descKey(Optional<? extends String> descKey) {
            Utils.checkNotNull(descKey, "descKey");
            this.descKey = descKey;
            return this;
        }

        public Builder firstCharacterKey(String firstCharacterKey) {
            Utils.checkNotNull(firstCharacterKey, "firstCharacterKey");
            this.firstCharacterKey = Optional.ofNullable(firstCharacterKey);
            return this;
        }

        public Builder firstCharacterKey(Optional<? extends String> firstCharacterKey) {
            Utils.checkNotNull(firstCharacterKey, "firstCharacterKey");
            this.firstCharacterKey = firstCharacterKey;
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
        
        public Sort build() {
            return new Sort(
                default_,
                defaultDirection,
                descKey,
                firstCharacterKey,
                key,
                title);
        }
    }
}

