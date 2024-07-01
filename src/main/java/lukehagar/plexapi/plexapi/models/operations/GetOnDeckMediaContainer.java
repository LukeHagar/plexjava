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

public class GetOnDeckMediaContainer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<? extends Double> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowSync")
    private Optional<? extends Boolean> allowSync;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifier")
    private Optional<? extends String> identifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaTagPrefix")
    private Optional<? extends String> mediaTagPrefix;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaTagVersion")
    private Optional<? extends Double> mediaTagVersion;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mixedParents")
    private Optional<? extends Boolean> mixedParents;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Metadata")
    private Optional<? extends java.util.List<GetOnDeckMetadata>> metadata;

    @JsonCreator
    public GetOnDeckMediaContainer(
            @JsonProperty("size") Optional<? extends Double> size,
            @JsonProperty("allowSync") Optional<? extends Boolean> allowSync,
            @JsonProperty("identifier") Optional<? extends String> identifier,
            @JsonProperty("mediaTagPrefix") Optional<? extends String> mediaTagPrefix,
            @JsonProperty("mediaTagVersion") Optional<? extends Double> mediaTagVersion,
            @JsonProperty("mixedParents") Optional<? extends Boolean> mixedParents,
            @JsonProperty("Metadata") Optional<? extends java.util.List<GetOnDeckMetadata>> metadata) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(allowSync, "allowSync");
        Utils.checkNotNull(identifier, "identifier");
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        Utils.checkNotNull(mixedParents, "mixedParents");
        Utils.checkNotNull(metadata, "metadata");
        this.size = size;
        this.allowSync = allowSync;
        this.identifier = identifier;
        this.mediaTagPrefix = mediaTagPrefix;
        this.mediaTagVersion = mediaTagVersion;
        this.mixedParents = mixedParents;
        this.metadata = metadata;
    }
    
    public GetOnDeckMediaContainer() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> size() {
        return (Optional<Double>) size;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> allowSync() {
        return (Optional<Boolean>) allowSync;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> identifier() {
        return (Optional<String>) identifier;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> mediaTagPrefix() {
        return (Optional<String>) mediaTagPrefix;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> mediaTagVersion() {
        return (Optional<Double>) mediaTagVersion;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> mixedParents() {
        return (Optional<Boolean>) mixedParents;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<GetOnDeckMetadata>> metadata() {
        return (Optional<java.util.List<GetOnDeckMetadata>>) metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetOnDeckMediaContainer withSize(double size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetOnDeckMediaContainer withSize(Optional<? extends Double> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetOnDeckMediaContainer withAllowSync(boolean allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = Optional.ofNullable(allowSync);
        return this;
    }

    public GetOnDeckMediaContainer withAllowSync(Optional<? extends Boolean> allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = allowSync;
        return this;
    }

    public GetOnDeckMediaContainer withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = Optional.ofNullable(identifier);
        return this;
    }

    public GetOnDeckMediaContainer withIdentifier(Optional<? extends String> identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    public GetOnDeckMediaContainer withMediaTagPrefix(String mediaTagPrefix) {
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        this.mediaTagPrefix = Optional.ofNullable(mediaTagPrefix);
        return this;
    }

    public GetOnDeckMediaContainer withMediaTagPrefix(Optional<? extends String> mediaTagPrefix) {
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        this.mediaTagPrefix = mediaTagPrefix;
        return this;
    }

    public GetOnDeckMediaContainer withMediaTagVersion(double mediaTagVersion) {
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        this.mediaTagVersion = Optional.ofNullable(mediaTagVersion);
        return this;
    }

    public GetOnDeckMediaContainer withMediaTagVersion(Optional<? extends Double> mediaTagVersion) {
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        this.mediaTagVersion = mediaTagVersion;
        return this;
    }

    public GetOnDeckMediaContainer withMixedParents(boolean mixedParents) {
        Utils.checkNotNull(mixedParents, "mixedParents");
        this.mixedParents = Optional.ofNullable(mixedParents);
        return this;
    }

    public GetOnDeckMediaContainer withMixedParents(Optional<? extends Boolean> mixedParents) {
        Utils.checkNotNull(mixedParents, "mixedParents");
        this.mixedParents = mixedParents;
        return this;
    }

    public GetOnDeckMediaContainer withMetadata(java.util.List<GetOnDeckMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public GetOnDeckMediaContainer withMetadata(Optional<? extends java.util.List<GetOnDeckMetadata>> metadata) {
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
        GetOnDeckMediaContainer other = (GetOnDeckMediaContainer) o;
        return 
            java.util.Objects.deepEquals(this.size, other.size) &&
            java.util.Objects.deepEquals(this.allowSync, other.allowSync) &&
            java.util.Objects.deepEquals(this.identifier, other.identifier) &&
            java.util.Objects.deepEquals(this.mediaTagPrefix, other.mediaTagPrefix) &&
            java.util.Objects.deepEquals(this.mediaTagVersion, other.mediaTagVersion) &&
            java.util.Objects.deepEquals(this.mixedParents, other.mixedParents) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            size,
            allowSync,
            identifier,
            mediaTagPrefix,
            mediaTagVersion,
            mixedParents,
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetOnDeckMediaContainer.class,
                "size", size,
                "allowSync", allowSync,
                "identifier", identifier,
                "mediaTagPrefix", mediaTagPrefix,
                "mediaTagVersion", mediaTagVersion,
                "mixedParents", mixedParents,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private Optional<? extends Double> size = Optional.empty();
 
        private Optional<? extends Boolean> allowSync = Optional.empty();
 
        private Optional<? extends String> identifier = Optional.empty();
 
        private Optional<? extends String> mediaTagPrefix = Optional.empty();
 
        private Optional<? extends Double> mediaTagVersion = Optional.empty();
 
        private Optional<? extends Boolean> mixedParents = Optional.empty();
 
        private Optional<? extends java.util.List<GetOnDeckMetadata>> metadata = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder allowSync(boolean allowSync) {
            Utils.checkNotNull(allowSync, "allowSync");
            this.allowSync = Optional.ofNullable(allowSync);
            return this;
        }

        public Builder allowSync(Optional<? extends Boolean> allowSync) {
            Utils.checkNotNull(allowSync, "allowSync");
            this.allowSync = allowSync;
            return this;
        }

        public Builder identifier(String identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = Optional.ofNullable(identifier);
            return this;
        }

        public Builder identifier(Optional<? extends String> identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }

        public Builder mediaTagPrefix(String mediaTagPrefix) {
            Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
            this.mediaTagPrefix = Optional.ofNullable(mediaTagPrefix);
            return this;
        }

        public Builder mediaTagPrefix(Optional<? extends String> mediaTagPrefix) {
            Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
            this.mediaTagPrefix = mediaTagPrefix;
            return this;
        }

        public Builder mediaTagVersion(double mediaTagVersion) {
            Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
            this.mediaTagVersion = Optional.ofNullable(mediaTagVersion);
            return this;
        }

        public Builder mediaTagVersion(Optional<? extends Double> mediaTagVersion) {
            Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
            this.mediaTagVersion = mediaTagVersion;
            return this;
        }

        public Builder mixedParents(boolean mixedParents) {
            Utils.checkNotNull(mixedParents, "mixedParents");
            this.mixedParents = Optional.ofNullable(mixedParents);
            return this;
        }

        public Builder mixedParents(Optional<? extends Boolean> mixedParents) {
            Utils.checkNotNull(mixedParents, "mixedParents");
            this.mixedParents = mixedParents;
            return this;
        }

        public Builder metadata(java.util.List<GetOnDeckMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends java.util.List<GetOnDeckMetadata>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public GetOnDeckMediaContainer build() {
            return new GetOnDeckMediaContainer(
                size,
                allowSync,
                identifier,
                mediaTagPrefix,
                mediaTagVersion,
                mixedParents,
                metadata);
        }
    }
}
