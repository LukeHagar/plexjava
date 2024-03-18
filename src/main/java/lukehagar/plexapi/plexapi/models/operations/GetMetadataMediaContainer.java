/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
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


public class GetMetadataMediaContainer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<? extends Integer> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowSync")
    private Optional<? extends Boolean> allowSync;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifier")
    private Optional<? extends String> identifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("librarySectionID")
    private Optional<? extends Integer> librarySectionID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("librarySectionTitle")
    private Optional<? extends String> librarySectionTitle;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("librarySectionUUID")
    private Optional<? extends String> librarySectionUUID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaTagPrefix")
    private Optional<? extends String> mediaTagPrefix;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaTagVersion")
    private Optional<? extends Integer> mediaTagVersion;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Metadata")
    private Optional<? extends java.util.List<GetMetadataMetadata>> metadata;

    public GetMetadataMediaContainer(
            @JsonProperty("size") Optional<? extends Integer> size,
            @JsonProperty("allowSync") Optional<? extends Boolean> allowSync,
            @JsonProperty("identifier") Optional<? extends String> identifier,
            @JsonProperty("librarySectionID") Optional<? extends Integer> librarySectionID,
            @JsonProperty("librarySectionTitle") Optional<? extends String> librarySectionTitle,
            @JsonProperty("librarySectionUUID") Optional<? extends String> librarySectionUUID,
            @JsonProperty("mediaTagPrefix") Optional<? extends String> mediaTagPrefix,
            @JsonProperty("mediaTagVersion") Optional<? extends Integer> mediaTagVersion,
            @JsonProperty("Metadata") Optional<? extends java.util.List<GetMetadataMetadata>> metadata) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(allowSync, "allowSync");
        Utils.checkNotNull(identifier, "identifier");
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        Utils.checkNotNull(librarySectionTitle, "librarySectionTitle");
        Utils.checkNotNull(librarySectionUUID, "librarySectionUUID");
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        Utils.checkNotNull(metadata, "metadata");
        this.size = size;
        this.allowSync = allowSync;
        this.identifier = identifier;
        this.librarySectionID = librarySectionID;
        this.librarySectionTitle = librarySectionTitle;
        this.librarySectionUUID = librarySectionUUID;
        this.mediaTagPrefix = mediaTagPrefix;
        this.mediaTagVersion = mediaTagVersion;
        this.metadata = metadata;
    }

    public Optional<? extends Integer> size() {
        return size;
    }

    public Optional<? extends Boolean> allowSync() {
        return allowSync;
    }

    public Optional<? extends String> identifier() {
        return identifier;
    }

    public Optional<? extends Integer> librarySectionID() {
        return librarySectionID;
    }

    public Optional<? extends String> librarySectionTitle() {
        return librarySectionTitle;
    }

    public Optional<? extends String> librarySectionUUID() {
        return librarySectionUUID;
    }

    public Optional<? extends String> mediaTagPrefix() {
        return mediaTagPrefix;
    }

    public Optional<? extends Integer> mediaTagVersion() {
        return mediaTagVersion;
    }

    public Optional<? extends java.util.List<GetMetadataMetadata>> metadata() {
        return metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetMetadataMediaContainer withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetMetadataMediaContainer withSize(Optional<? extends Integer> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetMetadataMediaContainer withAllowSync(boolean allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = Optional.ofNullable(allowSync);
        return this;
    }

    public GetMetadataMediaContainer withAllowSync(Optional<? extends Boolean> allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = allowSync;
        return this;
    }

    public GetMetadataMediaContainer withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = Optional.ofNullable(identifier);
        return this;
    }

    public GetMetadataMediaContainer withIdentifier(Optional<? extends String> identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    public GetMetadataMediaContainer withLibrarySectionID(int librarySectionID) {
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        this.librarySectionID = Optional.ofNullable(librarySectionID);
        return this;
    }

    public GetMetadataMediaContainer withLibrarySectionID(Optional<? extends Integer> librarySectionID) {
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        this.librarySectionID = librarySectionID;
        return this;
    }

    public GetMetadataMediaContainer withLibrarySectionTitle(String librarySectionTitle) {
        Utils.checkNotNull(librarySectionTitle, "librarySectionTitle");
        this.librarySectionTitle = Optional.ofNullable(librarySectionTitle);
        return this;
    }

    public GetMetadataMediaContainer withLibrarySectionTitle(Optional<? extends String> librarySectionTitle) {
        Utils.checkNotNull(librarySectionTitle, "librarySectionTitle");
        this.librarySectionTitle = librarySectionTitle;
        return this;
    }

    public GetMetadataMediaContainer withLibrarySectionUUID(String librarySectionUUID) {
        Utils.checkNotNull(librarySectionUUID, "librarySectionUUID");
        this.librarySectionUUID = Optional.ofNullable(librarySectionUUID);
        return this;
    }

    public GetMetadataMediaContainer withLibrarySectionUUID(Optional<? extends String> librarySectionUUID) {
        Utils.checkNotNull(librarySectionUUID, "librarySectionUUID");
        this.librarySectionUUID = librarySectionUUID;
        return this;
    }

    public GetMetadataMediaContainer withMediaTagPrefix(String mediaTagPrefix) {
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        this.mediaTagPrefix = Optional.ofNullable(mediaTagPrefix);
        return this;
    }

    public GetMetadataMediaContainer withMediaTagPrefix(Optional<? extends String> mediaTagPrefix) {
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        this.mediaTagPrefix = mediaTagPrefix;
        return this;
    }

    public GetMetadataMediaContainer withMediaTagVersion(int mediaTagVersion) {
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        this.mediaTagVersion = Optional.ofNullable(mediaTagVersion);
        return this;
    }

    public GetMetadataMediaContainer withMediaTagVersion(Optional<? extends Integer> mediaTagVersion) {
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        this.mediaTagVersion = mediaTagVersion;
        return this;
    }

    public GetMetadataMediaContainer withMetadata(java.util.List<GetMetadataMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public GetMetadataMediaContainer withMetadata(Optional<? extends java.util.List<GetMetadataMetadata>> metadata) {
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
        GetMetadataMediaContainer other = (GetMetadataMediaContainer) o;
        return 
            java.util.Objects.deepEquals(this.size, other.size) &&
            java.util.Objects.deepEquals(this.allowSync, other.allowSync) &&
            java.util.Objects.deepEquals(this.identifier, other.identifier) &&
            java.util.Objects.deepEquals(this.librarySectionID, other.librarySectionID) &&
            java.util.Objects.deepEquals(this.librarySectionTitle, other.librarySectionTitle) &&
            java.util.Objects.deepEquals(this.librarySectionUUID, other.librarySectionUUID) &&
            java.util.Objects.deepEquals(this.mediaTagPrefix, other.mediaTagPrefix) &&
            java.util.Objects.deepEquals(this.mediaTagVersion, other.mediaTagVersion) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            size,
            allowSync,
            identifier,
            librarySectionID,
            librarySectionTitle,
            librarySectionUUID,
            mediaTagPrefix,
            mediaTagVersion,
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMetadataMediaContainer.class,
                "size", size,
                "allowSync", allowSync,
                "identifier", identifier,
                "librarySectionID", librarySectionID,
                "librarySectionTitle", librarySectionTitle,
                "librarySectionUUID", librarySectionUUID,
                "mediaTagPrefix", mediaTagPrefix,
                "mediaTagVersion", mediaTagVersion,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private Optional<? extends Integer> size = Optional.empty();
 
        private Optional<? extends Boolean> allowSync = Optional.empty();
 
        private Optional<? extends String> identifier = Optional.empty();
 
        private Optional<? extends Integer> librarySectionID = Optional.empty();
 
        private Optional<? extends String> librarySectionTitle = Optional.empty();
 
        private Optional<? extends String> librarySectionUUID = Optional.empty();
 
        private Optional<? extends String> mediaTagPrefix = Optional.empty();
 
        private Optional<? extends Integer> mediaTagVersion = Optional.empty();
 
        private Optional<? extends java.util.List<GetMetadataMetadata>> metadata = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder size(int size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        public Builder size(Optional<? extends Integer> size) {
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

        public Builder librarySectionID(int librarySectionID) {
            Utils.checkNotNull(librarySectionID, "librarySectionID");
            this.librarySectionID = Optional.ofNullable(librarySectionID);
            return this;
        }

        public Builder librarySectionID(Optional<? extends Integer> librarySectionID) {
            Utils.checkNotNull(librarySectionID, "librarySectionID");
            this.librarySectionID = librarySectionID;
            return this;
        }

        public Builder librarySectionTitle(String librarySectionTitle) {
            Utils.checkNotNull(librarySectionTitle, "librarySectionTitle");
            this.librarySectionTitle = Optional.ofNullable(librarySectionTitle);
            return this;
        }

        public Builder librarySectionTitle(Optional<? extends String> librarySectionTitle) {
            Utils.checkNotNull(librarySectionTitle, "librarySectionTitle");
            this.librarySectionTitle = librarySectionTitle;
            return this;
        }

        public Builder librarySectionUUID(String librarySectionUUID) {
            Utils.checkNotNull(librarySectionUUID, "librarySectionUUID");
            this.librarySectionUUID = Optional.ofNullable(librarySectionUUID);
            return this;
        }

        public Builder librarySectionUUID(Optional<? extends String> librarySectionUUID) {
            Utils.checkNotNull(librarySectionUUID, "librarySectionUUID");
            this.librarySectionUUID = librarySectionUUID;
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

        public Builder mediaTagVersion(int mediaTagVersion) {
            Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
            this.mediaTagVersion = Optional.ofNullable(mediaTagVersion);
            return this;
        }

        public Builder mediaTagVersion(Optional<? extends Integer> mediaTagVersion) {
            Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
            this.mediaTagVersion = mediaTagVersion;
            return this;
        }

        public Builder metadata(java.util.List<GetMetadataMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends java.util.List<GetMetadataMetadata>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public GetMetadataMediaContainer build() {
            return new GetMetadataMediaContainer(
                size,
                allowSync,
                identifier,
                librarySectionID,
                librarySectionTitle,
                librarySectionUUID,
                mediaTagPrefix,
                mediaTagVersion,
                metadata);
        }
    }
}

