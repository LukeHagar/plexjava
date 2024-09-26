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


public class GetRecentlyAddedLibraryWriter {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    private Optional<String> tag;

    @JsonCreator
    public GetRecentlyAddedLibraryWriter(
            @JsonProperty("tag") Optional<String> tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = tag;
    }
    
    public GetRecentlyAddedLibraryWriter() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> tag() {
        return tag;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetRecentlyAddedLibraryWriter withTag(String tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = Optional.ofNullable(tag);
        return this;
    }

    public GetRecentlyAddedLibraryWriter withTag(Optional<String> tag) {
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
        GetRecentlyAddedLibraryWriter other = (GetRecentlyAddedLibraryWriter) o;
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
        return Utils.toString(GetRecentlyAddedLibraryWriter.class,
                "tag", tag);
    }
    
    public final static class Builder {
 
        private Optional<String> tag = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
        
        public GetRecentlyAddedLibraryWriter build() {
            return new GetRecentlyAddedLibraryWriter(
                tag);
        }
    }
}

