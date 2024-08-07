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

public class GetLibraryItemsMediaContainer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<? extends Integer> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowSync")
    private Optional<? extends Boolean> allowSync;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("art")
    private Optional<? extends String> art;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifier")
    private Optional<? extends String> identifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("librarySectionID")
    private Optional<? extends LibrarySectionID> librarySectionID;

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
    @JsonProperty("thumb")
    private Optional<? extends String> thumb;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title1")
    private Optional<? extends String> title1;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title2")
    private Optional<? extends String> title2;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("viewGroup")
    private Optional<? extends String> viewGroup;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("viewMode")
    private Optional<? extends Integer> viewMode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mixedParents")
    private Optional<? extends Boolean> mixedParents;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Metadata")
    private Optional<? extends java.util.List<GetLibraryItemsMetadata>> metadata;

    @JsonCreator
    public GetLibraryItemsMediaContainer(
            @JsonProperty("size") Optional<? extends Integer> size,
            @JsonProperty("allowSync") Optional<? extends Boolean> allowSync,
            @JsonProperty("art") Optional<? extends String> art,
            @JsonProperty("identifier") Optional<? extends String> identifier,
            @JsonProperty("librarySectionID") Optional<? extends LibrarySectionID> librarySectionID,
            @JsonProperty("librarySectionTitle") Optional<? extends String> librarySectionTitle,
            @JsonProperty("librarySectionUUID") Optional<? extends String> librarySectionUUID,
            @JsonProperty("mediaTagPrefix") Optional<? extends String> mediaTagPrefix,
            @JsonProperty("mediaTagVersion") Optional<? extends Integer> mediaTagVersion,
            @JsonProperty("thumb") Optional<? extends String> thumb,
            @JsonProperty("title1") Optional<? extends String> title1,
            @JsonProperty("title2") Optional<? extends String> title2,
            @JsonProperty("viewGroup") Optional<? extends String> viewGroup,
            @JsonProperty("viewMode") Optional<? extends Integer> viewMode,
            @JsonProperty("mixedParents") Optional<? extends Boolean> mixedParents,
            @JsonProperty("Metadata") Optional<? extends java.util.List<GetLibraryItemsMetadata>> metadata) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(allowSync, "allowSync");
        Utils.checkNotNull(art, "art");
        Utils.checkNotNull(identifier, "identifier");
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        Utils.checkNotNull(librarySectionTitle, "librarySectionTitle");
        Utils.checkNotNull(librarySectionUUID, "librarySectionUUID");
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        Utils.checkNotNull(thumb, "thumb");
        Utils.checkNotNull(title1, "title1");
        Utils.checkNotNull(title2, "title2");
        Utils.checkNotNull(viewGroup, "viewGroup");
        Utils.checkNotNull(viewMode, "viewMode");
        Utils.checkNotNull(mixedParents, "mixedParents");
        Utils.checkNotNull(metadata, "metadata");
        this.size = size;
        this.allowSync = allowSync;
        this.art = art;
        this.identifier = identifier;
        this.librarySectionID = librarySectionID;
        this.librarySectionTitle = librarySectionTitle;
        this.librarySectionUUID = librarySectionUUID;
        this.mediaTagPrefix = mediaTagPrefix;
        this.mediaTagVersion = mediaTagVersion;
        this.thumb = thumb;
        this.title1 = title1;
        this.title2 = title2;
        this.viewGroup = viewGroup;
        this.viewMode = viewMode;
        this.mixedParents = mixedParents;
        this.metadata = metadata;
    }
    
    public GetLibraryItemsMediaContainer() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> size() {
        return (Optional<Integer>) size;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> allowSync() {
        return (Optional<Boolean>) allowSync;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> art() {
        return (Optional<String>) art;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> identifier() {
        return (Optional<String>) identifier;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LibrarySectionID> librarySectionID() {
        return (Optional<LibrarySectionID>) librarySectionID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> librarySectionTitle() {
        return (Optional<String>) librarySectionTitle;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> librarySectionUUID() {
        return (Optional<String>) librarySectionUUID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> mediaTagPrefix() {
        return (Optional<String>) mediaTagPrefix;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> mediaTagVersion() {
        return (Optional<Integer>) mediaTagVersion;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> thumb() {
        return (Optional<String>) thumb;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> title1() {
        return (Optional<String>) title1;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> title2() {
        return (Optional<String>) title2;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> viewGroup() {
        return (Optional<String>) viewGroup;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> viewMode() {
        return (Optional<Integer>) viewMode;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> mixedParents() {
        return (Optional<Boolean>) mixedParents;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<GetLibraryItemsMetadata>> metadata() {
        return (Optional<java.util.List<GetLibraryItemsMetadata>>) metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLibraryItemsMediaContainer withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetLibraryItemsMediaContainer withSize(Optional<? extends Integer> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetLibraryItemsMediaContainer withAllowSync(boolean allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = Optional.ofNullable(allowSync);
        return this;
    }

    public GetLibraryItemsMediaContainer withAllowSync(Optional<? extends Boolean> allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = allowSync;
        return this;
    }

    public GetLibraryItemsMediaContainer withArt(String art) {
        Utils.checkNotNull(art, "art");
        this.art = Optional.ofNullable(art);
        return this;
    }

    public GetLibraryItemsMediaContainer withArt(Optional<? extends String> art) {
        Utils.checkNotNull(art, "art");
        this.art = art;
        return this;
    }

    public GetLibraryItemsMediaContainer withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = Optional.ofNullable(identifier);
        return this;
    }

    public GetLibraryItemsMediaContainer withIdentifier(Optional<? extends String> identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    public GetLibraryItemsMediaContainer withLibrarySectionID(LibrarySectionID librarySectionID) {
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        this.librarySectionID = Optional.ofNullable(librarySectionID);
        return this;
    }

    public GetLibraryItemsMediaContainer withLibrarySectionID(Optional<? extends LibrarySectionID> librarySectionID) {
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        this.librarySectionID = librarySectionID;
        return this;
    }

    public GetLibraryItemsMediaContainer withLibrarySectionTitle(String librarySectionTitle) {
        Utils.checkNotNull(librarySectionTitle, "librarySectionTitle");
        this.librarySectionTitle = Optional.ofNullable(librarySectionTitle);
        return this;
    }

    public GetLibraryItemsMediaContainer withLibrarySectionTitle(Optional<? extends String> librarySectionTitle) {
        Utils.checkNotNull(librarySectionTitle, "librarySectionTitle");
        this.librarySectionTitle = librarySectionTitle;
        return this;
    }

    public GetLibraryItemsMediaContainer withLibrarySectionUUID(String librarySectionUUID) {
        Utils.checkNotNull(librarySectionUUID, "librarySectionUUID");
        this.librarySectionUUID = Optional.ofNullable(librarySectionUUID);
        return this;
    }

    public GetLibraryItemsMediaContainer withLibrarySectionUUID(Optional<? extends String> librarySectionUUID) {
        Utils.checkNotNull(librarySectionUUID, "librarySectionUUID");
        this.librarySectionUUID = librarySectionUUID;
        return this;
    }

    public GetLibraryItemsMediaContainer withMediaTagPrefix(String mediaTagPrefix) {
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        this.mediaTagPrefix = Optional.ofNullable(mediaTagPrefix);
        return this;
    }

    public GetLibraryItemsMediaContainer withMediaTagPrefix(Optional<? extends String> mediaTagPrefix) {
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        this.mediaTagPrefix = mediaTagPrefix;
        return this;
    }

    public GetLibraryItemsMediaContainer withMediaTagVersion(int mediaTagVersion) {
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        this.mediaTagVersion = Optional.ofNullable(mediaTagVersion);
        return this;
    }

    public GetLibraryItemsMediaContainer withMediaTagVersion(Optional<? extends Integer> mediaTagVersion) {
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        this.mediaTagVersion = mediaTagVersion;
        return this;
    }

    public GetLibraryItemsMediaContainer withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = Optional.ofNullable(thumb);
        return this;
    }

    public GetLibraryItemsMediaContainer withThumb(Optional<? extends String> thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = thumb;
        return this;
    }

    public GetLibraryItemsMediaContainer withTitle1(String title1) {
        Utils.checkNotNull(title1, "title1");
        this.title1 = Optional.ofNullable(title1);
        return this;
    }

    public GetLibraryItemsMediaContainer withTitle1(Optional<? extends String> title1) {
        Utils.checkNotNull(title1, "title1");
        this.title1 = title1;
        return this;
    }

    public GetLibraryItemsMediaContainer withTitle2(String title2) {
        Utils.checkNotNull(title2, "title2");
        this.title2 = Optional.ofNullable(title2);
        return this;
    }

    public GetLibraryItemsMediaContainer withTitle2(Optional<? extends String> title2) {
        Utils.checkNotNull(title2, "title2");
        this.title2 = title2;
        return this;
    }

    public GetLibraryItemsMediaContainer withViewGroup(String viewGroup) {
        Utils.checkNotNull(viewGroup, "viewGroup");
        this.viewGroup = Optional.ofNullable(viewGroup);
        return this;
    }

    public GetLibraryItemsMediaContainer withViewGroup(Optional<? extends String> viewGroup) {
        Utils.checkNotNull(viewGroup, "viewGroup");
        this.viewGroup = viewGroup;
        return this;
    }

    public GetLibraryItemsMediaContainer withViewMode(int viewMode) {
        Utils.checkNotNull(viewMode, "viewMode");
        this.viewMode = Optional.ofNullable(viewMode);
        return this;
    }

    public GetLibraryItemsMediaContainer withViewMode(Optional<? extends Integer> viewMode) {
        Utils.checkNotNull(viewMode, "viewMode");
        this.viewMode = viewMode;
        return this;
    }

    public GetLibraryItemsMediaContainer withMixedParents(boolean mixedParents) {
        Utils.checkNotNull(mixedParents, "mixedParents");
        this.mixedParents = Optional.ofNullable(mixedParents);
        return this;
    }

    public GetLibraryItemsMediaContainer withMixedParents(Optional<? extends Boolean> mixedParents) {
        Utils.checkNotNull(mixedParents, "mixedParents");
        this.mixedParents = mixedParents;
        return this;
    }

    public GetLibraryItemsMediaContainer withMetadata(java.util.List<GetLibraryItemsMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public GetLibraryItemsMediaContainer withMetadata(Optional<? extends java.util.List<GetLibraryItemsMetadata>> metadata) {
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
        GetLibraryItemsMediaContainer other = (GetLibraryItemsMediaContainer) o;
        return 
            java.util.Objects.deepEquals(this.size, other.size) &&
            java.util.Objects.deepEquals(this.allowSync, other.allowSync) &&
            java.util.Objects.deepEquals(this.art, other.art) &&
            java.util.Objects.deepEquals(this.identifier, other.identifier) &&
            java.util.Objects.deepEquals(this.librarySectionID, other.librarySectionID) &&
            java.util.Objects.deepEquals(this.librarySectionTitle, other.librarySectionTitle) &&
            java.util.Objects.deepEquals(this.librarySectionUUID, other.librarySectionUUID) &&
            java.util.Objects.deepEquals(this.mediaTagPrefix, other.mediaTagPrefix) &&
            java.util.Objects.deepEquals(this.mediaTagVersion, other.mediaTagVersion) &&
            java.util.Objects.deepEquals(this.thumb, other.thumb) &&
            java.util.Objects.deepEquals(this.title1, other.title1) &&
            java.util.Objects.deepEquals(this.title2, other.title2) &&
            java.util.Objects.deepEquals(this.viewGroup, other.viewGroup) &&
            java.util.Objects.deepEquals(this.viewMode, other.viewMode) &&
            java.util.Objects.deepEquals(this.mixedParents, other.mixedParents) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            size,
            allowSync,
            art,
            identifier,
            librarySectionID,
            librarySectionTitle,
            librarySectionUUID,
            mediaTagPrefix,
            mediaTagVersion,
            thumb,
            title1,
            title2,
            viewGroup,
            viewMode,
            mixedParents,
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLibraryItemsMediaContainer.class,
                "size", size,
                "allowSync", allowSync,
                "art", art,
                "identifier", identifier,
                "librarySectionID", librarySectionID,
                "librarySectionTitle", librarySectionTitle,
                "librarySectionUUID", librarySectionUUID,
                "mediaTagPrefix", mediaTagPrefix,
                "mediaTagVersion", mediaTagVersion,
                "thumb", thumb,
                "title1", title1,
                "title2", title2,
                "viewGroup", viewGroup,
                "viewMode", viewMode,
                "mixedParents", mixedParents,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private Optional<? extends Integer> size = Optional.empty();
 
        private Optional<? extends Boolean> allowSync = Optional.empty();
 
        private Optional<? extends String> art = Optional.empty();
 
        private Optional<? extends String> identifier = Optional.empty();
 
        private Optional<? extends LibrarySectionID> librarySectionID = Optional.empty();
 
        private Optional<? extends String> librarySectionTitle = Optional.empty();
 
        private Optional<? extends String> librarySectionUUID = Optional.empty();
 
        private Optional<? extends String> mediaTagPrefix = Optional.empty();
 
        private Optional<? extends Integer> mediaTagVersion = Optional.empty();
 
        private Optional<? extends String> thumb = Optional.empty();
 
        private Optional<? extends String> title1 = Optional.empty();
 
        private Optional<? extends String> title2 = Optional.empty();
 
        private Optional<? extends String> viewGroup = Optional.empty();
 
        private Optional<? extends Integer> viewMode = Optional.empty();
 
        private Optional<? extends Boolean> mixedParents = Optional.empty();
 
        private Optional<? extends java.util.List<GetLibraryItemsMetadata>> metadata = Optional.empty();  
        
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

        public Builder art(String art) {
            Utils.checkNotNull(art, "art");
            this.art = Optional.ofNullable(art);
            return this;
        }

        public Builder art(Optional<? extends String> art) {
            Utils.checkNotNull(art, "art");
            this.art = art;
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

        public Builder librarySectionID(LibrarySectionID librarySectionID) {
            Utils.checkNotNull(librarySectionID, "librarySectionID");
            this.librarySectionID = Optional.ofNullable(librarySectionID);
            return this;
        }

        public Builder librarySectionID(Optional<? extends LibrarySectionID> librarySectionID) {
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

        public Builder thumb(String thumb) {
            Utils.checkNotNull(thumb, "thumb");
            this.thumb = Optional.ofNullable(thumb);
            return this;
        }

        public Builder thumb(Optional<? extends String> thumb) {
            Utils.checkNotNull(thumb, "thumb");
            this.thumb = thumb;
            return this;
        }

        public Builder title1(String title1) {
            Utils.checkNotNull(title1, "title1");
            this.title1 = Optional.ofNullable(title1);
            return this;
        }

        public Builder title1(Optional<? extends String> title1) {
            Utils.checkNotNull(title1, "title1");
            this.title1 = title1;
            return this;
        }

        public Builder title2(String title2) {
            Utils.checkNotNull(title2, "title2");
            this.title2 = Optional.ofNullable(title2);
            return this;
        }

        public Builder title2(Optional<? extends String> title2) {
            Utils.checkNotNull(title2, "title2");
            this.title2 = title2;
            return this;
        }

        public Builder viewGroup(String viewGroup) {
            Utils.checkNotNull(viewGroup, "viewGroup");
            this.viewGroup = Optional.ofNullable(viewGroup);
            return this;
        }

        public Builder viewGroup(Optional<? extends String> viewGroup) {
            Utils.checkNotNull(viewGroup, "viewGroup");
            this.viewGroup = viewGroup;
            return this;
        }

        public Builder viewMode(int viewMode) {
            Utils.checkNotNull(viewMode, "viewMode");
            this.viewMode = Optional.ofNullable(viewMode);
            return this;
        }

        public Builder viewMode(Optional<? extends Integer> viewMode) {
            Utils.checkNotNull(viewMode, "viewMode");
            this.viewMode = viewMode;
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

        public Builder metadata(java.util.List<GetLibraryItemsMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends java.util.List<GetLibraryItemsMetadata>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public GetLibraryItemsMediaContainer build() {
            return new GetLibraryItemsMediaContainer(
                size,
                allowSync,
                art,
                identifier,
                librarySectionID,
                librarySectionTitle,
                librarySectionUUID,
                mediaTagPrefix,
                mediaTagVersion,
                thumb,
                title1,
                title2,
                viewGroup,
                viewMode,
                mixedParents,
                metadata);
        }
    }
}

