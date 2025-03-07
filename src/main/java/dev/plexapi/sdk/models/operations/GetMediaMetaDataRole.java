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

public class GetMediaMetaDataRole {

    /**
     * The unique role identifier.
     */
    @JsonProperty("id")
    private long id;

    /**
     * The filter string for the role.
     */
    @JsonProperty("filter")
    private String filter;

    /**
     * The actor's name.
     */
    @JsonProperty("tag")
    private String tag;

    /**
     * A key associated with the actor tag.
     */
    @JsonProperty("tagKey")
    private String tagKey;

    /**
     * The character name or role.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    private Optional<String> role;

    /**
     * URL for the role thumbnail image.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    private Optional<String> thumb;

    @JsonCreator
    public GetMediaMetaDataRole(
            @JsonProperty("id") long id,
            @JsonProperty("filter") String filter,
            @JsonProperty("tag") String tag,
            @JsonProperty("tagKey") String tagKey,
            @JsonProperty("role") Optional<String> role,
            @JsonProperty("thumb") Optional<String> thumb) {
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
    
    public GetMediaMetaDataRole(
            long id,
            String filter,
            String tag,
            String tagKey) {
        this(id, filter, tag, tagKey, Optional.empty(), Optional.empty());
    }

    /**
     * The unique role identifier.
     */
    @JsonIgnore
    public long id() {
        return id;
    }

    /**
     * The filter string for the role.
     */
    @JsonIgnore
    public String filter() {
        return filter;
    }

    /**
     * The actor's name.
     */
    @JsonIgnore
    public String tag() {
        return tag;
    }

    /**
     * A key associated with the actor tag.
     */
    @JsonIgnore
    public String tagKey() {
        return tagKey;
    }

    /**
     * The character name or role.
     */
    @JsonIgnore
    public Optional<String> role() {
        return role;
    }

    /**
     * URL for the role thumbnail image.
     */
    @JsonIgnore
    public Optional<String> thumb() {
        return thumb;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique role identifier.
     */
    public GetMediaMetaDataRole withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The filter string for the role.
     */
    public GetMediaMetaDataRole withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * The actor's name.
     */
    public GetMediaMetaDataRole withTag(String tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = tag;
        return this;
    }

    /**
     * A key associated with the actor tag.
     */
    public GetMediaMetaDataRole withTagKey(String tagKey) {
        Utils.checkNotNull(tagKey, "tagKey");
        this.tagKey = tagKey;
        return this;
    }

    /**
     * The character name or role.
     */
    public GetMediaMetaDataRole withRole(String role) {
        Utils.checkNotNull(role, "role");
        this.role = Optional.ofNullable(role);
        return this;
    }

    /**
     * The character name or role.
     */
    public GetMediaMetaDataRole withRole(Optional<String> role) {
        Utils.checkNotNull(role, "role");
        this.role = role;
        return this;
    }

    /**
     * URL for the role thumbnail image.
     */
    public GetMediaMetaDataRole withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = Optional.ofNullable(thumb);
        return this;
    }

    /**
     * URL for the role thumbnail image.
     */
    public GetMediaMetaDataRole withThumb(Optional<String> thumb) {
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
        GetMediaMetaDataRole other = (GetMediaMetaDataRole) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.tag, other.tag) &&
            Objects.deepEquals(this.tagKey, other.tagKey) &&
            Objects.deepEquals(this.role, other.role) &&
            Objects.deepEquals(this.thumb, other.thumb);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            filter,
            tag,
            tagKey,
            role,
            thumb);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMediaMetaDataRole.class,
                "id", id,
                "filter", filter,
                "tag", tag,
                "tagKey", tagKey,
                "role", role,
                "thumb", thumb);
    }
    
    public final static class Builder {
 
        private Long id;
 
        private String filter;
 
        private String tag;
 
        private String tagKey;
 
        private Optional<String> role = Optional.empty();
 
        private Optional<String> thumb = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique role identifier.
         */
        public Builder id(long id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The filter string for the role.
         */
        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        /**
         * The actor's name.
         */
        public Builder tag(String tag) {
            Utils.checkNotNull(tag, "tag");
            this.tag = tag;
            return this;
        }

        /**
         * A key associated with the actor tag.
         */
        public Builder tagKey(String tagKey) {
            Utils.checkNotNull(tagKey, "tagKey");
            this.tagKey = tagKey;
            return this;
        }

        /**
         * The character name or role.
         */
        public Builder role(String role) {
            Utils.checkNotNull(role, "role");
            this.role = Optional.ofNullable(role);
            return this;
        }

        /**
         * The character name or role.
         */
        public Builder role(Optional<String> role) {
            Utils.checkNotNull(role, "role");
            this.role = role;
            return this;
        }

        /**
         * URL for the role thumbnail image.
         */
        public Builder thumb(String thumb) {
            Utils.checkNotNull(thumb, "thumb");
            this.thumb = Optional.ofNullable(thumb);
            return this;
        }

        /**
         * URL for the role thumbnail image.
         */
        public Builder thumb(Optional<String> thumb) {
            Utils.checkNotNull(thumb, "thumb");
            this.thumb = thumb;
            return this;
        }
        
        public GetMediaMetaDataRole build() {
            return new GetMediaMetaDataRole(
                id,
                filter,
                tag,
                tagKey,
                role,
                thumb);
        }
    }
}

