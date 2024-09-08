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


public class PostUsersSignInDataUserProfile {

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

    /**
     * The auto-select subtitle mode (0 = Manually selected, 1 = Shown with foreign audio, 2 = Always enabled)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("autoSelectSubtitle")
    private Optional<? extends PostUsersSignInDataAutoSelectSubtitle> autoSelectSubtitle;

    /**
     * The subtitles for the deaf or hard-of-hearing (SDH) searches mode (0 = Prefer non-SDH subtitles, 1 = Prefer SDH subtitles, 2 = Only show SDH subtitles, 3 = Only shown non-SDH subtitles)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultSubtitleAccessibility")
    private Optional<? extends PostUsersSignInDataDefaultSubtitleAccessibility> defaultSubtitleAccessibility;

    /**
     * The forced subtitles searches mode (0 = Prefer non-forced subtitles, 1 = Prefer forced subtitles, 2 = Only show forced subtitles, 3 = Only show non-forced subtitles)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("defaultSubtitleForced")
    private Optional<? extends PostUsersSignInDataDefaultSubtitleForced> defaultSubtitleForced;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("watchedIndicator")
    private Optional<? extends PostUsersSignInDataWatchedIndicator> watchedIndicator;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaReviewsVisibility")
    private Optional<? extends PostUsersSignInDataMediaReviewsVisibility> mediaReviewsVisibility;

    @JsonCreator
    public PostUsersSignInDataUserProfile(
            @JsonProperty("autoSelectAudio") Optional<Boolean> autoSelectAudio,
            @JsonProperty("defaultAudioLanguage") Optional<String> defaultAudioLanguage,
            @JsonProperty("defaultSubtitleLanguage") Optional<String> defaultSubtitleLanguage,
            @JsonProperty("autoSelectSubtitle") Optional<? extends PostUsersSignInDataAutoSelectSubtitle> autoSelectSubtitle,
            @JsonProperty("defaultSubtitleAccessibility") Optional<? extends PostUsersSignInDataDefaultSubtitleAccessibility> defaultSubtitleAccessibility,
            @JsonProperty("defaultSubtitleForced") Optional<? extends PostUsersSignInDataDefaultSubtitleForced> defaultSubtitleForced,
            @JsonProperty("watchedIndicator") Optional<? extends PostUsersSignInDataWatchedIndicator> watchedIndicator,
            @JsonProperty("mediaReviewsVisibility") Optional<? extends PostUsersSignInDataMediaReviewsVisibility> mediaReviewsVisibility) {
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
    
    public PostUsersSignInDataUserProfile() {
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

    /**
     * The auto-select subtitle mode (0 = Manually selected, 1 = Shown with foreign audio, 2 = Always enabled)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostUsersSignInDataAutoSelectSubtitle> autoSelectSubtitle() {
        return (Optional<PostUsersSignInDataAutoSelectSubtitle>) autoSelectSubtitle;
    }

    /**
     * The subtitles for the deaf or hard-of-hearing (SDH) searches mode (0 = Prefer non-SDH subtitles, 1 = Prefer SDH subtitles, 2 = Only show SDH subtitles, 3 = Only shown non-SDH subtitles)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostUsersSignInDataDefaultSubtitleAccessibility> defaultSubtitleAccessibility() {
        return (Optional<PostUsersSignInDataDefaultSubtitleAccessibility>) defaultSubtitleAccessibility;
    }

    /**
     * The forced subtitles searches mode (0 = Prefer non-forced subtitles, 1 = Prefer forced subtitles, 2 = Only show forced subtitles, 3 = Only show non-forced subtitles)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostUsersSignInDataDefaultSubtitleForced> defaultSubtitleForced() {
        return (Optional<PostUsersSignInDataDefaultSubtitleForced>) defaultSubtitleForced;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostUsersSignInDataWatchedIndicator> watchedIndicator() {
        return (Optional<PostUsersSignInDataWatchedIndicator>) watchedIndicator;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostUsersSignInDataMediaReviewsVisibility> mediaReviewsVisibility() {
        return (Optional<PostUsersSignInDataMediaReviewsVisibility>) mediaReviewsVisibility;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * If the account has automatically select audio and subtitle tracks enabled
     */
    public PostUsersSignInDataUserProfile withAutoSelectAudio(boolean autoSelectAudio) {
        Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
        this.autoSelectAudio = Optional.ofNullable(autoSelectAudio);
        return this;
    }

    /**
     * If the account has automatically select audio and subtitle tracks enabled
     */
    public PostUsersSignInDataUserProfile withAutoSelectAudio(Optional<Boolean> autoSelectAudio) {
        Utils.checkNotNull(autoSelectAudio, "autoSelectAudio");
        this.autoSelectAudio = autoSelectAudio;
        return this;
    }

    /**
     * The preferred audio language for the account
     */
    public PostUsersSignInDataUserProfile withDefaultAudioLanguage(String defaultAudioLanguage) {
        Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
        this.defaultAudioLanguage = Optional.ofNullable(defaultAudioLanguage);
        return this;
    }

    /**
     * The preferred audio language for the account
     */
    public PostUsersSignInDataUserProfile withDefaultAudioLanguage(Optional<String> defaultAudioLanguage) {
        Utils.checkNotNull(defaultAudioLanguage, "defaultAudioLanguage");
        this.defaultAudioLanguage = defaultAudioLanguage;
        return this;
    }

    /**
     * The preferred subtitle language for the account
     */
    public PostUsersSignInDataUserProfile withDefaultSubtitleLanguage(String defaultSubtitleLanguage) {
        Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
        this.defaultSubtitleLanguage = Optional.ofNullable(defaultSubtitleLanguage);
        return this;
    }

    /**
     * The preferred subtitle language for the account
     */
    public PostUsersSignInDataUserProfile withDefaultSubtitleLanguage(Optional<String> defaultSubtitleLanguage) {
        Utils.checkNotNull(defaultSubtitleLanguage, "defaultSubtitleLanguage");
        this.defaultSubtitleLanguage = defaultSubtitleLanguage;
        return this;
    }

    /**
     * The auto-select subtitle mode (0 = Manually selected, 1 = Shown with foreign audio, 2 = Always enabled)
     */
    public PostUsersSignInDataUserProfile withAutoSelectSubtitle(PostUsersSignInDataAutoSelectSubtitle autoSelectSubtitle) {
        Utils.checkNotNull(autoSelectSubtitle, "autoSelectSubtitle");
        this.autoSelectSubtitle = Optional.ofNullable(autoSelectSubtitle);
        return this;
    }

    /**
     * The auto-select subtitle mode (0 = Manually selected, 1 = Shown with foreign audio, 2 = Always enabled)
     */
    public PostUsersSignInDataUserProfile withAutoSelectSubtitle(Optional<? extends PostUsersSignInDataAutoSelectSubtitle> autoSelectSubtitle) {
        Utils.checkNotNull(autoSelectSubtitle, "autoSelectSubtitle");
        this.autoSelectSubtitle = autoSelectSubtitle;
        return this;
    }

    /**
     * The subtitles for the deaf or hard-of-hearing (SDH) searches mode (0 = Prefer non-SDH subtitles, 1 = Prefer SDH subtitles, 2 = Only show SDH subtitles, 3 = Only shown non-SDH subtitles)
     */
    public PostUsersSignInDataUserProfile withDefaultSubtitleAccessibility(PostUsersSignInDataDefaultSubtitleAccessibility defaultSubtitleAccessibility) {
        Utils.checkNotNull(defaultSubtitleAccessibility, "defaultSubtitleAccessibility");
        this.defaultSubtitleAccessibility = Optional.ofNullable(defaultSubtitleAccessibility);
        return this;
    }

    /**
     * The subtitles for the deaf or hard-of-hearing (SDH) searches mode (0 = Prefer non-SDH subtitles, 1 = Prefer SDH subtitles, 2 = Only show SDH subtitles, 3 = Only shown non-SDH subtitles)
     */
    public PostUsersSignInDataUserProfile withDefaultSubtitleAccessibility(Optional<? extends PostUsersSignInDataDefaultSubtitleAccessibility> defaultSubtitleAccessibility) {
        Utils.checkNotNull(defaultSubtitleAccessibility, "defaultSubtitleAccessibility");
        this.defaultSubtitleAccessibility = defaultSubtitleAccessibility;
        return this;
    }

    /**
     * The forced subtitles searches mode (0 = Prefer non-forced subtitles, 1 = Prefer forced subtitles, 2 = Only show forced subtitles, 3 = Only show non-forced subtitles)
     */
    public PostUsersSignInDataUserProfile withDefaultSubtitleForced(PostUsersSignInDataDefaultSubtitleForced defaultSubtitleForced) {
        Utils.checkNotNull(defaultSubtitleForced, "defaultSubtitleForced");
        this.defaultSubtitleForced = Optional.ofNullable(defaultSubtitleForced);
        return this;
    }

    /**
     * The forced subtitles searches mode (0 = Prefer non-forced subtitles, 1 = Prefer forced subtitles, 2 = Only show forced subtitles, 3 = Only show non-forced subtitles)
     */
    public PostUsersSignInDataUserProfile withDefaultSubtitleForced(Optional<? extends PostUsersSignInDataDefaultSubtitleForced> defaultSubtitleForced) {
        Utils.checkNotNull(defaultSubtitleForced, "defaultSubtitleForced");
        this.defaultSubtitleForced = defaultSubtitleForced;
        return this;
    }

    public PostUsersSignInDataUserProfile withWatchedIndicator(PostUsersSignInDataWatchedIndicator watchedIndicator) {
        Utils.checkNotNull(watchedIndicator, "watchedIndicator");
        this.watchedIndicator = Optional.ofNullable(watchedIndicator);
        return this;
    }

    public PostUsersSignInDataUserProfile withWatchedIndicator(Optional<? extends PostUsersSignInDataWatchedIndicator> watchedIndicator) {
        Utils.checkNotNull(watchedIndicator, "watchedIndicator");
        this.watchedIndicator = watchedIndicator;
        return this;
    }

    public PostUsersSignInDataUserProfile withMediaReviewsVisibility(PostUsersSignInDataMediaReviewsVisibility mediaReviewsVisibility) {
        Utils.checkNotNull(mediaReviewsVisibility, "mediaReviewsVisibility");
        this.mediaReviewsVisibility = Optional.ofNullable(mediaReviewsVisibility);
        return this;
    }

    public PostUsersSignInDataUserProfile withMediaReviewsVisibility(Optional<? extends PostUsersSignInDataMediaReviewsVisibility> mediaReviewsVisibility) {
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
        PostUsersSignInDataUserProfile other = (PostUsersSignInDataUserProfile) o;
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
        return Utils.toString(PostUsersSignInDataUserProfile.class,
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
 
        private Optional<? extends PostUsersSignInDataAutoSelectSubtitle> autoSelectSubtitle = Optional.empty();
 
        private Optional<? extends PostUsersSignInDataDefaultSubtitleAccessibility> defaultSubtitleAccessibility = Optional.empty();
 
        private Optional<? extends PostUsersSignInDataDefaultSubtitleForced> defaultSubtitleForced = Optional.empty();
 
        private Optional<? extends PostUsersSignInDataWatchedIndicator> watchedIndicator = Optional.empty();
 
        private Optional<? extends PostUsersSignInDataMediaReviewsVisibility> mediaReviewsVisibility = Optional.empty();  
        
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

        /**
         * The auto-select subtitle mode (0 = Manually selected, 1 = Shown with foreign audio, 2 = Always enabled)
         */
        public Builder autoSelectSubtitle(PostUsersSignInDataAutoSelectSubtitle autoSelectSubtitle) {
            Utils.checkNotNull(autoSelectSubtitle, "autoSelectSubtitle");
            this.autoSelectSubtitle = Optional.ofNullable(autoSelectSubtitle);
            return this;
        }

        /**
         * The auto-select subtitle mode (0 = Manually selected, 1 = Shown with foreign audio, 2 = Always enabled)
         */
        public Builder autoSelectSubtitle(Optional<? extends PostUsersSignInDataAutoSelectSubtitle> autoSelectSubtitle) {
            Utils.checkNotNull(autoSelectSubtitle, "autoSelectSubtitle");
            this.autoSelectSubtitle = autoSelectSubtitle;
            return this;
        }

        /**
         * The subtitles for the deaf or hard-of-hearing (SDH) searches mode (0 = Prefer non-SDH subtitles, 1 = Prefer SDH subtitles, 2 = Only show SDH subtitles, 3 = Only shown non-SDH subtitles)
         */
        public Builder defaultSubtitleAccessibility(PostUsersSignInDataDefaultSubtitleAccessibility defaultSubtitleAccessibility) {
            Utils.checkNotNull(defaultSubtitleAccessibility, "defaultSubtitleAccessibility");
            this.defaultSubtitleAccessibility = Optional.ofNullable(defaultSubtitleAccessibility);
            return this;
        }

        /**
         * The subtitles for the deaf or hard-of-hearing (SDH) searches mode (0 = Prefer non-SDH subtitles, 1 = Prefer SDH subtitles, 2 = Only show SDH subtitles, 3 = Only shown non-SDH subtitles)
         */
        public Builder defaultSubtitleAccessibility(Optional<? extends PostUsersSignInDataDefaultSubtitleAccessibility> defaultSubtitleAccessibility) {
            Utils.checkNotNull(defaultSubtitleAccessibility, "defaultSubtitleAccessibility");
            this.defaultSubtitleAccessibility = defaultSubtitleAccessibility;
            return this;
        }

        /**
         * The forced subtitles searches mode (0 = Prefer non-forced subtitles, 1 = Prefer forced subtitles, 2 = Only show forced subtitles, 3 = Only show non-forced subtitles)
         */
        public Builder defaultSubtitleForced(PostUsersSignInDataDefaultSubtitleForced defaultSubtitleForced) {
            Utils.checkNotNull(defaultSubtitleForced, "defaultSubtitleForced");
            this.defaultSubtitleForced = Optional.ofNullable(defaultSubtitleForced);
            return this;
        }

        /**
         * The forced subtitles searches mode (0 = Prefer non-forced subtitles, 1 = Prefer forced subtitles, 2 = Only show forced subtitles, 3 = Only show non-forced subtitles)
         */
        public Builder defaultSubtitleForced(Optional<? extends PostUsersSignInDataDefaultSubtitleForced> defaultSubtitleForced) {
            Utils.checkNotNull(defaultSubtitleForced, "defaultSubtitleForced");
            this.defaultSubtitleForced = defaultSubtitleForced;
            return this;
        }

        public Builder watchedIndicator(PostUsersSignInDataWatchedIndicator watchedIndicator) {
            Utils.checkNotNull(watchedIndicator, "watchedIndicator");
            this.watchedIndicator = Optional.ofNullable(watchedIndicator);
            return this;
        }

        public Builder watchedIndicator(Optional<? extends PostUsersSignInDataWatchedIndicator> watchedIndicator) {
            Utils.checkNotNull(watchedIndicator, "watchedIndicator");
            this.watchedIndicator = watchedIndicator;
            return this;
        }

        public Builder mediaReviewsVisibility(PostUsersSignInDataMediaReviewsVisibility mediaReviewsVisibility) {
            Utils.checkNotNull(mediaReviewsVisibility, "mediaReviewsVisibility");
            this.mediaReviewsVisibility = Optional.ofNullable(mediaReviewsVisibility);
            return this;
        }

        public Builder mediaReviewsVisibility(Optional<? extends PostUsersSignInDataMediaReviewsVisibility> mediaReviewsVisibility) {
            Utils.checkNotNull(mediaReviewsVisibility, "mediaReviewsVisibility");
            this.mediaReviewsVisibility = mediaReviewsVisibility;
            return this;
        }
        
        public PostUsersSignInDataUserProfile build() {
            if (autoSelectAudio == null) {
                autoSelectAudio = _SINGLETON_VALUE_AutoSelectAudio.value();
            }            return new PostUsersSignInDataUserProfile(
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
    }
}

