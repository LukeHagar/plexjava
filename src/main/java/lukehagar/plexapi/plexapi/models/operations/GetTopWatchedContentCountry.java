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

public class GetTopWatchedContentCountry {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends Integer> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    private Optional<? extends String> filter;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    private Optional<? extends String> tag;

    @JsonCreator
    public GetTopWatchedContentCountry(
            @JsonProperty("id") Optional<? extends Integer> id,
            @JsonProperty("filter") Optional<? extends String> filter,
            @JsonProperty("tag") Optional<? extends String> tag) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(tag, "tag");
        this.id = id;
        this.filter = filter;
        this.tag = tag;
    }
    
    public GetTopWatchedContentCountry() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
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

    public final static Builder builder() {
        return new Builder();
    }

    public GetTopWatchedContentCountry withId(int id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GetTopWatchedContentCountry withId(Optional<? extends Integer> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetTopWatchedContentCountry withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    public GetTopWatchedContentCountry withFilter(Optional<? extends String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    public GetTopWatchedContentCountry withTag(String tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = Optional.ofNullable(tag);
        return this;
    }

    public GetTopWatchedContentCountry withTag(Optional<? extends String> tag) {
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
        GetTopWatchedContentCountry other = (GetTopWatchedContentCountry) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.filter, other.filter) &&
            java.util.Objects.deepEquals(this.tag, other.tag);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            filter,
            tag);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTopWatchedContentCountry.class,
                "id", id,
                "filter", filter,
                "tag", tag);
    }
    
    public final static class Builder {
 
        private Optional<? extends Integer> id = Optional.empty();
 
        private Optional<? extends String> filter = Optional.empty();
 
        private Optional<? extends String> tag = Optional.empty();  
        
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
        
        public GetTopWatchedContentCountry build() {
            return new GetTopWatchedContentCountry(
                id,
                filter,
                tag);
        }
    }
}

