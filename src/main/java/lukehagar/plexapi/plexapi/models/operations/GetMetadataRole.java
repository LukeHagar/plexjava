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


public class GetMetadataRole {

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
    @JsonProperty("role")
    private Optional<? extends String> role;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    private Optional<? extends String> thumb;

    public GetMetadataRole(
            @JsonProperty("id") Optional<? extends Integer> id,
            @JsonProperty("filter") Optional<? extends String> filter,
            @JsonProperty("tag") Optional<? extends String> tag,
            @JsonProperty("tagKey") Optional<? extends String> tagKey,
            @JsonProperty("role") Optional<? extends String> role,
            @JsonProperty("thumb") Optional<? extends String> thumb) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(tag, "tag");
        Utils.checkNotNull(tagKey, "tagKey");
        Utils.checkNotNull(role, "role");
        Utils.checkNotNull(thumb, "thumb");
        this.id = id;
        this.filter = filter;
        this.tag = tag;
        this.tagKey = tagKey;
        this.role = role;
        this.thumb = thumb;
    }

    public Optional<? extends Integer> id() {
        return id;
    }

    public Optional<? extends String> filter() {
        return filter;
    }

    public Optional<? extends String> tag() {
        return tag;
    }

    public Optional<? extends String> tagKey() {
        return tagKey;
    }

    public Optional<? extends String> role() {
        return role;
    }

    public Optional<? extends String> thumb() {
        return thumb;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetMetadataRole withId(int id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GetMetadataRole withId(Optional<? extends Integer> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetMetadataRole withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    public GetMetadataRole withFilter(Optional<? extends String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    public GetMetadataRole withTag(String tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = Optional.ofNullable(tag);
        return this;
    }

    public GetMetadataRole withTag(Optional<? extends String> tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = tag;
        return this;
    }

    public GetMetadataRole withTagKey(String tagKey) {
        Utils.checkNotNull(tagKey, "tagKey");
        this.tagKey = Optional.ofNullable(tagKey);
        return this;
    }

    public GetMetadataRole withTagKey(Optional<? extends String> tagKey) {
        Utils.checkNotNull(tagKey, "tagKey");
        this.tagKey = tagKey;
        return this;
    }

    public GetMetadataRole withRole(String role) {
        Utils.checkNotNull(role, "role");
        this.role = Optional.ofNullable(role);
        return this;
    }

    public GetMetadataRole withRole(Optional<? extends String> role) {
        Utils.checkNotNull(role, "role");
        this.role = role;
        return this;
    }

    public GetMetadataRole withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = Optional.ofNullable(thumb);
        return this;
    }

    public GetMetadataRole withThumb(Optional<? extends String> thumb) {
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
        GetMetadataRole other = (GetMetadataRole) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.filter, other.filter) &&
            java.util.Objects.deepEquals(this.tag, other.tag) &&
            java.util.Objects.deepEquals(this.tagKey, other.tagKey) &&
            java.util.Objects.deepEquals(this.role, other.role) &&
            java.util.Objects.deepEquals(this.thumb, other.thumb);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            filter,
            tag,
            tagKey,
            role,
            thumb);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMetadataRole.class,
                "id", id,
                "filter", filter,
                "tag", tag,
                "tagKey", tagKey,
                "role", role,
                "thumb", thumb);
    }
    
    public final static class Builder {
 
        private Optional<? extends Integer> id = Optional.empty();
 
        private Optional<? extends String> filter = Optional.empty();
 
        private Optional<? extends String> tag = Optional.empty();
 
        private Optional<? extends String> tagKey = Optional.empty();
 
        private Optional<? extends String> role = Optional.empty();
 
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

        public Builder role(String role) {
            Utils.checkNotNull(role, "role");
            this.role = Optional.ofNullable(role);
            return this;
        }

        public Builder role(Optional<? extends String> role) {
            Utils.checkNotNull(role, "role");
            this.role = role;
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
        
        public GetMetadataRole build() {
            return new GetMetadataRole(
                id,
                filter,
                tag,
                tagKey,
                role,
                thumb);
        }
    }
}

