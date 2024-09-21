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


public class UserProfile {

    /**
     * If the account has automatically select audio and subtitle tracks enabled
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("autoSelectAudio")
    private Optional<Boolean> autoSelectAudio;

    /**
     * The preferred audio language for the account
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("defaultAudioLanguage")
    private Optional<String> defaultAudioLanguage;

    /**
     * The preferred subtitle language for the account
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("defaultSubtitleLanguage")
    private Optional<String> defaultSubtitleLanguage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("autoSelectSubtitle")
    private Optional<? extends AutoSelectSubtitle> autoSelectSubtitle;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultSubtitleAccessibility")
    private Optional<? extends DefaultSubtitleAccessibility> defaultSubtitleAccessibility;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultSubtitleForced")
    private Optional<? extends DefaultSubtitleForced> defaultSubtitleForced;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("watchedIndicator")
    private Optional<? extends WatchedIndicator> watchedIndicator;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaReviewsVisibility")
    private Optional<? extends MediaReviewsVisibility> mediaReviewsVisibility;

    @JsonCreator
    public UserProfile(
            @JsonProperty("autoSelectAudio") Optional<Boolean> autoSelectAudio,
            @JsonProperty("defaultAudioLanguage") Optional<String> defaultAudioLanguage,
            @JsonProperty("defaultSubtitleLanguage") Optional<String> defaultSubtitleLanguage,
            @JsonProperty("autoSelectSubtitle") Optional<? extends AutoSelectSubtitle> autoSelectSubtitle,
            @JsonProperty("defaultSubtitleAccessibility") Optional<? extends DefaultSubtitleAccessibility> defaultSubtitleAccessibility,
            @JsonProperty("defaultSubtitleForced") Optional<? extends DefaultSubtitleForced> defaultSubtitleForced,
            @JsonProperty("watchedIndicator") Optional<? extends WatchedIndicator> watchedIndicator,
            @JsonProperty("mediaReviewsVisibility") Optional<? extends MediaReviewsVisibility> mediaReviewsVisibility) {
        Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
        Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
        Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
        Utils.checkNotNull(autoSelectSubtitle, "autoSelectSubtitle");
        Utils.checkNotNull(defaultSubtitleAccessibility, "defaultSubtitleAccessibility");
        Utils.checkNotNull(defaultSubtitleForced, "defaultSubtitleForced");
        Utils.checkNotNull(watchedIndicator, "watchedIndicator");
        Utils.checkNotNull(mediaReviewsVisibility, "mediaReviewsVisibility");
        this.autoSelectAudio = autoSelectAudio;
        this.defaultAudioLanguage = defaultAudioLanguage;
        this.defaultSubtitleLanguage = defaultSubtitleLanguage;
        this.autoSelectSubtitle = autoSelectSubtitle;
        this.defaultSubtitleAccessibility = defaultSubtitleAccessibility;
        this.defaultSubtitleForced = defaultSubtitleForced;
        this.watchedIndicator = watchedIndicator;
        this.mediaReviewsVisibility = mediaReviewsVisibility;
    }
    
    public UserProfile() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * If the account has automatically select audio and subtitle tracks enabled
     */
    @JsonIgnore
    public Optional<Boolean> autoSelectAudio() {
        return autoSelectAudio;
    }

    /**
     * The preferred audio language for the account
     */
    @JsonIgnore
    public Optional<String> defaultAudioLanguage() {
        return defaultAudioLanguage;
    }

    /**
     * The preferred subtitle language for the account
     */
    @JsonIgnore
    public Optional<String> defaultSubtitleLanguage() {
        return defaultSubtitleLanguage;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AutoSelectSubtitle> autoSelectSubtitle() {
        return (Optional<AutoSelectSubtitle>) autoSelectSubtitle;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DefaultSubtitleAccessibility> defaultSubtitleAccessibility() {
        return (Optional<DefaultSubtitleAccessibility>) defaultSubtitleAccessibility;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DefaultSubtitleForced> defaultSubtitleForced() {
        return (Optional<DefaultSubtitleForced>) defaultSubtitleForced;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<WatchedIndicator> watchedIndicator() {
        return (Optional<WatchedIndicator>) watchedIndicator;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MediaReviewsVisibility> mediaReviewsVisibility() {
        return (Optional<MediaReviewsVisibility>) mediaReviewsVisibility;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * If the account has automatically select audio and subtitle tracks enabled
     */
    public UserProfile withAutoSelectAudio(boolean autoSelectAudio) {
        Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
        this.autoSelectAudio = Optional.ofNullable(autoSelectAudio);
        return this;
    }

    /**
     * If the account has automatically select audio and subtitle tracks enabled
     */
    public UserProfile withAutoSelectAudio(Optional<Boolean> autoSelectAudio) {
        Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
        this.autoSelectAudio = autoSelectAudio;
        return this;
    }

    /**
     * The preferred audio language for the account
     */
    public UserProfile withDefaultAudioLanguage(String defaultAudioLanguage) {
        Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
        this.defaultAudioLanguage = Optional.ofNullable(defaultAudioLanguage);
        return this;
    }

    /**
     * The preferred audio language for the account
     */
    public UserProfile withDefaultAudioLanguage(Optional<String> defaultAudioLanguage) {
        Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
        this.defaultAudioLanguage = defaultAudioLanguage;
        return this;
    }

    /**
     * The preferred subtitle language for the account
     */
    public UserProfile withDefaultSubtitleLanguage(String defaultSubtitleLanguage) {
        Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
        this.defaultSubtitleLanguage = Optional.ofNullable(defaultSubtitleLanguage);
        return this;
    }

    /**
     * The preferred subtitle language for the account
     */
    public UserProfile withDefaultSubtitleLanguage(Optional<String> defaultSubtitleLanguage) {
        Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
        this.defaultSubtitleLanguage = defaultSubtitleLanguage;
        return this;
    }

    public UserProfile withAutoSelectSubtitle(AutoSelectSubtitle autoSelectSubtitle) {
        Utils.checkNotNull(autoSelectSubtitle, "autoSelectSubtitle");
        this.autoSelectSubtitle = Optional.ofNullable(autoSelectSubtitle);
        return this;
    }

    public UserProfile withAutoSelectSubtitle(Optional<? extends AutoSelectSubtitle> autoSelectSubtitle) {
        Utils.checkNotNull(autoSelectSubtitle, "autoSelectSubtitle");
        this.autoSelectSubtitle = autoSelectSubtitle;
        return this;
    }

    public UserProfile withDefaultSubtitleAccessibility(DefaultSubtitleAccessibility defaultSubtitleAccessibility) {
        Utils.checkNotNull(defaultSubtitleAccessibility, "defaultSubtitleAccessibility");
        this.defaultSubtitleAccessibility = Optional.ofNullable(defaultSubtitleAccessibility);
        return this;
    }

    public UserProfile withDefaultSubtitleAccessibility(Optional<? extends DefaultSubtitleAccessibility> defaultSubtitleAccessibility) {
        Utils.checkNotNull(defaultSubtitleAccessibility, "defaultSubtitleAccessibility");
        this.defaultSubtitleAccessibility = defaultSubtitleAccessibility;
        return this;
    }

    public UserProfile withDefaultSubtitleForced(DefaultSubtitleForced defaultSubtitleForced) {
        Utils.checkNotNull(defaultSubtitleForced, "defaultSubtitleForced");
        this.defaultSubtitleForced = Optional.ofNullable(defaultSubtitleForced);
        return this;
    }

    public UserProfile withDefaultSubtitleForced(Optional<? extends DefaultSubtitleForced> defaultSubtitleForced) {
        Utils.checkNotNull(defaultSubtitleForced, "defaultSubtitleForced");
        this.defaultSubtitleForced = defaultSubtitleForced;
        return this;
    }

    public UserProfile withWatchedIndicator(WatchedIndicator watchedIndicator) {
        Utils.checkNotNull(watchedIndicator, "watchedIndicator");
        this.watchedIndicator = Optional.ofNullable(watchedIndicator);
        return this;
    }

    public UserProfile withWatchedIndicator(Optional<? extends WatchedIndicator> watchedIndicator) {
        Utils.checkNotNull(watchedIndicator, "watchedIndicator");
        this.watchedIndicator = watchedIndicator;
        return this;
    }

    public UserProfile withMediaReviewsVisibility(MediaReviewsVisibility mediaReviewsVisibility) {
        Utils.checkNotNull(mediaReviewsVisibility, "mediaReviewsVisibility");
        this.mediaReviewsVisibility = Optional.ofNullable(mediaReviewsVisibility);
        return this;
    }

    public UserProfile withMediaReviewsVisibility(Optional<? extends MediaReviewsVisibility> mediaReviewsVisibility) {
        Utils.checkNotNull(mediaReviewsVisibility, "mediaReviewsVisibility");
        this.mediaReviewsVisibility = mediaReviewsVisibility;
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
        UserProfile other = (UserProfile) o;
        return 
            Objects.deepEquals(this.autoSelectAudio, other.autoSelectAudio) &&
            Objects.deepEquals(this.defaultAudioLanguage, other.defaultAudioLanguage) &&
            Objects.deepEquals(this.defaultSubtitleLanguage, other.defaultSubtitleLanguage) &&
            Objects.deepEquals(this.autoSelectSubtitle, other.autoSelectSubtitle) &&
            Objects.deepEquals(this.defaultSubtitleAccessibility, other.defaultSubtitleAccessibility) &&
            Objects.deepEquals(this.defaultSubtitleForced, other.defaultSubtitleForced) &&
            Objects.deepEquals(this.watchedIndicator, other.watchedIndicator) &&
            Objects.deepEquals(this.mediaReviewsVisibility, other.mediaReviewsVisibility);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            autoSelectAudio,
            defaultAudioLanguage,
            defaultSubtitleLanguage,
            autoSelectSubtitle,
            defaultSubtitleAccessibility,
            defaultSubtitleForced,
            watchedIndicator,
            mediaReviewsVisibility);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UserProfile.class,
                "autoSelectAudio", autoSelectAudio,
                "defaultAudioLanguage", defaultAudioLanguage,
                "defaultSubtitleLanguage", defaultSubtitleLanguage,
                "autoSelectSubtitle", autoSelectSubtitle,
                "defaultSubtitleAccessibility", defaultSubtitleAccessibility,
                "defaultSubtitleForced", defaultSubtitleForced,
                "watchedIndicator", watchedIndicator,
                "mediaReviewsVisibility", mediaReviewsVisibility);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> autoSelectAudio;
 
        private Optional<String> defaultAudioLanguage = Optional.empty();
 
        private Optional<String> defaultSubtitleLanguage = Optional.empty();
 
        private Optional<? extends AutoSelectSubtitle> autoSelectSubtitle;
 
        private Optional<? extends DefaultSubtitleAccessibility> defaultSubtitleAccessibility;
 
        private Optional<? extends DefaultSubtitleForced> defaultSubtitleForced;
 
        private Optional<? extends WatchedIndicator> watchedIndicator;
 
        private Optional<? extends MediaReviewsVisibility> mediaReviewsVisibility;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * If the account has automatically select audio and subtitle tracks enabled
         */
        public Builder autoSelectAudio(boolean autoSelectAudio) {
            Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
            this.autoSelectAudio = Optional.ofNullable(autoSelectAudio);
            return this;
        }

        /**
         * If the account has automatically select audio and subtitle tracks enabled
         */
        public Builder autoSelectAudio(Optional<Boolean> autoSelectAudio) {
            Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
            this.autoSelectAudio = autoSelectAudio;
            return this;
        }

        /**
         * The preferred audio language for the account
         */
        public Builder defaultAudioLanguage(String defaultAudioLanguage) {
            Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
            this.defaultAudioLanguage = Optional.ofNullable(defaultAudioLanguage);
            return this;
        }

        /**
         * The preferred audio language for the account
         */
        public Builder defaultAudioLanguage(Optional<String> defaultAudioLanguage) {
            Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
            this.defaultAudioLanguage = defaultAudioLanguage;
            return this;
        }

        /**
         * The preferred subtitle language for the account
         */
        public Builder defaultSubtitleLanguage(String defaultSubtitleLanguage) {
            Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
            this.defaultSubtitleLanguage = Optional.ofNullable(defaultSubtitleLanguage);
            return this;
        }

        /**
         * The preferred subtitle language for the account
         */
        public Builder defaultSubtitleLanguage(Optional<String> defaultSubtitleLanguage) {
            Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
            this.defaultSubtitleLanguage = defaultSubtitleLanguage;
            return this;
        }

        public Builder autoSelectSubtitle(AutoSelectSubtitle autoSelectSubtitle) {
            Utils.checkNotNull(autoSelectSubtitle, "autoSelectSubtitle");
            this.autoSelectSubtitle = Optional.ofNullable(autoSelectSubtitle);
            return this;
        }

        public Builder autoSelectSubtitle(Optional<? extends AutoSelectSubtitle> autoSelectSubtitle) {
            Utils.checkNotNull(autoSelectSubtitle, "autoSelectSubtitle");
            this.autoSelectSubtitle = autoSelectSubtitle;
            return this;
        }

        public Builder defaultSubtitleAccessibility(DefaultSubtitleAccessibility defaultSubtitleAccessibility) {
            Utils.checkNotNull(defaultSubtitleAccessibility, "defaultSubtitleAccessibility");
            this.defaultSubtitleAccessibility = Optional.ofNullable(defaultSubtitleAccessibility);
            return this;
        }

        public Builder defaultSubtitleAccessibility(Optional<? extends DefaultSubtitleAccessibility> defaultSubtitleAccessibility) {
            Utils.checkNotNull(defaultSubtitleAccessibility, "defaultSubtitleAccessibility");
            this.defaultSubtitleAccessibility = defaultSubtitleAccessibility;
            return this;
        }

        public Builder defaultSubtitleForced(DefaultSubtitleForced defaultSubtitleForced) {
            Utils.checkNotNull(defaultSubtitleForced, "defaultSubtitleForced");
            this.defaultSubtitleForced = Optional.ofNullable(defaultSubtitleForced);
            return this;
        }

        public Builder defaultSubtitleForced(Optional<? extends DefaultSubtitleForced> defaultSubtitleForced) {
            Utils.checkNotNull(defaultSubtitleForced, "defaultSubtitleForced");
            this.defaultSubtitleForced = defaultSubtitleForced;
            return this;
        }

        public Builder watchedIndicator(WatchedIndicator watchedIndicator) {
            Utils.checkNotNull(watchedIndicator, "watchedIndicator");
            this.watchedIndicator = Optional.ofNullable(watchedIndicator);
            return this;
        }

        public Builder watchedIndicator(Optional<? extends WatchedIndicator> watchedIndicator) {
            Utils.checkNotNull(watchedIndicator, "watchedIndicator");
            this.watchedIndicator = watchedIndicator;
            return this;
        }

        public Builder mediaReviewsVisibility(MediaReviewsVisibility mediaReviewsVisibility) {
            Utils.checkNotNull(mediaReviewsVisibility, "mediaReviewsVisibility");
            this.mediaReviewsVisibility = Optional.ofNullable(mediaReviewsVisibility);
            return this;
        }

        public Builder mediaReviewsVisibility(Optional<? extends MediaReviewsVisibility> mediaReviewsVisibility) {
            Utils.checkNotNull(mediaReviewsVisibility, "mediaReviewsVisibility");
            this.mediaReviewsVisibility = mediaReviewsVisibility;
            return this;
        }
        
        public UserProfile build() {
            if (autoSelectAudio == null) {
                autoSelectAudio = _SINGLETON_VALUE_AutoSelectAudio.value();
            }
            if (autoSelectSubtitle == null) {
                autoSelectSubtitle = _SINGLETON_VALUE_AutoSelectSubtitle.value();
            }
            if (defaultSubtitleAccessibility == null) {
                defaultSubtitleAccessibility = _SINGLETON_VALUE_DefaultSubtitleAccessibility.value();
            }
            if (defaultSubtitleForced == null) {
                defaultSubtitleForced = _SINGLETON_VALUE_DefaultSubtitleForced.value();
            }
            if (watchedIndicator == null) {
                watchedIndicator = _SINGLETON_VALUE_WatchedIndicator.value();
            }
            if (mediaReviewsVisibility == null) {
                mediaReviewsVisibility = _SINGLETON_VALUE_MediaReviewsVisibility.value();
            }            return new UserProfile(
                autoSelectAudio,
                defaultAudioLanguage,
                defaultSubtitleLanguage,
                autoSelectSubtitle,
                defaultSubtitleAccessibility,
                defaultSubtitleForced,
                watchedIndicator,
                mediaReviewsVisibility);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_AutoSelectAudio =
                new LazySingletonValue<>(
                        "autoSelectAudio",
                        "true",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends AutoSelectSubtitle>> _SINGLETON_VALUE_AutoSelectSubtitle =
                new LazySingletonValue<>(
                        "autoSelectSubtitle",
                        "0",
                        new TypeReference<Optional<? extends AutoSelectSubtitle>>() {});

        private static final LazySingletonValue<Optional<? extends DefaultSubtitleAccessibility>> _SINGLETON_VALUE_DefaultSubtitleAccessibility =
                new LazySingletonValue<>(
                        "defaultSubtitleAccessibility",
                        "0",
                        new TypeReference<Optional<? extends DefaultSubtitleAccessibility>>() {});

        private static final LazySingletonValue<Optional<? extends DefaultSubtitleForced>> _SINGLETON_VALUE_DefaultSubtitleForced =
                new LazySingletonValue<>(
                        "defaultSubtitleForced",
                        "0",
                        new TypeReference<Optional<? extends DefaultSubtitleForced>>() {});

        private static final LazySingletonValue<Optional<? extends WatchedIndicator>> _SINGLETON_VALUE_WatchedIndicator =
                new LazySingletonValue<>(
                        "watchedIndicator",
                        "0",
                        new TypeReference<Optional<? extends WatchedIndicator>>() {});

        private static final LazySingletonValue<Optional<? extends MediaReviewsVisibility>> _SINGLETON_VALUE_MediaReviewsVisibility =
                new LazySingletonValue<>(
                        "mediaReviewsVisibility",
                        "0",
                        new TypeReference<Optional<? extends MediaReviewsVisibility>>() {});
    }
}

