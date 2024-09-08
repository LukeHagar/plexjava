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
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetLibraryItemsPart {

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
    private Optional<Long> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    private Optional<String> container;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoProfile")
    private Optional<String> videoProfile;

    @JsonCreator
    public GetLibraryItemsPart(
            @JsonProperty("id") Optional<Integer> id,
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("duration") Optional<Integer> duration,
            @JsonProperty("file") Optional<String> file,
            @JsonProperty("size") Optional<Long> size,
            @JsonProperty("container") Optional<String> container,
            @JsonProperty("videoProfile") Optional<String> videoProfile) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(duration, "duration");
        Utils.checkNotNull(file, "file");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(container, "container");
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.id = id;
        this.key = key;
        this.duration = duration;
        this.file = file;
        this.size = size;
        this.container = container;
        this.videoProfile = videoProfile;
    }
    
    public GetLibraryItemsPart() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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
    public Optional<Long> size() {
        return size;
    }

    @JsonIgnore
    public Optional<String> container() {
        return container;
    }

    @JsonIgnore
    public Optional<String> videoProfile() {
        return videoProfile;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLibraryItemsPart withId(int id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GetLibraryItemsPart withId(Optional<Integer> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetLibraryItemsPart withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetLibraryItemsPart withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetLibraryItemsPart withDuration(int duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    public GetLibraryItemsPart withDuration(Optional<Integer> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    public GetLibraryItemsPart withFile(String file) {
        Utils.checkNotNull(file, "file");
        this.file = Optional.ofNullable(file);
        return this;
    }

    public GetLibraryItemsPart withFile(Optional<String> file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
        return this;
    }

    public GetLibraryItemsPart withSize(long size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetLibraryItemsPart withSize(Optional<Long> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetLibraryItemsPart withContainer(String container) {
        Utils.checkNotNull(container, "container");
        this.container = Optional.ofNullable(container);
        return this;
    }

    public GetLibraryItemsPart withContainer(Optional<String> container) {
        Utils.checkNotNull(container, "container");
        this.container = container;
        return this;
    }

    public GetLibraryItemsPart withVideoProfile(String videoProfile) {
        Utils.checkNotNull(videoProfile, "videoProfile");
        this.videoProfile = Optional.ofNullable(videoProfile);
        return this;
    }

    public GetLibraryItemsPart withVideoProfile(Optional<String> videoProfile) {
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
        GetLibraryItemsPart other = (GetLibraryItemsPart) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.duration, other.duration) &&
            Objects.deepEquals(this.file, other.file) &&
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.container, other.container) &&
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
            videoProfile);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLibraryItemsPart.class,
                "id", id,
                "key", key,
                "duration", duration,
                "file", file,
                "size", size,
                "container", container,
                "videoProfile", videoProfile);
    }
    
    public final static class Builder {
 
        private Optional<Integer> id = Optional.empty();
 
        private Optional<String> key = Optional.empty();
 
        private Optional<Integer> duration = Optional.empty();
 
        private Optional<String> file = Optional.empty();
 
        private Optional<Long> size = Optional.empty();
 
        private Optional<String> container = Optional.empty();
 
        private Optional<String> videoProfile = Optional.empty();  
        
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

        public Builder size(long size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        public Builder size(Optional<Long> size) {
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
        
        public GetLibraryItemsPart build() {
            return new GetLibraryItemsPart(
                id,
                key,
                duration,
                file,
                size,
                container,
                videoProfile);
        }
    }
}
