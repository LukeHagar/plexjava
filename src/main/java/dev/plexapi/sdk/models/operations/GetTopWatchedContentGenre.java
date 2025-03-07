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

public class GetTopWatchedContentGenre {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<Integer> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    private Optional<String> filter;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    private Optional<String> tag;

    @JsonCreator
    public GetTopWatchedContentGenre(
            @JsonProperty("id") Optional<Integer> id,
            @JsonProperty("filter") Optional<String> filter,
            @JsonProperty("tag") Optional<String> tag) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(tag, "tag");
        this.id = id;
        this.filter = filter;
        this.tag = tag;
    }
    
    public GetTopWatchedContentGenre() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
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

    public final static Builder builder() {
        return new Builder();
    }

    public GetTopWatchedContentGenre withId(int id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GetTopWatchedContentGenre withId(Optional<Integer> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetTopWatchedContentGenre withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    public GetTopWatchedContentGenre withFilter(Optional<String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    public GetTopWatchedContentGenre withTag(String tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = Optional.ofNullable(tag);
        return this;
    }

    public GetTopWatchedContentGenre withTag(Optional<String> tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = tag;
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
        GetTopWatchedContentGenre other = (GetTopWatchedContentGenre) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.tag, other.tag);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            filter,
            tag);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTopWatchedContentGenre.class,
                "id", id,
                "filter", filter,
                "tag", tag);
    }
    
    public final static class Builder {
 
        private Optional<Integer> id = Optional.empty();
 
        private Optional<String> filter = Optional.empty();
 
        private Optional<String> tag = Optional.empty();  
        
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
        
        public GetTopWatchedContentGenre build() {
            return new GetTopWatchedContentGenre(
                id,
                filter,
                tag);
        }
    }
}

