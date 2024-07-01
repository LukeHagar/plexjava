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

public class GetMetadataWriter {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends Integer> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    private Optional<? extends String> filter;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    private Optional<? extends String> tag;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tagKey")
    private Optional<? extends String> tagKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    private Optional<? extends String> thumb;

    @JsonCreator
    public GetMetadataWriter(
            @JsonProperty("id") Optional<? extends Integer> id,
            @JsonProperty("filter") Optional<? extends String> filter,
            @JsonProperty("tag") Optional<? extends String> tag,
            @JsonProperty("tagKey") Optional<? extends String> tagKey,
            @JsonProperty("thumb") Optional<? extends String> thumb) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(tag, "tag");
        Utils.checkNotNull(tagKey, "tagKey");
        Utils.checkNotNull(thumb, "thumb");
        this.id = id;
        this.filter = filter;
        this.tag = tag;
        this.tagKey = tagKey;
        this.thumb = thumb;
    }
    
    public GetMetadataWriter() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> id() {
        return (Optional<Integer>) id;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> filter() {
        return (Optional<String>) filter;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> tag() {
        return (Optional<String>) tag;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> tagKey() {
        return (Optional<String>) tagKey;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> thumb() {
        return (Optional<String>) thumb;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetMetadataWriter withId(int id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GetMetadataWriter withId(Optional<? extends Integer> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetMetadataWriter withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    public GetMetadataWriter withFilter(Optional<? extends String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    public GetMetadataWriter withTag(String tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = Optional.ofNullable(tag);
        return this;
    }

    public GetMetadataWriter withTag(Optional<? extends String> tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = tag;
        return this;
    }

    public GetMetadataWriter withTagKey(String tagKey) {
        Utils.checkNotNull(tagKey, "tagKey");
        this.tagKey = Optional.ofNullable(tagKey);
        return this;
    }

    public GetMetadataWriter withTagKey(Optional<? extends String> tagKey) {
        Utils.checkNotNull(tagKey, "tagKey");
        this.tagKey = tagKey;
        return this;
    }

    public GetMetadataWriter withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = Optional.ofNullable(thumb);
        return this;
    }

    public GetMetadataWriter withThumb(Optional<? extends String> thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = thumb;
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
        GetMetadataWriter other = (GetMetadataWriter) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.filter, other.filter) &&
            java.util.Objects.deepEquals(this.tag, other.tag) &&
            java.util.Objects.deepEquals(this.tagKey, other.tagKey) &&
            java.util.Objects.deepEquals(this.thumb, other.thumb);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            filter,
            tag,
            tagKey,
            thumb);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMetadataWriter.class,
                "id", id,
                "filter", filter,
                "tag", tag,
                "tagKey", tagKey,
                "thumb", thumb);
    }
    
    public final static class Builder {
 
        private Optional<? extends Integer> id = Optional.empty();
 
        private Optional<? extends String> filter = Optional.empty();
 
        private Optional<? extends String> tag = Optional.empty();
 
        private Optional<? extends String> tagKey = Optional.empty();
 
        private Optional<? extends String> thumb = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(int id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<? extends Integer> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        public Builder filter(Optional<? extends String> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        public Builder tag(String tag) {
            Utils.checkNotNull(tag, "tag");
            this.tag = Optional.ofNullable(tag);
            return this;
        }

        public Builder tag(Optional<? extends String> tag) {
            Utils.checkNotNull(tag, "tag");
            this.tag = tag;
            return this;
        }

        public Builder tagKey(String tagKey) {
            Utils.checkNotNull(tagKey, "tagKey");
            this.tagKey = Optional.ofNullable(tagKey);
            return this;
        }

        public Builder tagKey(Optional<? extends String> tagKey) {
            Utils.checkNotNull(tagKey, "tagKey");
            this.tagKey = tagKey;
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
        
        public GetMetadataWriter build() {
            return new GetMetadataWriter(
                id,
                filter,
                tag,
                tagKey,
                thumb);
        }
    }
}
