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


public class GetMetadataChildrenDirectory {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("leafCount")
    private Optional<? extends Integer> leafCount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    private Optional<? extends String> thumb;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("viewedLeafCount")
    private Optional<? extends Integer> viewedLeafCount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<? extends String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<? extends String> title;

    public GetMetadataChildrenDirectory(
            @JsonProperty("leafCount") Optional<? extends Integer> leafCount,
            @JsonProperty("thumb") Optional<? extends String> thumb,
            @JsonProperty("viewedLeafCount") Optional<? extends Integer> viewedLeafCount,
            @JsonProperty("key") Optional<? extends String> key,
            @JsonProperty("title") Optional<? extends String> title) {
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

    public Optional<? extends Integer> leafCount() {
        return leafCount;
    }

    public Optional<? extends String> thumb() {
        return thumb;
    }

    public Optional<? extends Integer> viewedLeafCount() {
        return viewedLeafCount;
    }

    public Optional<? extends String> key() {
        return key;
    }

    public Optional<? extends String> title() {
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

    public GetMetadataChildrenDirectory withLeafCount(Optional<? extends Integer> leafCount) {
        Utils.checkNotNull(leafCount, "leafCount");
        this.leafCount = leafCount;
        return this;
    }

    public GetMetadataChildrenDirectory withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = Optional.ofNullable(thumb);
        return this;
    }

    public GetMetadataChildrenDirectory withThumb(Optional<? extends String> thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = thumb;
        return this;
    }

    public GetMetadataChildrenDirectory withViewedLeafCount(int viewedLeafCount) {
        Utils.checkNotNull(viewedLeafCount, "viewedLeafCount");
        this.viewedLeafCount = Optional.ofNullable(viewedLeafCount);
        return this;
    }

    public GetMetadataChildrenDirectory withViewedLeafCount(Optional<? extends Integer> viewedLeafCount) {
        Utils.checkNotNull(viewedLeafCount, "viewedLeafCount");
        this.viewedLeafCount = viewedLeafCount;
        return this;
    }

    public GetMetadataChildrenDirectory withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public GetMetadataChildrenDirectory withKey(Optional<? extends String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public GetMetadataChildrenDirectory withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public GetMetadataChildrenDirectory withTitle(Optional<? extends String> title) {
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
            java.util.Objects.deepEquals(this.leafCount, other.leafCount) &&
            java.util.Objects.deepEquals(this.thumb, other.thumb) &&
            java.util.Objects.deepEquals(this.viewedLeafCount, other.viewedLeafCount) &&
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.title, other.title);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
 
        private Optional<? extends Integer> leafCount = Optional.empty();
 
        private Optional<? extends String> thumb = Optional.empty();
 
        private Optional<? extends Integer> viewedLeafCount = Optional.empty();
 
        private Optional<? extends String> key = Optional.empty();
 
        private Optional<? extends String> title = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder leafCount(int leafCount) {
            Utils.checkNotNull(leafCount, "leafCount");
            this.leafCount = Optional.ofNullable(leafCount);
            return this;
        }

        public Builder leafCount(Optional<? extends Integer> leafCount) {
            Utils.checkNotNull(leafCount, "leafCount");
            this.leafCount = leafCount;
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

        public Builder viewedLeafCount(int viewedLeafCount) {
            Utils.checkNotNull(viewedLeafCount, "viewedLeafCount");
            this.viewedLeafCount = Optional.ofNullable(viewedLeafCount);
            return this;
        }

        public Builder viewedLeafCount(Optional<? extends Integer> viewedLeafCount) {
            Utils.checkNotNull(viewedLeafCount, "viewedLeafCount");
            this.viewedLeafCount = viewedLeafCount;
            return this;
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<? extends String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<? extends String> title) {
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

