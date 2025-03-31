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
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GetRecentlyAddedLibraryMedia {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<Double> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<Double> duration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bitrate")
    private Optional<Double> bitrate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("width")
    private Optional<Double> width;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("height")
    private Optional<Double> height;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aspectRatio")
    private Optional<Double> aspectRatio;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioChannels")
    private Optional<Double> audioChannels;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioCodec")
    private Optional<String> audioCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoCodec")
    private Optional<String> videoCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoResolution")
    private Optional<Double> videoResolution;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    private Optional<String> container;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoFrameRate")
    private Optional<String> videoFrameRate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("optimizedForStreaming")
    private Optional<Double> optimizedForStreaming;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has64bitOffsets")
    private Optional<Boolean> has64bitOffsets;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoProfile")
    private Optional<String> videoProfile;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Part")
    private Optional<? extends List<GetRecentlyAddedLibraryPart>> part;

    @JsonCreator
    public GetRecentlyAddedLibraryMedia(
            @JsonProperty("id") Optional<Double> id,
            @JsonProperty("duration") Optional<Double> duration,
            @JsonProperty("bitrate") Optional<Double> bitrate,
            @JsonProperty("width") Optional<Double> width,
            @JsonProperty("height") Optional<Double> height,
            @JsonProperty("aspectRatio") Optional<Double> aspectRatio,
            @JsonProperty("audioChannels") Optional<Double> audioChannels,
            @JsonProperty("audioCodec") Optional<String> audioCodec,
            @JsonProperty("videoCodec") Optional<String> videoCodec,
            @JsonProperty("videoResolution") Optional<Double> videoResolution,
            @JsonProperty("container") Optional<String> container,
            @JsonProperty("videoFrameRate") Optional<String> videoFrameRate,
            @JsonProperty("optimizedForStreaming") Optional<Double> optimizedForStreaming,
            @JsonProperty("has64bitOffsets") Optional<Boolean> has64bitOffsets,
            @JsonProperty("videoProfile") Optional<String> videoProfile,
            @JsonProperty("Part") Optional<? extends List<GetRecentlyAddedLibraryPart>> part) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(duration, "duration");
        Utils.checkNotNull(bitrate, "bitrate");
        Utils.checkNotNull(width, "width");
        Utils.checkNotNull(height, "height");
        Utils.checkNotNull(aspectRatio, "aspectRatio");
        Utils.checkNotNull(audioChannels, "audioChannels");
        Utils.checkNotNull(audioCodec, "audioCodec");
        Utils.checkNotNull(videoCodec, "videoCodec");
        Utils.checkNotNull(videoResolution, "videoResolution");
        Utils.checkNotNull(container, "container");
        Utils.checkNotNull(videoFrameRate, "videoFrameRate");
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        Utils.checkNotNull(videoProfile, "videoProfile");
        Utils.checkNotNull(part, "part");
        this.id = id;
        this.duration = duration;
        this.bitrate = bitrate;
        this.width = width;
        this.height = height;
        this.aspectRatio = aspectRatio;
        this.audioChannels = audioChannels;
        this.audioCodec = audioCodec;
        this.videoCodec = videoCodec;
        this.videoResolution = videoResolution;
        this.container = container;
        this.videoFrameRate = videoFrameRate;
        this.optimizedForStreaming = optimizedForStreaming;
        this.has64bitOffsets = has64bitOffsets;
        this.videoProfile = videoProfile;
        this.part = part;
    }
    
    public GetRecentlyAddedLibraryMedia() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Double> id() {
        return id;
    }

    @JsonIgnore
    public Optional<Double> duration() {
        return duration;
    }

    @JsonIgnore
    public Optional<Double> bitrate() {
        return bitrate;
    }

    @JsonIgnore
    public Optional<Double> width() {
        return width;
    }

    @JsonIgnore
    public Optional<Double> height() {
        return height;
    }

    @JsonIgnore
    public Optional<Double> aspectRatio() {
        return aspectRatio;
    }

    @JsonIgnore
    public Optional<Double> audioChannels() {
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
    public Optional<Double> videoResolution() {
        return videoResolution;
    }

    @JsonIgnore
    public Optional<String> container() {
        return container;
    }

    @JsonIgnore
    public Optional<String> videoFrameRate() {
        return videoFrameRate;
    }

    @JsonIgnore
    public Optional<Double> optimizedForStreaming() {
        return optimizedForStreaming;
    }

    @JsonIgnore
    public Optional<Boolean> has64bitOffsets() {
        return has64bitOffsets;
    }

    @JsonIgnore
    public Optional<String> videoProfile() {
        return videoProfile;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetRecentlyAddedLibraryPart>> part() {
        return (Optional<List<GetRecentlyAddedLibraryPart>>) part;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetRecentlyAddedLibraryMedia withId(double id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withId(Optional<Double> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withDuration(double duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withDuration(Optional<Double> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withBitrate(double bitrate) {
        Utils.checkNotNull(bitrate, "bitrate");
        this.bitrate = Optional.ofNullable(bitrate);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withBitrate(Optional<Double> bitrate) {
        Utils.checkNotNull(bitrate, "bitrate");
        this.bitrate = bitrate;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withWidth(double width) {
        Utils.checkNotNull(width, "width");
        this.width = Optional.ofNullable(width);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withWidth(Optional<Double> width) {
        Utils.checkNotNull(width, "width");
        this.width = width;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withHeight(double height) {
        Utils.checkNotNull(height, "height");
        this.height = Optional.ofNullable(height);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withHeight(Optional<Double> height) {
        Utils.checkNotNull(height, "height");
        this.height = height;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withAspectRatio(double aspectRatio) {
        Utils.checkNotNull(aspectRatio, "aspectRatio");
        this.aspectRatio = Optional.ofNullable(aspectRatio);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withAspectRatio(Optional<Double> aspectRatio) {
        Utils.checkNotNull(aspectRatio, "aspectRatio");
        this.aspectRatio = aspectRatio;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withAudioChannels(double audioChannels) {
        Utils.checkNotNull(audioChannels, "audioChannels");
        this.audioChannels = Optional.ofNullable(audioChannels);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withAudioChannels(Optional<Double> audioChannels) {
        Utils.checkNotNull(audioChannels, "audioChannels");
        this.audioChannels = audioChannels;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withAudioCodec(String audioCodec) {
        Utils.checkNotNull(audioCodec, "audioCodec");
        this.audioCodec = Optional.ofNullable(audioCodec);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withAudioCodec(Optional<String> audioCodec) {
        Utils.checkNotNull(audioCodec, "audioCodec");
        this.audioCodec = audioCodec;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withVideoCodec(String videoCodec) {
        Utils.checkNotNull(videoCodec, "videoCodec");
        this.videoCodec = Optional.ofNullable(videoCodec);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withVideoCodec(Optional<String> videoCodec) {
        Utils.checkNotNull(videoCodec, "videoCodec");
        this.videoCodec = videoCodec;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withVideoResolution(double videoResolution) {
        Utils.checkNotNull(videoResolution, "videoResolution");
        this.videoResolution = Optional.ofNullable(videoResolution);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withVideoResolution(Optional<Double> videoResolution) {
        Utils.checkNotNull(videoResolution, "videoResolution");
        this.videoResolution = videoResolution;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withContainer(String container) {
        Utils.checkNotNull(container, "container");
        this.container = Optional.ofNullable(container);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withContainer(Optional<String> container) {
        Utils.checkNotNull(container, "container");
        this.container = container;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withVideoFrameRate(String videoFrameRate) {
        Utils.checkNotNull(videoFrameRate, "videoFrameRate");
        this.videoFrameRate = Optional.ofNullable(videoFrameRate);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withVideoFrameRate(Optional<String> videoFrameRate) {
        Utils.checkNotNull(videoFrameRate, "videoFrameRate");
        this.videoFrameRate = videoFrameRate;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withOptimizedForStreaming(double optimizedForStreaming) {
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        this.optimizedForStreaming = Optional.ofNullable(optimizedForStreaming);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withOptimizedForStreaming(Optional<Double> optimizedForStreaming) {
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        this.optimizedForStreaming = optimizedForStreaming;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withHas64bitOffsets(boolean has64bitOffsets) {
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        this.has64bitOffsets = Optional.ofNullable(has64bitOffsets);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withHas64bitOffsets(Optional<Boolean> has64bitOffsets) {
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        this.has64bitOffsets = has64bitOffsets;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withVideoProfile(String videoProfile) {
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.videoProfile = Optional.ofNullable(videoProfile);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withVideoProfile(Optional<String> videoProfile) {
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.videoProfile = videoProfile;
        return this;
    }

    public GetRecentlyAddedLibraryMedia withPart(List<GetRecentlyAddedLibraryPart> part) {
        Utils.checkNotNull(part, "part");
        this.part = Optional.ofNullable(part);
        return this;
    }

    public GetRecentlyAddedLibraryMedia withPart(Optional<? extends List<GetRecentlyAddedLibraryPart>> part) {
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
        GetRecentlyAddedLibraryMedia other = (GetRecentlyAddedLibraryMedia) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.duration, other.duration) &&
            Objects.deepEquals(this.bitrate, other.bitrate) &&
            Objects.deepEquals(this.width, other.width) &&
            Objects.deepEquals(this.height, other.height) &&
            Objects.deepEquals(this.aspectRatio, other.aspectRatio) &&
            Objects.deepEquals(this.audioChannels, other.audioChannels) &&
            Objects.deepEquals(this.audioCodec, other.audioCodec) &&
            Objects.deepEquals(this.videoCodec, other.videoCodec) &&
            Objects.deepEquals(this.videoResolution, other.videoResolution) &&
            Objects.deepEquals(this.container, other.container) &&
            Objects.deepEquals(this.videoFrameRate, other.videoFrameRate) &&
            Objects.deepEquals(this.optimizedForStreaming, other.optimizedForStreaming) &&
            Objects.deepEquals(this.has64bitOffsets, other.has64bitOffsets) &&
            Objects.deepEquals(this.videoProfile, other.videoProfile) &&
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
            audioCodec,
            videoCodec,
            videoResolution,
            container,
            videoFrameRate,
            optimizedForStreaming,
            has64bitOffsets,
            videoProfile,
            part);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetRecentlyAddedLibraryMedia.class,
                "id", id,
                "duration", duration,
                "bitrate", bitrate,
                "width", width,
                "height", height,
                "aspectRatio", aspectRatio,
                "audioChannels", audioChannels,
                "audioCodec", audioCodec,
                "videoCodec", videoCodec,
                "videoResolution", videoResolution,
                "container", container,
                "videoFrameRate", videoFrameRate,
                "optimizedForStreaming", optimizedForStreaming,
                "has64bitOffsets", has64bitOffsets,
                "videoProfile", videoProfile,
                "part", part);
    }
    
    public final static class Builder {
 
        private Optional<Double> id = Optional.empty();
 
        private Optional<Double> duration = Optional.empty();
 
        private Optional<Double> bitrate = Optional.empty();
 
        private Optional<Double> width = Optional.empty();
 
        private Optional<Double> height = Optional.empty();
 
        private Optional<Double> aspectRatio = Optional.empty();
 
        private Optional<Double> audioChannels = Optional.empty();
 
        private Optional<String> audioCodec = Optional.empty();
 
        private Optional<String> videoCodec = Optional.empty();
 
        private Optional<Double> videoResolution = Optional.empty();
 
        private Optional<String> container = Optional.empty();
 
        private Optional<String> videoFrameRate = Optional.empty();
 
        private Optional<Double> optimizedForStreaming = Optional.empty();
 
        private Optional<Boolean> has64bitOffsets = Optional.empty();
 
        private Optional<String> videoProfile = Optional.empty();
 
        private Optional<? extends List<GetRecentlyAddedLibraryPart>> part = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(double id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<Double> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder duration(double duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = Optional.ofNullable(duration);
            return this;
        }

        public Builder duration(Optional<Double> duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = duration;
            return this;
        }

        public Builder bitrate(double bitrate) {
            Utils.checkNotNull(bitrate, "bitrate");
            this.bitrate = Optional.ofNullable(bitrate);
            return this;
        }

        public Builder bitrate(Optional<Double> bitrate) {
            Utils.checkNotNull(bitrate, "bitrate");
            this.bitrate = bitrate;
            return this;
        }

        public Builder width(double width) {
            Utils.checkNotNull(width, "width");
            this.width = Optional.ofNullable(width);
            return this;
        }

        public Builder width(Optional<Double> width) {
            Utils.checkNotNull(width, "width");
            this.width = width;
            return this;
        }

        public Builder height(double height) {
            Utils.checkNotNull(height, "height");
            this.height = Optional.ofNullable(height);
            return this;
        }

        public Builder height(Optional<Double> height) {
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

        public Builder audioChannels(double audioChannels) {
            Utils.checkNotNull(audioChannels, "audioChannels");
            this.audioChannels = Optional.ofNullable(audioChannels);
            return this;
        }

        public Builder audioChannels(Optional<Double> audioChannels) {
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

        public Builder videoResolution(double videoResolution) {
            Utils.checkNotNull(videoResolution, "videoResolution");
            this.videoResolution = Optional.ofNullable(videoResolution);
            return this;
        }

        public Builder videoResolution(Optional<Double> videoResolution) {
            Utils.checkNotNull(videoResolution, "videoResolution");
            this.videoResolution = videoResolution;
            return this;
        }

        public Builder container(String container) {
            Utils.checkNotNull(container, "container");
            this.container = Optional.ofNullable(container);
            return this;
        }

        public Builder container(Optional<String> container) {
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

        public Builder optimizedForStreaming(double optimizedForStreaming) {
            Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
            this.optimizedForStreaming = Optional.ofNullable(optimizedForStreaming);
            return this;
        }

        public Builder optimizedForStreaming(Optional<Double> optimizedForStreaming) {
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

        public Builder part(List<GetRecentlyAddedLibraryPart> part) {
            Utils.checkNotNull(part, "part");
            this.part = Optional.ofNullable(part);
            return this;
        }

        public Builder part(Optional<? extends List<GetRecentlyAddedLibraryPart>> part) {
            Utils.checkNotNull(part, "part");
            this.part = part;
            return this;
        }
        
        public GetRecentlyAddedLibraryMedia build() {
            return new GetRecentlyAddedLibraryMedia(
                id,
                duration,
                bitrate,
                width,
                height,
                aspectRatio,
                audioChannels,
                audioCodec,
                videoCodec,
                videoResolution,
                container,
                videoFrameRate,
                optimizedForStreaming,
                has64bitOffsets,
                videoProfile,
                part);
        }
    }
}
