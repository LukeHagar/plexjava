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


public class Producer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<Integer> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    private Optional<String> filter;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    private Optional<String> tag;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tagKey")
    private Optional<String> tagKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    private Optional<String> thumb;

    @JsonCreator
    public Producer(
            @JsonProperty("id") Optional<Integer> id,
            @JsonProperty("filter") Optional<String> filter,
            @JsonProperty("tag") Optional<String> tag,
            @JsonProperty("tagKey") Optional<String> tagKey,
            @JsonProperty("thumb") Optional<String> thumb) {
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
    
    public Producer() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Integer> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> filter() {
        return filter;
    }

    @JsonIgnore
    public Optional<String> tag() {
        return tag;
    }

    @JsonIgnore
    public Optional<String> tagKey() {
        return tagKey;
    }

    @JsonIgnore
    public Optional<String> thumb() {
        return thumb;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Producer withId(int id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public Producer withId(Optional<Integer> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Producer withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    public Producer withFilter(Optional<String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    public Producer withTag(String tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = Optional.ofNullable(tag);
        return this;
    }

    public Producer withTag(Optional<String> tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = tag;
        return this;
    }

    public Producer withTagKey(String tagKey) {
        Utils.checkNotNull(tagKey, "tagKey");
        this.tagKey = Optional.ofNullable(tagKey);
        return this;
    }

    public Producer withTagKey(Optional<String> tagKey) {
        Utils.checkNotNull(tagKey, "tagKey");
        this.tagKey = tagKey;
        return this;
    }

    public Producer withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = Optional.ofNullable(thumb);
        return this;
    }

    public Producer withThumb(Optional<String> thumb) {
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
        Producer other = (Producer) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.tag, other.tag) &&
            Objects.deepEquals(this.tagKey, other.tagKey) &&
            Objects.deepEquals(this.thumb, other.thumb);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            filter,
            tag,
            tagKey,
            thumb);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Producer.class,
                "id", id,
                "filter", filter,
                "tag", tag,
                "tagKey", tagKey,
                "thumb", thumb);
    }
    
    public final static class Builder {
 
        private Optional<Integer> id = Optional.empty();
 
        private Optional<String> filter = Optional.empty();
 
        private Optional<String> tag = Optional.empty();
 
        private Optional<String> tagKey = Optional.empty();
 
        private Optional<String> thumb = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(int id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<Integer> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        public Builder filter(Optional<String> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        public Builder tag(String tag) {
            Utils.checkNotNull(tag, "tag");
            this.tag = Optional.ofNullable(tag);
            return this;
        }

        public Builder tag(Optional<String> tag) {
            Utils.checkNotNull(tag, "tag");
            this.tag = tag;
            return this;
        }

        public Builder tagKey(String tagKey) {
            Utils.checkNotNull(tagKey, "tagKey");
            this.tagKey = Optional.ofNullable(tagKey);
            return this;
        }

        public Builder tagKey(Optional<String> tagKey) {
            Utils.checkNotNull(tagKey, "tagKey");
            this.tagKey = tagKey;
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
        
        public Producer build() {
            return new Producer(
                id,
                filter,
                tag,
                tagKey,
                thumb);
        }
    }
}
