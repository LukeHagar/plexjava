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

public class Part {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends Double> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<? extends String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<? extends Double> duration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    private Optional<? extends String> file;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<? extends Double> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    private Optional<? extends String> container;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has64bitOffsets")
    private Optional<? extends Boolean> has64bitOffsets;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hasThumbnail")
    private Optional<? extends Double> hasThumbnail;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("optimizedForStreaming")
    private Optional<? extends Boolean> optimizedForStreaming;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoProfile")
    private Optional<? extends String> videoProfile;

    @JsonCreator
    public Part(
            @JsonProperty("id") Optional<? extends Double> id,
            @JsonProperty("key") Optional<? extends String> key,
            @JsonProperty("duration") Optional<? extends Double> duration,
            @JsonProperty("file") Optional<? extends String> file,
            @JsonProperty("size") Optional<? extends Double> size,
            @JsonProperty("container") Optional<? extends String> container,
            @JsonProperty("has64bitOffsets") Optional<? extends Boolean> has64bitOffsets,
            @JsonProperty("hasThumbnail") Optional<? extends Double> hasThumbnail,
            @JsonProperty("optimizedForStreaming") Optional<? extends Boolean> optimizedForStreaming,
            @JsonProperty("videoProfile") Optional<? extends String> videoProfile) {
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
    
    public Part() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> id() {
        return (Optional<Double>) id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> key() {
        return (Optional<String>) key;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> duration() {
        return (Optional<Double>) duration;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> file() {
        return (Optional<String>) file;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> size() {
        return (Optional<Double>) size;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> container() {
        return (Optional<String>) container;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> has64bitOffsets() {
        return (Optional<Boolean>) has64bitOffsets;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> hasThumbnail() {
        return (Optional<Double>) hasThumbnail;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> optimizedForStreaming() {
        return (Optional<Boolean>) optimizedForStreaming;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> videoProfile() {
        return (Optional<String>) videoProfile;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Part withId(double id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public Part withId(Optional<? extends Double> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Part withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public Part withKey(Optional<? extends String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public Part withDuration(double duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    public Part withDuration(Optional<? extends Double> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    public Part withFile(String file) {
        Utils.checkNotNull(file, "file");
        this.file = Optional.ofNullable(file);
        return this;
    }

    public Part withFile(Optional<? extends String> file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
        return this;
    }

    public Part withSize(double size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public Part withSize(Optional<? extends Double> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public Part withContainer(String container) {
        Utils.checkNotNull(container, "container");
        this.container = Optional.ofNullable(container);
        return this;
    }

    public Part withContainer(Optional<? extends String> container) {
        Utils.checkNotNull(container, "container");
        this.container = container;
        return this;
    }

    public Part withHas64bitOffsets(boolean has64bitOffsets) {
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        this.has64bitOffsets = Optional.ofNullable(has64bitOffsets);
        return this;
    }

    public Part withHas64bitOffsets(Optional<? extends Boolean> has64bitOffsets) {
        Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
        this.has64bitOffsets = has64bitOffsets;
        return this;
    }

    public Part withHasThumbnail(double hasThumbnail) {
        Utils.checkNotNull(hasThumbnail, "hasThumbnail");
        this.hasThumbnail = Optional.ofNullable(hasThumbnail);
        return this;
    }

    public Part withHasThumbnail(Optional<? extends Double> hasThumbnail) {
        Utils.checkNotNull(hasThumbnail, "hasThumbnail");
        this.hasThumbnail = hasThumbnail;
        return this;
    }

    public Part withOptimizedForStreaming(boolean optimizedForStreaming) {
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        this.optimizedForStreaming = Optional.ofNullable(optimizedForStreaming);
        return this;
    }

    public Part withOptimizedForStreaming(Optional<? extends Boolean> optimizedForStreaming) {
        Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
        this.optimizedForStreaming = optimizedForStreaming;
        return this;
    }

    public Part withVideoProfile(String videoProfile) {
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.videoProfile = Optional.ofNullable(videoProfile);
        return this;
    }

    public Part withVideoProfile(Optional<? extends String> videoProfile) {
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
        Part other = (Part) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.duration, other.duration) &&
            java.util.Objects.deepEquals(this.file, other.file) &&
            java.util.Objects.deepEquals(this.size, other.size) &&
            java.util.Objects.deepEquals(this.container, other.container) &&
            java.util.Objects.deepEquals(this.has64bitOffsets, other.has64bitOffsets) &&
            java.util.Objects.deepEquals(this.hasThumbnail, other.hasThumbnail) &&
            java.util.Objects.deepEquals(this.optimizedForStreaming, other.optimizedForStreaming) &&
            java.util.Objects.deepEquals(this.videoProfile, other.videoProfile);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
        return Utils.toString(Part.class,
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
 
        private Optional<? extends Double> id = Optional.empty();
 
        private Optional<? extends String> key = Optional.empty();
 
        private Optional<? extends Double> duration = Optional.empty();
 
        private Optional<? extends String> file = Optional.empty();
 
        private Optional<? extends Double> size = Optional.empty();
 
        private Optional<? extends String> container = Optional.empty();
 
        private Optional<? extends Boolean> has64bitOffsets = Optional.empty();
 
        private Optional<? extends Double> hasThumbnail = Optional.empty();
 
        private Optional<? extends Boolean> optimizedForStreaming = Optional.empty();
 
        private Optional<? extends String> videoProfile = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(double id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<? extends Double> id) {
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

        public Builder duration(double duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = Optional.ofNullable(duration);
            return this;
        }

        public Builder duration(Optional<? extends Double> duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = duration;
            return this;
        }

        public Builder file(String file) {
            Utils.checkNotNull(file, "file");
            this.file = Optional.ofNullable(file);
            return this;
        }

        public Builder file(Optional<? extends String> file) {
            Utils.checkNotNull(file, "file");
            this.file = file;
            return this;
        }

        public Builder size(double size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        public Builder size(Optional<? extends Double> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
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

        public Builder has64bitOffsets(boolean has64bitOffsets) {
            Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
            this.has64bitOffsets = Optional.ofNullable(has64bitOffsets);
            return this;
        }

        public Builder has64bitOffsets(Optional<? extends Boolean> has64bitOffsets) {
            Utils.checkNotNull(has64bitOffsets, "has64bitOffsets");
            this.has64bitOffsets = has64bitOffsets;
            return this;
        }

        public Builder hasThumbnail(double hasThumbnail) {
            Utils.checkNotNull(hasThumbnail, "hasThumbnail");
            this.hasThumbnail = Optional.ofNullable(hasThumbnail);
            return this;
        }

        public Builder hasThumbnail(Optional<? extends Double> hasThumbnail) {
            Utils.checkNotNull(hasThumbnail, "hasThumbnail");
            this.hasThumbnail = hasThumbnail;
            return this;
        }

        public Builder optimizedForStreaming(boolean optimizedForStreaming) {
            Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
            this.optimizedForStreaming = Optional.ofNullable(optimizedForStreaming);
            return this;
        }

        public Builder optimizedForStreaming(Optional<? extends Boolean> optimizedForStreaming) {
            Utils.checkNotNull(optimizedForStreaming, "optimizedForStreaming");
            this.optimizedForStreaming = optimizedForStreaming;
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
        
        public Part build() {
            return new Part(
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

