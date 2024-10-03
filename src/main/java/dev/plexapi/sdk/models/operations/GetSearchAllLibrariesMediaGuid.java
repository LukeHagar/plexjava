/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetSearchAllLibrariesMediaGuid {

    /**
     * Can be one of the following formats:
     * imdb://tt13015952, tmdb://2434012, tvdb://7945991
     * 
     */
    @JsonProperty("id")
    private String id;

    @JsonCreator
    public GetSearchAllLibrariesMediaGuid(
            @JsonProperty("id") String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
    }

    /**
     * Can be one of the following formats:
     * imdb://tt13015952, tmdb://2434012, tvdb://7945991
     * 
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Can be one of the following formats:
     * imdb://tt13015952, tmdb://2434012, tvdb://7945991
     * 
     */
    public GetSearchAllLibrariesMediaGuid withId(String id) {
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
        GetSearchAllLibrariesMediaGuid other = (GetSearchAllLibrariesMediaGuid) o;
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
        return Utils.toString(GetSearchAllLibrariesMediaGuid.class,
                "id", id);
    }
    
    public final static class Builder {
 
        private String id;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Can be one of the following formats:
         * imdb://tt13015952, tmdb://2434012, tvdb://7945991
         * 
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public GetSearchAllLibrariesMediaGuid build() {
            return new GetSearchAllLibrariesMediaGuid(
                id);
        }
    }
}

