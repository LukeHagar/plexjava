/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.utils.LazySingletonValue;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class Sort {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default")
    private Optional<String> default_;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private Optional<Boolean> active;

    /**
     * The direction of the sort. Can be either `asc` or `desc`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("activeDirection")
    private Optional<? extends ActiveDirection> activeDirection;

    /**
     * The direction of the sort. Can be either `asc` or `desc`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultDirection")
    private Optional<? extends DefaultDirection> defaultDirection;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("descKey")
    private Optional<String> descKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("firstCharacterKey")
    private Optional<String> firstCharacterKey;

    @JsonProperty("key")
    private String key;

    @JsonProperty("title")
    private String title;

    @JsonCreator
    public Sort(
            @JsonProperty("default") Optional<String> default_,
            @JsonProperty("active") Optional<Boolean> active,
            @JsonProperty("activeDirection") Optional<? extends ActiveDirection> activeDirection,
            @JsonProperty("defaultDirection") Optional<? extends DefaultDirection> defaultDirection,
            @JsonProperty("descKey") Optional<String> descKey,
            @JsonProperty("firstCharacterKey") Optional<String> firstCharacterKey,
            @JsonProperty("key") String key,
            @JsonProperty("title") String title) {
        Utils.checkNotNull(default_, "default_");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(activeDirection, "activeDirection");
        Utils.checkNotNull(defaultDirection, "defaultDirection");
        Utils.checkNotNull(descKey, "descKey");
        Utils.checkNotNull(firstCharacterKey, "firstCharacterKey");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(title, "title");
        this.default_ = default_;
        this.active = active;
        this.activeDirection = activeDirection;
        this.defaultDirection = defaultDirection;
        this.descKey = descKey;
        this.firstCharacterKey = firstCharacterKey;
        this.key = key;
        this.title = title;
    }
    
    public Sort(
            String key,
            String title) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), key, title);
    }

    @JsonIgnore
    public Optional<String> default_() {
        return default_;
    }

    @JsonIgnore
    public Optional<Boolean> active() {
        return active;
    }

    /**
     * The direction of the sort. Can be either `asc` or `desc`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ActiveDirection> activeDirection() {
        return (Optional<ActiveDirection>) activeDirection;
    }

    /**
     * The direction of the sort. Can be either `asc` or `desc`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DefaultDirection> defaultDirection() {
        return (Optional<DefaultDirection>) defaultDirection;
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
    public String key() {
        return key;
    }

    @JsonIgnore
    public String title() {
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

    public Sort withDefault(Optional<String> default_) {
        Utils.checkNotNull(default_, "default_");
        this.default_ = default_;
        return this;
    }

    public Sort withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = Optional.ofNullable(active);
        return this;
    }

    public Sort withActive(Optional<Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    /**
     * The direction of the sort. Can be either `asc` or `desc`.
     */
    public Sort withActiveDirection(ActiveDirection activeDirection) {
        Utils.checkNotNull(activeDirection, "activeDirection");
        this.activeDirection = Optional.ofNullable(activeDirection);
        return this;
    }

    /**
     * The direction of the sort. Can be either `asc` or `desc`.
     */
    public Sort withActiveDirection(Optional<? extends ActiveDirection> activeDirection) {
        Utils.checkNotNull(activeDirection, "activeDirection");
        this.activeDirection = activeDirection;
        return this;
    }

    /**
     * The direction of the sort. Can be either `asc` or `desc`.
     */
    public Sort withDefaultDirection(DefaultDirection defaultDirection) {
        Utils.checkNotNull(defaultDirection, "defaultDirection");
        this.defaultDirection = Optional.ofNullable(defaultDirection);
        return this;
    }

    /**
     * The direction of the sort. Can be either `asc` or `desc`.
     */
    public Sort withDefaultDirection(Optional<? extends DefaultDirection> defaultDirection) {
        Utils.checkNotNull(defaultDirection, "defaultDirection");
        this.defaultDirection = defaultDirection;
        return this;
    }

    public Sort withDescKey(String descKey) {
        Utils.checkNotNull(descKey, "descKey");
        this.descKey = Optional.ofNullable(descKey);
        return this;
    }

    public Sort withDescKey(Optional<String> descKey) {
        Utils.checkNotNull(descKey, "descKey");
        this.descKey = descKey;
        return this;
    }

    public Sort withFirstCharacterKey(String firstCharacterKey) {
        Utils.checkNotNull(firstCharacterKey, "firstCharacterKey");
        this.firstCharacterKey = Optional.ofNullable(firstCharacterKey);
        return this;
    }

    public Sort withFirstCharacterKey(Optional<String> firstCharacterKey) {
        Utils.checkNotNull(firstCharacterKey, "firstCharacterKey");
        this.firstCharacterKey = firstCharacterKey;
        return this;
    }

    public Sort withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public Sort withTitle(String title) {
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
            Objects.deepEquals(this.default_, other.default_) &&
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.activeDirection, other.activeDirection) &&
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
            active,
            activeDirection,
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
                "active", active,
                "activeDirection", activeDirection,
                "defaultDirection", defaultDirection,
                "descKey", descKey,
                "firstCharacterKey", firstCharacterKey,
                "key", key,
                "title", title);
    }
    
    public final static class Builder {
 
        private Optional<String> default_ = Optional.empty();
 
        private Optional<Boolean> active = Optional.empty();
 
        private Optional<? extends ActiveDirection> activeDirection;
 
        private Optional<? extends DefaultDirection> defaultDirection;
 
        private Optional<String> descKey = Optional.empty();
 
        private Optional<String> firstCharacterKey = Optional.empty();
 
        private String key;
 
        private String title;
        
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

        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = Optional.ofNullable(active);
            return this;
        }

        public Builder active(Optional<Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        /**
         * The direction of the sort. Can be either `asc` or `desc`.
         */
        public Builder activeDirection(ActiveDirection activeDirection) {
            Utils.checkNotNull(activeDirection, "activeDirection");
            this.activeDirection = Optional.ofNullable(activeDirection);
            return this;
        }

        /**
         * The direction of the sort. Can be either `asc` or `desc`.
         */
        public Builder activeDirection(Optional<? extends ActiveDirection> activeDirection) {
            Utils.checkNotNull(activeDirection, "activeDirection");
            this.activeDirection = activeDirection;
            return this;
        }

        /**
         * The direction of the sort. Can be either `asc` or `desc`.
         */
        public Builder defaultDirection(DefaultDirection defaultDirection) {
            Utils.checkNotNull(defaultDirection, "defaultDirection");
            this.defaultDirection = Optional.ofNullable(defaultDirection);
            return this;
        }

        /**
         * The direction of the sort. Can be either `asc` or `desc`.
         */
        public Builder defaultDirection(Optional<? extends DefaultDirection> defaultDirection) {
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
            this.key = key;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }
        
        public Sort build() {
            if (activeDirection == null) {
                activeDirection = _SINGLETON_VALUE_ActiveDirection.value();
            }
            if (defaultDirection == null) {
                defaultDirection = _SINGLETON_VALUE_DefaultDirection.value();
            }
            return new Sort(
                default_,
                active,
                activeDirection,
                defaultDirection,
                descKey,
                firstCharacterKey,
                key,
                title);
        }

        private static final LazySingletonValue<Optional<? extends ActiveDirection>> _SINGLETON_VALUE_ActiveDirection =
                new LazySingletonValue<>(
                        "activeDirection",
                        "\"asc\"",
                        new TypeReference<Optional<? extends ActiveDirection>>() {});

        private static final LazySingletonValue<Optional<? extends DefaultDirection>> _SINGLETON_VALUE_DefaultDirection =
                new LazySingletonValue<>(
                        "defaultDirection",
                        "\"asc\"",
                        new TypeReference<Optional<? extends DefaultDirection>>() {});
    }
}
