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
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GetSearchResultsMediaContainer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<Double> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifier")
    private Optional<String> identifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaTagPrefix")
    private Optional<String> mediaTagPrefix;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaTagVersion")
    private Optional<Double> mediaTagVersion;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Metadata")
    private Optional<? extends List<GetSearchResultsMetadata>> metadata;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Provider")
    private Optional<? extends List<Provider>> provider;

    @JsonCreator
    public GetSearchResultsMediaContainer(
            @JsonProperty("size") Optional<Double> size,
            @JsonProperty("identifier") Optional<String> identifier,
            @JsonProperty("mediaTagPrefix") Optional<String> mediaTagPrefix,
            @JsonProperty("mediaTagVersion") Optional<Double> mediaTagVersion,
            @JsonProperty("Metadata") Optional<? extends List<GetSearchResultsMetadata>> metadata,
            @JsonProperty("Provider") Optional<? extends List<Provider>> provider) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(identifier, "identifier");
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(provider, "provider");
        this.size = size;
        this.identifier = identifier;
        this.mediaTagPrefix = mediaTagPrefix;
        this.mediaTagVersion = mediaTagVersion;
        this.metadata = metadata;
        this.provider = provider;
    }
    
    public GetSearchResultsMediaContainer() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Double> size() {
        return size;
    }

    @JsonIgnore
    public Optional<String> identifier() {
        return identifier;
    }

    @JsonIgnore
    public Optional<String> mediaTagPrefix() {
        return mediaTagPrefix;
    }

    @JsonIgnore
    public Optional<Double> mediaTagVersion() {
        return mediaTagVersion;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetSearchResultsMetadata>> metadata() {
        return (Optional<List<GetSearchResultsMetadata>>) metadata;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Provider>> provider() {
        return (Optional<List<Provider>>) provider;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetSearchResultsMediaContainer withSize(double size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetSearchResultsMediaContainer withSize(Optional<Double> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetSearchResultsMediaContainer withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = Optional.ofNullable(identifier);
        return this;
    }

    public GetSearchResultsMediaContainer withIdentifier(Optional<String> identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    public GetSearchResultsMediaContainer withMediaTagPrefix(String mediaTagPrefix) {
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        this.mediaTagPrefix = Optional.ofNullable(mediaTagPrefix);
        return this;
    }

    public GetSearchResultsMediaContainer withMediaTagPrefix(Optional<String> mediaTagPrefix) {
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        this.mediaTagPrefix = mediaTagPrefix;
        return this;
    }

    public GetSearchResultsMediaContainer withMediaTagVersion(double mediaTagVersion) {
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        this.mediaTagVersion = Optional.ofNullable(mediaTagVersion);
        return this;
    }

    public GetSearchResultsMediaContainer withMediaTagVersion(Optional<Double> mediaTagVersion) {
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        this.mediaTagVersion = mediaTagVersion;
        return this;
    }

    public GetSearchResultsMediaContainer withMetadata(List<GetSearchResultsMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public GetSearchResultsMediaContainer withMetadata(Optional<? extends List<GetSearchResultsMetadata>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public GetSearchResultsMediaContainer withProvider(List<Provider> provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = Optional.ofNullable(provider);
        return this;
    }

    public GetSearchResultsMediaContainer withProvider(Optional<? extends List<Provider>> provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
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
        GetSearchResultsMediaContainer other = (GetSearchResultsMediaContainer) o;
        return 
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.identifier, other.identifier) &&
            Objects.deepEquals(this.mediaTagPrefix, other.mediaTagPrefix) &&
            Objects.deepEquals(this.mediaTagVersion, other.mediaTagVersion) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.provider, other.provider);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            size,
            identifier,
            mediaTagPrefix,
            mediaTagVersion,
            metadata,
            provider);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSearchResultsMediaContainer.class,
                "size", size,
                "identifier", identifier,
                "mediaTagPrefix", mediaTagPrefix,
                "mediaTagVersion", mediaTagVersion,
                "metadata", metadata,
                "provider", provider);
    }
    
    public final static class Builder {
 
        private Optional<Double> size = Optional.empty();
 
        private Optional<String> identifier = Optional.empty();
 
        private Optional<String> mediaTagPrefix = Optional.empty();
 
        private Optional<Double> mediaTagVersion = Optional.empty();
 
        private Optional<? extends List<GetSearchResultsMetadata>> metadata = Optional.empty();
 
        private Optional<? extends List<Provider>> provider = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder identifier(String identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = Optional.ofNullable(identifier);
            return this;
        }

        public Builder identifier(Optional<String> identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }

        public Builder mediaTagPrefix(String mediaTagPrefix) {
            Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
            this.mediaTagPrefix = Optional.ofNullable(mediaTagPrefix);
            return this;
        }

        public Builder mediaTagPrefix(Optional<String> mediaTagPrefix) {
            Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
            this.mediaTagPrefix = mediaTagPrefix;
            return this;
        }

        public Builder mediaTagVersion(double mediaTagVersion) {
            Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
            this.mediaTagVersion = Optional.ofNullable(mediaTagVersion);
            return this;
        }

        public Builder mediaTagVersion(Optional<Double> mediaTagVersion) {
            Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
            this.mediaTagVersion = mediaTagVersion;
            return this;
        }

        public Builder metadata(List<GetSearchResultsMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends List<GetSearchResultsMetadata>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder provider(List<Provider> provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = Optional.ofNullable(provider);
            return this;
        }

        public Builder provider(Optional<? extends List<Provider>> provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = provider;
            return this;
        }
        
        public GetSearchResultsMediaContainer build() {
            return new GetSearchResultsMediaContainer(
                size,
                identifier,
                mediaTagPrefix,
                mediaTagVersion,
                metadata,
                provider);
        }
    }
}

