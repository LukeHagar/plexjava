/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.utils.LazySingletonValue;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class GetRecentlyAddedRequest {

    /**
     * The content directory ID.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=contentDirectoryID")
    private long contentDirectoryID;

    /**
     * Comma-separated list of pinned content directory IDs.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pinnedContentDirectoryID")
    private Optional<String> pinnedContentDirectoryID;

    /**
     * The library section ID for filtering content.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sectionID")
    private Optional<Long> sectionID;

    /**
     * The type of media to retrieve.
     * 1 = movie
     * 2 = show
     * 3 = season
     * 4 = episode
     * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=type")
    private Type type;

    /**
     * Adds the Meta object to the response
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeMeta")
    private Optional<? extends IncludeMeta> includeMeta;

    /**
     * The index of the first item to return. If not specified, the first item will be returned.
     * If the number of items exceeds the limit, the response will be paginated.
     * By default this is 0
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=X-Plex-Container-Start")
    private Optional<Integer> xPlexContainerStart;

    /**
     * The number of items to return. If not specified, all items will be returned.
     * If the number of items exceeds the limit, the response will be paginated.
     * By default this is 50
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=X-Plex-Container-Size")
    private Optional<Integer> xPlexContainerSize;

    @JsonCreator
    public GetRecentlyAddedRequest(
            long contentDirectoryID,
            Optional<String> pinnedContentDirectoryID,
            Optional<Long> sectionID,
            Type type,
            Optional<? extends IncludeMeta> includeMeta,
            Optional<Integer> xPlexContainerStart,
            Optional<Integer> xPlexContainerSize) {
        Utils.checkNotNull(contentDirectoryID, "contentDirectoryID");
        Utils.checkNotNull(pinnedContentDirectoryID, "pinnedContentDirectoryID");
        Utils.checkNotNull(sectionID, "sectionID");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(includeMeta, "includeMeta");
        Utils.checkNotNull(xPlexContainerStart, "xPlexContainerStart");
        Utils.checkNotNull(xPlexContainerSize, "xPlexContainerSize");
        this.contentDirectoryID = contentDirectoryID;
        this.pinnedContentDirectoryID = pinnedContentDirectoryID;
        this.sectionID = sectionID;
        this.type = type;
        this.includeMeta = includeMeta;
        this.xPlexContainerStart = xPlexContainerStart;
        this.xPlexContainerSize = xPlexContainerSize;
    }
    
    public GetRecentlyAddedRequest(
            long contentDirectoryID,
            Type type) {
        this(contentDirectoryID, Optional.empty(), Optional.empty(), type, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The content directory ID.
     */
    @JsonIgnore
    public long contentDirectoryID() {
        return contentDirectoryID;
    }

    /**
     * Comma-separated list of pinned content directory IDs.
     */
    @JsonIgnore
    public Optional<String> pinnedContentDirectoryID() {
        return pinnedContentDirectoryID;
    }

    /**
     * The library section ID for filtering content.
     */
    @JsonIgnore
    public Optional<Long> sectionID() {
        return sectionID;
    }

    /**
     * The type of media to retrieve.
     * 1 = movie
     * 2 = show
     * 3 = season
     * 4 = episode
     * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
     * 
     */
    @JsonIgnore
    public Type type() {
        return type;
    }

    /**
     * Adds the Meta object to the response
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<IncludeMeta> includeMeta() {
        return (Optional<IncludeMeta>) includeMeta;
    }

    /**
     * The index of the first item to return. If not specified, the first item will be returned.
     * If the number of items exceeds the limit, the response will be paginated.
     * By default this is 0
     * 
     */
    @JsonIgnore
    public Optional<Integer> xPlexContainerStart() {
        return xPlexContainerStart;
    }

    /**
     * The number of items to return. If not specified, all items will be returned.
     * If the number of items exceeds the limit, the response will be paginated.
     * By default this is 50
     * 
     */
    @JsonIgnore
    public Optional<Integer> xPlexContainerSize() {
        return xPlexContainerSize;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The content directory ID.
     */
    public GetRecentlyAddedRequest withContentDirectoryID(long contentDirectoryID) {
        Utils.checkNotNull(contentDirectoryID, "contentDirectoryID");
        this.contentDirectoryID = contentDirectoryID;
        return this;
    }

    /**
     * Comma-separated list of pinned content directory IDs.
     */
    public GetRecentlyAddedRequest withPinnedContentDirectoryID(String pinnedContentDirectoryID) {
        Utils.checkNotNull(pinnedContentDirectoryID, "pinnedContentDirectoryID");
        this.pinnedContentDirectoryID = Optional.ofNullable(pinnedContentDirectoryID);
        return this;
    }

    /**
     * Comma-separated list of pinned content directory IDs.
     */
    public GetRecentlyAddedRequest withPinnedContentDirectoryID(Optional<String> pinnedContentDirectoryID) {
        Utils.checkNotNull(pinnedContentDirectoryID, "pinnedContentDirectoryID");
        this.pinnedContentDirectoryID = pinnedContentDirectoryID;
        return this;
    }

    /**
     * The library section ID for filtering content.
     */
    public GetRecentlyAddedRequest withSectionID(long sectionID) {
        Utils.checkNotNull(sectionID, "sectionID");
        this.sectionID = Optional.ofNullable(sectionID);
        return this;
    }

    /**
     * The library section ID for filtering content.
     */
    public GetRecentlyAddedRequest withSectionID(Optional<Long> sectionID) {
        Utils.checkNotNull(sectionID, "sectionID");
        this.sectionID = sectionID;
        return this;
    }

    /**
     * The type of media to retrieve.
     * 1 = movie
     * 2 = show
     * 3 = season
     * 4 = episode
     * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
     * 
     */
    public GetRecentlyAddedRequest withType(Type type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Adds the Meta object to the response
     * 
     */
    public GetRecentlyAddedRequest withIncludeMeta(IncludeMeta includeMeta) {
        Utils.checkNotNull(includeMeta, "includeMeta");
        this.includeMeta = Optional.ofNullable(includeMeta);
        return this;
    }

    /**
     * Adds the Meta object to the response
     * 
     */
    public GetRecentlyAddedRequest withIncludeMeta(Optional<? extends IncludeMeta> includeMeta) {
        Utils.checkNotNull(includeMeta, "includeMeta");
        this.includeMeta = includeMeta;
        return this;
    }

    /**
     * The index of the first item to return. If not specified, the first item will be returned.
     * If the number of items exceeds the limit, the response will be paginated.
     * By default this is 0
     * 
     */
    public GetRecentlyAddedRequest withXPlexContainerStart(int xPlexContainerStart) {
        Utils.checkNotNull(xPlexContainerStart, "xPlexContainerStart");
        this.xPlexContainerStart = Optional.ofNullable(xPlexContainerStart);
        return this;
    }

    /**
     * The index of the first item to return. If not specified, the first item will be returned.
     * If the number of items exceeds the limit, the response will be paginated.
     * By default this is 0
     * 
     */
    public GetRecentlyAddedRequest withXPlexContainerStart(Optional<Integer> xPlexContainerStart) {
        Utils.checkNotNull(xPlexContainerStart, "xPlexContainerStart");
        this.xPlexContainerStart = xPlexContainerStart;
        return this;
    }

    /**
     * The number of items to return. If not specified, all items will be returned.
     * If the number of items exceeds the limit, the response will be paginated.
     * By default this is 50
     * 
     */
    public GetRecentlyAddedRequest withXPlexContainerSize(int xPlexContainerSize) {
        Utils.checkNotNull(xPlexContainerSize, "xPlexContainerSize");
        this.xPlexContainerSize = Optional.ofNullable(xPlexContainerSize);
        return this;
    }

    /**
     * The number of items to return. If not specified, all items will be returned.
     * If the number of items exceeds the limit, the response will be paginated.
     * By default this is 50
     * 
     */
    public GetRecentlyAddedRequest withXPlexContainerSize(Optional<Integer> xPlexContainerSize) {
        Utils.checkNotNull(xPlexContainerSize, "xPlexContainerSize");
        this.xPlexContainerSize = xPlexContainerSize;
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
        GetRecentlyAddedRequest other = (GetRecentlyAddedRequest) o;
        return 
            Objects.deepEquals(this.contentDirectoryID, other.contentDirectoryID) &&
            Objects.deepEquals(this.pinnedContentDirectoryID, other.pinnedContentDirectoryID) &&
            Objects.deepEquals(this.sectionID, other.sectionID) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.includeMeta, other.includeMeta) &&
            Objects.deepEquals(this.xPlexContainerStart, other.xPlexContainerStart) &&
            Objects.deepEquals(this.xPlexContainerSize, other.xPlexContainerSize);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentDirectoryID,
            pinnedContentDirectoryID,
            sectionID,
            type,
            includeMeta,
            xPlexContainerStart,
            xPlexContainerSize);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetRecentlyAddedRequest.class,
                "contentDirectoryID", contentDirectoryID,
                "pinnedContentDirectoryID", pinnedContentDirectoryID,
                "sectionID", sectionID,
                "type", type,
                "includeMeta", includeMeta,
                "xPlexContainerStart", xPlexContainerStart,
                "xPlexContainerSize", xPlexContainerSize);
    }
    
    public final static class Builder {
 
        private Long contentDirectoryID;
 
        private Optional<String> pinnedContentDirectoryID = Optional.empty();
 
        private Optional<Long> sectionID = Optional.empty();
 
        private Type type;
 
        private Optional<? extends IncludeMeta> includeMeta;
 
        private Optional<Integer> xPlexContainerStart;
 
        private Optional<Integer> xPlexContainerSize;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The content directory ID.
         */
        public Builder contentDirectoryID(long contentDirectoryID) {
            Utils.checkNotNull(contentDirectoryID, "contentDirectoryID");
            this.contentDirectoryID = contentDirectoryID;
            return this;
        }

        /**
         * Comma-separated list of pinned content directory IDs.
         */
        public Builder pinnedContentDirectoryID(String pinnedContentDirectoryID) {
            Utils.checkNotNull(pinnedContentDirectoryID, "pinnedContentDirectoryID");
            this.pinnedContentDirectoryID = Optional.ofNullable(pinnedContentDirectoryID);
            return this;
        }

        /**
         * Comma-separated list of pinned content directory IDs.
         */
        public Builder pinnedContentDirectoryID(Optional<String> pinnedContentDirectoryID) {
            Utils.checkNotNull(pinnedContentDirectoryID, "pinnedContentDirectoryID");
            this.pinnedContentDirectoryID = pinnedContentDirectoryID;
            return this;
        }

        /**
         * The library section ID for filtering content.
         */
        public Builder sectionID(long sectionID) {
            Utils.checkNotNull(sectionID, "sectionID");
            this.sectionID = Optional.ofNullable(sectionID);
            return this;
        }

        /**
         * The library section ID for filtering content.
         */
        public Builder sectionID(Optional<Long> sectionID) {
            Utils.checkNotNull(sectionID, "sectionID");
            this.sectionID = sectionID;
            return this;
        }

        /**
         * The type of media to retrieve.
         * 1 = movie
         * 2 = show
         * 3 = season
         * 4 = episode
         * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
         * 
         */
        public Builder type(Type type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Adds the Meta object to the response
         * 
         */
        public Builder includeMeta(IncludeMeta includeMeta) {
            Utils.checkNotNull(includeMeta, "includeMeta");
            this.includeMeta = Optional.ofNullable(includeMeta);
            return this;
        }

        /**
         * Adds the Meta object to the response
         * 
         */
        public Builder includeMeta(Optional<? extends IncludeMeta> includeMeta) {
            Utils.checkNotNull(includeMeta, "includeMeta");
            this.includeMeta = includeMeta;
            return this;
        }

        /**
         * The index of the first item to return. If not specified, the first item will be returned.
         * If the number of items exceeds the limit, the response will be paginated.
         * By default this is 0
         * 
         */
        public Builder xPlexContainerStart(int xPlexContainerStart) {
            Utils.checkNotNull(xPlexContainerStart, "xPlexContainerStart");
            this.xPlexContainerStart = Optional.ofNullable(xPlexContainerStart);
            return this;
        }

        /**
         * The index of the first item to return. If not specified, the first item will be returned.
         * If the number of items exceeds the limit, the response will be paginated.
         * By default this is 0
         * 
         */
        public Builder xPlexContainerStart(Optional<Integer> xPlexContainerStart) {
            Utils.checkNotNull(xPlexContainerStart, "xPlexContainerStart");
            this.xPlexContainerStart = xPlexContainerStart;
            return this;
        }

        /**
         * The number of items to return. If not specified, all items will be returned.
         * If the number of items exceeds the limit, the response will be paginated.
         * By default this is 50
         * 
         */
        public Builder xPlexContainerSize(int xPlexContainerSize) {
            Utils.checkNotNull(xPlexContainerSize, "xPlexContainerSize");
            this.xPlexContainerSize = Optional.ofNullable(xPlexContainerSize);
            return this;
        }

        /**
         * The number of items to return. If not specified, all items will be returned.
         * If the number of items exceeds the limit, the response will be paginated.
         * By default this is 50
         * 
         */
        public Builder xPlexContainerSize(Optional<Integer> xPlexContainerSize) {
            Utils.checkNotNull(xPlexContainerSize, "xPlexContainerSize");
            this.xPlexContainerSize = xPlexContainerSize;
            return this;
        }
        
        public GetRecentlyAddedRequest build() {
            if (includeMeta == null) {
                includeMeta = _SINGLETON_VALUE_IncludeMeta.value();
            }
            if (xPlexContainerStart == null) {
                xPlexContainerStart = _SINGLETON_VALUE_XPlexContainerStart.value();
            }
            if (xPlexContainerSize == null) {
                xPlexContainerSize = _SINGLETON_VALUE_XPlexContainerSize.value();
            }            return new GetRecentlyAddedRequest(
                contentDirectoryID,
                pinnedContentDirectoryID,
                sectionID,
                type,
                includeMeta,
                xPlexContainerStart,
                xPlexContainerSize);
        }

        private static final LazySingletonValue<Optional<? extends IncludeMeta>> _SINGLETON_VALUE_IncludeMeta =
                new LazySingletonValue<>(
                        "includeMeta",
                        "0",
                        new TypeReference<Optional<? extends IncludeMeta>>() {});

        private static final LazySingletonValue<Optional<Integer>> _SINGLETON_VALUE_XPlexContainerStart =
                new LazySingletonValue<>(
                        "X-Plex-Container-Start",
                        "0",
                        new TypeReference<Optional<Integer>>() {});

        private static final LazySingletonValue<Optional<Integer>> _SINGLETON_VALUE_XPlexContainerSize =
                new LazySingletonValue<>(
                        "X-Plex-Container-Size",
                        "50",
                        new TypeReference<Optional<Integer>>() {});
    }
}

