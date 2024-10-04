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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * GetLibraryItemsMediaContainer - The Meta object is only included in the response if the `includeMeta` parameter is set to `1`.
 * 
 */

public class GetLibraryItemsMediaContainer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Type")
    private Optional<? extends List<GetLibraryItemsType>> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("FieldType")
    private Optional<? extends List<GetLibraryItemsFieldType>> fieldType;

    @JsonProperty("size")
    private int size;

    @JsonProperty("totalSize")
    private int totalSize;

    @JsonProperty("offset")
    private int offset;

    @JsonProperty("content")
    private String content;

    @JsonProperty("allowSync")
    private boolean allowSync;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nocache")
    private Optional<Boolean> nocache;

    @JsonProperty("art")
    private String art;

    @JsonProperty("identifier")
    private String identifier;

    @JsonProperty("librarySectionID")
    private long librarySectionID;

    @JsonProperty("librarySectionTitle")
    private String librarySectionTitle;

    @JsonProperty("librarySectionUUID")
    private String librarySectionUUID;

    @JsonProperty("mediaTagPrefix")
    private String mediaTagPrefix;

    @JsonProperty("mediaTagVersion")
    private int mediaTagVersion;

    @JsonProperty("thumb")
    private String thumb;

    @JsonProperty("title1")
    private String title1;

    @JsonProperty("title2")
    private String title2;

    @JsonProperty("viewGroup")
    private String viewGroup;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("viewMode")
    private Optional<Integer> viewMode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mixedParents")
    private Optional<Boolean> mixedParents;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Metadata")
    private Optional<? extends List<GetLibraryItemsMetadata>> metadata;

    /**
     * The Meta object is only included in the response if the `includeMeta` parameter is set to `1`.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Meta")
    private Optional<? extends GetLibraryItemsMeta> meta;

    @JsonCreator
    public GetLibraryItemsMediaContainer(
            @JsonProperty("Type") Optional<? extends List<GetLibraryItemsType>> type,
            @JsonProperty("FieldType") Optional<? extends List<GetLibraryItemsFieldType>> fieldType,
            @JsonProperty("size") int size,
            @JsonProperty("totalSize") int totalSize,
            @JsonProperty("offset") int offset,
            @JsonProperty("content") String content,
            @JsonProperty("allowSync") boolean allowSync,
            @JsonProperty("nocache") Optional<Boolean> nocache,
            @JsonProperty("art") String art,
            @JsonProperty("identifier") String identifier,
            @JsonProperty("librarySectionID") long librarySectionID,
            @JsonProperty("librarySectionTitle") String librarySectionTitle,
            @JsonProperty("librarySectionUUID") String librarySectionUUID,
            @JsonProperty("mediaTagPrefix") String mediaTagPrefix,
            @JsonProperty("mediaTagVersion") int mediaTagVersion,
            @JsonProperty("thumb") String thumb,
            @JsonProperty("title1") String title1,
            @JsonProperty("title2") String title2,
            @JsonProperty("viewGroup") String viewGroup,
            @JsonProperty("viewMode") Optional<Integer> viewMode,
            @JsonProperty("mixedParents") Optional<Boolean> mixedParents,
            @JsonProperty("Metadata") Optional<? extends List<GetLibraryItemsMetadata>> metadata,
            @JsonProperty("Meta") Optional<? extends GetLibraryItemsMeta> meta) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(fieldType, "fieldType");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(totalSize, "totalSize");
        Utils.checkNotNull(offset, "offset");
        Utils.checkNotNull(content, "content");
        Utils.checkNotNull(allowSync, "allowSync");
        Utils.checkNotNull(nocache, "nocache");
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
        Utils.checkNotNull(meta, "meta");
        this.type = type;
        this.fieldType = fieldType;
        this.size = size;
        this.totalSize = totalSize;
        this.offset = offset;
        this.content = content;
        this.allowSync = allowSync;
        this.nocache = nocache;
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
        this.meta = meta;
    }
    
    public GetLibraryItemsMediaContainer(
            int size,
            int totalSize,
            int offset,
            String content,
            boolean allowSync,
            String art,
            String identifier,
            long librarySectionID,
            String librarySectionTitle,
            String librarySectionUUID,
            String mediaTagPrefix,
            int mediaTagVersion,
            String thumb,
            String title1,
            String title2,
            String viewGroup) {
        this(Optional.empty(), Optional.empty(), size, totalSize, offset, content, allowSync, Optional.empty(), art, identifier, librarySectionID, librarySectionTitle, librarySectionUUID, mediaTagPrefix, mediaTagVersion, thumb, title1, title2, viewGroup, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetLibraryItemsType>> type() {
        return (Optional<List<GetLibraryItemsType>>) type;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetLibraryItemsFieldType>> fieldType() {
        return (Optional<List<GetLibraryItemsFieldType>>) fieldType;
    }

    @JsonIgnore
    public int size() {
        return size;
    }

    @JsonIgnore
    public int totalSize() {
        return totalSize;
    }

    @JsonIgnore
    public int offset() {
        return offset;
    }

    @JsonIgnore
    public String content() {
        return content;
    }

    @JsonIgnore
    public boolean allowSync() {
        return allowSync;
    }

    @JsonIgnore
    public Optional<Boolean> nocache() {
        return nocache;
    }

    @JsonIgnore
    public String art() {
        return art;
    }

    @JsonIgnore
    public String identifier() {
        return identifier;
    }

    @JsonIgnore
    public long librarySectionID() {
        return librarySectionID;
    }

    @JsonIgnore
    public String librarySectionTitle() {
        return librarySectionTitle;
    }

    @JsonIgnore
    public String librarySectionUUID() {
        return librarySectionUUID;
    }

    @JsonIgnore
    public String mediaTagPrefix() {
        return mediaTagPrefix;
    }

    @JsonIgnore
    public int mediaTagVersion() {
        return mediaTagVersion;
    }

    @JsonIgnore
    public String thumb() {
        return thumb;
    }

    @JsonIgnore
    public String title1() {
        return title1;
    }

    @JsonIgnore
    public String title2() {
        return title2;
    }

    @JsonIgnore
    public String viewGroup() {
        return viewGroup;
    }

    @JsonIgnore
    public Optional<Integer> viewMode() {
        return viewMode;
    }

    @JsonIgnore
    public Optional<Boolean> mixedParents() {
        return mixedParents;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetLibraryItemsMetadata>> metadata() {
        return (Optional<List<GetLibraryItemsMetadata>>) metadata;
    }

    /**
     * The Meta object is only included in the response if the `includeMeta` parameter is set to `1`.
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetLibraryItemsMeta> meta() {
        return (Optional<GetLibraryItemsMeta>) meta;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLibraryItemsMediaContainer withType(List<GetLibraryItemsType> type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public GetLibraryItemsMediaContainer withType(Optional<? extends List<GetLibraryItemsType>> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetLibraryItemsMediaContainer withFieldType(List<GetLibraryItemsFieldType> fieldType) {
        Utils.checkNotNull(fieldType, "fieldType");
        this.fieldType = Optional.ofNullable(fieldType);
        return this;
    }

    public GetLibraryItemsMediaContainer withFieldType(Optional<? extends List<GetLibraryItemsFieldType>> fieldType) {
        Utils.checkNotNull(fieldType, "fieldType");
        this.fieldType = fieldType;
        return this;
    }

    public GetLibraryItemsMediaContainer withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetLibraryItemsMediaContainer withTotalSize(int totalSize) {
        Utils.checkNotNull(totalSize, "totalSize");
        this.totalSize = totalSize;
        return this;
    }

    public GetLibraryItemsMediaContainer withOffset(int offset) {
        Utils.checkNotNull(offset, "offset");
        this.offset = offset;
        return this;
    }

    public GetLibraryItemsMediaContainer withContent(String content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
        return this;
    }

    public GetLibraryItemsMediaContainer withAllowSync(boolean allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = allowSync;
        return this;
    }

    public GetLibraryItemsMediaContainer withNocache(boolean nocache) {
        Utils.checkNotNull(nocache, "nocache");
        this.nocache = Optional.ofNullable(nocache);
        return this;
    }

    public GetLibraryItemsMediaContainer withNocache(Optional<Boolean> nocache) {
        Utils.checkNotNull(nocache, "nocache");
        this.nocache = nocache;
        return this;
    }

    public GetLibraryItemsMediaContainer withArt(String art) {
        Utils.checkNotNull(art, "art");
        this.art = art;
        return this;
    }

    public GetLibraryItemsMediaContainer withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    public GetLibraryItemsMediaContainer withLibrarySectionID(long librarySectionID) {
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        this.librarySectionID = librarySectionID;
        return this;
    }

    public GetLibraryItemsMediaContainer withLibrarySectionTitle(String librarySectionTitle) {
        Utils.checkNotNull(librarySectionTitle, "librarySectionTitle");
        this.librarySectionTitle = librarySectionTitle;
        return this;
    }

    public GetLibraryItemsMediaContainer withLibrarySectionUUID(String librarySectionUUID) {
        Utils.checkNotNull(librarySectionUUID, "librarySectionUUID");
        this.librarySectionUUID = librarySectionUUID;
        return this;
    }

    public GetLibraryItemsMediaContainer withMediaTagPrefix(String mediaTagPrefix) {
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        this.mediaTagPrefix = mediaTagPrefix;
        return this;
    }

    public GetLibraryItemsMediaContainer withMediaTagVersion(int mediaTagVersion) {
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        this.mediaTagVersion = mediaTagVersion;
        return this;
    }

    public GetLibraryItemsMediaContainer withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = thumb;
        return this;
    }

    public GetLibraryItemsMediaContainer withTitle1(String title1) {
        Utils.checkNotNull(title1, "title1");
        this.title1 = title1;
        return this;
    }

    public GetLibraryItemsMediaContainer withTitle2(String title2) {
        Utils.checkNotNull(title2, "title2");
        this.title2 = title2;
        return this;
    }

    public GetLibraryItemsMediaContainer withViewGroup(String viewGroup) {
        Utils.checkNotNull(viewGroup, "viewGroup");
        this.viewGroup = viewGroup;
        return this;
    }

    public GetLibraryItemsMediaContainer withViewMode(int viewMode) {
        Utils.checkNotNull(viewMode, "viewMode");
        this.viewMode = Optional.ofNullable(viewMode);
        return this;
    }

    public GetLibraryItemsMediaContainer withViewMode(Optional<Integer> viewMode) {
        Utils.checkNotNull(viewMode, "viewMode");
        this.viewMode = viewMode;
        return this;
    }

    public GetLibraryItemsMediaContainer withMixedParents(boolean mixedParents) {
        Utils.checkNotNull(mixedParents, "mixedParents");
        this.mixedParents = Optional.ofNullable(mixedParents);
        return this;
    }

    public GetLibraryItemsMediaContainer withMixedParents(Optional<Boolean> mixedParents) {
        Utils.checkNotNull(mixedParents, "mixedParents");
        this.mixedParents = mixedParents;
        return this;
    }

    public GetLibraryItemsMediaContainer withMetadata(List<GetLibraryItemsMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public GetLibraryItemsMediaContainer withMetadata(Optional<? extends List<GetLibraryItemsMetadata>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * The Meta object is only included in the response if the `includeMeta` parameter is set to `1`.
     * 
     */
    public GetLibraryItemsMediaContainer withMeta(GetLibraryItemsMeta meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = Optional.ofNullable(meta);
        return this;
    }

    /**
     * The Meta object is only included in the response if the `includeMeta` parameter is set to `1`.
     * 
     */
    public GetLibraryItemsMediaContainer withMeta(Optional<? extends GetLibraryItemsMeta> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = meta;
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
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.fieldType, other.fieldType) &&
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.totalSize, other.totalSize) &&
            Objects.deepEquals(this.offset, other.offset) &&
            Objects.deepEquals(this.content, other.content) &&
            Objects.deepEquals(this.allowSync, other.allowSync) &&
            Objects.deepEquals(this.nocache, other.nocache) &&
            Objects.deepEquals(this.art, other.art) &&
            Objects.deepEquals(this.identifier, other.identifier) &&
            Objects.deepEquals(this.librarySectionID, other.librarySectionID) &&
            Objects.deepEquals(this.librarySectionTitle, other.librarySectionTitle) &&
            Objects.deepEquals(this.librarySectionUUID, other.librarySectionUUID) &&
            Objects.deepEquals(this.mediaTagPrefix, other.mediaTagPrefix) &&
            Objects.deepEquals(this.mediaTagVersion, other.mediaTagVersion) &&
            Objects.deepEquals(this.thumb, other.thumb) &&
            Objects.deepEquals(this.title1, other.title1) &&
            Objects.deepEquals(this.title2, other.title2) &&
            Objects.deepEquals(this.viewGroup, other.viewGroup) &&
            Objects.deepEquals(this.viewMode, other.viewMode) &&
            Objects.deepEquals(this.mixedParents, other.mixedParents) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.meta, other.meta);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            fieldType,
            size,
            totalSize,
            offset,
            content,
            allowSync,
            nocache,
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
            metadata,
            meta);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLibraryItemsMediaContainer.class,
                "type", type,
                "fieldType", fieldType,
                "size", size,
                "totalSize", totalSize,
                "offset", offset,
                "content", content,
                "allowSync", allowSync,
                "nocache", nocache,
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
                "metadata", metadata,
                "meta", meta);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<GetLibraryItemsType>> type = Optional.empty();
 
        private Optional<? extends List<GetLibraryItemsFieldType>> fieldType = Optional.empty();
 
        private Integer size;
 
        private Integer totalSize;
 
        private Integer offset;
 
        private String content;
 
        private Boolean allowSync;
 
        private Optional<Boolean> nocache = Optional.empty();
 
        private String art;
 
        private String identifier;
 
        private Long librarySectionID;
 
        private String librarySectionTitle;
 
        private String librarySectionUUID;
 
        private String mediaTagPrefix;
 
        private Integer mediaTagVersion;
 
        private String thumb;
 
        private String title1;
 
        private String title2;
 
        private String viewGroup;
 
        private Optional<Integer> viewMode = Optional.empty();
 
        private Optional<Boolean> mixedParents = Optional.empty();
 
        private Optional<? extends List<GetLibraryItemsMetadata>> metadata = Optional.empty();
 
        private Optional<? extends GetLibraryItemsMeta> meta = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(List<GetLibraryItemsType> type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends List<GetLibraryItemsType>> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder fieldType(List<GetLibraryItemsFieldType> fieldType) {
            Utils.checkNotNull(fieldType, "fieldType");
            this.fieldType = Optional.ofNullable(fieldType);
            return this;
        }

        public Builder fieldType(Optional<? extends List<GetLibraryItemsFieldType>> fieldType) {
            Utils.checkNotNull(fieldType, "fieldType");
            this.fieldType = fieldType;
            return this;
        }

        public Builder size(int size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        public Builder totalSize(int totalSize) {
            Utils.checkNotNull(totalSize, "totalSize");
            this.totalSize = totalSize;
            return this;
        }

        public Builder offset(int offset) {
            Utils.checkNotNull(offset, "offset");
            this.offset = offset;
            return this;
        }

        public Builder content(String content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }

        public Builder allowSync(boolean allowSync) {
            Utils.checkNotNull(allowSync, "allowSync");
            this.allowSync = allowSync;
            return this;
        }

        public Builder nocache(boolean nocache) {
            Utils.checkNotNull(nocache, "nocache");
            this.nocache = Optional.ofNullable(nocache);
            return this;
        }

        public Builder nocache(Optional<Boolean> nocache) {
            Utils.checkNotNull(nocache, "nocache");
            this.nocache = nocache;
            return this;
        }

        public Builder art(String art) {
            Utils.checkNotNull(art, "art");
            this.art = art;
            return this;
        }

        public Builder identifier(String identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }

        public Builder librarySectionID(long librarySectionID) {
            Utils.checkNotNull(librarySectionID, "librarySectionID");
            this.librarySectionID = librarySectionID;
            return this;
        }

        public Builder librarySectionTitle(String librarySectionTitle) {
            Utils.checkNotNull(librarySectionTitle, "librarySectionTitle");
            this.librarySectionTitle = librarySectionTitle;
            return this;
        }

        public Builder librarySectionUUID(String librarySectionUUID) {
            Utils.checkNotNull(librarySectionUUID, "librarySectionUUID");
            this.librarySectionUUID = librarySectionUUID;
            return this;
        }

        public Builder mediaTagPrefix(String mediaTagPrefix) {
            Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
            this.mediaTagPrefix = mediaTagPrefix;
            return this;
        }

        public Builder mediaTagVersion(int mediaTagVersion) {
            Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
            this.mediaTagVersion = mediaTagVersion;
            return this;
        }

        public Builder thumb(String thumb) {
            Utils.checkNotNull(thumb, "thumb");
            this.thumb = thumb;
            return this;
        }

        public Builder title1(String title1) {
            Utils.checkNotNull(title1, "title1");
            this.title1 = title1;
            return this;
        }

        public Builder title2(String title2) {
            Utils.checkNotNull(title2, "title2");
            this.title2 = title2;
            return this;
        }

        public Builder viewGroup(String viewGroup) {
            Utils.checkNotNull(viewGroup, "viewGroup");
            this.viewGroup = viewGroup;
            return this;
        }

        public Builder viewMode(int viewMode) {
            Utils.checkNotNull(viewMode, "viewMode");
            this.viewMode = Optional.ofNullable(viewMode);
            return this;
        }

        public Builder viewMode(Optional<Integer> viewMode) {
            Utils.checkNotNull(viewMode, "viewMode");
            this.viewMode = viewMode;
            return this;
        }

        public Builder mixedParents(boolean mixedParents) {
            Utils.checkNotNull(mixedParents, "mixedParents");
            this.mixedParents = Optional.ofNullable(mixedParents);
            return this;
        }

        public Builder mixedParents(Optional<Boolean> mixedParents) {
            Utils.checkNotNull(mixedParents, "mixedParents");
            this.mixedParents = mixedParents;
            return this;
        }

        public Builder metadata(List<GetLibraryItemsMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends List<GetLibraryItemsMetadata>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * The Meta object is only included in the response if the `includeMeta` parameter is set to `1`.
         * 
         */
        public Builder meta(GetLibraryItemsMeta meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = Optional.ofNullable(meta);
            return this;
        }

        /**
         * The Meta object is only included in the response if the `includeMeta` parameter is set to `1`.
         * 
         */
        public Builder meta(Optional<? extends GetLibraryItemsMeta> meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = meta;
            return this;
        }
        
        public GetLibraryItemsMediaContainer build() {
            return new GetLibraryItemsMediaContainer(
                type,
                fieldType,
                size,
                totalSize,
                offset,
                content,
                allowSync,
                nocache,
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
                metadata,
                meta);
        }
    }
}

