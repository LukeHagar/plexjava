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

public class GetSessionsMediaContainer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<Integer> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Metadata")
    private Optional<? extends List<GetSessionsMetadata>> metadata;

    @JsonCreator
    public GetSessionsMediaContainer(
            @JsonProperty("size") Optional<Integer> size,
            @JsonProperty("Metadata") Optional<? extends List<GetSessionsMetadata>> metadata) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(metadata, "metadata");
        this.size = size;
        this.metadata = metadata;
    }
    
    public GetSessionsMediaContainer() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Integer> size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetSessionsMetadata>> metadata() {
        return (Optional<List<GetSessionsMetadata>>) metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetSessionsMediaContainer withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetSessionsMediaContainer withSize(Optional<Integer> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetSessionsMediaContainer withMetadata(List<GetSessionsMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public GetSessionsMediaContainer withMetadata(Optional<? extends List<GetSessionsMetadata>> metadata) {
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
        GetSessionsMediaContainer other = (GetSessionsMediaContainer) o;
        return 
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            size,
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSessionsMediaContainer.class,
                "size", size,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private Optional<Integer> size = Optional.empty();
 
        private Optional<? extends List<GetSessionsMetadata>> metadata = Optional.empty();  
        
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

        public Builder metadata(List<GetSessionsMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends List<GetSessionsMetadata>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public GetSessionsMediaContainer build() {
            return new GetSessionsMediaContainer(
                size,
                metadata);
        }
    }
}

