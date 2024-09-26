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
import java.util.Objects;
import java.util.Optional;


public class GetRecentlyAddedLibraryPart {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<Double> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<Double> duration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    private Optional<String> file;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<Double> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    private Optional<String> container;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has64bitOffsets")
    private Optional<Boolean> has64bitOffsets;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hasThumbnail")
    private Optional<Double> hasThumbnail;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("optimizedForStreaming")
    private Optional<Boolean> optimizedForStreaming;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoProfile")
    private Optional<String> videoProfile;

    @JsonCreator
    public GetRecentlyAddedLibraryPart(
            @JsonProperty("id") Optional<Double> id,
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("duration") Optional<Double> duration,
            @JsonProperty("file") Optional<String> file,
            @JsonProperty("size") Optional<Double> size,
            @JsonProperty("container") Optional<String> container,
            @JsonProperty("has64bitOffsets") Optional<Boolean> has64bitOffsets,
            @JsonProperty("hasThumbnail") Optional<Double> hasThumbnail,
            @JsonProperty("optimizedForStreaming") Optional<Boolean> optimizedForStreaming,
            @JsonProperty("videoProfile") Optional<String> videoProfile) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(duration, "duration");
        Utils.checkNotNull(file, "file");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(container, "container");
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        Utils.checkNotNull(hasThumbnail, "hasThumbnail");
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.id = id;
        this.key = key;
        this.duration = duration;
        this.file = file;
        this.size = size;
        this.container = container;
        this.has64bitOffsets = has64bitOffsets;
        this.hasThumbnail = hasThumbnail;
        this.optimizedForStreaming = optimizedForStreaming;
        this.videoProfile = videoProfile;
    }
    
    public GetRecentlyAddedLibraryPart() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Double> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    @JsonIgnore
    public Optional<Double> duration() {
        return duration;
    }

    @JsonIgnore
    public Optional<String> file() {
        return file;
    }

    @JsonIgnore
    public Optional<Double> size() {
        return size;
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
    public Optional<Double> hasThumbnail() {
        return hasThumbnail;
    }

    @JsonIgnore
    public Optional<Boolean> optimizedForStreaming() {
        return optimizedForStreaming;
    }

    @JsonIgnore
    public Optional<String> videoProfile() {
        return videoProfile;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetRecentlyAddedLibraryPart withId(double id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GetRecentlyAddedLibraryPart withId(Optional<Double> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetRecentlyAddedLibraryPart withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetRecentlyAddedLibraryPart withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetRecentlyAddedLibraryPart withDuration(double duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    public GetRecentlyAddedLibraryPart withDuration(Optional<Double> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    public GetRecentlyAddedLibraryPart withFile(String file) {
        Utils.checkNotNull(file, "file");
        this.file = Optional.ofNullable(file);
        return this;
    }

    public GetRecentlyAddedLibraryPart withFile(Optional<String> file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
        return this;
    }

    public GetRecentlyAddedLibraryPart withSize(double size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetRecentlyAddedLibraryPart withSize(Optional<Double> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetRecentlyAddedLibraryPart withContainer(String container) {
        Utils.checkNotNull(container, "container");
        this.container = Optional.ofNullable(container);
        return this;
    }

    public GetRecentlyAddedLibraryPart withContainer(Optional<String> container) {
        Utils.checkNotNull(container, "container");
        this.container = container;
        return this;
    }

    public GetRecentlyAddedLibraryPart withHas64bitOffsets(boolean has64bitOffsets) {
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        this.has64bitOffsets = Optional.ofNullable(has64bitOffsets);
        return this;
    }

    public GetRecentlyAddedLibraryPart withHas64bitOffsets(Optional<Boolean> has64bitOffsets) {
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        this.has64bitOffsets = has64bitOffsets;
        return this;
    }

    public GetRecentlyAddedLibraryPart withHasThumbnail(double hasThumbnail) {
        Utils.checkNotNull(hasThumbnail, "hasThumbnail");
        this.hasThumbnail = Optional.ofNullable(hasThumbnail);
        return this;
    }

    public GetRecentlyAddedLibraryPart withHasThumbnail(Optional<Double> hasThumbnail) {
        Utils.checkNotNull(hasThumbnail, "hasThumbnail");
        this.hasThumbnail = hasThumbnail;
        return this;
    }

    public GetRecentlyAddedLibraryPart withOptimizedForStreaming(boolean optimizedForStreaming) {
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        this.optimizedForStreaming = Optional.ofNullable(optimizedForStreaming);
        return this;
    }

    public GetRecentlyAddedLibraryPart withOptimizedForStreaming(Optional<Boolean> optimizedForStreaming) {
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        this.optimizedForStreaming = optimizedForStreaming;
        return this;
    }

    public GetRecentlyAddedLibraryPart withVideoProfile(String videoProfile) {
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.videoProfile = Optional.ofNullable(videoProfile);
        return this;
    }

    public GetRecentlyAddedLibraryPart withVideoProfile(Optional<String> videoProfile) {
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.videoProfile = videoProfile;
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
        GetRecentlyAddedLibraryPart other = (GetRecentlyAddedLibraryPart) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.duration, other.duration) &&
            Objects.deepEquals(this.file, other.file) &&
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.container, other.container) &&
            Objects.deepEquals(this.has64bitOffsets, other.has64bitOffsets) &&
            Objects.deepEquals(this.hasThumbnail, other.hasThumbnail) &&
            Objects.deepEquals(this.optimizedForStreaming, other.optimizedForStreaming) &&
            Objects.deepEquals(this.videoProfile, other.videoProfile);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            key,
            duration,
            file,
            size,
            container,
            has64bitOffsets,
            hasThumbnail,
            optimizedForStreaming,
            videoProfile);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetRecentlyAddedLibraryPart.class,
                "id", id,
                "key", key,
                "duration", duration,
                "file", file,
                "size", size,
                "container", container,
                "has64bitOffsets", has64bitOffsets,
                "hasThumbnail", hasThumbnail,
                "optimizedForStreaming", optimizedForStreaming,
                "videoProfile", videoProfile);
    }
    
    public final static class Builder {
 
        private Optional<Double> id = Optional.empty();
 
        private Optional<String> key = Optional.empty();
 
        private Optional<Double> duration = Optional.empty();
 
        private Optional<String> file = Optional.empty();
 
        private Optional<Double> size = Optional.empty();
 
        private Optional<String> container = Optional.empty();
 
        private Optional<Boolean> has64bitOffsets = Optional.empty();
 
        private Optional<Double> hasThumbnail = Optional.empty();
 
        private Optional<Boolean> optimizedForStreaming = Optional.empty();
 
        private Optional<String> videoProfile = Optional.empty();  
        
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

        public Builder size(double size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        public Builder size(Optional<Double> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
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

        public Builder hasThumbnail(double hasThumbnail) {
            Utils.checkNotNull(hasThumbnail, "hasThumbnail");
            this.hasThumbnail = Optional.ofNullable(hasThumbnail);
            return this;
        }

        public Builder hasThumbnail(Optional<Double> hasThumbnail) {
            Utils.checkNotNull(hasThumbnail, "hasThumbnail");
            this.hasThumbnail = hasThumbnail;
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
        
        public GetRecentlyAddedLibraryPart build() {
            return new GetRecentlyAddedLibraryPart(
                id,
                key,
                duration,
                file,
                size,
                container,
                has64bitOffsets,
                hasThumbnail,
                optimizedForStreaming,
                videoProfile);
        }
    }
}

