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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GetLibraryItemsMedia {

    @JsonProperty("id")
    private int id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<Integer> duration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bitrate")
    private Optional<Integer> bitrate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("width")
    private Optional<Integer> width;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("height")
    private Optional<Integer> height;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aspectRatio")
    private Optional<Double> aspectRatio;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioProfile")
    private Optional<String> audioProfile;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioChannels")
    private Optional<Integer> audioChannels;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioCodec")
    private Optional<String> audioCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoCodec")
    private Optional<String> videoCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoResolution")
    private Optional<String> videoResolution;

    @JsonProperty("container")
    private String container;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoFrameRate")
    private Optional<String> videoFrameRate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoProfile")
    private Optional<String> videoProfile;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hasVoiceActivity")
    private Optional<Boolean> hasVoiceActivity;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("optimizedForStreaming")
    private Optional<? extends GetLibraryItemsOptimizedForStreaming> optimizedForStreaming;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has64bitOffsets")
    private Optional<Boolean> has64bitOffsets;

    @JsonProperty("Part")
    private List<GetLibraryItemsPart> part;

    @JsonCreator
    public GetLibraryItemsMedia(
            @JsonProperty("id") int id,
            @JsonProperty("duration") Optional<Integer> duration,
            @JsonProperty("bitrate") Optional<Integer> bitrate,
            @JsonProperty("width") Optional<Integer> width,
            @JsonProperty("height") Optional<Integer> height,
            @JsonProperty("aspectRatio") Optional<Double> aspectRatio,
            @JsonProperty("audioProfile") Optional<String> audioProfile,
            @JsonProperty("audioChannels") Optional<Integer> audioChannels,
            @JsonProperty("audioCodec") Optional<String> audioCodec,
            @JsonProperty("videoCodec") Optional<String> videoCodec,
            @JsonProperty("videoResolution") Optional<String> videoResolution,
            @JsonProperty("container") String container,
            @JsonProperty("videoFrameRate") Optional<String> videoFrameRate,
            @JsonProperty("videoProfile") Optional<String> videoProfile,
            @JsonProperty("hasVoiceActivity") Optional<Boolean> hasVoiceActivity,
            @JsonProperty("optimizedForStreaming") Optional<? extends GetLibraryItemsOptimizedForStreaming> optimizedForStreaming,
            @JsonProperty("has64bitOffsets") Optional<Boolean> has64bitOffsets,
            @JsonProperty("Part") List<GetLibraryItemsPart> part) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(duration, "duration");
        Utils.checkNotNull(bitrate, "bitrate");
        Utils.checkNotNull(width, "width");
        Utils.checkNotNull(height, "height");
        Utils.checkNotNull(aspectRatio, "aspectRatio");
        Utils.checkNotNull(audioProfile, "audioProfile");
        Utils.checkNotNull(audioChannels, "audioChannels");
        Utils.checkNotNull(audioCodec, "audioCodec");
        Utils.checkNotNull(videoCodec, "videoCodec");
        Utils.checkNotNull(videoResolution, "videoResolution");
        Utils.checkNotNull(container, "container");
        Utils.checkNotNull(videoFrameRate, "videoFrameRate");
        Utils.checkNotNull(videoProfile, "videoProfile");
        Utils.checkNotNull(hasVoiceActivity, "hasVoiceActivity");
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        Utils.checkNotNull(part, "part");
        this.id = id;
        this.duration = duration;
        this.bitrate = bitrate;
        this.width = width;
        this.height = height;
        this.aspectRatio = aspectRatio;
        this.audioProfile = audioProfile;
        this.audioChannels = audioChannels;
        this.audioCodec = audioCodec;
        this.videoCodec = videoCodec;
        this.videoResolution = videoResolution;
        this.container = container;
        this.videoFrameRate = videoFrameRate;
        this.videoProfile = videoProfile;
        this.hasVoiceActivity = hasVoiceActivity;
        this.optimizedForStreaming = optimizedForStreaming;
        this.has64bitOffsets = has64bitOffsets;
        this.part = part;
    }
    
    public GetLibraryItemsMedia(
            int id,
            String container,
            List<GetLibraryItemsPart> part) {
        this(id, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), container, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), part);
    }

    @JsonIgnore
    public int id() {
        return id;
    }

    @JsonIgnore
    public Optional<Integer> duration() {
        return duration;
    }

    @JsonIgnore
    public Optional<Integer> bitrate() {
        return bitrate;
    }

    @JsonIgnore
    public Optional<Integer> width() {
        return width;
    }

    @JsonIgnore
    public Optional<Integer> height() {
        return height;
    }

    @JsonIgnore
    public Optional<Double> aspectRatio() {
        return aspectRatio;
    }

    @JsonIgnore
    public Optional<String> audioProfile() {
        return audioProfile;
    }

    @JsonIgnore
    public Optional<Integer> audioChannels() {
        return audioChannels;
    }

    @JsonIgnore
    public Optional<String> audioCodec() {
        return audioCodec;
    }

    @JsonIgnore
    public Optional<String> videoCodec() {
        return videoCodec;
    }

    @JsonIgnore
    public Optional<String> videoResolution() {
        return videoResolution;
    }

    @JsonIgnore
    public String container() {
        return container;
    }

    @JsonIgnore
    public Optional<String> videoFrameRate() {
        return videoFrameRate;
    }

    @JsonIgnore
    public Optional<String> videoProfile() {
        return videoProfile;
    }

    @JsonIgnore
    public Optional<Boolean> hasVoiceActivity() {
        return hasVoiceActivity;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetLibraryItemsOptimizedForStreaming> optimizedForStreaming() {
        return (Optional<GetLibraryItemsOptimizedForStreaming>) optimizedForStreaming;
    }

    @JsonIgnore
    public Optional<Boolean> has64bitOffsets() {
        return has64bitOffsets;
    }

    @JsonIgnore
    public List<GetLibraryItemsPart> part() {
        return part;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetLibraryItemsMedia withId(int id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetLibraryItemsMedia withDuration(int duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    public GetLibraryItemsMedia withDuration(Optional<Integer> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    public GetLibraryItemsMedia withBitrate(int bitrate) {
        Utils.checkNotNull(bitrate, "bitrate");
        this.bitrate = Optional.ofNullable(bitrate);
        return this;
    }

    public GetLibraryItemsMedia withBitrate(Optional<Integer> bitrate) {
        Utils.checkNotNull(bitrate, "bitrate");
        this.bitrate = bitrate;
        return this;
    }

    public GetLibraryItemsMedia withWidth(int width) {
        Utils.checkNotNull(width, "width");
        this.width = Optional.ofNullable(width);
        return this;
    }

    public GetLibraryItemsMedia withWidth(Optional<Integer> width) {
        Utils.checkNotNull(width, "width");
        this.width = width;
        return this;
    }

    public GetLibraryItemsMedia withHeight(int height) {
        Utils.checkNotNull(height, "height");
        this.height = Optional.ofNullable(height);
        return this;
    }

    public GetLibraryItemsMedia withHeight(Optional<Integer> height) {
        Utils.checkNotNull(height, "height");
        this.height = height;
        return this;
    }

    public GetLibraryItemsMedia withAspectRatio(double aspectRatio) {
        Utils.checkNotNull(aspectRatio, "aspectRatio");
        this.aspectRatio = Optional.ofNullable(aspectRatio);
        return this;
    }

    public GetLibraryItemsMedia withAspectRatio(Optional<Double> aspectRatio) {
        Utils.checkNotNull(aspectRatio, "aspectRatio");
        this.aspectRatio = aspectRatio;
        return this;
    }

    public GetLibraryItemsMedia withAudioProfile(String audioProfile) {
        Utils.checkNotNull(audioProfile, "audioProfile");
        this.audioProfile = Optional.ofNullable(audioProfile);
        return this;
    }

    public GetLibraryItemsMedia withAudioProfile(Optional<String> audioProfile) {
        Utils.checkNotNull(audioProfile, "audioProfile");
        this.audioProfile = audioProfile;
        return this;
    }

    public GetLibraryItemsMedia withAudioChannels(int audioChannels) {
        Utils.checkNotNull(audioChannels, "audioChannels");
        this.audioChannels = Optional.ofNullable(audioChannels);
        return this;
    }

    public GetLibraryItemsMedia withAudioChannels(Optional<Integer> audioChannels) {
        Utils.checkNotNull(audioChannels, "audioChannels");
        this.audioChannels = audioChannels;
        return this;
    }

    public GetLibraryItemsMedia withAudioCodec(String audioCodec) {
        Utils.checkNotNull(audioCodec, "audioCodec");
        this.audioCodec = Optional.ofNullable(audioCodec);
        return this;
    }

    public GetLibraryItemsMedia withAudioCodec(Optional<String> audioCodec) {
        Utils.checkNotNull(audioCodec, "audioCodec");
        this.audioCodec = audioCodec;
        return this;
    }

    public GetLibraryItemsMedia withVideoCodec(String videoCodec) {
        Utils.checkNotNull(videoCodec, "videoCodec");
        this.videoCodec = Optional.ofNullable(videoCodec);
        return this;
    }

    public GetLibraryItemsMedia withVideoCodec(Optional<String> videoCodec) {
        Utils.checkNotNull(videoCodec, "videoCodec");
        this.videoCodec = videoCodec;
        return this;
    }

    public GetLibraryItemsMedia withVideoResolution(String videoResolution) {
        Utils.checkNotNull(videoResolution, "videoResolution");
        this.videoResolution = Optional.ofNullable(videoResolution);
        return this;
    }

    public GetLibraryItemsMedia withVideoResolution(Optional<String> videoResolution) {
        Utils.checkNotNull(videoResolution, "videoResolution");
        this.videoResolution = videoResolution;
        return this;
    }

    public GetLibraryItemsMedia withContainer(String container) {
        Utils.checkNotNull(container, "container");
        this.container = container;
        return this;
    }

    public GetLibraryItemsMedia withVideoFrameRate(String videoFrameRate) {
        Utils.checkNotNull(videoFrameRate, "videoFrameRate");
        this.videoFrameRate = Optional.ofNullable(videoFrameRate);
        return this;
    }

    public GetLibraryItemsMedia withVideoFrameRate(Optional<String> videoFrameRate) {
        Utils.checkNotNull(videoFrameRate, "videoFrameRate");
        this.videoFrameRate = videoFrameRate;
        return this;
    }

    public GetLibraryItemsMedia withVideoProfile(String videoProfile) {
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.videoProfile = Optional.ofNullable(videoProfile);
        return this;
    }

    public GetLibraryItemsMedia withVideoProfile(Optional<String> videoProfile) {
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.videoProfile = videoProfile;
        return this;
    }

    public GetLibraryItemsMedia withHasVoiceActivity(boolean hasVoiceActivity) {
        Utils.checkNotNull(hasVoiceActivity, "hasVoiceActivity");
        this.hasVoiceActivity = Optional.ofNullable(hasVoiceActivity);
        return this;
    }

    public GetLibraryItemsMedia withHasVoiceActivity(Optional<Boolean> hasVoiceActivity) {
        Utils.checkNotNull(hasVoiceActivity, "hasVoiceActivity");
        this.hasVoiceActivity = hasVoiceActivity;
        return this;
    }

    public GetLibraryItemsMedia withOptimizedForStreaming(GetLibraryItemsOptimizedForStreaming optimizedForStreaming) {
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        this.optimizedForStreaming = Optional.ofNullable(optimizedForStreaming);
        return this;
    }

    public GetLibraryItemsMedia withOptimizedForStreaming(Optional<? extends GetLibraryItemsOptimizedForStreaming> optimizedForStreaming) {
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        this.optimizedForStreaming = optimizedForStreaming;
        return this;
    }

    public GetLibraryItemsMedia withHas64bitOffsets(boolean has64bitOffsets) {
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        this.has64bitOffsets = Optional.ofNullable(has64bitOffsets);
        return this;
    }

    public GetLibraryItemsMedia withHas64bitOffsets(Optional<Boolean> has64bitOffsets) {
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        this.has64bitOffsets = has64bitOffsets;
        return this;
    }

    public GetLibraryItemsMedia withPart(List<GetLibraryItemsPart> part) {
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
        GetLibraryItemsMedia other = (GetLibraryItemsMedia) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.duration, other.duration) &&
            Objects.deepEquals(this.bitrate, other.bitrate) &&
            Objects.deepEquals(this.width, other.width) &&
            Objects.deepEquals(this.height, other.height) &&
            Objects.deepEquals(this.aspectRatio, other.aspectRatio) &&
            Objects.deepEquals(this.audioProfile, other.audioProfile) &&
            Objects.deepEquals(this.audioChannels, other.audioChannels) &&
            Objects.deepEquals(this.audioCodec, other.audioCodec) &&
            Objects.deepEquals(this.videoCodec, other.videoCodec) &&
            Objects.deepEquals(this.videoResolution, other.videoResolution) &&
            Objects.deepEquals(this.container, other.container) &&
            Objects.deepEquals(this.videoFrameRate, other.videoFrameRate) &&
            Objects.deepEquals(this.videoProfile, other.videoProfile) &&
            Objects.deepEquals(this.hasVoiceActivity, other.hasVoiceActivity) &&
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
            audioProfile,
            audioChannels,
            audioCodec,
            videoCodec,
            videoResolution,
            container,
            videoFrameRate,
            videoProfile,
            hasVoiceActivity,
            optimizedForStreaming,
            has64bitOffsets,
            part);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLibraryItemsMedia.class,
                "id", id,
                "duration", duration,
                "bitrate", bitrate,
                "width", width,
                "height", height,
                "aspectRatio", aspectRatio,
                "audioProfile", audioProfile,
                "audioChannels", audioChannels,
                "audioCodec", audioCodec,
                "videoCodec", videoCodec,
                "videoResolution", videoResolution,
                "container", container,
                "videoFrameRate", videoFrameRate,
                "videoProfile", videoProfile,
                "hasVoiceActivity", hasVoiceActivity,
                "optimizedForStreaming", optimizedForStreaming,
                "has64bitOffsets", has64bitOffsets,
                "part", part);
    }
    
    public final static class Builder {
 
        private Integer id;
 
        private Optional<Integer> duration = Optional.empty();
 
        private Optional<Integer> bitrate = Optional.empty();
 
        private Optional<Integer> width = Optional.empty();
 
        private Optional<Integer> height = Optional.empty();
 
        private Optional<Double> aspectRatio = Optional.empty();
 
        private Optional<String> audioProfile = Optional.empty();
 
        private Optional<Integer> audioChannels = Optional.empty();
 
        private Optional<String> audioCodec = Optional.empty();
 
        private Optional<String> videoCodec = Optional.empty();
 
        private Optional<String> videoResolution = Optional.empty();
 
        private String container;
 
        private Optional<String> videoFrameRate = Optional.empty();
 
        private Optional<String> videoProfile = Optional.empty();
 
        private Optional<Boolean> hasVoiceActivity = Optional.empty();
 
        private Optional<? extends GetLibraryItemsOptimizedForStreaming> optimizedForStreaming;
 
        private Optional<Boolean> has64bitOffsets = Optional.empty();
 
        private List<GetLibraryItemsPart> part;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(int id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder duration(int duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = Optional.ofNullable(duration);
            return this;
        }

        public Builder duration(Optional<Integer> duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = duration;
            return this;
        }

        public Builder bitrate(int bitrate) {
            Utils.checkNotNull(bitrate, "bitrate");
            this.bitrate = Optional.ofNullable(bitrate);
            return this;
        }

        public Builder bitrate(Optional<Integer> bitrate) {
            Utils.checkNotNull(bitrate, "bitrate");
            this.bitrate = bitrate;
            return this;
        }

        public Builder width(int width) {
            Utils.checkNotNull(width, "width");
            this.width = Optional.ofNullable(width);
            return this;
        }

        public Builder width(Optional<Integer> width) {
            Utils.checkNotNull(width, "width");
            this.width = width;
            return this;
        }

        public Builder height(int height) {
            Utils.checkNotNull(height, "height");
            this.height = Optional.ofNullable(height);
            return this;
        }

        public Builder height(Optional<Integer> height) {
            Utils.checkNotNull(height, "height");
            this.height = height;
            return this;
        }

        public Builder aspectRatio(double aspectRatio) {
            Utils.checkNotNull(aspectRatio, "aspectRatio");
            this.aspectRatio = Optional.ofNullable(aspectRatio);
            return this;
        }

        public Builder aspectRatio(Optional<Double> aspectRatio) {
            Utils.checkNotNull(aspectRatio, "aspectRatio");
            this.aspectRatio = aspectRatio;
            return this;
        }

        public Builder audioProfile(String audioProfile) {
            Utils.checkNotNull(audioProfile, "audioProfile");
            this.audioProfile = Optional.ofNullable(audioProfile);
            return this;
        }

        public Builder audioProfile(Optional<String> audioProfile) {
            Utils.checkNotNull(audioProfile, "audioProfile");
            this.audioProfile = audioProfile;
            return this;
        }

        public Builder audioChannels(int audioChannels) {
            Utils.checkNotNull(audioChannels, "audioChannels");
            this.audioChannels = Optional.ofNullable(audioChannels);
            return this;
        }

        public Builder audioChannels(Optional<Integer> audioChannels) {
            Utils.checkNotNull(audioChannels, "audioChannels");
            this.audioChannels = audioChannels;
            return this;
        }

        public Builder audioCodec(String audioCodec) {
            Utils.checkNotNull(audioCodec, "audioCodec");
            this.audioCodec = Optional.ofNullable(audioCodec);
            return this;
        }

        public Builder audioCodec(Optional<String> audioCodec) {
            Utils.checkNotNull(audioCodec, "audioCodec");
            this.audioCodec = audioCodec;
            return this;
        }

        public Builder videoCodec(String videoCodec) {
            Utils.checkNotNull(videoCodec, "videoCodec");
            this.videoCodec = Optional.ofNullable(videoCodec);
            return this;
        }

        public Builder videoCodec(Optional<String> videoCodec) {
            Utils.checkNotNull(videoCodec, "videoCodec");
            this.videoCodec = videoCodec;
            return this;
        }

        public Builder videoResolution(String videoResolution) {
            Utils.checkNotNull(videoResolution, "videoResolution");
            this.videoResolution = Optional.ofNullable(videoResolution);
            return this;
        }

        public Builder videoResolution(Optional<String> videoResolution) {
            Utils.checkNotNull(videoResolution, "videoResolution");
            this.videoResolution = videoResolution;
            return this;
        }

        public Builder container(String container) {
            Utils.checkNotNull(container, "container");
            this.container = container;
            return this;
        }

        public Builder videoFrameRate(String videoFrameRate) {
            Utils.checkNotNull(videoFrameRate, "videoFrameRate");
            this.videoFrameRate = Optional.ofNullable(videoFrameRate);
            return this;
        }

        public Builder videoFrameRate(Optional<String> videoFrameRate) {
            Utils.checkNotNull(videoFrameRate, "videoFrameRate");
            this.videoFrameRate = videoFrameRate;
            return this;
        }

        public Builder videoProfile(String videoProfile) {
            Utils.checkNotNull(videoProfile, "videoProfile");
            this.videoProfile = Optional.ofNullable(videoProfile);
            return this;
        }

        public Builder videoProfile(Optional<String> videoProfile) {
            Utils.checkNotNull(videoProfile, "videoProfile");
            this.videoProfile = videoProfile;
            return this;
        }

        public Builder hasVoiceActivity(boolean hasVoiceActivity) {
            Utils.checkNotNull(hasVoiceActivity, "hasVoiceActivity");
            this.hasVoiceActivity = Optional.ofNullable(hasVoiceActivity);
            return this;
        }

        public Builder hasVoiceActivity(Optional<Boolean> hasVoiceActivity) {
            Utils.checkNotNull(hasVoiceActivity, "hasVoiceActivity");
            this.hasVoiceActivity = hasVoiceActivity;
            return this;
        }

        public Builder optimizedForStreaming(GetLibraryItemsOptimizedForStreaming optimizedForStreaming) {
            Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
            this.optimizedForStreaming = Optional.ofNullable(optimizedForStreaming);
            return this;
        }

        public Builder optimizedForStreaming(Optional<? extends GetLibraryItemsOptimizedForStreaming> optimizedForStreaming) {
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

        public Builder part(List<GetLibraryItemsPart> part) {
            Utils.checkNotNull(part, "part");
            this.part = part;
            return this;
        }
        
        public GetLibraryItemsMedia build() {
            if (optimizedForStreaming == null) {
                optimizedForStreaming = _SINGLETON_VALUE_OptimizedForStreaming.value();
            }
            return new GetLibraryItemsMedia(
                id,
                duration,
                bitrate,
                width,
                height,
                aspectRatio,
                audioProfile,
                audioChannels,
                audioCodec,
                videoCodec,
                videoResolution,
                container,
                videoFrameRate,
                videoProfile,
                hasVoiceActivity,
                optimizedForStreaming,
                has64bitOffsets,
                part);
        }

        private static final LazySingletonValue<Optional<? extends GetLibraryItemsOptimizedForStreaming>> _SINGLETON_VALUE_OptimizedForStreaming =
                new LazySingletonValue<>(
                        "optimizedForStreaming",
                        "0",
                        new TypeReference<Optional<? extends GetLibraryItemsOptimizedForStreaming>>() {});
    }
}
