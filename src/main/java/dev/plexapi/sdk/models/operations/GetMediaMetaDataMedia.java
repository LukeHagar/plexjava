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
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GetMediaMetaDataMedia {

    /**
     * Unique media identifier.
     */
    @JsonProperty("id")
    private long id;

    /**
     * Duration of the media in milliseconds.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<Integer> duration;

    /**
     * Bitrate in bits per second.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bitrate")
    private Optional<Integer> bitrate;

    /**
     * Video width in pixels.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("width")
    private Optional<Integer> width;

    /**
     * Video height in pixels.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("height")
    private Optional<Integer> height;

    /**
     * Aspect ratio of the video.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aspectRatio")
    private Optional<Float> aspectRatio;

    /**
     * Number of audio channels.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioChannels")
    private Optional<Integer> audioChannels;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("displayOffset")
    private Optional<Integer> displayOffset;

    /**
     * Audio codec used.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioCodec")
    private Optional<String> audioCodec;

    /**
     * Video codec used.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoCodec")
    private Optional<String> videoCodec;

    /**
     * Video resolution (e.g., 4k).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoResolution")
    private Optional<String> videoResolution;

    /**
     * File container type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    private Optional<String> container;

    /**
     * Frame rate of the video. Values found include NTSC, PAL, 24p
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoFrameRate")
    private Optional<String> videoFrameRate;

    /**
     * Video profile (e.g., main 10).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoProfile")
    private Optional<String> videoProfile;

    /**
     * Indicates whether voice activity is detected.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hasVoiceActivity")
    private Optional<Boolean> hasVoiceActivity;

    /**
     * The audio profile used for the media (e.g., DTS, Dolby Digital, etc.).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioProfile")
    private Optional<String> audioProfile;

    /**
     * Has this media been optimized for streaming. NOTE: This can be 0, 1, false or true
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("optimizedForStreaming")
    private Optional<? extends GetMediaMetaDataOptimizedForStreaming> optimizedForStreaming;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has64bitOffsets")
    private Optional<Boolean> has64bitOffsets;

    /**
     * An array of parts for this media item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Part")
    private Optional<? extends List<GetMediaMetaDataPart>> part;

    @JsonCreator
    public GetMediaMetaDataMedia(
            @JsonProperty("id") long id,
            @JsonProperty("duration") Optional<Integer> duration,
            @JsonProperty("bitrate") Optional<Integer> bitrate,
            @JsonProperty("width") Optional<Integer> width,
            @JsonProperty("height") Optional<Integer> height,
            @JsonProperty("aspectRatio") Optional<Float> aspectRatio,
            @JsonProperty("audioChannels") Optional<Integer> audioChannels,
            @JsonProperty("displayOffset") Optional<Integer> displayOffset,
            @JsonProperty("audioCodec") Optional<String> audioCodec,
            @JsonProperty("videoCodec") Optional<String> videoCodec,
            @JsonProperty("videoResolution") Optional<String> videoResolution,
            @JsonProperty("container") Optional<String> container,
            @JsonProperty("videoFrameRate") Optional<String> videoFrameRate,
            @JsonProperty("videoProfile") Optional<String> videoProfile,
            @JsonProperty("hasVoiceActivity") Optional<Boolean> hasVoiceActivity,
            @JsonProperty("audioProfile") Optional<String> audioProfile,
            @JsonProperty("optimizedForStreaming") Optional<? extends GetMediaMetaDataOptimizedForStreaming> optimizedForStreaming,
            @JsonProperty("has64bitOffsets") Optional<Boolean> has64bitOffsets,
            @JsonProperty("Part") Optional<? extends List<GetMediaMetaDataPart>> part) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(duration, "duration");
        Utils.checkNotNull(bitrate, "bitrate");
        Utils.checkNotNull(width, "width");
        Utils.checkNotNull(height, "height");
        Utils.checkNotNull(aspectRatio, "aspectRatio");
        Utils.checkNotNull(audioChannels, "audioChannels");
        Utils.checkNotNull(displayOffset, "displayOffset");
        Utils.checkNotNull(audioCodec, "audioCodec");
        Utils.checkNotNull(videoCodec, "videoCodec");
        Utils.checkNotNull(videoResolution, "videoResolution");
        Utils.checkNotNull(container, "container");
        Utils.checkNotNull(videoFrameRate, "videoFrameRate");
        Utils.checkNotNull(videoProfile, "videoProfile");
        Utils.checkNotNull(hasVoiceActivity, "hasVoiceActivity");
        Utils.checkNotNull(audioProfile, "audioProfile");
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        Utils.checkNotNull(part, "part");
        this.id = id;
        this.duration = duration;
        this.bitrate = bitrate;
        this.width = width;
        this.height = height;
        this.aspectRatio = aspectRatio;
        this.audioChannels = audioChannels;
        this.displayOffset = displayOffset;
        this.audioCodec = audioCodec;
        this.videoCodec = videoCodec;
        this.videoResolution = videoResolution;
        this.container = container;
        this.videoFrameRate = videoFrameRate;
        this.videoProfile = videoProfile;
        this.hasVoiceActivity = hasVoiceActivity;
        this.audioProfile = audioProfile;
        this.optimizedForStreaming = optimizedForStreaming;
        this.has64bitOffsets = has64bitOffsets;
        this.part = part;
    }
    
    public GetMediaMetaDataMedia(
            long id) {
        this(id, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique media identifier.
     */
    @JsonIgnore
    public long id() {
        return id;
    }

    /**
     * Duration of the media in milliseconds.
     */
    @JsonIgnore
    public Optional<Integer> duration() {
        return duration;
    }

    /**
     * Bitrate in bits per second.
     */
    @JsonIgnore
    public Optional<Integer> bitrate() {
        return bitrate;
    }

    /**
     * Video width in pixels.
     */
    @JsonIgnore
    public Optional<Integer> width() {
        return width;
    }

    /**
     * Video height in pixels.
     */
    @JsonIgnore
    public Optional<Integer> height() {
        return height;
    }

    /**
     * Aspect ratio of the video.
     */
    @JsonIgnore
    public Optional<Float> aspectRatio() {
        return aspectRatio;
    }

    /**
     * Number of audio channels.
     */
    @JsonIgnore
    public Optional<Integer> audioChannels() {
        return audioChannels;
    }

    @JsonIgnore
    public Optional<Integer> displayOffset() {
        return displayOffset;
    }

    /**
     * Audio codec used.
     */
    @JsonIgnore
    public Optional<String> audioCodec() {
        return audioCodec;
    }

    /**
     * Video codec used.
     */
    @JsonIgnore
    public Optional<String> videoCodec() {
        return videoCodec;
    }

    /**
     * Video resolution (e.g., 4k).
     */
    @JsonIgnore
    public Optional<String> videoResolution() {
        return videoResolution;
    }

    /**
     * File container type.
     */
    @JsonIgnore
    public Optional<String> container() {
        return container;
    }

    /**
     * Frame rate of the video. Values found include NTSC, PAL, 24p
     * 
     */
    @JsonIgnore
    public Optional<String> videoFrameRate() {
        return videoFrameRate;
    }

    /**
     * Video profile (e.g., main 10).
     */
    @JsonIgnore
    public Optional<String> videoProfile() {
        return videoProfile;
    }

    /**
     * Indicates whether voice activity is detected.
     */
    @JsonIgnore
    public Optional<Boolean> hasVoiceActivity() {
        return hasVoiceActivity;
    }

    /**
     * The audio profile used for the media (e.g., DTS, Dolby Digital, etc.).
     */
    @JsonIgnore
    public Optional<String> audioProfile() {
        return audioProfile;
    }

    /**
     * Has this media been optimized for streaming. NOTE: This can be 0, 1, false or true
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetMediaMetaDataOptimizedForStreaming> optimizedForStreaming() {
        return (Optional<GetMediaMetaDataOptimizedForStreaming>) optimizedForStreaming;
    }

    @JsonIgnore
    public Optional<Boolean> has64bitOffsets() {
        return has64bitOffsets;
    }

    /**
     * An array of parts for this media item.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetMediaMetaDataPart>> part() {
        return (Optional<List<GetMediaMetaDataPart>>) part;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique media identifier.
     */
    public GetMediaMetaDataMedia withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Duration of the media in milliseconds.
     */
    public GetMediaMetaDataMedia withDuration(int duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    /**
     * Duration of the media in milliseconds.
     */
    public GetMediaMetaDataMedia withDuration(Optional<Integer> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    /**
     * Bitrate in bits per second.
     */
    public GetMediaMetaDataMedia withBitrate(int bitrate) {
        Utils.checkNotNull(bitrate, "bitrate");
        this.bitrate = Optional.ofNullable(bitrate);
        return this;
    }

    /**
     * Bitrate in bits per second.
     */
    public GetMediaMetaDataMedia withBitrate(Optional<Integer> bitrate) {
        Utils.checkNotNull(bitrate, "bitrate");
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Video width in pixels.
     */
    public GetMediaMetaDataMedia withWidth(int width) {
        Utils.checkNotNull(width, "width");
        this.width = Optional.ofNullable(width);
        return this;
    }

    /**
     * Video width in pixels.
     */
    public GetMediaMetaDataMedia withWidth(Optional<Integer> width) {
        Utils.checkNotNull(width, "width");
        this.width = width;
        return this;
    }

    /**
     * Video height in pixels.
     */
    public GetMediaMetaDataMedia withHeight(int height) {
        Utils.checkNotNull(height, "height");
        this.height = Optional.ofNullable(height);
        return this;
    }

    /**
     * Video height in pixels.
     */
    public GetMediaMetaDataMedia withHeight(Optional<Integer> height) {
        Utils.checkNotNull(height, "height");
        this.height = height;
        return this;
    }

    /**
     * Aspect ratio of the video.
     */
    public GetMediaMetaDataMedia withAspectRatio(float aspectRatio) {
        Utils.checkNotNull(aspectRatio, "aspectRatio");
        this.aspectRatio = Optional.ofNullable(aspectRatio);
        return this;
    }

    /**
     * Aspect ratio of the video.
     */
    public GetMediaMetaDataMedia withAspectRatio(Optional<Float> aspectRatio) {
        Utils.checkNotNull(aspectRatio, "aspectRatio");
        this.aspectRatio = aspectRatio;
        return this;
    }

    /**
     * Number of audio channels.
     */
    public GetMediaMetaDataMedia withAudioChannels(int audioChannels) {
        Utils.checkNotNull(audioChannels, "audioChannels");
        this.audioChannels = Optional.ofNullable(audioChannels);
        return this;
    }

    /**
     * Number of audio channels.
     */
    public GetMediaMetaDataMedia withAudioChannels(Optional<Integer> audioChannels) {
        Utils.checkNotNull(audioChannels, "audioChannels");
        this.audioChannels = audioChannels;
        return this;
    }

    public GetMediaMetaDataMedia withDisplayOffset(int displayOffset) {
        Utils.checkNotNull(displayOffset, "displayOffset");
        this.displayOffset = Optional.ofNullable(displayOffset);
        return this;
    }

    public GetMediaMetaDataMedia withDisplayOffset(Optional<Integer> displayOffset) {
        Utils.checkNotNull(displayOffset, "displayOffset");
        this.displayOffset = displayOffset;
        return this;
    }

    /**
     * Audio codec used.
     */
    public GetMediaMetaDataMedia withAudioCodec(String audioCodec) {
        Utils.checkNotNull(audioCodec, "audioCodec");
        this.audioCodec = Optional.ofNullable(audioCodec);
        return this;
    }

    /**
     * Audio codec used.
     */
    public GetMediaMetaDataMedia withAudioCodec(Optional<String> audioCodec) {
        Utils.checkNotNull(audioCodec, "audioCodec");
        this.audioCodec = audioCodec;
        return this;
    }

    /**
     * Video codec used.
     */
    public GetMediaMetaDataMedia withVideoCodec(String videoCodec) {
        Utils.checkNotNull(videoCodec, "videoCodec");
        this.videoCodec = Optional.ofNullable(videoCodec);
        return this;
    }

    /**
     * Video codec used.
     */
    public GetMediaMetaDataMedia withVideoCodec(Optional<String> videoCodec) {
        Utils.checkNotNull(videoCodec, "videoCodec");
        this.videoCodec = videoCodec;
        return this;
    }

    /**
     * Video resolution (e.g., 4k).
     */
    public GetMediaMetaDataMedia withVideoResolution(String videoResolution) {
        Utils.checkNotNull(videoResolution, "videoResolution");
        this.videoResolution = Optional.ofNullable(videoResolution);
        return this;
    }

    /**
     * Video resolution (e.g., 4k).
     */
    public GetMediaMetaDataMedia withVideoResolution(Optional<String> videoResolution) {
        Utils.checkNotNull(videoResolution, "videoResolution");
        this.videoResolution = videoResolution;
        return this;
    }

    /**
     * File container type.
     */
    public GetMediaMetaDataMedia withContainer(String container) {
        Utils.checkNotNull(container, "container");
        this.container = Optional.ofNullable(container);
        return this;
    }

    /**
     * File container type.
     */
    public GetMediaMetaDataMedia withContainer(Optional<String> container) {
        Utils.checkNotNull(container, "container");
        this.container = container;
        return this;
    }

    /**
     * Frame rate of the video. Values found include NTSC, PAL, 24p
     * 
     */
    public GetMediaMetaDataMedia withVideoFrameRate(String videoFrameRate) {
        Utils.checkNotNull(videoFrameRate, "videoFrameRate");
        this.videoFrameRate = Optional.ofNullable(videoFrameRate);
        return this;
    }

    /**
     * Frame rate of the video. Values found include NTSC, PAL, 24p
     * 
     */
    public GetMediaMetaDataMedia withVideoFrameRate(Optional<String> videoFrameRate) {
        Utils.checkNotNull(videoFrameRate, "videoFrameRate");
        this.videoFrameRate = videoFrameRate;
        return this;
    }

    /**
     * Video profile (e.g., main 10).
     */
    public GetMediaMetaDataMedia withVideoProfile(String videoProfile) {
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.videoProfile = Optional.ofNullable(videoProfile);
        return this;
    }

    /**
     * Video profile (e.g., main 10).
     */
    public GetMediaMetaDataMedia withVideoProfile(Optional<String> videoProfile) {
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.videoProfile = videoProfile;
        return this;
    }

    /**
     * Indicates whether voice activity is detected.
     */
    public GetMediaMetaDataMedia withHasVoiceActivity(boolean hasVoiceActivity) {
        Utils.checkNotNull(hasVoiceActivity, "hasVoiceActivity");
        this.hasVoiceActivity = Optional.ofNullable(hasVoiceActivity);
        return this;
    }

    /**
     * Indicates whether voice activity is detected.
     */
    public GetMediaMetaDataMedia withHasVoiceActivity(Optional<Boolean> hasVoiceActivity) {
        Utils.checkNotNull(hasVoiceActivity, "hasVoiceActivity");
        this.hasVoiceActivity = hasVoiceActivity;
        return this;
    }

    /**
     * The audio profile used for the media (e.g., DTS, Dolby Digital, etc.).
     */
    public GetMediaMetaDataMedia withAudioProfile(String audioProfile) {
        Utils.checkNotNull(audioProfile, "audioProfile");
        this.audioProfile = Optional.ofNullable(audioProfile);
        return this;
    }

    /**
     * The audio profile used for the media (e.g., DTS, Dolby Digital, etc.).
     */
    public GetMediaMetaDataMedia withAudioProfile(Optional<String> audioProfile) {
        Utils.checkNotNull(audioProfile, "audioProfile");
        this.audioProfile = audioProfile;
        return this;
    }

    /**
     * Has this media been optimized for streaming. NOTE: This can be 0, 1, false or true
     */
    public GetMediaMetaDataMedia withOptimizedForStreaming(GetMediaMetaDataOptimizedForStreaming optimizedForStreaming) {
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        this.optimizedForStreaming = Optional.ofNullable(optimizedForStreaming);
        return this;
    }

    /**
     * Has this media been optimized for streaming. NOTE: This can be 0, 1, false or true
     */
    public GetMediaMetaDataMedia withOptimizedForStreaming(Optional<? extends GetMediaMetaDataOptimizedForStreaming> optimizedForStreaming) {
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        this.optimizedForStreaming = optimizedForStreaming;
        return this;
    }

    public GetMediaMetaDataMedia withHas64bitOffsets(boolean has64bitOffsets) {
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        this.has64bitOffsets = Optional.ofNullable(has64bitOffsets);
        return this;
    }

    public GetMediaMetaDataMedia withHas64bitOffsets(Optional<Boolean> has64bitOffsets) {
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        this.has64bitOffsets = has64bitOffsets;
        return this;
    }

    /**
     * An array of parts for this media item.
     */
    public GetMediaMetaDataMedia withPart(List<GetMediaMetaDataPart> part) {
        Utils.checkNotNull(part, "part");
        this.part = Optional.ofNullable(part);
        return this;
    }

    /**
     * An array of parts for this media item.
     */
    public GetMediaMetaDataMedia withPart(Optional<? extends List<GetMediaMetaDataPart>> part) {
        Utils.checkNotNull(part, "part");
        this.part = part;
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
        GetMediaMetaDataMedia other = (GetMediaMetaDataMedia) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.duration, other.duration) &&
            Objects.deepEquals(this.bitrate, other.bitrate) &&
            Objects.deepEquals(this.width, other.width) &&
            Objects.deepEquals(this.height, other.height) &&
            Objects.deepEquals(this.aspectRatio, other.aspectRatio) &&
            Objects.deepEquals(this.audioChannels, other.audioChannels) &&
            Objects.deepEquals(this.displayOffset, other.displayOffset) &&
            Objects.deepEquals(this.audioCodec, other.audioCodec) &&
            Objects.deepEquals(this.videoCodec, other.videoCodec) &&
            Objects.deepEquals(this.videoResolution, other.videoResolution) &&
            Objects.deepEquals(this.container, other.container) &&
            Objects.deepEquals(this.videoFrameRate, other.videoFrameRate) &&
            Objects.deepEquals(this.videoProfile, other.videoProfile) &&
            Objects.deepEquals(this.hasVoiceActivity, other.hasVoiceActivity) &&
            Objects.deepEquals(this.audioProfile, other.audioProfile) &&
            Objects.deepEquals(this.optimizedForStreaming, other.optimizedForStreaming) &&
            Objects.deepEquals(this.has64bitOffsets, other.has64bitOffsets) &&
            Objects.deepEquals(this.part, other.part);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            duration,
            bitrate,
            width,
            height,
            aspectRatio,
            audioChannels,
            displayOffset,
            audioCodec,
            videoCodec,
            videoResolution,
            container,
            videoFrameRate,
            videoProfile,
            hasVoiceActivity,
            audioProfile,
            optimizedForStreaming,
            has64bitOffsets,
            part);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMediaMetaDataMedia.class,
                "id", id,
                "duration", duration,
                "bitrate", bitrate,
                "width", width,
                "height", height,
                "aspectRatio", aspectRatio,
                "audioChannels", audioChannels,
                "displayOffset", displayOffset,
                "audioCodec", audioCodec,
                "videoCodec", videoCodec,
                "videoResolution", videoResolution,
                "container", container,
                "videoFrameRate", videoFrameRate,
                "videoProfile", videoProfile,
                "hasVoiceActivity", hasVoiceActivity,
                "audioProfile", audioProfile,
                "optimizedForStreaming", optimizedForStreaming,
                "has64bitOffsets", has64bitOffsets,
                "part", part);
    }
    
    public final static class Builder {
 
        private Long id;
 
        private Optional<Integer> duration = Optional.empty();
 
        private Optional<Integer> bitrate = Optional.empty();
 
        private Optional<Integer> width = Optional.empty();
 
        private Optional<Integer> height = Optional.empty();
 
        private Optional<Float> aspectRatio = Optional.empty();
 
        private Optional<Integer> audioChannels = Optional.empty();
 
        private Optional<Integer> displayOffset = Optional.empty();
 
        private Optional<String> audioCodec = Optional.empty();
 
        private Optional<String> videoCodec = Optional.empty();
 
        private Optional<String> videoResolution = Optional.empty();
 
        private Optional<String> container = Optional.empty();
 
        private Optional<String> videoFrameRate = Optional.empty();
 
        private Optional<String> videoProfile = Optional.empty();
 
        private Optional<Boolean> hasVoiceActivity = Optional.empty();
 
        private Optional<String> audioProfile = Optional.empty();
 
        private Optional<? extends GetMediaMetaDataOptimizedForStreaming> optimizedForStreaming = Optional.empty();
 
        private Optional<Boolean> has64bitOffsets = Optional.empty();
 
        private Optional<? extends List<GetMediaMetaDataPart>> part = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique media identifier.
         */
        public Builder id(long id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Duration of the media in milliseconds.
         */
        public Builder duration(int duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = Optional.ofNullable(duration);
            return this;
        }

        /**
         * Duration of the media in milliseconds.
         */
        public Builder duration(Optional<Integer> duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = duration;
            return this;
        }

        /**
         * Bitrate in bits per second.
         */
        public Builder bitrate(int bitrate) {
            Utils.checkNotNull(bitrate, "bitrate");
            this.bitrate = Optional.ofNullable(bitrate);
            return this;
        }

        /**
         * Bitrate in bits per second.
         */
        public Builder bitrate(Optional<Integer> bitrate) {
            Utils.checkNotNull(bitrate, "bitrate");
            this.bitrate = bitrate;
            return this;
        }

        /**
         * Video width in pixels.
         */
        public Builder width(int width) {
            Utils.checkNotNull(width, "width");
            this.width = Optional.ofNullable(width);
            return this;
        }

        /**
         * Video width in pixels.
         */
        public Builder width(Optional<Integer> width) {
            Utils.checkNotNull(width, "width");
            this.width = width;
            return this;
        }

        /**
         * Video height in pixels.
         */
        public Builder height(int height) {
            Utils.checkNotNull(height, "height");
            this.height = Optional.ofNullable(height);
            return this;
        }

        /**
         * Video height in pixels.
         */
        public Builder height(Optional<Integer> height) {
            Utils.checkNotNull(height, "height");
            this.height = height;
            return this;
        }

        /**
         * Aspect ratio of the video.
         */
        public Builder aspectRatio(float aspectRatio) {
            Utils.checkNotNull(aspectRatio, "aspectRatio");
            this.aspectRatio = Optional.ofNullable(aspectRatio);
            return this;
        }

        /**
         * Aspect ratio of the video.
         */
        public Builder aspectRatio(Optional<Float> aspectRatio) {
            Utils.checkNotNull(aspectRatio, "aspectRatio");
            this.aspectRatio = aspectRatio;
            return this;
        }

        /**
         * Number of audio channels.
         */
        public Builder audioChannels(int audioChannels) {
            Utils.checkNotNull(audioChannels, "audioChannels");
            this.audioChannels = Optional.ofNullable(audioChannels);
            return this;
        }

        /**
         * Number of audio channels.
         */
        public Builder audioChannels(Optional<Integer> audioChannels) {
            Utils.checkNotNull(audioChannels, "audioChannels");
            this.audioChannels = audioChannels;
            return this;
        }

        public Builder displayOffset(int displayOffset) {
            Utils.checkNotNull(displayOffset, "displayOffset");
            this.displayOffset = Optional.ofNullable(displayOffset);
            return this;
        }

        public Builder displayOffset(Optional<Integer> displayOffset) {
            Utils.checkNotNull(displayOffset, "displayOffset");
            this.displayOffset = displayOffset;
            return this;
        }

        /**
         * Audio codec used.
         */
        public Builder audioCodec(String audioCodec) {
            Utils.checkNotNull(audioCodec, "audioCodec");
            this.audioCodec = Optional.ofNullable(audioCodec);
            return this;
        }

        /**
         * Audio codec used.
         */
        public Builder audioCodec(Optional<String> audioCodec) {
            Utils.checkNotNull(audioCodec, "audioCodec");
            this.audioCodec = audioCodec;
            return this;
        }

        /**
         * Video codec used.
         */
        public Builder videoCodec(String videoCodec) {
            Utils.checkNotNull(videoCodec, "videoCodec");
            this.videoCodec = Optional.ofNullable(videoCodec);
            return this;
        }

        /**
         * Video codec used.
         */
        public Builder videoCodec(Optional<String> videoCodec) {
            Utils.checkNotNull(videoCodec, "videoCodec");
            this.videoCodec = videoCodec;
            return this;
        }

        /**
         * Video resolution (e.g., 4k).
         */
        public Builder videoResolution(String videoResolution) {
            Utils.checkNotNull(videoResolution, "videoResolution");
            this.videoResolution = Optional.ofNullable(videoResolution);
            return this;
        }

        /**
         * Video resolution (e.g., 4k).
         */
        public Builder videoResolution(Optional<String> videoResolution) {
            Utils.checkNotNull(videoResolution, "videoResolution");
            this.videoResolution = videoResolution;
            return this;
        }

        /**
         * File container type.
         */
        public Builder container(String container) {
            Utils.checkNotNull(container, "container");
            this.container = Optional.ofNullable(container);
            return this;
        }

        /**
         * File container type.
         */
        public Builder container(Optional<String> container) {
            Utils.checkNotNull(container, "container");
            this.container = container;
            return this;
        }

        /**
         * Frame rate of the video. Values found include NTSC, PAL, 24p
         * 
         */
        public Builder videoFrameRate(String videoFrameRate) {
            Utils.checkNotNull(videoFrameRate, "videoFrameRate");
            this.videoFrameRate = Optional.ofNullable(videoFrameRate);
            return this;
        }

        /**
         * Frame rate of the video. Values found include NTSC, PAL, 24p
         * 
         */
        public Builder videoFrameRate(Optional<String> videoFrameRate) {
            Utils.checkNotNull(videoFrameRate, "videoFrameRate");
            this.videoFrameRate = videoFrameRate;
            return this;
        }

        /**
         * Video profile (e.g., main 10).
         */
        public Builder videoProfile(String videoProfile) {
            Utils.checkNotNull(videoProfile, "videoProfile");
            this.videoProfile = Optional.ofNullable(videoProfile);
            return this;
        }

        /**
         * Video profile (e.g., main 10).
         */
        public Builder videoProfile(Optional<String> videoProfile) {
            Utils.checkNotNull(videoProfile, "videoProfile");
            this.videoProfile = videoProfile;
            return this;
        }

        /**
         * Indicates whether voice activity is detected.
         */
        public Builder hasVoiceActivity(boolean hasVoiceActivity) {
            Utils.checkNotNull(hasVoiceActivity, "hasVoiceActivity");
            this.hasVoiceActivity = Optional.ofNullable(hasVoiceActivity);
            return this;
        }

        /**
         * Indicates whether voice activity is detected.
         */
        public Builder hasVoiceActivity(Optional<Boolean> hasVoiceActivity) {
            Utils.checkNotNull(hasVoiceActivity, "hasVoiceActivity");
            this.hasVoiceActivity = hasVoiceActivity;
            return this;
        }

        /**
         * The audio profile used for the media (e.g., DTS, Dolby Digital, etc.).
         */
        public Builder audioProfile(String audioProfile) {
            Utils.checkNotNull(audioProfile, "audioProfile");
            this.audioProfile = Optional.ofNullable(audioProfile);
            return this;
        }

        /**
         * The audio profile used for the media (e.g., DTS, Dolby Digital, etc.).
         */
        public Builder audioProfile(Optional<String> audioProfile) {
            Utils.checkNotNull(audioProfile, "audioProfile");
            this.audioProfile = audioProfile;
            return this;
        }

        /**
         * Has this media been optimized for streaming. NOTE: This can be 0, 1, false or true
         */
        public Builder optimizedForStreaming(GetMediaMetaDataOptimizedForStreaming optimizedForStreaming) {
            Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
            this.optimizedForStreaming = Optional.ofNullable(optimizedForStreaming);
            return this;
        }

        /**
         * Has this media been optimized for streaming. NOTE: This can be 0, 1, false or true
         */
        public Builder optimizedForStreaming(Optional<? extends GetMediaMetaDataOptimizedForStreaming> optimizedForStreaming) {
            Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
            this.optimizedForStreaming = optimizedForStreaming;
            return this;
        }

        public Builder has64bitOffsets(boolean has64bitOffsets) {
            Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
            this.has64bitOffsets = Optional.ofNullable(has64bitOffsets);
            return this;
        }

        public Builder has64bitOffsets(Optional<Boolean> has64bitOffsets) {
            Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
            this.has64bitOffsets = has64bitOffsets;
            return this;
        }

        /**
         * An array of parts for this media item.
         */
        public Builder part(List<GetMediaMetaDataPart> part) {
            Utils.checkNotNull(part, "part");
            this.part = Optional.ofNullable(part);
            return this;
        }

        /**
         * An array of parts for this media item.
         */
        public Builder part(Optional<? extends List<GetMediaMetaDataPart>> part) {
            Utils.checkNotNull(part, "part");
            this.part = part;
            return this;
        }
        
        public GetMediaMetaDataMedia build() {
            return new GetMediaMetaDataMedia(
                id,
                duration,
                bitrate,
                width,
                height,
                aspectRatio,
                audioChannels,
                displayOffset,
                audioCodec,
                videoCodec,
                videoResolution,
                container,
                videoFrameRate,
                videoProfile,
                hasVoiceActivity,
                audioProfile,
                optimizedForStreaming,
                has64bitOffsets,
                part);
        }
    }
}

