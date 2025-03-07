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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class AddPlaylistContentsMediaContainer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<Integer> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("leafCountAdded")
    private Optional<Integer> leafCountAdded;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("leafCountRequested")
    private Optional<Integer> leafCountRequested;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Metadata")
    private Optional<? extends List<AddPlaylistContentsMetadata>> metadata;

    @JsonCreator
    public AddPlaylistContentsMediaContainer(
            @JsonProperty("size") Optional<Integer> size,
            @JsonProperty("leafCountAdded") Optional<Integer> leafCountAdded,
            @JsonProperty("leafCountRequested") Optional<Integer> leafCountRequested,
            @JsonProperty("Metadata") Optional<? extends List<AddPlaylistContentsMetadata>> metadata) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(leafCountAdded, "leafCountAdded");
        Utils.checkNotNull(leafCountRequested, "leafCountRequested");
        Utils.checkNotNull(metadata, "metadata");
        this.size = size;
        this.leafCountAdded = leafCountAdded;
        this.leafCountRequested = leafCountRequested;
        this.metadata = metadata;
    }
    
    public AddPlaylistContentsMediaContainer() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Integer> size() {
        return size;
    }

    @JsonIgnore
    public Optional<Integer> leafCountAdded() {
        return leafCountAdded;
    }

    @JsonIgnore
    public Optional<Integer> leafCountRequested() {
        return leafCountRequested;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<AddPlaylistContentsMetadata>> metadata() {
        return (Optional<List<AddPlaylistContentsMetadata>>) metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AddPlaylistContentsMediaContainer withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public AddPlaylistContentsMediaContainer withSize(Optional<Integer> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public AddPlaylistContentsMediaContainer withLeafCountAdded(int leafCountAdded) {
        Utils.checkNotNull(leafCountAdded, "leafCountAdded");
        this.leafCountAdded = Optional.ofNullable(leafCountAdded);
        return this;
    }

    public AddPlaylistContentsMediaContainer withLeafCountAdded(Optional<Integer> leafCountAdded) {
        Utils.checkNotNull(leafCountAdded, "leafCountAdded");
        this.leafCountAdded = leafCountAdded;
        return this;
    }

    public AddPlaylistContentsMediaContainer withLeafCountRequested(int leafCountRequested) {
        Utils.checkNotNull(leafCountRequested, "leafCountRequested");
        this.leafCountRequested = Optional.ofNullable(leafCountRequested);
        return this;
    }

    public AddPlaylistContentsMediaContainer withLeafCountRequested(Optional<Integer> leafCountRequested) {
        Utils.checkNotNull(leafCountRequested, "leafCountRequested");
        this.leafCountRequested = leafCountRequested;
        return this;
    }

    public AddPlaylistContentsMediaContainer withMetadata(List<AddPlaylistContentsMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public AddPlaylistContentsMediaContainer withMetadata(Optional<? extends List<AddPlaylistContentsMetadata>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
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
        AddPlaylistContentsMediaContainer other = (AddPlaylistContentsMediaContainer) o;
        return 
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.leafCountAdded, other.leafCountAdded) &&
            Objects.deepEquals(this.leafCountRequested, other.leafCountRequested) &&
            Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            size,
            leafCountAdded,
            leafCountRequested,
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AddPlaylistContentsMediaContainer.class,
                "size", size,
                "leafCountAdded", leafCountAdded,
                "leafCountRequested", leafCountRequested,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private Optional<Integer> size = Optional.empty();
 
        private Optional<Integer> leafCountAdded = Optional.empty();
 
        private Optional<Integer> leafCountRequested = Optional.empty();
 
        private Optional<? extends List<AddPlaylistContentsMetadata>> metadata = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder leafCountAdded(int leafCountAdded) {
            Utils.checkNotNull(leafCountAdded, "leafCountAdded");
            this.leafCountAdded = Optional.ofNullable(leafCountAdded);
            return this;
        }

        public Builder leafCountAdded(Optional<Integer> leafCountAdded) {
            Utils.checkNotNull(leafCountAdded, "leafCountAdded");
            this.leafCountAdded = leafCountAdded;
            return this;
        }

        public Builder leafCountRequested(int leafCountRequested) {
            Utils.checkNotNull(leafCountRequested, "leafCountRequested");
            this.leafCountRequested = Optional.ofNullable(leafCountRequested);
            return this;
        }

        public Builder leafCountRequested(Optional<Integer> leafCountRequested) {
            Utils.checkNotNull(leafCountRequested, "leafCountRequested");
            this.leafCountRequested = leafCountRequested;
            return this;
        }

        public Builder metadata(List<AddPlaylistContentsMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends List<AddPlaylistContentsMetadata>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public AddPlaylistContentsMediaContainer build() {
            return new AddPlaylistContentsMediaContainer(
                size,
                leafCountAdded,
                leafCountRequested,
                metadata);
        }
    }
}

