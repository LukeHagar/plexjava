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


public class Account {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends Integer> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<? extends String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultAudioLanguage")
    private Optional<? extends String> defaultAudioLanguage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("autoSelectAudio")
    private Optional<? extends Boolean> autoSelectAudio;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultSubtitleLanguage")
    private Optional<? extends String> defaultSubtitleLanguage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subtitleMode")
    private Optional<? extends Integer> subtitleMode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    private Optional<? extends String> thumb;

    public Account(
            @JsonProperty("id") Optional<? extends Integer> id,
            @JsonProperty("key") Optional<? extends String> key,
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("defaultAudioLanguage") Optional<? extends String> defaultAudioLanguage,
            @JsonProperty("autoSelectAudio") Optional<? extends Boolean> autoSelectAudio,
            @JsonProperty("defaultSubtitleLanguage") Optional<? extends String> defaultSubtitleLanguage,
            @JsonProperty("subtitleMode") Optional<? extends Integer> subtitleMode,
            @JsonProperty("thumb") Optional<? extends String> thumb) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
        Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
        Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
        Utils.checkNotNull(subtitleMode, "subtitleMode");
        Utils.checkNotNull(thumb, "thumb");
        this.id = id;
        this.key = key;
        this.name = name;
        this.defaultAudioLanguage = defaultAudioLanguage;
        this.autoSelectAudio = autoSelectAudio;
        this.defaultSubtitleLanguage = defaultSubtitleLanguage;
        this.subtitleMode = subtitleMode;
        this.thumb = thumb;
    }

    public Optional<? extends Integer> id() {
        return id;
    }

    public Optional<? extends String> key() {
        return key;
    }

    public Optional<? extends String> name() {
        return name;
    }

    public Optional<? extends String> defaultAudioLanguage() {
        return defaultAudioLanguage;
    }

    public Optional<? extends Boolean> autoSelectAudio() {
        return autoSelectAudio;
    }

    public Optional<? extends String> defaultSubtitleLanguage() {
        return defaultSubtitleLanguage;
    }

    public Optional<? extends Integer> subtitleMode() {
        return subtitleMode;
    }

    public Optional<? extends String> thumb() {
        return thumb;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Account withId(int id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public Account withId(Optional<? extends Integer> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Account withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public Account withKey(Optional<? extends String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public Account withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public Account withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public Account withDefaultAudioLanguage(String defaultAudioLanguage) {
        Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
        this.defaultAudioLanguage = Optional.ofNullable(defaultAudioLanguage);
        return this;
    }

    public Account withDefaultAudioLanguage(Optional<? extends String> defaultAudioLanguage) {
        Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
        this.defaultAudioLanguage = defaultAudioLanguage;
        return this;
    }

    public Account withAutoSelectAudio(boolean autoSelectAudio) {
        Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
        this.autoSelectAudio = Optional.ofNullable(autoSelectAudio);
        return this;
    }

    public Account withAutoSelectAudio(Optional<? extends Boolean> autoSelectAudio) {
        Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
        this.autoSelectAudio = autoSelectAudio;
        return this;
    }

    public Account withDefaultSubtitleLanguage(String defaultSubtitleLanguage) {
        Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
        this.defaultSubtitleLanguage = Optional.ofNullable(defaultSubtitleLanguage);
        return this;
    }

    public Account withDefaultSubtitleLanguage(Optional<? extends String> defaultSubtitleLanguage) {
        Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
        this.defaultSubtitleLanguage = defaultSubtitleLanguage;
        return this;
    }

    public Account withSubtitleMode(int subtitleMode) {
        Utils.checkNotNull(subtitleMode, "subtitleMode");
        this.subtitleMode = Optional.ofNullable(subtitleMode);
        return this;
    }

    public Account withSubtitleMode(Optional<? extends Integer> subtitleMode) {
        Utils.checkNotNull(subtitleMode, "subtitleMode");
        this.subtitleMode = subtitleMode;
        return this;
    }

    public Account withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = Optional.ofNullable(thumb);
        return this;
    }

    public Account withThumb(Optional<? extends String> thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = thumb;
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
        Account other = (Account) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.defaultAudioLanguage, other.defaultAudioLanguage) &&
            java.util.Objects.deepEquals(this.autoSelectAudio, other.autoSelectAudio) &&
            java.util.Objects.deepEquals(this.defaultSubtitleLanguage, other.defaultSubtitleLanguage) &&
            java.util.Objects.deepEquals(this.subtitleMode, other.subtitleMode) &&
            java.util.Objects.deepEquals(this.thumb, other.thumb);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            key,
            name,
            defaultAudioLanguage,
            autoSelectAudio,
            defaultSubtitleLanguage,
            subtitleMode,
            thumb);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Account.class,
                "id", id,
                "key", key,
                "name", name,
                "defaultAudioLanguage", defaultAudioLanguage,
                "autoSelectAudio", autoSelectAudio,
                "defaultSubtitleLanguage", defaultSubtitleLanguage,
                "subtitleMode", subtitleMode,
                "thumb", thumb);
    }
    
    public final static class Builder {
 
        private Optional<? extends Integer> id = Optional.empty();
 
        private Optional<? extends String> key = Optional.empty();
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends String> defaultAudioLanguage = Optional.empty();
 
        private Optional<? extends Boolean> autoSelectAudio = Optional.empty();
 
        private Optional<? extends String> defaultSubtitleLanguage = Optional.empty();
 
        private Optional<? extends Integer> subtitleMode = Optional.empty();
 
        private Optional<? extends String> thumb = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(int id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<? extends Integer> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
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

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder defaultAudioLanguage(String defaultAudioLanguage) {
            Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
            this.defaultAudioLanguage = Optional.ofNullable(defaultAudioLanguage);
            return this;
        }

        public Builder defaultAudioLanguage(Optional<? extends String> defaultAudioLanguage) {
            Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
            this.defaultAudioLanguage = defaultAudioLanguage;
            return this;
        }

        public Builder autoSelectAudio(boolean autoSelectAudio) {
            Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
            this.autoSelectAudio = Optional.ofNullable(autoSelectAudio);
            return this;
        }

        public Builder autoSelectAudio(Optional<? extends Boolean> autoSelectAudio) {
            Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
            this.autoSelectAudio = autoSelectAudio;
            return this;
        }

        public Builder defaultSubtitleLanguage(String defaultSubtitleLanguage) {
            Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
            this.defaultSubtitleLanguage = Optional.ofNullable(defaultSubtitleLanguage);
            return this;
        }

        public Builder defaultSubtitleLanguage(Optional<? extends String> defaultSubtitleLanguage) {
            Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
            this.defaultSubtitleLanguage = defaultSubtitleLanguage;
            return this;
        }

        public Builder subtitleMode(int subtitleMode) {
            Utils.checkNotNull(subtitleMode, "subtitleMode");
            this.subtitleMode = Optional.ofNullable(subtitleMode);
            return this;
        }

        public Builder subtitleMode(Optional<? extends Integer> subtitleMode) {
            Utils.checkNotNull(subtitleMode, "subtitleMode");
            this.subtitleMode = subtitleMode;
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
        
        public Account build() {
            return new Account(
                id,
                key,
                name,
                defaultAudioLanguage,
                autoSelectAudio,
                defaultSubtitleLanguage,
                subtitleMode,
                thumb);
        }
    }
}

