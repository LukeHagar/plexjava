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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class GetMetaDataByRatingKeyPart {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<Integer> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<Integer> duration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    private Optional<String> file;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<Integer> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioProfile")
    private Optional<String> audioProfile;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    private Optional<String> container;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has64bitOffsets")
    private Optional<Boolean> has64bitOffsets;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("optimizedForStreaming")
    private Optional<Boolean> optimizedForStreaming;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoProfile")
    private Optional<String> videoProfile;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Stream")
    private Optional<? extends List<GetMetaDataByRatingKeyStream>> stream;

    @JsonCreator
    public GetMetaDataByRatingKeyPart(
            @JsonProperty("id") Optional<Integer> id,
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("duration") Optional<Integer> duration,
            @JsonProperty("file") Optional<String> file,
            @JsonProperty("size") Optional<Integer> size,
            @JsonProperty("audioProfile") Optional<String> audioProfile,
            @JsonProperty("container") Optional<String> container,
            @JsonProperty("has64bitOffsets") Optional<Boolean> has64bitOffsets,
            @JsonProperty("optimizedForStreaming") Optional<Boolean> optimizedForStreaming,
            @JsonProperty("videoProfile") Optional<String> videoProfile,
            @JsonProperty("Stream") Optional<? extends List<GetMetaDataByRatingKeyStream>> stream) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(duration, "duration");
        Utils.checkNotNull(file, "file");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(audioProfile, "audioProfile");
        Utils.checkNotNull(container, "container");
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        Utils.checkNotNull(videoProfile, "videoProfile");
        Utils.checkNotNull(stream, "stream");
        this.id = id;
        this.key = key;
        this.duration = duration;
        this.file = file;
        this.size = size;
        this.audioProfile = audioProfile;
        this.container = container;
        this.has64bitOffsets = has64bitOffsets;
        this.optimizedForStreaming = optimizedForStreaming;
        this.videoProfile = videoProfile;
        this.stream = stream;
    }
    
    public GetMetaDataByRatingKeyPart() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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
    public Optional<Integer> duration() {
        return duration;
    }

    @JsonIgnore
    public Optional<String> file() {
        return file;
    }

    @JsonIgnore
    public Optional<Integer> size() {
        return size;
    }

    @JsonIgnore
    public Optional<String> audioProfile() {
        return audioProfile;
    }

    @JsonIgnore
    public Optional<String> container() {
        return container;
    }

    @JsonIgnore
    public Optional<Boolean> has64bitOffsets() {
        return has64bitOffsets;
    }

    @JsonIgnore
    public Optional<Boolean> optimizedForStreaming() {
        return optimizedForStreaming;
    }

    @JsonIgnore
    public Optional<String> videoProfile() {
        return videoProfile;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetMetaDataByRatingKeyStream>> stream() {
        return (Optional<List<GetMetaDataByRatingKeyStream>>) stream;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetMetaDataByRatingKeyPart withId(int id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GetMetaDataByRatingKeyPart withId(Optional<Integer> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetMetaDataByRatingKeyPart withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetMetaDataByRatingKeyPart withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetMetaDataByRatingKeyPart withDuration(int duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    public GetMetaDataByRatingKeyPart withDuration(Optional<Integer> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    public GetMetaDataByRatingKeyPart withFile(String file) {
        Utils.checkNotNull(file, "file");
        this.file = Optional.ofNullable(file);
        return this;
    }

    public GetMetaDataByRatingKeyPart withFile(Optional<String> file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
        return this;
    }

    public GetMetaDataByRatingKeyPart withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetMetaDataByRatingKeyPart withSize(Optional<Integer> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetMetaDataByRatingKeyPart withAudioProfile(String audioProfile) {
        Utils.checkNotNull(audioProfile, "audioProfile");
        this.audioProfile = Optional.ofNullable(audioProfile);
        return this;
    }

    public GetMetaDataByRatingKeyPart withAudioProfile(Optional<String> audioProfile) {
        Utils.checkNotNull(audioProfile, "audioProfile");
        this.audioProfile = audioProfile;
        return this;
    }

    public GetMetaDataByRatingKeyPart withContainer(String container) {
        Utils.checkNotNull(container, "container");
        this.container = Optional.ofNullable(container);
        return this;
    }

    public GetMetaDataByRatingKeyPart withContainer(Optional<String> container) {
        Utils.checkNotNull(container, "container");
        this.container = container;
        return this;
    }

    public GetMetaDataByRatingKeyPart withHas64bitOffsets(boolean has64bitOffsets) {
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        this.has64bitOffsets = Optional.ofNullable(has64bitOffsets);
        return this;
    }

    public GetMetaDataByRatingKeyPart withHas64bitOffsets(Optional<Boolean> has64bitOffsets) {
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        this.has64bitOffsets = has64bitOffsets;
        return this;
    }

    public GetMetaDataByRatingKeyPart withOptimizedForStreaming(boolean optimizedForStreaming) {
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        this.optimizedForStreaming = Optional.ofNullable(optimizedForStreaming);
        return this;
    }

    public GetMetaDataByRatingKeyPart withOptimizedForStreaming(Optional<Boolean> optimizedForStreaming) {
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        this.optimizedForStreaming = optimizedForStreaming;
        return this;
    }

    public GetMetaDataByRatingKeyPart withVideoProfile(String videoProfile) {
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.videoProfile = Optional.ofNullable(videoProfile);
        return this;
    }

    public GetMetaDataByRatingKeyPart withVideoProfile(Optional<String> videoProfile) {
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.videoProfile = videoProfile;
        return this;
    }

    public GetMetaDataByRatingKeyPart withStream(List<GetMetaDataByRatingKeyStream> stream) {
        Utils.checkNotNull(stream, "stream");
        this.stream = Optional.ofNullable(stream);
        return this;
    }

    public GetMetaDataByRatingKeyPart withStream(Optional<? extends List<GetMetaDataByRatingKeyStream>> stream) {
        Utils.checkNotNull(stream, "stream");
        this.stream = stream;
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
        GetMetaDataByRatingKeyPart other = (GetMetaDataByRatingKeyPart) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.duration, other.duration) &&
            Objects.deepEquals(this.file, other.file) &&
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.audioProfile, other.audioProfile) &&
            Objects.deepEquals(this.container, other.container) &&
            Objects.deepEquals(this.has64bitOffsets, other.has64bitOffsets) &&
            Objects.deepEquals(this.optimizedForStreaming, other.optimizedForStreaming) &&
            Objects.deepEquals(this.videoProfile, other.videoProfile) &&
            Objects.deepEquals(this.stream, other.stream);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            key,
            duration,
            file,
            size,
            audioProfile,
            container,
            has64bitOffsets,
            optimizedForStreaming,
            videoProfile,
            stream);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMetaDataByRatingKeyPart.class,
                "id", id,
                "key", key,
                "duration", duration,
                "file", file,
                "size", size,
                "audioProfile", audioProfile,
                "container", container,
                "has64bitOffsets", has64bitOffsets,
                "optimizedForStreaming", optimizedForStreaming,
                "videoProfile", videoProfile,
                "stream", stream);
    }
    
    public final static class Builder {
 
        private Optional<Integer> id = Optional.empty();
 
        private Optional<String> key = Optional.empty();
 
        private Optional<Integer> duration = Optional.empty();
 
        private Optional<String> file = Optional.empty();
 
        private Optional<Integer> size = Optional.empty();
 
        private Optional<String> audioProfile = Optional.empty();
 
        private Optional<String> container = Optional.empty();
 
        private Optional<Boolean> has64bitOffsets = Optional.empty();
 
        private Optional<Boolean> optimizedForStreaming = Optional.empty();
 
        private Optional<String> videoProfile = Optional.empty();
 
        private Optional<? extends List<GetMetaDataByRatingKeyStream>> stream = Optional.empty();  
        
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

        public Builder file(String file) {
            Utils.checkNotNull(file, "file");
            this.file = Optional.ofNullable(file);
            return this;
        }

        public Builder file(Optional<String> file) {
            Utils.checkNotNull(file, "file");
            this.file = file;
            return this;
        }

        public Builder size(int size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        public Builder size(Optional<Integer> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
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

        public Builder optimizedForStreaming(boolean optimizedForStreaming) {
            Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
            this.optimizedForStreaming = Optional.ofNullable(optimizedForStreaming);
            return this;
        }

        public Builder optimizedForStreaming(Optional<Boolean> optimizedForStreaming) {
            Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
            this.optimizedForStreaming = optimizedForStreaming;
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

        public Builder stream(List<GetMetaDataByRatingKeyStream> stream) {
            Utils.checkNotNull(stream, "stream");
            this.stream = Optional.ofNullable(stream);
            return this;
        }

        public Builder stream(Optional<? extends List<GetMetaDataByRatingKeyStream>> stream) {
            Utils.checkNotNull(stream, "stream");
            this.stream = stream;
            return this;
        }
        
        public GetMetaDataByRatingKeyPart build() {
            return new GetMetaDataByRatingKeyPart(
                id,
                key,
                duration,
                file,
                size,
                audioProfile,
                container,
                has64bitOffsets,
                optimizedForStreaming,
                videoProfile,
                stream);
        }
    }
}

