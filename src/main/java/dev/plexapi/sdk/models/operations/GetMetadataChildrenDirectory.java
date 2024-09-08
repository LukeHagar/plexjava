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
import java.util.Objects;
import java.util.Optional;


public class GetMetadataChildrenDirectory {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("leafCount")
    private Optional<Integer> leafCount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    private Optional<String> thumb;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("viewedLeafCount")
    private Optional<Integer> viewedLeafCount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonCreator
    public GetMetadataChildrenDirectory(
            @JsonProperty("leafCount") Optional<Integer> leafCount,
            @JsonProperty("thumb") Optional<String> thumb,
            @JsonProperty("viewedLeafCount") Optional<Integer> viewedLeafCount,
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("title") Optional<String> title) {
        Utils.checkNotNull(leafCount, "leafCount");
        Utils.checkNotNull(thumb, "thumb");
        Utils.checkNotNull(viewedLeafCount, "viewedLeafCount");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(title, "title");
        this.leafCount = leafCount;
        this.thumb = thumb;
        this.viewedLeafCount = viewedLeafCount;
        this.key = key;
        this.title = title;
    }
    
    public GetMetadataChildrenDirectory() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Integer> leafCount() {
        return leafCount;
    }

    @JsonIgnore
    public Optional<String> thumb() {
        return thumb;
    }

    @JsonIgnore
    public Optional<Integer> viewedLeafCount() {
        return viewedLeafCount;
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetMetadataChildrenDirectory withLeafCount(int leafCount) {
        Utils.checkNotNull(leafCount, "leafCount");
        this.leafCount = Optional.ofNullable(leafCount);
        return this;
    }

    public GetMetadataChildrenDirectory withLeafCount(Optional<Integer> leafCount) {
        Utils.checkNotNull(leafCount, "leafCount");
        this.leafCount = leafCount;
        return this;
    }

    public GetMetadataChildrenDirectory withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = Optional.ofNullable(thumb);
        return this;
    }

    public GetMetadataChildrenDirectory withThumb(Optional<String> thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = thumb;
        return this;
    }

    public GetMetadataChildrenDirectory withViewedLeafCount(int viewedLeafCount) {
        Utils.checkNotNull(viewedLeafCount, "viewedLeafCount");
        this.viewedLeafCount = Optional.ofNullable(viewedLeafCount);
        return this;
    }

    public GetMetadataChildrenDirectory withViewedLeafCount(Optional<Integer> viewedLeafCount) {
        Utils.checkNotNull(viewedLeafCount, "viewedLeafCount");
        this.viewedLeafCount = viewedLeafCount;
        return this;
    }

    public GetMetadataChildrenDirectory withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetMetadataChildrenDirectory withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetMetadataChildrenDirectory withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public GetMetadataChildrenDirectory withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
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
        GetMetadataChildrenDirectory other = (GetMetadataChildrenDirectory) o;
        return 
            Objects.deepEquals(this.leafCount, other.leafCount) &&
            Objects.deepEquals(this.thumb, other.thumb) &&
            Objects.deepEquals(this.viewedLeafCount, other.viewedLeafCount) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.title, other.title);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            leafCount,
            thumb,
            viewedLeafCount,
            key,
            title);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMetadataChildrenDirectory.class,
                "leafCount", leafCount,
                "thumb", thumb,
                "viewedLeafCount", viewedLeafCount,
                "key", key,
                "title", title);
    }
    
    public final static class Builder {
 
        private Optional<Integer> leafCount = Optional.empty();
 
        private Optional<String> thumb = Optional.empty();
 
        private Optional<Integer> viewedLeafCount = Optional.empty();
 
        private Optional<String> key = Optional.empty();
 
        private Optional<String> title = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder leafCount(int leafCount) {
            Utils.checkNotNull(leafCount, "leafCount");
            this.leafCount = Optional.ofNullable(leafCount);
            return this;
        }

        public Builder leafCount(Optional<Integer> leafCount) {
            Utils.checkNotNull(leafCount, "leafCount");
            this.leafCount = leafCount;
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

        public Builder viewedLeafCount(int viewedLeafCount) {
            Utils.checkNotNull(viewedLeafCount, "viewedLeafCount");
            this.viewedLeafCount = Optional.ofNullable(viewedLeafCount);
            return this;
        }

        public Builder viewedLeafCount(Optional<Integer> viewedLeafCount) {
            Utils.checkNotNull(viewedLeafCount, "viewedLeafCount");
            this.viewedLeafCount = viewedLeafCount;
            return this;
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }
        
        public GetMetadataChildrenDirectory build() {
            return new GetMetadataChildrenDirectory(
                leafCount,
                thumb,
                viewedLeafCount,
                key,
                title);
        }
    }
}
