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

public class GetSessionsPart {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    private Optional<String> container;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<Integer> duration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file")
    private Optional<String> file;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hasThumbnail")
    private Optional<String> hasThumbnail;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<Integer> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("decision")
    private Optional<String> decision;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selected")
    private Optional<Boolean> selected;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Stream")
    private Optional<? extends List<GetSessionsStream>> stream;

    @JsonCreator
    public GetSessionsPart(
            @JsonProperty("container") Optional<String> container,
            @JsonProperty("duration") Optional<Integer> duration,
            @JsonProperty("file") Optional<String> file,
            @JsonProperty("hasThumbnail") Optional<String> hasThumbnail,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("size") Optional<Integer> size,
            @JsonProperty("decision") Optional<String> decision,
            @JsonProperty("selected") Optional<Boolean> selected,
            @JsonProperty("Stream") Optional<? extends List<GetSessionsStream>> stream) {
        Utils.checkNotNull(container, "container");
        Utils.checkNotNull(duration, "duration");
        Utils.checkNotNull(file, "file");
        Utils.checkNotNull(hasThumbnail, "hasThumbnail");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(decision, "decision");
        Utils.checkNotNull(selected, "selected");
        Utils.checkNotNull(stream, "stream");
        this.container = container;
        this.duration = duration;
        this.file = file;
        this.hasThumbnail = hasThumbnail;
        this.id = id;
        this.key = key;
        this.size = size;
        this.decision = decision;
        this.selected = selected;
        this.stream = stream;
    }
    
    public GetSessionsPart() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> container() {
        return container;
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
    public Optional<String> hasThumbnail() {
        return hasThumbnail;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    @JsonIgnore
    public Optional<Integer> size() {
        return size;
    }

    @JsonIgnore
    public Optional<String> decision() {
        return decision;
    }

    @JsonIgnore
    public Optional<Boolean> selected() {
        return selected;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetSessionsStream>> stream() {
        return (Optional<List<GetSessionsStream>>) stream;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetSessionsPart withContainer(String container) {
        Utils.checkNotNull(container, "container");
        this.container = Optional.ofNullable(container);
        return this;
    }

    public GetSessionsPart withContainer(Optional<String> container) {
        Utils.checkNotNull(container, "container");
        this.container = container;
        return this;
    }

    public GetSessionsPart withDuration(int duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    public GetSessionsPart withDuration(Optional<Integer> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    public GetSessionsPart withFile(String file) {
        Utils.checkNotNull(file, "file");
        this.file = Optional.ofNullable(file);
        return this;
    }

    public GetSessionsPart withFile(Optional<String> file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
        return this;
    }

    public GetSessionsPart withHasThumbnail(String hasThumbnail) {
        Utils.checkNotNull(hasThumbnail, "hasThumbnail");
        this.hasThumbnail = Optional.ofNullable(hasThumbnail);
        return this;
    }

    public GetSessionsPart withHasThumbnail(Optional<String> hasThumbnail) {
        Utils.checkNotNull(hasThumbnail, "hasThumbnail");
        this.hasThumbnail = hasThumbnail;
        return this;
    }

    public GetSessionsPart withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GetSessionsPart withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetSessionsPart withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetSessionsPart withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetSessionsPart withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetSessionsPart withSize(Optional<Integer> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetSessionsPart withDecision(String decision) {
        Utils.checkNotNull(decision, "decision");
        this.decision = Optional.ofNullable(decision);
        return this;
    }

    public GetSessionsPart withDecision(Optional<String> decision) {
        Utils.checkNotNull(decision, "decision");
        this.decision = decision;
        return this;
    }

    public GetSessionsPart withSelected(boolean selected) {
        Utils.checkNotNull(selected, "selected");
        this.selected = Optional.ofNullable(selected);
        return this;
    }

    public GetSessionsPart withSelected(Optional<Boolean> selected) {
        Utils.checkNotNull(selected, "selected");
        this.selected = selected;
        return this;
    }

    public GetSessionsPart withStream(List<GetSessionsStream> stream) {
        Utils.checkNotNull(stream, "stream");
        this.stream = Optional.ofNullable(stream);
        return this;
    }

    public GetSessionsPart withStream(Optional<? extends List<GetSessionsStream>> stream) {
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
        GetSessionsPart other = (GetSessionsPart) o;
        return 
            Objects.deepEquals(this.container, other.container) &&
            Objects.deepEquals(this.duration, other.duration) &&
            Objects.deepEquals(this.file, other.file) &&
            Objects.deepEquals(this.hasThumbnail, other.hasThumbnail) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.decision, other.decision) &&
            Objects.deepEquals(this.selected, other.selected) &&
            Objects.deepEquals(this.stream, other.stream);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            container,
            duration,
            file,
            hasThumbnail,
            id,
            key,
            size,
            decision,
            selected,
            stream);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSessionsPart.class,
                "container", container,
                "duration", duration,
                "file", file,
                "hasThumbnail", hasThumbnail,
                "id", id,
                "key", key,
                "size", size,
                "decision", decision,
                "selected", selected,
                "stream", stream);
    }
    
    public final static class Builder {
 
        private Optional<String> container = Optional.empty();
 
        private Optional<Integer> duration = Optional.empty();
 
        private Optional<String> file = Optional.empty();
 
        private Optional<String> hasThumbnail = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> key = Optional.empty();
 
        private Optional<Integer> size = Optional.empty();
 
        private Optional<String> decision = Optional.empty();
 
        private Optional<Boolean> selected = Optional.empty();
 
        private Optional<? extends List<GetSessionsStream>> stream = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
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

        public Builder hasThumbnail(String hasThumbnail) {
            Utils.checkNotNull(hasThumbnail, "hasThumbnail");
            this.hasThumbnail = Optional.ofNullable(hasThumbnail);
            return this;
        }

        public Builder hasThumbnail(Optional<String> hasThumbnail) {
            Utils.checkNotNull(hasThumbnail, "hasThumbnail");
            this.hasThumbnail = hasThumbnail;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
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

        public Builder decision(String decision) {
            Utils.checkNotNull(decision, "decision");
            this.decision = Optional.ofNullable(decision);
            return this;
        }

        public Builder decision(Optional<String> decision) {
            Utils.checkNotNull(decision, "decision");
            this.decision = decision;
            return this;
        }

        public Builder selected(boolean selected) {
            Utils.checkNotNull(selected, "selected");
            this.selected = Optional.ofNullable(selected);
            return this;
        }

        public Builder selected(Optional<Boolean> selected) {
            Utils.checkNotNull(selected, "selected");
            this.selected = selected;
            return this;
        }

        public Builder stream(List<GetSessionsStream> stream) {
            Utils.checkNotNull(stream, "stream");
            this.stream = Optional.ofNullable(stream);
            return this;
        }

        public Builder stream(Optional<? extends List<GetSessionsStream>> stream) {
            Utils.checkNotNull(stream, "stream");
            this.stream = stream;
            return this;
        }
        
        public GetSessionsPart build() {
            return new GetSessionsPart(
                container,
                duration,
                file,
                hasThumbnail,
                id,
                key,
                size,
                decision,
                selected,
                stream);
        }
    }
}
