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
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class Guids {

    /**
     * The unique identifier for the Guid. Can be imdb://tt0286347, tmdb://1763, tvdb://2337
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonCreator
    public Guids(
            @JsonProperty("id") Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
    }
    
    public Guids() {
        this(Optional.empty());
    }

    /**
     * The unique identifier for the Guid. Can be imdb://tt0286347, tmdb://1763, tvdb://2337
     * 
     */
    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identifier for the Guid. Can be imdb://tt0286347, tmdb://1763, tvdb://2337
     * 
     */
    public Guids withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The unique identifier for the Guid. Can be imdb://tt0286347, tmdb://1763, tvdb://2337
     * 
     */
    public Guids withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        Guids other = (Guids) o;
        return 
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Guids.class,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identifier for the Guid. Can be imdb://tt0286347, tmdb://1763, tvdb://2337
         * 
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * The unique identifier for the Guid. Can be imdb://tt0286347, tmdb://1763, tvdb://2337
         * 
         */
        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public Guids build() {
            return new Guids(
                id);
        }
    }
}

