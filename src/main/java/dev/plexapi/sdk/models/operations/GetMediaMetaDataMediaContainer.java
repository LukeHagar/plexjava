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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class GetMediaMetaDataMediaContainer {

    @JsonProperty("size")
    private double size;

    /**
     * Indicates whether syncing is allowed.
     */
    @JsonProperty("allowSync")
    private boolean allowSync;

    /**
     * An plugin identifier for the media container.
     */
    @JsonProperty("identifier")
    private String identifier;

    /**
     * The unique identifier for the library section.
     */
    @JsonProperty("librarySectionID")
    private long librarySectionID;

    /**
     * The title of the library section.
     */
    @JsonProperty("librarySectionTitle")
    private String librarySectionTitle;

    /**
     * The universally unique identifier for the library section.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("librarySectionUUID")
    private Optional<String> librarySectionUUID;

    /**
     * The prefix used for media tag resource paths.
     */
    @JsonProperty("mediaTagPrefix")
    private String mediaTagPrefix;

    /**
     * The version number for media tags.
     */
    @JsonProperty("mediaTagVersion")
    private long mediaTagVersion;

    /**
     * An array of metadata items.
     */
    @JsonProperty("Metadata")
    private List<GetMediaMetaDataMetadata> metadata;

    @JsonCreator
    public GetMediaMetaDataMediaContainer(
            @JsonProperty("size") double size,
            @JsonProperty("allowSync") boolean allowSync,
            @JsonProperty("identifier") String identifier,
            @JsonProperty("librarySectionID") long librarySectionID,
            @JsonProperty("librarySectionTitle") String librarySectionTitle,
            @JsonProperty("librarySectionUUID") Optional<String> librarySectionUUID,
            @JsonProperty("mediaTagPrefix") String mediaTagPrefix,
            @JsonProperty("mediaTagVersion") long mediaTagVersion,
            @JsonProperty("Metadata") List<GetMediaMetaDataMetadata> metadata) {
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
    
    public GetMediaMetaDataMediaContainer(
            double size,
            boolean allowSync,
            String identifier,
            long librarySectionID,
            String librarySectionTitle,
            String mediaTagPrefix,
            long mediaTagVersion,
            List<GetMediaMetaDataMetadata> metadata) {
        this(size, allowSync, identifier, librarySectionID, librarySectionTitle, Optional.empty(), mediaTagPrefix, mediaTagVersion, metadata);
    }

    @JsonIgnore
    public double size() {
        return size;
    }

    /**
     * Indicates whether syncing is allowed.
     */
    @JsonIgnore
    public boolean allowSync() {
        return allowSync;
    }

    /**
     * An plugin identifier for the media container.
     */
    @JsonIgnore
    public String identifier() {
        return identifier;
    }

    /**
     * The unique identifier for the library section.
     */
    @JsonIgnore
    public long librarySectionID() {
        return librarySectionID;
    }

    /**
     * The title of the library section.
     */
    @JsonIgnore
    public String librarySectionTitle() {
        return librarySectionTitle;
    }

    /**
     * The universally unique identifier for the library section.
     */
    @JsonIgnore
    public Optional<String> librarySectionUUID() {
        return librarySectionUUID;
    }

    /**
     * The prefix used for media tag resource paths.
     */
    @JsonIgnore
    public String mediaTagPrefix() {
        return mediaTagPrefix;
    }

    /**
     * The version number for media tags.
     */
    @JsonIgnore
    public long mediaTagVersion() {
        return mediaTagVersion;
    }

    /**
     * An array of metadata items.
     */
    @JsonIgnore
    public List<GetMediaMetaDataMetadata> metadata() {
        return metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetMediaMetaDataMediaContainer withSize(double size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    /**
     * Indicates whether syncing is allowed.
     */
    public GetMediaMetaDataMediaContainer withAllowSync(boolean allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = allowSync;
        return this;
    }

    /**
     * An plugin identifier for the media container.
     */
    public GetMediaMetaDataMediaContainer withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    /**
     * The unique identifier for the library section.
     */
    public GetMediaMetaDataMediaContainer withLibrarySectionID(long librarySectionID) {
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        this.librarySectionID = librarySectionID;
        return this;
    }

    /**
     * The title of the library section.
     */
    public GetMediaMetaDataMediaContainer withLibrarySectionTitle(String librarySectionTitle) {
        Utils.checkNotNull(librarySectionTitle, "librarySectionTitle");
        this.librarySectionTitle = librarySectionTitle;
        return this;
    }

    /**
     * The universally unique identifier for the library section.
     */
    public GetMediaMetaDataMediaContainer withLibrarySectionUUID(String librarySectionUUID) {
        Utils.checkNotNull(librarySectionUUID, "librarySectionUUID");
        this.librarySectionUUID = Optional.ofNullable(librarySectionUUID);
        return this;
    }

    /**
     * The universally unique identifier for the library section.
     */
    public GetMediaMetaDataMediaContainer withLibrarySectionUUID(Optional<String> librarySectionUUID) {
        Utils.checkNotNull(librarySectionUUID, "librarySectionUUID");
        this.librarySectionUUID = librarySectionUUID;
        return this;
    }

    /**
     * The prefix used for media tag resource paths.
     */
    public GetMediaMetaDataMediaContainer withMediaTagPrefix(String mediaTagPrefix) {
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        this.mediaTagPrefix = mediaTagPrefix;
        return this;
    }

    /**
     * The version number for media tags.
     */
    public GetMediaMetaDataMediaContainer withMediaTagVersion(long mediaTagVersion) {
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        this.mediaTagVersion = mediaTagVersion;
        return this;
    }

    /**
     * An array of metadata items.
     */
    public GetMediaMetaDataMediaContainer withMetadata(List<GetMediaMetaDataMetadata> metadata) {
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
        GetMediaMetaDataMediaContainer other = (GetMediaMetaDataMediaContainer) o;
        return 
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.allowSync, other.allowSync) &&
            Objects.deepEquals(this.identifier, other.identifier) &&
            Objects.deepEquals(this.librarySectionID, other.librarySectionID) &&
            Objects.deepEquals(this.librarySectionTitle, other.librarySectionTitle) &&
            Objects.deepEquals(this.librarySectionUUID, other.librarySectionUUID) &&
            Objects.deepEquals(this.mediaTagPrefix, other.mediaTagPrefix) &&
            Objects.deepEquals(this.mediaTagVersion, other.mediaTagVersion) &&
            Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
        return Utils.toString(GetMediaMetaDataMediaContainer.class,
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
 
        private Double size;
 
        private Boolean allowSync;
 
        private String identifier;
 
        private Long librarySectionID;
 
        private String librarySectionTitle;
 
        private Optional<String> librarySectionUUID = Optional.empty();
 
        private String mediaTagPrefix;
 
        private Long mediaTagVersion;
 
        private List<GetMediaMetaDataMetadata> metadata;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder size(double size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        /**
         * Indicates whether syncing is allowed.
         */
        public Builder allowSync(boolean allowSync) {
            Utils.checkNotNull(allowSync, "allowSync");
            this.allowSync = allowSync;
            return this;
        }

        /**
         * An plugin identifier for the media container.
         */
        public Builder identifier(String identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }

        /**
         * The unique identifier for the library section.
         */
        public Builder librarySectionID(long librarySectionID) {
            Utils.checkNotNull(librarySectionID, "librarySectionID");
            this.librarySectionID = librarySectionID;
            return this;
        }

        /**
         * The title of the library section.
         */
        public Builder librarySectionTitle(String librarySectionTitle) {
            Utils.checkNotNull(librarySectionTitle, "librarySectionTitle");
            this.librarySectionTitle = librarySectionTitle;
            return this;
        }

        /**
         * The universally unique identifier for the library section.
         */
        public Builder librarySectionUUID(String librarySectionUUID) {
            Utils.checkNotNull(librarySectionUUID, "librarySectionUUID");
            this.librarySectionUUID = Optional.ofNullable(librarySectionUUID);
            return this;
        }

        /**
         * The universally unique identifier for the library section.
         */
        public Builder librarySectionUUID(Optional<String> librarySectionUUID) {
            Utils.checkNotNull(librarySectionUUID, "librarySectionUUID");
            this.librarySectionUUID = librarySectionUUID;
            return this;
        }

        /**
         * The prefix used for media tag resource paths.
         */
        public Builder mediaTagPrefix(String mediaTagPrefix) {
            Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
            this.mediaTagPrefix = mediaTagPrefix;
            return this;
        }

        /**
         * The version number for media tags.
         */
        public Builder mediaTagVersion(long mediaTagVersion) {
            Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
            this.mediaTagVersion = mediaTagVersion;
            return this;
        }

        /**
         * An array of metadata items.
         */
        public Builder metadata(List<GetMediaMetaDataMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public GetMediaMetaDataMediaContainer build() {
            return new GetMediaMetaDataMediaContainer(
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

