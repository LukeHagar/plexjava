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

public class GetSearchLibraryMediaContainer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<Integer> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowSync")
    private Optional<Boolean> allowSync;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("art")
    private Optional<String> art;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifier")
    private Optional<String> identifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaTagPrefix")
    private Optional<String> mediaTagPrefix;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaTagVersion")
    private Optional<Integer> mediaTagVersion;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nocache")
    private Optional<Boolean> nocache;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    private Optional<String> thumb;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title1")
    private Optional<String> title1;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title2")
    private Optional<String> title2;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("viewGroup")
    private Optional<String> viewGroup;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("viewMode")
    private Optional<Integer> viewMode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Metadata")
    private Optional<? extends List<GetSearchLibraryMetadata>> metadata;

    @JsonCreator
    public GetSearchLibraryMediaContainer(
            @JsonProperty("size") Optional<Integer> size,
            @JsonProperty("allowSync") Optional<Boolean> allowSync,
            @JsonProperty("art") Optional<String> art,
            @JsonProperty("identifier") Optional<String> identifier,
            @JsonProperty("mediaTagPrefix") Optional<String> mediaTagPrefix,
            @JsonProperty("mediaTagVersion") Optional<Integer> mediaTagVersion,
            @JsonProperty("nocache") Optional<Boolean> nocache,
            @JsonProperty("thumb") Optional<String> thumb,
            @JsonProperty("title1") Optional<String> title1,
            @JsonProperty("title2") Optional<String> title2,
            @JsonProperty("viewGroup") Optional<String> viewGroup,
            @JsonProperty("viewMode") Optional<Integer> viewMode,
            @JsonProperty("Metadata") Optional<? extends List<GetSearchLibraryMetadata>> metadata) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(allowSync, "allowSync");
        Utils.checkNotNull(art, "art");
        Utils.checkNotNull(identifier, "identifier");
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        Utils.checkNotNull(nocache, "nocache");
        Utils.checkNotNull(thumb, "thumb");
        Utils.checkNotNull(title1, "title1");
        Utils.checkNotNull(title2, "title2");
        Utils.checkNotNull(viewGroup, "viewGroup");
        Utils.checkNotNull(viewMode, "viewMode");
        Utils.checkNotNull(metadata, "metadata");
        this.size = size;
        this.allowSync = allowSync;
        this.art = art;
        this.identifier = identifier;
        this.mediaTagPrefix = mediaTagPrefix;
        this.mediaTagVersion = mediaTagVersion;
        this.nocache = nocache;
        this.thumb = thumb;
        this.title1 = title1;
        this.title2 = title2;
        this.viewGroup = viewGroup;
        this.viewMode = viewMode;
        this.metadata = metadata;
    }
    
    public GetSearchLibraryMediaContainer() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Integer> size() {
        return size;
    }

    @JsonIgnore
    public Optional<Boolean> allowSync() {
        return allowSync;
    }

    @JsonIgnore
    public Optional<String> art() {
        return art;
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
    public Optional<Integer> mediaTagVersion() {
        return mediaTagVersion;
    }

    @JsonIgnore
    public Optional<Boolean> nocache() {
        return nocache;
    }

    @JsonIgnore
    public Optional<String> thumb() {
        return thumb;
    }

    @JsonIgnore
    public Optional<String> title1() {
        return title1;
    }

    @JsonIgnore
    public Optional<String> title2() {
        return title2;
    }

    @JsonIgnore
    public Optional<String> viewGroup() {
        return viewGroup;
    }

    @JsonIgnore
    public Optional<Integer> viewMode() {
        return viewMode;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetSearchLibraryMetadata>> metadata() {
        return (Optional<List<GetSearchLibraryMetadata>>) metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetSearchLibraryMediaContainer withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetSearchLibraryMediaContainer withSize(Optional<Integer> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetSearchLibraryMediaContainer withAllowSync(boolean allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = Optional.ofNullable(allowSync);
        return this;
    }

    public GetSearchLibraryMediaContainer withAllowSync(Optional<Boolean> allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = allowSync;
        return this;
    }

    public GetSearchLibraryMediaContainer withArt(String art) {
        Utils.checkNotNull(art, "art");
        this.art = Optional.ofNullable(art);
        return this;
    }

    public GetSearchLibraryMediaContainer withArt(Optional<String> art) {
        Utils.checkNotNull(art, "art");
        this.art = art;
        return this;
    }

    public GetSearchLibraryMediaContainer withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = Optional.ofNullable(identifier);
        return this;
    }

    public GetSearchLibraryMediaContainer withIdentifier(Optional<String> identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    public GetSearchLibraryMediaContainer withMediaTagPrefix(String mediaTagPrefix) {
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        this.mediaTagPrefix = Optional.ofNullable(mediaTagPrefix);
        return this;
    }

    public GetSearchLibraryMediaContainer withMediaTagPrefix(Optional<String> mediaTagPrefix) {
        Utils.checkNotNull(mediaTagPrefix, "mediaTagPrefix");
        this.mediaTagPrefix = mediaTagPrefix;
        return this;
    }

    public GetSearchLibraryMediaContainer withMediaTagVersion(int mediaTagVersion) {
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        this.mediaTagVersion = Optional.ofNullable(mediaTagVersion);
        return this;
    }

    public GetSearchLibraryMediaContainer withMediaTagVersion(Optional<Integer> mediaTagVersion) {
        Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
        this.mediaTagVersion = mediaTagVersion;
        return this;
    }

    public GetSearchLibraryMediaContainer withNocache(boolean nocache) {
        Utils.checkNotNull(nocache, "nocache");
        this.nocache = Optional.ofNullable(nocache);
        return this;
    }

    public GetSearchLibraryMediaContainer withNocache(Optional<Boolean> nocache) {
        Utils.checkNotNull(nocache, "nocache");
        this.nocache = nocache;
        return this;
    }

    public GetSearchLibraryMediaContainer withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = Optional.ofNullable(thumb);
        return this;
    }

    public GetSearchLibraryMediaContainer withThumb(Optional<String> thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = thumb;
        return this;
    }

    public GetSearchLibraryMediaContainer withTitle1(String title1) {
        Utils.checkNotNull(title1, "title1");
        this.title1 = Optional.ofNullable(title1);
        return this;
    }

    public GetSearchLibraryMediaContainer withTitle1(Optional<String> title1) {
        Utils.checkNotNull(title1, "title1");
        this.title1 = title1;
        return this;
    }

    public GetSearchLibraryMediaContainer withTitle2(String title2) {
        Utils.checkNotNull(title2, "title2");
        this.title2 = Optional.ofNullable(title2);
        return this;
    }

    public GetSearchLibraryMediaContainer withTitle2(Optional<String> title2) {
        Utils.checkNotNull(title2, "title2");
        this.title2 = title2;
        return this;
    }

    public GetSearchLibraryMediaContainer withViewGroup(String viewGroup) {
        Utils.checkNotNull(viewGroup, "viewGroup");
        this.viewGroup = Optional.ofNullable(viewGroup);
        return this;
    }

    public GetSearchLibraryMediaContainer withViewGroup(Optional<String> viewGroup) {
        Utils.checkNotNull(viewGroup, "viewGroup");
        this.viewGroup = viewGroup;
        return this;
    }

    public GetSearchLibraryMediaContainer withViewMode(int viewMode) {
        Utils.checkNotNull(viewMode, "viewMode");
        this.viewMode = Optional.ofNullable(viewMode);
        return this;
    }

    public GetSearchLibraryMediaContainer withViewMode(Optional<Integer> viewMode) {
        Utils.checkNotNull(viewMode, "viewMode");
        this.viewMode = viewMode;
        return this;
    }

    public GetSearchLibraryMediaContainer withMetadata(List<GetSearchLibraryMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public GetSearchLibraryMediaContainer withMetadata(Optional<? extends List<GetSearchLibraryMetadata>> metadata) {
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
        GetSearchLibraryMediaContainer other = (GetSearchLibraryMediaContainer) o;
        return 
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.allowSync, other.allowSync) &&
            Objects.deepEquals(this.art, other.art) &&
            Objects.deepEquals(this.identifier, other.identifier) &&
            Objects.deepEquals(this.mediaTagPrefix, other.mediaTagPrefix) &&
            Objects.deepEquals(this.mediaTagVersion, other.mediaTagVersion) &&
            Objects.deepEquals(this.nocache, other.nocache) &&
            Objects.deepEquals(this.thumb, other.thumb) &&
            Objects.deepEquals(this.title1, other.title1) &&
            Objects.deepEquals(this.title2, other.title2) &&
            Objects.deepEquals(this.viewGroup, other.viewGroup) &&
            Objects.deepEquals(this.viewMode, other.viewMode) &&
            Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            size,
            allowSync,
            art,
            identifier,
            mediaTagPrefix,
            mediaTagVersion,
            nocache,
            thumb,
            title1,
            title2,
            viewGroup,
            viewMode,
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSearchLibraryMediaContainer.class,
                "size", size,
                "allowSync", allowSync,
                "art", art,
                "identifier", identifier,
                "mediaTagPrefix", mediaTagPrefix,
                "mediaTagVersion", mediaTagVersion,
                "nocache", nocache,
                "thumb", thumb,
                "title1", title1,
                "title2", title2,
                "viewGroup", viewGroup,
                "viewMode", viewMode,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private Optional<Integer> size = Optional.empty();
 
        private Optional<Boolean> allowSync = Optional.empty();
 
        private Optional<String> art = Optional.empty();
 
        private Optional<String> identifier = Optional.empty();
 
        private Optional<String> mediaTagPrefix = Optional.empty();
 
        private Optional<Integer> mediaTagVersion = Optional.empty();
 
        private Optional<Boolean> nocache = Optional.empty();
 
        private Optional<String> thumb = Optional.empty();
 
        private Optional<String> title1 = Optional.empty();
 
        private Optional<String> title2 = Optional.empty();
 
        private Optional<String> viewGroup = Optional.empty();
 
        private Optional<Integer> viewMode = Optional.empty();
 
        private Optional<? extends List<GetSearchLibraryMetadata>> metadata = Optional.empty();
        
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

        public Builder allowSync(boolean allowSync) {
            Utils.checkNotNull(allowSync, "allowSync");
            this.allowSync = Optional.ofNullable(allowSync);
            return this;
        }

        public Builder allowSync(Optional<Boolean> allowSync) {
            Utils.checkNotNull(allowSync, "allowSync");
            this.allowSync = allowSync;
            return this;
        }

        public Builder art(String art) {
            Utils.checkNotNull(art, "art");
            this.art = Optional.ofNullable(art);
            return this;
        }

        public Builder art(Optional<String> art) {
            Utils.checkNotNull(art, "art");
            this.art = art;
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

        public Builder mediaTagVersion(int mediaTagVersion) {
            Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
            this.mediaTagVersion = Optional.ofNullable(mediaTagVersion);
            return this;
        }

        public Builder mediaTagVersion(Optional<Integer> mediaTagVersion) {
            Utils.checkNotNull(mediaTagVersion, "mediaTagVersion");
            this.mediaTagVersion = mediaTagVersion;
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

        public Builder thumb(String thumb) {
            Utils.checkNotNull(thumb, "thumb");
            this.thumb = Optional.ofNullable(thumb);
            return this;
        }

        public Builder thumb(Optional<String> thumb) {
            Utils.checkNotNull(thumb, "thumb");
            this.thumb = thumb;
            return this;
        }

        public Builder title1(String title1) {
            Utils.checkNotNull(title1, "title1");
            this.title1 = Optional.ofNullable(title1);
            return this;
        }

        public Builder title1(Optional<String> title1) {
            Utils.checkNotNull(title1, "title1");
            this.title1 = title1;
            return this;
        }

        public Builder title2(String title2) {
            Utils.checkNotNull(title2, "title2");
            this.title2 = Optional.ofNullable(title2);
            return this;
        }

        public Builder title2(Optional<String> title2) {
            Utils.checkNotNull(title2, "title2");
            this.title2 = title2;
            return this;
        }

        public Builder viewGroup(String viewGroup) {
            Utils.checkNotNull(viewGroup, "viewGroup");
            this.viewGroup = Optional.ofNullable(viewGroup);
            return this;
        }

        public Builder viewGroup(Optional<String> viewGroup) {
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

        public Builder metadata(List<GetSearchLibraryMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends List<GetSearchLibraryMetadata>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public GetSearchLibraryMediaContainer build() {
            return new GetSearchLibraryMediaContainer(
                size,
                allowSync,
                art,
                identifier,
                mediaTagPrefix,
                mediaTagVersion,
                nocache,
                thumb,
                title1,
                title2,
                viewGroup,
                viewMode,
                metadata);
        }
    }
}
