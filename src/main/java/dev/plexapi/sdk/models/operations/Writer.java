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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class Writer {

    /**
     * Unique identifier for the writer.
     */
    @JsonProperty("id")
    private long id;

    /**
     * The filter string used to query this writer.
     */
    @JsonProperty("filter")
    private String filter;

    /**
     * The role of Writer
     */
    @JsonProperty("tag")
    private String tag;

    /**
     * A unique key associated with the writers tag, used for internal identification.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tagKey")
    private Optional<String> tagKey;

    @JsonCreator
    public Writer(
            @JsonProperty("id") long id,
            @JsonProperty("filter") String filter,
            @JsonProperty("tag") String tag,
            @JsonProperty("tagKey") Optional<String> tagKey) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(tag, "tag");
        Utils.checkNotNull(tagKey, "tagKey");
        this.id = id;
        this.filter = filter;
        this.tag = tag;
        this.tagKey = tagKey;
    }
    
    public Writer(
            long id,
            String filter,
            String tag) {
        this(id, filter, tag, Optional.empty());
    }

    /**
     * Unique identifier for the writer.
     */
    @JsonIgnore
    public long id() {
        return id;
    }

    /**
     * The filter string used to query this writer.
     */
    @JsonIgnore
    public String filter() {
        return filter;
    }

    /**
     * The role of Writer
     */
    @JsonIgnore
    public String tag() {
        return tag;
    }

    /**
     * A unique key associated with the writers tag, used for internal identification.
     */
    @JsonIgnore
    public Optional<String> tagKey() {
        return tagKey;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Unique identifier for the writer.
     */
    public Writer withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The filter string used to query this writer.
     */
    public Writer withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * The role of Writer
     */
    public Writer withTag(String tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = tag;
        return this;
    }

    /**
     * A unique key associated with the writers tag, used for internal identification.
     */
    public Writer withTagKey(String tagKey) {
        Utils.checkNotNull(tagKey, "tagKey");
        this.tagKey = Optional.ofNullable(tagKey);
        return this;
    }

    /**
     * A unique key associated with the writers tag, used for internal identification.
     */
    public Writer withTagKey(Optional<String> tagKey) {
        Utils.checkNotNull(tagKey, "tagKey");
        this.tagKey = tagKey;
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
        Writer other = (Writer) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.tag, other.tag) &&
            Objects.deepEquals(this.tagKey, other.tagKey);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            filter,
            tag,
            tagKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Writer.class,
                "id", id,
                "filter", filter,
                "tag", tag,
                "tagKey", tagKey);
    }
    
    public final static class Builder {
 
        private Long id;
 
        private String filter;
 
        private String tag;
 
        private Optional<String> tagKey = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for the writer.
         */
        public Builder id(long id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The filter string used to query this writer.
         */
        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        /**
         * The role of Writer
         */
        public Builder tag(String tag) {
            Utils.checkNotNull(tag, "tag");
            this.tag = tag;
            return this;
        }

        /**
         * A unique key associated with the writers tag, used for internal identification.
         */
        public Builder tagKey(String tagKey) {
            Utils.checkNotNull(tagKey, "tagKey");
            this.tagKey = Optional.ofNullable(tagKey);
            return this;
        }

        /**
         * A unique key associated with the writers tag, used for internal identification.
         */
        public Builder tagKey(Optional<String> tagKey) {
            Utils.checkNotNull(tagKey, "tagKey");
            this.tagKey = tagKey;
            return this;
        }
        
        public Writer build() {
            return new Writer(
                id,
                filter,
                tag,
                tagKey);
        }
    }
}
