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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class GetBandwidthStatisticsAccount {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<Integer> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultAudioLanguage")
    private Optional<String> defaultAudioLanguage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("autoSelectAudio")
    private Optional<Boolean> autoSelectAudio;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultSubtitleLanguage")
    private Optional<String> defaultSubtitleLanguage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subtitleMode")
    private Optional<Integer> subtitleMode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    private Optional<String> thumb;

    @JsonCreator
    public GetBandwidthStatisticsAccount(
            @JsonProperty("id") Optional<Integer> id,
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("defaultAudioLanguage") Optional<String> defaultAudioLanguage,
            @JsonProperty("autoSelectAudio") Optional<Boolean> autoSelectAudio,
            @JsonProperty("defaultSubtitleLanguage") Optional<String> defaultSubtitleLanguage,
            @JsonProperty("subtitleMode") Optional<Integer> subtitleMode,
            @JsonProperty("thumb") Optional<String> thumb) {
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
    
    public GetBandwidthStatisticsAccount() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Integer> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> defaultAudioLanguage() {
        return defaultAudioLanguage;
    }

    @JsonIgnore
    public Optional<Boolean> autoSelectAudio() {
        return autoSelectAudio;
    }

    @JsonIgnore
    public Optional<String> defaultSubtitleLanguage() {
        return defaultSubtitleLanguage;
    }

    @JsonIgnore
    public Optional<Integer> subtitleMode() {
        return subtitleMode;
    }

    @JsonIgnore
    public Optional<String> thumb() {
        return thumb;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetBandwidthStatisticsAccount withId(int id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GetBandwidthStatisticsAccount withId(Optional<Integer> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetBandwidthStatisticsAccount withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetBandwidthStatisticsAccount withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetBandwidthStatisticsAccount withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public GetBandwidthStatisticsAccount withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public GetBandwidthStatisticsAccount withDefaultAudioLanguage(String defaultAudioLanguage) {
        Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
        this.defaultAudioLanguage = Optional.ofNullable(defaultAudioLanguage);
        return this;
    }

    public GetBandwidthStatisticsAccount withDefaultAudioLanguage(Optional<String> defaultAudioLanguage) {
        Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
        this.defaultAudioLanguage = defaultAudioLanguage;
        return this;
    }

    public GetBandwidthStatisticsAccount withAutoSelectAudio(boolean autoSelectAudio) {
        Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
        this.autoSelectAudio = Optional.ofNullable(autoSelectAudio);
        return this;
    }

    public GetBandwidthStatisticsAccount withAutoSelectAudio(Optional<Boolean> autoSelectAudio) {
        Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
        this.autoSelectAudio = autoSelectAudio;
        return this;
    }

    public GetBandwidthStatisticsAccount withDefaultSubtitleLanguage(String defaultSubtitleLanguage) {
        Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
        this.defaultSubtitleLanguage = Optional.ofNullable(defaultSubtitleLanguage);
        return this;
    }

    public GetBandwidthStatisticsAccount withDefaultSubtitleLanguage(Optional<String> defaultSubtitleLanguage) {
        Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
        this.defaultSubtitleLanguage = defaultSubtitleLanguage;
        return this;
    }

    public GetBandwidthStatisticsAccount withSubtitleMode(int subtitleMode) {
        Utils.checkNotNull(subtitleMode, "subtitleMode");
        this.subtitleMode = Optional.ofNullable(subtitleMode);
        return this;
    }

    public GetBandwidthStatisticsAccount withSubtitleMode(Optional<Integer> subtitleMode) {
        Utils.checkNotNull(subtitleMode, "subtitleMode");
        this.subtitleMode = subtitleMode;
        return this;
    }

    public GetBandwidthStatisticsAccount withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = Optional.ofNullable(thumb);
        return this;
    }

    public GetBandwidthStatisticsAccount withThumb(Optional<String> thumb) {
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
        GetBandwidthStatisticsAccount other = (GetBandwidthStatisticsAccount) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.defaultAudioLanguage, other.defaultAudioLanguage) &&
            Objects.deepEquals(this.autoSelectAudio, other.autoSelectAudio) &&
            Objects.deepEquals(this.defaultSubtitleLanguage, other.defaultSubtitleLanguage) &&
            Objects.deepEquals(this.subtitleMode, other.subtitleMode) &&
            Objects.deepEquals(this.thumb, other.thumb);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
        return Utils.toString(GetBandwidthStatisticsAccount.class,
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
 
        private Optional<Integer> id = Optional.empty();
 
        private Optional<String> key = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> defaultAudioLanguage = Optional.empty();
 
        private Optional<Boolean> autoSelectAudio = Optional.empty();
 
        private Optional<String> defaultSubtitleLanguage = Optional.empty();
 
        private Optional<Integer> subtitleMode = Optional.empty();
 
        private Optional<String> thumb = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(int id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<Integer> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
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

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder defaultAudioLanguage(String defaultAudioLanguage) {
            Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
            this.defaultAudioLanguage = Optional.ofNullable(defaultAudioLanguage);
            return this;
        }

        public Builder defaultAudioLanguage(Optional<String> defaultAudioLanguage) {
            Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
            this.defaultAudioLanguage = defaultAudioLanguage;
            return this;
        }

        public Builder autoSelectAudio(boolean autoSelectAudio) {
            Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
            this.autoSelectAudio = Optional.ofNullable(autoSelectAudio);
            return this;
        }

        public Builder autoSelectAudio(Optional<Boolean> autoSelectAudio) {
            Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
            this.autoSelectAudio = autoSelectAudio;
            return this;
        }

        public Builder defaultSubtitleLanguage(String defaultSubtitleLanguage) {
            Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
            this.defaultSubtitleLanguage = Optional.ofNullable(defaultSubtitleLanguage);
            return this;
        }

        public Builder defaultSubtitleLanguage(Optional<String> defaultSubtitleLanguage) {
            Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
            this.defaultSubtitleLanguage = defaultSubtitleLanguage;
            return this;
        }

        public Builder subtitleMode(int subtitleMode) {
            Utils.checkNotNull(subtitleMode, "subtitleMode");
            this.subtitleMode = Optional.ofNullable(subtitleMode);
            return this;
        }

        public Builder subtitleMode(Optional<Integer> subtitleMode) {
            Utils.checkNotNull(subtitleMode, "subtitleMode");
            this.subtitleMode = subtitleMode;
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
        
        public GetBandwidthStatisticsAccount build() {
            return new GetBandwidthStatisticsAccount(
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
