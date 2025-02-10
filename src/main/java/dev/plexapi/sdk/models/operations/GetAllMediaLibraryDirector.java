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


public class GetAllMediaLibraryDirector {

    /**
     * The role of Director
     */
    @JsonProperty("tag")
    private String tag;

    @JsonCreator
    public GetAllMediaLibraryDirector(
            @JsonProperty("tag") String tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = tag;
    }

    /**
     * The role of Director
     */
    @JsonIgnore
    public String tag() {
        return tag;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The role of Director
     */
    public GetAllMediaLibraryDirector withTag(String tag) {
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
        GetAllMediaLibraryDirector other = (GetAllMediaLibraryDirector) o;
        return 
            Objects.deepEquals(this.tag, other.tag);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            tag);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAllMediaLibraryDirector.class,
                "tag", tag);
    }
    
    public final static class Builder {
 
        private String tag;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The role of Director
         */
        public Builder tag(String tag) {
            Utils.checkNotNull(tag, "tag");
            this.tag = tag;
            return this;
        }
        
        public GetAllMediaLibraryDirector build() {
            return new GetAllMediaLibraryDirector(
                tag);
        }
    }
}

