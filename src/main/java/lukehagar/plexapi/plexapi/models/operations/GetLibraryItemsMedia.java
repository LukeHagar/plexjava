/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class GetLibraryItemsMedia {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends Integer> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<? extends Integer> duration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bitrate")
    private Optional<? extends Integer> bitrate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("width")
    private Optional<? extends Integer> width;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("height")
    private Optional<? extends Integer> height;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aspectRatio")
    private Optional<? extends Double> aspectRatio;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioChannels")
    private Optional<? extends Integer> audioChannels;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioCodec")
    private Optional<? extends String> audioCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoCodec")
    private Optional<? extends String> videoCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoResolution")
    private Optional<? extends String> videoResolution;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    private Optional<? extends String> container;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoFrameRate")
    private Optional<? extends String> videoFrameRate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoProfile")
    private Optional<? extends String> videoProfile;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Part")
    private Optional<? extends java.util.List<GetLibraryItemsPart>> part;

    @JsonCreator
    public GetLibraryItemsMedia(
            @JsonProperty("id") Optional<? extends Integer> id,
            @JsonProperty("duration") Optional<? extends Integer> duration,
            @JsonProperty("bitrate") Optional<? extends Integer> bitrate,
            @JsonProperty("width") Optional<? extends Integer> width,
            @JsonProperty("height") Optional<? extends Integer> height,
            @JsonProperty("aspectRatio") Optional<? extends Double> aspectRatio,
            @JsonProperty("audioChannels") Optional<? extends Integer> audioChannels,
            @JsonProperty("audioCodec") Optional<? extends String> audioCodec,
            @JsonProperty("videoCodec") Optional<? extends String> videoCodec,
            @JsonProperty("videoResolution") Optional<? extends String> videoResolution,
            @JsonProperty("container") Optional<? extends String> container,
            @JsonProperty("videoFrameRate") Optional<? extends String> videoFrameRate,
            @JsonProperty("videoProfile") Optional<? extends String> videoProfile,
            @JsonProperty("Part") Optional<? extends java.util.List<GetLibraryItemsPart>> part) {
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
        this.videoProfile = videoProfile;
        this.part = part;
    }
    
    public GetLibraryItemsMedia() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> id() {
        return (Optional<Integer>) id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> duration() {
        return (Optional<Integer>) duration;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> bitrate() {
        return (Optional<Integer>) bitrate;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> width() {
        return (Optional<Integer>) width;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> height() {
        return (Optional<Integer>) height;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> aspectRatio() {
        return (Optional<Double>) aspectRatio;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> audioChannels() {
        return (Optional<Integer>) audioChannels;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> audioCodec() {
        return (Optional<String>) audioCodec;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> videoCodec() {
        return (Optional<String>) videoCodec;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> videoResolution() {
        return (Optional<String>) videoResolution;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> container() {
        return (Optional<String>) container;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> videoFrameRate() {
        return (Optional<String>) videoFrameRate;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> videoProfile() {
        return (Optional<String>) videoProfile;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<GetLibraryItemsPart>> part() {
        return (Optional<java.util.List<GetLibraryItemsPart>>) part;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLibraryItemsMedia withId(int id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GetLibraryItemsMedia withId(Optional<? extends Integer> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetLibraryItemsMedia withDuration(int duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    public GetLibraryItemsMedia withDuration(Optional<? extends Integer> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    public GetLibraryItemsMedia withBitrate(int bitrate) {
        Utils.checkNotNull(bitrate, "bitrate");
        this.bitrate = Optional.ofNullable(bitrate);
        return this;
    }

    public GetLibraryItemsMedia withBitrate(Optional<? extends Integer> bitrate) {
        Utils.checkNotNull(bitrate, "bitrate");
        this.bitrate = bitrate;
        return this;
    }

    public GetLibraryItemsMedia withWidth(int width) {
        Utils.checkNotNull(width, "width");
        this.width = Optional.ofNullable(width);
        return this;
    }

    public GetLibraryItemsMedia withWidth(Optional<? extends Integer> width) {
        Utils.checkNotNull(width, "width");
        this.width = width;
        return this;
    }

    public GetLibraryItemsMedia withHeight(int height) {
        Utils.checkNotNull(height, "height");
        this.height = Optional.ofNullable(height);
        return this;
    }

    public GetLibraryItemsMedia withHeight(Optional<? extends Integer> height) {
        Utils.checkNotNull(height, "height");
        this.height = height;
        return this;
    }

    public GetLibraryItemsMedia withAspectRatio(double aspectRatio) {
        Utils.checkNotNull(aspectRatio, "aspectRatio");
        this.aspectRatio = Optional.ofNullable(aspectRatio);
        return this;
    }

    public GetLibraryItemsMedia withAspectRatio(Optional<? extends Double> aspectRatio) {
        Utils.checkNotNull(aspectRatio, "aspectRatio");
        this.aspectRatio = aspectRatio;
        return this;
    }

    public GetLibraryItemsMedia withAudioChannels(int audioChannels) {
        Utils.checkNotNull(audioChannels, "audioChannels");
        this.audioChannels = Optional.ofNullable(audioChannels);
        return this;
    }

    public GetLibraryItemsMedia withAudioChannels(Optional<? extends Integer> audioChannels) {
        Utils.checkNotNull(audioChannels, "audioChannels");
        this.audioChannels = audioChannels;
        return this;
    }

    public GetLibraryItemsMedia withAudioCodec(String audioCodec) {
        Utils.checkNotNull(audioCodec, "audioCodec");
        this.audioCodec = Optional.ofNullable(audioCodec);
        return this;
    }

    public GetLibraryItemsMedia withAudioCodec(Optional<? extends String> audioCodec) {
        Utils.checkNotNull(audioCodec, "audioCodec");
        this.audioCodec = audioCodec;
        return this;
    }

    public GetLibraryItemsMedia withVideoCodec(String videoCodec) {
        Utils.checkNotNull(videoCodec, "videoCodec");
        this.videoCodec = Optional.ofNullable(videoCodec);
        return this;
    }

    public GetLibraryItemsMedia withVideoCodec(Optional<? extends String> videoCodec) {
        Utils.checkNotNull(videoCodec, "videoCodec");
        this.videoCodec = videoCodec;
        return this;
    }

    public GetLibraryItemsMedia withVideoResolution(String videoResolution) {
        Utils.checkNotNull(videoResolution, "videoResolution");
        this.videoResolution = Optional.ofNullable(videoResolution);
        return this;
    }

    public GetLibraryItemsMedia withVideoResolution(Optional<? extends String> videoResolution) {
        Utils.checkNotNull(videoResolution, "videoResolution");
        this.videoResolution = videoResolution;
        return this;
    }

    public GetLibraryItemsMedia withContainer(String container) {
        Utils.checkNotNull(container, "container");
        this.container = Optional.ofNullable(container);
        return this;
    }

    public GetLibraryItemsMedia withContainer(Optional<? extends String> container) {
        Utils.checkNotNull(container, "container");
        this.container = container;
        return this;
    }

    public GetLibraryItemsMedia withVideoFrameRate(String videoFrameRate) {
        Utils.checkNotNull(videoFrameRate, "videoFrameRate");
        this.videoFrameRate = Optional.ofNullable(videoFrameRate);
        return this;
    }

    public GetLibraryItemsMedia withVideoFrameRate(Optional<? extends String> videoFrameRate) {
        Utils.checkNotNull(videoFrameRate, "videoFrameRate");
        this.videoFrameRate = videoFrameRate;
        return this;
    }

    public GetLibraryItemsMedia withVideoProfile(String videoProfile) {
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.videoProfile = Optional.ofNullable(videoProfile);
        return this;
    }

    public GetLibraryItemsMedia withVideoProfile(Optional<? extends String> videoProfile) {
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.videoProfile = videoProfile;
        return this;
    }

    public GetLibraryItemsMedia withPart(java.util.List<GetLibraryItemsPart> part) {
        Utils.checkNotNull(part, "part");
        this.part = Optional.ofNullable(part);
        return this;
    }

    public GetLibraryItemsMedia withPart(Optional<? extends java.util.List<GetLibraryItemsPart>> part) {
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
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.duration, other.duration) &&
            java.util.Objects.deepEquals(this.bitrate, other.bitrate) &&
            java.util.Objects.deepEquals(this.width, other.width) &&
            java.util.Objects.deepEquals(this.height, other.height) &&
            java.util.Objects.deepEquals(this.aspectRatio, other.aspectRatio) &&
            java.util.Objects.deepEquals(this.audioChannels, other.audioChannels) &&
            java.util.Objects.deepEquals(this.audioCodec, other.audioCodec) &&
            java.util.Objects.deepEquals(this.videoCodec, other.videoCodec) &&
            java.util.Objects.deepEquals(this.videoResolution, other.videoResolution) &&
            java.util.Objects.deepEquals(this.container, other.container) &&
            java.util.Objects.deepEquals(this.videoFrameRate, other.videoFrameRate) &&
            java.util.Objects.deepEquals(this.videoProfile, other.videoProfile) &&
            java.util.Objects.deepEquals(this.part, other.part);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
            videoProfile,
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
                "audioChannels", audioChannels,
                "audioCodec", audioCodec,
                "videoCodec", videoCodec,
                "videoResolution", videoResolution,
                "container", container,
                "videoFrameRate", videoFrameRate,
                "videoProfile", videoProfile,
                "part", part);
    }
    
    public final static class Builder {
 
        private Optional<? extends Integer> id = Optional.empty();
 
        private Optional<? extends Integer> duration = Optional.empty();
 
        private Optional<? extends Integer> bitrate = Optional.empty();
 
        private Optional<? extends Integer> width = Optional.empty();
 
        private Optional<? extends Integer> height = Optional.empty();
 
        private Optional<? extends Double> aspectRatio = Optional.empty();
 
        private Optional<? extends Integer> audioChannels = Optional.empty();
 
        private Optional<? extends String> audioCodec = Optional.empty();
 
        private Optional<? extends String> videoCodec = Optional.empty();
 
        private Optional<? extends String> videoResolution = Optional.empty();
 
        private Optional<? extends String> container = Optional.empty();
 
        private Optional<? extends String> videoFrameRate = Optional.empty();
 
        private Optional<? extends String> videoProfile = Optional.empty();
 
        private Optional<? extends java.util.List<GetLibraryItemsPart>> part = Optional.empty();  
        
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

        public Builder duration(int duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = Optional.ofNullable(duration);
            return this;
        }

        public Builder duration(Optional<? extends Integer> duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = duration;
            return this;
        }

        public Builder bitrate(int bitrate) {
            Utils.checkNotNull(bitrate, "bitrate");
            this.bitrate = Optional.ofNullable(bitrate);
            return this;
        }

        public Builder bitrate(Optional<? extends Integer> bitrate) {
            Utils.checkNotNull(bitrate, "bitrate");
            this.bitrate = bitrate;
            return this;
        }

        public Builder width(int width) {
            Utils.checkNotNull(width, "width");
            this.width = Optional.ofNullable(width);
            return this;
        }

        public Builder width(Optional<? extends Integer> width) {
            Utils.checkNotNull(width, "width");
            this.width = width;
            return this;
        }

        public Builder height(int height) {
            Utils.checkNotNull(height, "height");
            this.height = Optional.ofNullable(height);
            return this;
        }

        public Builder height(Optional<? extends Integer> height) {
            Utils.checkNotNull(height, "height");
            this.height = height;
            return this;
        }

        public Builder aspectRatio(double aspectRatio) {
            Utils.checkNotNull(aspectRatio, "aspectRatio");
            this.aspectRatio = Optional.ofNullable(aspectRatio);
            return this;
        }

        public Builder aspectRatio(Optional<? extends Double> aspectRatio) {
            Utils.checkNotNull(aspectRatio, "aspectRatio");
            this.aspectRatio = aspectRatio;
            return this;
        }

        public Builder audioChannels(int audioChannels) {
            Utils.checkNotNull(audioChannels, "audioChannels");
            this.audioChannels = Optional.ofNullable(audioChannels);
            return this;
        }

        public Builder audioChannels(Optional<? extends Integer> audioChannels) {
            Utils.checkNotNull(audioChannels, "audioChannels");
            this.audioChannels = audioChannels;
            return this;
        }

        public Builder audioCodec(String audioCodec) {
            Utils.checkNotNull(audioCodec, "audioCodec");
            this.audioCodec = Optional.ofNullable(audioCodec);
            return this;
        }

        public Builder audioCodec(Optional<? extends String> audioCodec) {
            Utils.checkNotNull(audioCodec, "audioCodec");
            this.audioCodec = audioCodec;
            return this;
        }

        public Builder videoCodec(String videoCodec) {
            Utils.checkNotNull(videoCodec, "videoCodec");
            this.videoCodec = Optional.ofNullable(videoCodec);
            return this;
        }

        public Builder videoCodec(Optional<? extends String> videoCodec) {
            Utils.checkNotNull(videoCodec, "videoCodec");
            this.videoCodec = videoCodec;
            return this;
        }

        public Builder videoResolution(String videoResolution) {
            Utils.checkNotNull(videoResolution, "videoResolution");
            this.videoResolution = Optional.ofNullable(videoResolution);
            return this;
        }

        public Builder videoResolution(Optional<? extends String> videoResolution) {
            Utils.checkNotNull(videoResolution, "videoResolution");
            this.videoResolution = videoResolution;
            return this;
        }

        public Builder container(String container) {
            Utils.checkNotNull(container, "container");
            this.container = Optional.ofNullable(container);
            return this;
        }

        public Builder container(Optional<? extends String> container) {
            Utils.checkNotNull(container, "container");
            this.container = container;
            return this;
        }

        public Builder videoFrameRate(String videoFrameRate) {
            Utils.checkNotNull(videoFrameRate, "videoFrameRate");
            this.videoFrameRate = Optional.ofNullable(videoFrameRate);
            return this;
        }

        public Builder videoFrameRate(Optional<? extends String> videoFrameRate) {
            Utils.checkNotNull(videoFrameRate, "videoFrameRate");
            this.videoFrameRate = videoFrameRate;
            return this;
        }

        public Builder videoProfile(String videoProfile) {
            Utils.checkNotNull(videoProfile, "videoProfile");
            this.videoProfile = Optional.ofNullable(videoProfile);
            return this;
        }

        public Builder videoProfile(Optional<? extends String> videoProfile) {
            Utils.checkNotNull(videoProfile, "videoProfile");
            this.videoProfile = videoProfile;
            return this;
        }

        public Builder part(java.util.List<GetLibraryItemsPart> part) {
            Utils.checkNotNull(part, "part");
            this.part = Optional.ofNullable(part);
            return this;
        }

        public Builder part(Optional<? extends java.util.List<GetLibraryItemsPart>> part) {
            Utils.checkNotNull(part, "part");
            this.part = part;
            return this;
        }
        
        public GetLibraryItemsMedia build() {
            return new GetLibraryItemsMedia(
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
                videoProfile,
                part);
        }
    }
}

